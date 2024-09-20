package eje_08;

public class TarjetaDeCredito {
	private String numero;
	private String titular; 
	private double limiteDeCompra;
	private double acumuladoActual;
	
	//constructor
	public TarjetaDeCredito(String numero, String titular, double limiteDeCompra) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.limiteDeCompra = limiteDeCompra;
		this.acumuladoActual= 0;
	}

	public String getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public double getLimiteDeCompra() {
		return limiteDeCompra;
	}

	public double getAcumuladoActual() {
		return acumuladoActual;
	}

	private void setNumero(String numero) {
		this.numero = numero;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	private void setLimiteDeCompra(double limiteDeCompra) {
		this.limiteDeCompra = limiteDeCompra;
	}
	
	public double montoDisponible(){
		double resultado;
		resultado= this.limiteDeCompra - this.acumuladoActual;
		
		if (resultado<0){
			resultado = 0;	
		} return resultado;
	}
	
	private boolean compraPosible(double monto){
		return monto <= this.montoDisponible();
	}
	
	public void actualizarLimite(double nuevoLimite){
		this.setLimiteDeCompra(nuevoLimite);;
	}
	
	private void acumularGastoActual(double importeCompra){
		this.acumuladoActual += importeCompra;
	}
	
	public boolean realizarCompra(double montoCompra){
		boolean esPosible = compraPosible(montoCompra);
		if (esPosible){
			this.acumularGastoActual(montoCompra);
		}
		return esPosible;
	}

	public String toString() {
		double montoDisponible = montoDisponible();
		return "TarjetaDeCredito [numero= " + numero + ", titular= " + titular + ", limiteDeCompra= " + limiteDeCompra
				+ ", acumuladoActual= " + acumuladoActual+" montoDisponible= "+ montoDisponible + "]";
	}

}
