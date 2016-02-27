package com.dyalogo.crm.servicios.bd.dao_general;

import java.util.List;


/**
 * Interface DAO
 *
 * @author david
 *
 */
public interface IDAO<B extends IEntidadBase> {

    B getNuevaInstancia() throws ExcepcionBd;

    B getById(Integer id) throws ExcepcionBd;

    B getByCondicion(String condicion) throws ExcepcionBd;

    void insertar(B obj) throws ExcepcionBd;

    void actualizar(B obj) throws ExcepcionBd;

    void eliminar(B obj) throws ExcepcionBd;

    List<B> getTodos(String strCondicion_p) throws ExcepcionBd;
    
    List<B> getTodos(String strCondicion_p,int limite_p) throws ExcepcionBd;

    List<B> getTodos() throws ExcepcionBd;

    List<B> getTodos(String strCondicion_p, List<DatosCondiciones> lstCondicion_p) throws ExcepcionBd;

    List<Object> getDatosConsulta(String strSelect) throws ExcepcionBd;

    List<B> getTodosOrden(String strCampOrden_p) throws ExcepcionBd;

    List<B> getTodos(String strCondicion_p, List<DatosCondiciones> lstCondicion_p, String strCampOrden_p) throws ExcepcionBd;
}
