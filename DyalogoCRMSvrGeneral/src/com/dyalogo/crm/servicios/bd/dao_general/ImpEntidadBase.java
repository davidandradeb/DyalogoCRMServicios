package com.dyalogo.crm.servicios.bd.dao_general;

public abstract class ImpEntidadBase implements IEntidadBase {

    private Integer id;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public  String getDatoFiltro(){
        return String.valueOf(id);
    }

}
