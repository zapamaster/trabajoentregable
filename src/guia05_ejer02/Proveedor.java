package guia05_ejer02;

import java.util.ArrayList;

public class Proveedor extends Persona{

	private ArrayList<Bien> bienes;
	private ArrayList<Factura> facturas;
	
	public double descuento() throws ExcedidoDeBienesException{
		double desc=0;
		int tam = bienes.size();
		if(tam >= 20) {
			throw new ExcedidoDeBienesException("Ya hay 20 o más bienes agregados");
		}
		else {
			if (tam >=5) {desc=0.1;}
			else if(tam>10) desc=0.2;
			return desc;
		}
	}
	public ArrayList<Factura> getFacturas() {
		return facturas;
	}
}



