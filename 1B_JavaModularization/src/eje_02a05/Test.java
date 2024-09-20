package eje_02a05;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domicilio direccion = new Domicilio();
		direccion.setCalle("Yatay");
		direccion.setCiudad("CABA");
		direccion.setNumero(240);
		System.out.println(direccion);
		
		Persona maria = new Persona();
		maria.ponerNombre("Maria");
		maria.ponerApellido("Perez");
		System.out.println(maria);
		System.out.println(maria.getNombre());
		System.out.println(maria.getApellido());

		Persona margarita = new Persona();
		margarita.ponerApellido("Rodriguez");
		margarita.ponerNombre("Margarita");
		System.out.println(margarita);
		System.out.println(margarita.getApellido());
		System.out.println(margarita.getNombre());
		System.out.println(margarita.obtenerNombreCompleto());
		margarita.setDomicilio(direccion);
		
		Persona personita = new Persona();
		personita.ponerNombre("Fulano");
		personita.ponerApellido("Gomez");
		System.out.println(personita.obtenerNombreCompleto());
		personita.setDomicilio(direccion);
		
		System.out.println("ANTES");
		margarita.mostrarDomicilio();
		personita.mostrarDomicilio();
		
		direccion.setCalle("Corrientes");
		
		System.out.println("Despues");
		margarita.mostrarDomicilio();
		personita.mostrarDomicilio();
		
		}

}
