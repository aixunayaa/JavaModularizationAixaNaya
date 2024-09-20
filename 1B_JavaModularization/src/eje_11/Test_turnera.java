package eje_11;

public class Test_turnera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Turnera t = new Turnera();
		
		System.out.println(t.obtenerUltimoNumeroOtorgado());
		t.otorgarProximoNumero();
		System.out.println(t.obtenerUltimoNumeroOtorgado());
		t.otorgarProximoNumero();
		System.out.println(t.obtenerUltimoNumeroOtorgado());
		t.otorgarProximoNumero();
		System.out.println(t.obtenerUltimoNumeroOtorgado());*/
		int n = 9, n2 = 19, resultado, maximo;
		maximo = Math.max(n, n2);
		System.out.println(Math.E);
		// NO LA PUEDO INSTANCIAR PORQUE EL CONSTRCUTOR ES PRIVADO
		//Math matematica = new Math();
		
		// SI MI TURNERA FUESE UNICA EN MI PROGRAMA
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		Turnera.resetearContador(50);
		Turnera.otorgarProximoNumero();
		Turnera.otorgarProximoNumero();
		System.out.println(Turnera.obtenerUltimoNumeroOtorgado());
		 

	}

}
