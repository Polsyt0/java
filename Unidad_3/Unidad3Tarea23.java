package Unidad_3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Realiza una aplicación que nos pida un número de ventas a introducir, 
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
 * Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 * Utiliza el bloque try catch para tratar las excepciones.
 * */

public class Unidad3Tarea23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumaVentas = 0;
		boolean valido = true;
		Scanner sc = new Scanner(System.in);

		do {

			try {
				System.out.println("Introduce el numero de ventas a continuacion:");
				int numVentas = sc.nextInt();

				for (int i = 1; i <= numVentas; i++) {

					try {

						valido = true;
						System.out.println("Introduce el precio de la " + i + "ª venta:");
						int ventas = sc.nextInt();
						sumaVentas += ventas;

					} catch (InputMismatchException ex) {
						System.out.println("Error: Introduce un numero");
						sc.next();
						i--;
					}
				}

			} catch (InputMismatchException ex) {
				System.out.println("Error: Introduce un numero");
				sc.next();
				valido = false;
			}

		} while (valido == false);

		System.out.println("El total de ventas es: " + sumaVentas);

	}

}
