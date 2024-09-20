package eje_14;

public class Contador {
	
	private int valorActual;
	
	public Contador () {
		valorActual = 0;
	}

	public void incrementar() {
		valorActual++;
	}

	public double obtenerValor() {
		return valorActual;
	}

}
