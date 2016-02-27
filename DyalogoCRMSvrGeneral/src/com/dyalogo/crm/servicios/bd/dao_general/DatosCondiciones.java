package com.dyalogo.crm.servicios.bd.dao_general;

/**
 * Clase para poder enviar distintas condiciones dinammicamente a una consulta. </br>
 * Estas condiciones seran interpretadas por la clase de implementacion DAO
 * @author davidchacon
 */
public class DatosCondiciones {

    private String nombreParametro; //Nombre del parametro ej: :param1
    private Object valorParametro; //Valor del parametro que se va a tomar

    public DatosCondiciones() {
    }

    /**
     * Crea una condicion
     * @param nombreParametro
     * @param valorParametro
     */
    public DatosCondiciones(String nombreParametro, Object valorParametro) {
        this.nombreParametro = nombreParametro;
        this.valorParametro = valorParametro;
    }

    public String getNombreParametro() {
        return nombreParametro;
    }

    public void setNombreParametro(String nombreParametro) {
        this.nombreParametro = nombreParametro;
    }

    public Object getValorParametro() {
        return valorParametro;
    }

    public void setValorParametro(Object valorParametro) {
        this.valorParametro = valorParametro;
    }
}
