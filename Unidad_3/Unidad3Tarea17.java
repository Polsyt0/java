package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea17 {

	public static int obtenerNumero(int minimo, int maximo) {
		Scanner scanner = new Scanner(System.in);
		int numero;

		
		do {
			System.out.print("Introduce un número entre " + minimo + " y " + maximo + ": ");
			numero = scanner.nextInt();

			
			if (numero < minimo || numero > maximo) {
				System.out.println("El número no es válido. Inténtalo de nuevo.");
			}
		} while (numero < minimo || numero > maximo); 

		return numero;
	}

	public static void main(String[] args) {
		int suma = 0;
		
		for (int i = 0; i < 5; i++) {
			int numero = obtenerNumero(100, 999);
			suma += numero; 
		}

		
		System.out.println("La suma de los 5 números es: " + suma);
	}
}
