package guia05_ejer02;

public class Bien {
	private static int id=0;
	private String alias; 
	private String descripcion;
	private double precio;
	private Responsable responsable;
	
	public Bien(String alias,String descripcion, double precio, Responsable responsable) {
		Bien.id = id +1;
		this.alias = alias;
		this.descripcion= descripcion;
		this.precio= precio;
		this.responsable= responsable;
	}

	public double getPrecio() {
		return precio;
	}
	
}



