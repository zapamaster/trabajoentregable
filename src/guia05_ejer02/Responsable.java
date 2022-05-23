package guia05_ejer02;

import java.util.ArrayList;

public class Responsable extends Persona{

	private String oficina;
	private ArrayList<Factura> facturas;
	private ArrayList<Bien> bienes;
	
	public ArrayList<Factura>  getFacturas() {
		return facturas;
	}
	public ArrayList<Bien>  getBienes() {
		return bienes;
	}
}
