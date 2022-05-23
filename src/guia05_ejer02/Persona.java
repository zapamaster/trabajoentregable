package guia05_ejer02;

public abstract class Persona implements CriterioBusqueda{

	private static int id=0;
	private String nombre;
	private Localidad localidad;
	

	public Localidad getLocalidad() {
		return localidad;
	}
	public Boolean esDeLocalidad(Localidad l) {
		return l.equals(localidad) &&
				l.getProvincia().equals(localidad.getProvincia()) && 
				l.getProvincia().getPais().equals(localidad.getProvincia().getPais()) &&
				l.equalsTo(localidad);
		
		}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
}