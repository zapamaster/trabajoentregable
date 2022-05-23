package guia05_ejer02;

import java.util.ArrayList;


	public class Empresa {
		
	private ArrayList<Proveedor> proveedores;
	private ArrayList<Responsable> responsable;	
	private ArrayList<Bien> bienes;	
	private ArrayList<Factura> facturas;
		
	public ArrayList<Factura> listarFacturaByProveedor(Proveedor p){
		return p.getFacturas();
	}
	public ArrayList<Factura> listarFacturaByResponsable(Responsable r){
		return r.getFacturas();
	}
	public ArrayList<String> listarNombresProveedores(){
		ArrayList<String> nombres = new ArrayList<String>();
		for(Proveedor p: proveedores) {
			nombres.add(p.toString());
		}
		return nombres;
	}
	
	public ArrayList<Bien> listarBienesByLocalidad(Localidad l){
		ArrayList<Responsable> listaAux = new ArrayList<Responsable>();
		
		listaAux =buscarEn(responsable, l);
		
		ArrayList<Bien> bienesSolicitados = new ArrayList<Bien>();
		for(Responsable r: listaAux) {
			bienesSolicitados.addAll(r.getBienes());
		}
		
		return bienesSolicitados;
	}
	public ArrayList<Responsable> buscarEn(ArrayList<Responsable> responsables, Localidad l){
		
		ArrayList<Responsable> listaResponsables = new ArrayList<Responsable>();
		
		for(Responsable p: responsables) {
			if(p.getLocalidad() == l) {
				listaResponsables.add(p);
			}
		}
		return listaResponsables;
	}
	
	
	public ArrayList<Bien> listarBienesByPrecioMayor(Double precioMayor){
		
		ArrayList<Bien> BienesByPrecioMayor = new ArrayList<Bien>();
		
		for(Bien b: bienes) {
			if(b.getPrecio() > precioMayor) {
				BienesByPrecioMayor.add(b);
			}
		}
		return BienesByPrecioMayor;
	}
	
	public ArrayList<Factura> listarFacturasByMontoMayor(Double montoMayor){
		
		ArrayList<Factura> FacturasByMontoMayor = new ArrayList<Factura>();
		
		for(Factura f: facturas) {
			if(f.calcularMontoTotal() > montoMayor) {
				FacturasByMontoMayor.add(f);
			}
		}
		return FacturasByMontoMayor;
	}
	
	public ArrayList<String> listarFacturadasPorProveedor(Proveedor p){
		
		ArrayList<String> FacturasByProveedor = new ArrayList<String>();
		
		
		for(Factura f: p.getFacturas()) {
			FacturasByProveedor.add("En la fecha "+ f.getFecha().toString() + p.toString() +"facturó con un total de $" + f.calcularMontoTotal() + "con "+ f.totalBienes()+ "bienes");
		}
		return FacturasByProveedor;
		
	}
	
	
}
	
//Ni idea como manejar lo del stream y tampoco lo de ordernar las colecciones...
//Otra duda es, siento re forzado que proveedor, responsable tengan listas de Facturas y Bienes pero bueno... No tenía otra forma de implementarlo.
// De última después le pregunto a algún profe. Después miren usd qué hacen
