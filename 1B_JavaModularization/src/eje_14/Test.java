package eje_14;

import java.util.Scanner;

public class Test {
	
	private static final int NOTA_CORTE = -1;
	private static final int NOTA_TOPE = 10;
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Promedio promedioPrimerParcial = new Promedio();
		int nota = pedirNota();
		while (nota != NOTA_CORTE) {
			promedioPrimerParcial.acumular(nota);
			nota = pedirNota();
		}
		// muestra usando obtenerValor
		System.out.println("Nota promedio: " + promedioPrimerParcial.obtenerValor());
		// muestra usando el toString de Promedio
		//System.out.println("Nota promedio: " + promedioPrimerParcial);
		input.close();
	}

	private static int pedirNota() {
		System.out.print("Nota? ");
		int nota = Integer.parseInt(input.nextLine());
		while (nota < NOTA_CORTE || nota > NOTA_TOPE) {
			System.out.println("Error en el rango de la nota (debe estar entre " + NOTA_CORTE + " y " + NOTA_TOPE);
			System.out.print("Nota? ");
			nota = Integer.parseInt(input.nextLine());
		}
		return nota;
	}

}
