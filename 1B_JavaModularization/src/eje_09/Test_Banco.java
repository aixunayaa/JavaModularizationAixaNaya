package eje_09;

public class Test_Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Una cuenta bancaria de tipo caja de ahorros le pertenece a 
		 * Fulano Gómez, cuyo DNI es 12345678
y otra de tipo cuenta corriente le pertenece a Mengana Torres, con DNI
 9123456. Ambos son pareja
y viven juntos en Yatay 240, Almagr
		 * */
		Domicilio unDomicilio = new Domicilio("YATAY", "ALMAGRO", 240);
		
		Persona fulano = new Persona("Fulano", "Gomez", unDomicilio, "12345678");
		//los parametros son posicionales
		
		CuentaBancaria cuentaFulano = new CuentaBancaria(fulano, TipoCuenta.CAJA_DE_AHORRO);
	
		Persona mengana = new Persona("Mengana", "Torres", unDomicilio, "9123456");
		
		CuentaBancaria cuentaMengana = new CuentaBancaria(mengana, TipoCuenta.CUENTA_CORRIENTE);
	
		System.out.println("El cbu de fulano es "+cuentaFulano.getCBU());
		System.out.println("El cbu de mengana es "+cuentaMengana.getCBU());
		System.out.println(unDomicilio);
		System.out.println(TipoCuenta.CAJA_DE_AHORRO.ordinal());
		System.out.println(TipoCuenta.CUENTA_CORRIENTE.ordinal());
	}

}
