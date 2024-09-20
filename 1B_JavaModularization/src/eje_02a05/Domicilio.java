package eje_02a05;

public class Domicilio {
	private String calle;
	private String ciudad;
	private int numero;
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	// CUANDO ESTE METODO ESTA EN LA CLASE
	// CUANDO HAGA SYSO(NOMBREOBJETO);
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", ciudad=" + ciudad + ", numero=" + numero + "]";
	}

	
}

	

	


