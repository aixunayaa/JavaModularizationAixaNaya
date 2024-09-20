package eje_14;

public class Promedio {
	
	private Acumulador acum = null;
	private Contador cont = null;
	
	public Promedio () {
		acum = new Acumulador();
		cont = new Contador();
	}

	public void acumular(int valor) {
		acum.incrementar(valor);
		cont.incrementar();
	}
	
	public double obtenerValor() {
		double resultado = 0;
		if (cont.obtenerValor() > 0) {
			resultado = acum.obtenerValor() / cont.obtenerValor();
		}
		return resultado;
	}

	// opcional: podes hacer que el toString del promedio devuelva el obtenerValor;
	@Override
	public String toString() {
		return Double.toString(obtenerValor());
	}
	
	
	

}
