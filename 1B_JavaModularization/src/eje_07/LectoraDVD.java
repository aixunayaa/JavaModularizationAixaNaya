package eje_07;

public class LectoraDVD {

	private String marca;
	private boolean puedeGrabar;
	
	public LectoraDVD(String marca) {
		this(marca, false);
	}
	
	public LectoraDVD(String marca, boolean puedeGrabar) {
		this.marca = marca;
		this.puedeGrabar = puedeGrabar;
	}

	@Override
	public String toString() {
		return "LectoraDVD [marca=" + marca + ", puedeGrabar=" + puedeGrabar + "]";
	}

}
