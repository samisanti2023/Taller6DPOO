package lógica;

abstract class HamburguesaException extends Exception {
	protected String nombre;
	public HamburguesaException(String mensaje,String nombre) {
        super(mensaje);
        this.nombre=nombre;
	}
     public String getNombre() {
		return nombre;
    	 
     
		
	}

}
