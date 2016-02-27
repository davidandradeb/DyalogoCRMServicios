package com.dyalogo.crm.servicios.bd.dao_general;


import com.dyalogo.crm.servicios.bd.conexion.PersistenciaBD;
import java.util.List;
import javax.persistence.EntityManager;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import org.apache.log4j.*;

public abstract class DAOImpOperaciones<B extends IEntidadBase> implements IDAO<B> {

    protected org.apache.log4j.Logger log = Logger.getLogger(DAOImpOperaciones.class.getName());

    private int intCanMaxRes_t = 60000;
    private Class<B> claseConsulta;

    public DAOImpOperaciones(Class<B> queryClass) {
        this.claseConsulta = queryClass;
    }


    @Override
    public B getNuevaInstancia() throws ExcepcionBd {
        try {
            return claseConsulta.newInstance();
        } catch (InstantiationException e) {
            throw new ExcepcionBd(e, 4);
        } catch (IllegalAccessException e) {
            throw new ExcepcionBd(e, 4);
        }
    }

    @Override
    public B getById(Integer id) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.find(claseConsulta, id);
        } catch (Exception e) {
            throw new ExcepcionBd(e, 5);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    public EntityManager getEM() {
        return PersistenciaBD.getEMF().createEntityManager();
    }

    @Override
    public B getByCondicion(String condicion) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        Query qryBusqueda;
        try {
            qryBusqueda = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t where " + condicion);
            return (B) qryBusqueda.getSingleResult();
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new ExcepcionBd(e, 6);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            qryBusqueda = null;
        }
    }

    
    @Override
    public void insertar(B obj) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {

            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new ExcepcionBd(e, 1);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public void actualizar(B obj) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new ExcepcionBd(e, 1);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public void eliminar(B obj) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            em.getTransaction().begin();
            em.remove(em.getReference(claseConsulta, obj.getId()));
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new ExcepcionBd(e, 1);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public List<B> getTodos(String strCondicion_p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.createQuery(
                    "select t from " + claseConsulta.getSimpleName()
                    + " t where " + strCondicion_p).getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 1);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public List<B> getTodos(String strCondicion_p, int limite_p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.createQuery(
                    "select t from " + claseConsulta.getSimpleName()
                    + " t where " + strCondicion_p).setMaxResults(limite_p).getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 1);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public List<B> getTodos() throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        Query query;
        try {
            query = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t");
            //query.setHint("javax.persistence.cache.retrieveMode", "BYPASS"); // skip the L2 cache.
            //query.setHint("javax.persistence.cache.storeMode", "REFRESH");

            return query.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 1);
        } finally {
            query = null;
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    @Override
    public List<B> getTodos(String strCondicion_p, List<DatosCondiciones> lstCondicion_p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        Query consulta;
        try {
            consulta = em.createQuery("select t from "
                    + claseConsulta.getSimpleName() + " t where "
                    + strCondicion_p);
            for (DatosCondiciones condicion : lstCondicion_p) {
                consulta.setParameter(condicion.getNombreParametro(),
                        condicion.getValorParametro());
            }
            return consulta.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 4);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            consulta = null;
        }
    }

    @Override
    public List<B> getTodosOrden(String strCampOrden_p)
            throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.createQuery(
                    "select t from " + claseConsulta.getSimpleName()
                    + " t order by " + strCampOrden_p).getResultList();
        } catch (Exception e) {

            throw new ExcepcionBd(e, 7);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    /**
     * Retorna una lista de Objetos la cual contiene los datos de la consulta
     * enviada por parametro y es limitada por intCanMaxRes_t
     *
     * @param strSelect____p
     * @return
     * @throws com.persistencia.bd.dao.estandar.ExcepcionBd
     */
    @Override
    public List<Object> getDatosConsulta(String strSelect____p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.createQuery(strSelect____p).setMaxResults(intCanMaxRes_t).getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 9);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    /**
     * Retorna los datos de una consulta nativa
     *
     * @param strSelect____p
     * @return
     * @throws ExcepcionBd
     */
    public List<Object> getDatosConsultaNativa(String strSelect____p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {
            return em.createNativeQuery(strSelect____p).setMaxResults(intCanMaxRes_t).getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 9);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    /**
     *
     * @param strSQLNativo_p
     * @return
     * @throws ExcepcionBd
     */
    public int ejecutaSQLNativo(String strSQLNativo_p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        int intRetorno___t = 0;
        try {
            em.getTransaction().begin();
            intRetorno___t = em.createNativeQuery(strSQLNativo_p).executeUpdate();
            em.getTransaction().commit();
            return intRetorno___t;

        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw new ExcepcionBd(e, 9);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }

    }

    /**
     * Retorna la lista de todos los objetos de la entidad que se tenga
     * asignada, filtrada por la lista de condiciones enviadas por parametro,
     *
     * @param primero - El primer registro a consultar
     * @param longitud - La cantidad de filas que se van a consultar
     *
     * @param strCondicion_p
     * @param lstCondicion_p
     * @return
     * @throws ExcepcionBD
     */
    public List<B> getTodos(String strCondicion_p, List<DatosCondiciones> lstCondicion_p, int primero, int longitud) throws ExcepcionBd {
        EntityManager em = null;

        Query consulta;
        try {
            em = getEM();
            consulta = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t where " + strCondicion_p);

            for (DatosCondiciones condicion : lstCondicion_p) {
                consulta.setParameter(condicion.getNombreParametro(), condicion.getValorParametro());
            }

            consulta.setFirstResult(primero);
            consulta.setMaxResults(longitud);
            return consulta.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 6);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            consulta = null;
        }
    }

    /**
     * Retorna una lista de objetos de acuerdo a una condicion especifica,
     * limitando la cantidad de resultados a intCanMaxRes_t
     *
     * @param strLuegWhere_p luego del where
     * @param primero - El primer registro a consultar
     * @param longitud - La cantidad de filas que se van a consultar
     * @return
     * @throws ExcepcionBD
     */
    public List<B> getTodos(String strLuegWhere_p, int primero, int longitud) throws ExcepcionBd {
        EntityManager em = null;
        Query qry;

        try {
            em = getEM();
            qry = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t where " + strLuegWhere_p);

            qry.setFirstResult(primero);
            qry.setMaxResults(longitud);
            return qry.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 4);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            qry = null;
        }
    }

    /**
     * Retorna la lista de todos los objetos de la entidad que se tenga
     * asignada, limitado por intCanMaxRes_t
     *
     * @return
     * @throws ExcepcionBD
     */
    public List<B> getTodos(int primero, int longitud) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        Query qry;
        try {
            qry = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t");

            qry.setFirstResult(primero);
            qry.setMaxResults(longitud);
            return qry.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 5);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            qry = null;
        }
    }

    @Override
    public List<B> getTodos(String strCondicion_p,
            List<DatosCondiciones> lstCondicion_p, String strCampOrden_p)
            throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        Query consulta;
        try {
            consulta = em.createQuery("select t from " + claseConsulta.getSimpleName() + " t where " + strCondicion_p + " order by " + strCampOrden_p);
            for (DatosCondiciones condicion : lstCondicion_p) {
                consulta.setParameter(condicion.getNombreParametro(),
                        condicion.getValorParametro());
            }
            return consulta.getResultList();
        } catch (Exception e) {
            throw new ExcepcionBd(e, 4);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
            consulta = null;
        }
    }

    /**
     * Retorna los registros con los parametros seleccionados
     *
     * @param strSelect____p
     * @param strCondicion_p
     * @param strCampOrden_p
     * @return
     * @throws BdEscepcion
     */
    public List<Object> getTodosOrden(String strSelect____p, String strCondicion_p, String strCampOrden_p) throws ExcepcionBd {
        EntityManager em = PersistenciaBD.getEMF().createEntityManager();
        try {

            Query consulta = em.createQuery("select " + strSelect____p + " from " + claseConsulta.getSimpleName() + " t where " + strCondicion_p + " order by " + strCampOrden_p);
            return consulta.getResultList();
        } catch (Exception ex) {
            throw new ExcepcionBd(ex, 1002);
        } finally {
            if (em.isOpen()) {
                em.close();
            }
            em = null;
        }
    }

    public Class<B> getClaseConsulta() {
        return claseConsulta;
    }

    public void setClaseConsulta(Class<B> claseConsulta) {
        this.claseConsulta = claseConsulta;
    }


}
