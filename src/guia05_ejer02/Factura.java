package guia05_ejer02;

import java.util.ArrayList;
import java.util.Date;

public class Factura implements Comparable<Factura>{

	private static int id = 0;
	private double monto_total ;
	private ArrayList<Bien> bienes;
	private Responsable responsable;
	private Proveedor proveedor;
	private Date fecha;
	

	
	public double calcularMontoTotal() { //throws PaisesDiferentesException{
		monto_total = 0;
		for (Bien b: bienes) {
			monto_total += b.getPrecio(); 
			}
			if(responsable.getLocalidad() == proveedor.getLocalidad()){
				monto_total  *= 1.10;
			}
			else if(responsable.getLocalidad().getProvincia() == proveedor.getLocalidad().getProvincia()) {
				monto_total *= 1.30;
			}
			else if(responsable.getLocalidad().getProvincia().getPais() == proveedor.getLocalidad().getProvincia().getPais()) {
				monto_total *=1.70;
			}
			return monto_total;
			/*else {
				throw new PaisesDiferentesException("Son de paises diferentes");
			}
			*/
	}
	@Override
	public String toString() {
		return "Factura [monto_total=" + monto_total + ", bienes=" + bienes + ", responsable=" + responsable
				+ ", proveedor=" + proveedor + ", fecha=" + fecha + "]";
	}
	public Date getFecha() {
		return fecha;
	}
	public int totalBienes() {
		return bienes.size();
	}

	  @Override
	  public int compareTo(Factura o) {
	    return this.getFecha().compareTo(o.getFecha());
	  }
}

// preguntar, hay alguna forma de implementar el método equals para buscar respuesta al que sean o no de la misma localidad?
// AGREGAR excepcion, si no son del mismo país, throws exception PaisesDiferentesException.
// cuadndo retorno el monto total, tendré que multiplicar por el descuendo que hace el proveedor?



