package com.dyalogo.crm.servicios.bd.dao_general;

    public class ExcepcionBd extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int operacion;
	
	public ExcepcionBd(Exception e, int codErr){
		super(e);
	}
        
        public ExcepcionBd(String e, int codErr){
		super(e);
	}
	
	public int getOperacion() {
		return operacion;
	}

	public void setOperacion(int operacion) {
		this.operacion = operacion;
	}
        
        
        

}
