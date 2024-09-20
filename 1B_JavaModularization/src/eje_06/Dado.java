package eje_06;

public class Dado {
	final static int CANT_CARAS = 6;
	// el valor del dado en esa cara
	private int valor;
	private int cantidadCaras;
	// modifica el codigo para que me permita generar dado de n cantidad de caras
	
	public Dado(int caras) {
		this.tirarDado();
		this.setCantidadCaras(caras);
		setCantidadCaras(CANT_CARAS);
	
	}	
	/*public Dado() {
		this.tirarDado();
		setCantidadCaras(CANT_CARAS);
	
	}*/
	private void setCantidadCaras (int cant) {
		if(cant > 0) {
			this.cantidadCaras = cant;
		}else {
			this.cantidadCaras = this.CANT_CARAS;
		}
	}
	
	public int getValor() {
		return this.valor;
	}
	public void tirarDado() {
		this.valor = (int)(Math.random() * this.cantidadCaras) + 1;
	}
	


}
