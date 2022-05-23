package guia05_ejer02;

import java.util.Objects;

public class Localidad extends Ubicacion{

	private Provincia provincia;
	
	public Provincia getProvincia() {
		return provincia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(provincia);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localidad other = (Localidad) obj;
		return Objects.equals(provincia, other.provincia);
	}
	
	public boolean equalsTo(Object obj) {
		return super.equals(obj);	}
	
}

