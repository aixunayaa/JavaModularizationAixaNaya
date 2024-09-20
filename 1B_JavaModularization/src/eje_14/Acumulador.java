package eje_14;

public class Acumulador {
	
	private double valorActual;
	
	public Acumulador () {
		valorActual = 0;
	}

	public void incrementar(double valor) {
		valorActual += valor;
	}

	public double obtenerValor() {
		return valorActual;
	}

}