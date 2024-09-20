package eje_01;

import java.util.Scanner;

public class Eje1_1tp2 {
	private static Scanner input = new Scanner (System.in);

	public static void main(String[] args) {
	
		int minimo = 2;
		int maximo = 20;
		String mensaje = "Escoja un numero entre " +minimo+ " y " +maximo;
		System.out.println(pedirNumero(mensaje, minimo, maximo));
		
		
	}
	public static int suma (int n1, int n2){
		int suma; 
		suma = n1+n2;
		return suma;
	}
	public static int pedirNumero(String mensaje, int minimo, int maximo) {
		int numero;
		do {
			System.out.println(mensaje);
			numero = Integer.parseInt(input.nextLine());
		}while( numero < minimo || numero > maximo);
		return numero;
	}
}
