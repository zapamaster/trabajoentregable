package guia05_ejer02;

import java.util.Objects;

public abstract class Ubicacion {

	private static int id=0;
	private String nombre;
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ubicacion other = (Ubicacion) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
}
