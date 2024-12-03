package Unidad_3;

/**Solicita 5 nombres y almacenarlos en un string separados por coma (utilizar el bucle for)

SÓLO SE ACEPTARAN NOMBRES QUE COMIENCEN POR "A"**/

import java.util.Scanner;

public class Unidad3Tarea10_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String nombres = "";

		for (int i = 0; i < 5;) {
			System.out.print("Ingresa un nombre que comience con 'A': ");
			String nombre = scanner.nextLine();

			if (nombre.toUpperCase().startsWith("A")) {

				if (!nombres.isEmpty()) {
					nombres += ", ";
				}
				nombres += nombre;
				i++;
			} else {
				System.out.println("El nombre debe comenzar con la letra 'A'. Inténtalo de nuevo.");
			}
		}

		System.out.println("Nombres ingresados: " + nombres);
		scanner.close();
	}

}
