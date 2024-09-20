package eje_06;

public class Test_Dado {

	public static void main(String[] args) {
		// INSTANCIAS EL DADO
				final int CANT_TIROS = 100;
				Dado d1 = new Dado(1);
				Dado d2 = new Dado(1);
				int suma = 0;
				double promedio;
				d1.tirarDado();
				d2.tirarDado();
				if(d1.getValor() == d2.getValor()) {
					System.out.println("Son iguales con "+d1.getValor());
				}else if(d1.getValor() > d2.getValor()) {
					System.out.println("El mayor es d1 con "+d1.getValor());
				}else {
					System.out.println("El mayor es d2 con "+d2.getValor());
				}
				for(int i = 0; i < CANT_TIROS; i++) {
					System.out.print("Tiro "+i);

					d1.tirarDado();
					d2.tirarDado();
					System.out.println(" - D1 "+ d1.getValor()+"- D2 "+d2.getValor());
					suma+= d1.getValor();
					suma+= d2.getValor();
					//System.out.println();
				}
				
				promedio = suma / CANT_TIROS;
				System.out.println("El promedio es "+ promedio);
			
	}

}
