package eje_09;

public class CuentaBancaria {
	private String cbu;
	private TipoCuenta tipo;
	private double saldo;
	private Persona titular;
	
	public CuentaBancaria(Persona titular, TipoCuenta tipo) {
		this.saldo = 0;
		this.titular = titular;
		this.tipo = tipo;
		this.cbu = generarCBU();
	
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	public void incrementarSaldo(double incremento) {
		this.saldo+= incremento;
	}
	public void decrementarSaldo(double incremento) {
		this.saldo-= incremento;
	}
	public void depositar(double deposito) {
		if(deposito > 0) {
			this.incrementarSaldo(deposito);;
		}		
	}
	public boolean extraer(double retiro) {
		boolean estado = false;
		if(this.saldo >= retiro) {
			this.decrementarSaldo(retiro);
			//this.saldo-= retiro;
			estado  = true;
		}
		return estado;
	}
	public String getCBU() {
		return this.cbu;
	}
	private String generarCBU() {
		String cbu;
		String dni = this.titular.getDni();
		cbu = (tipo.ordinal()+10) + "-"+dni+"-"+dni.charAt(dni.length()-1);
		return cbu;
	}
	
	


	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
}
