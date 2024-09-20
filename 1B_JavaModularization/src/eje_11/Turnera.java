package eje_11;

public class Turnera {
	private static int ultimoNumero;
	final private static int NUMERO_INICIAL = 0;
	/*
	 * otorgarProximoNumero: void
	● obtenerUltimoNumeroOtorgado: int
	● resetearContador: void
	 * */
	// ESTOY DECLARANDO QUE NO ES UNA CLASE PARA INSTANCIAR
	// AL PONERLE EL PRIVATE AL CONTRUCTOR. 
	private Turnera() {
		ultimoNumero = NUMERO_INICIAL;
	}
	public static void otorgarProximoNumero() {
		ultimoNumero++;
	}
	
	private static int getUltimoNumero() {
		return ultimoNumero;
	}
	private static void setUltimoNumero(int ultimoNumero1) {
		ultimoNumero = ultimoNumero1;
	}
	public static int obtenerUltimoNumeroOtorgado() {
		return getUltimoNumero();
	}
	
	// SOBRECARGA DE METODOS. 
	public static void resetearContador(int numero) {
		setUltimoNumero(numero);
		//this.ultimoNumero = numero;
	}
	public static void resetearContador() {
		setUltimoNumero(NUMERO_INICIAL);
		//this.ultimoNumero = 0;
	}
	

}
