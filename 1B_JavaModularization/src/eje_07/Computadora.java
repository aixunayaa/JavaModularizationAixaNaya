package eje_07;

public class Computadora {
	private String marca;
	private TipoDeComputadora tipo;
	private Procesador procesador;
	private LectoraDVD lectora;
	private boolean prendida;
	
	public Computadora(String marca, TipoDeComputadora tipo, Procesador procesador, LectoraDVD lectora) {
		this.marca = marca;
		this.tipo = tipo;
		this.procesador = procesador;
		this.lectora = lectora;
		this.prendida = false;
	}

	public void apagar() {
		System.out.println("la computadora se esta apagando...");
		prendida = false;
	}

	public void prender() {
		prendida = true;
		System.out.println("la computadora esta prendida");
	}

	public void reiniciar() {
		apagar();
		prender();
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", tipo=" + tipo + ", procesador=" + procesador + ", lectora=" + lectora
				+ ", prendida=" + prendida + "]";
	}

}