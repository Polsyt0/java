package Unidad_3;

/*Crear una aplicación que solicite 5 notas y nos muestre la media de las notas indicadas.

Las notas recogidas serán valores numéricos de tipo decimal.
Sólo serán válidas las notas cuyo valor sea mayor o igual a 0 y menor o igual a 10.
Si alguna de las notas recogidas no es válida volver a solicitar la nota hasta se introduzca una correcta.*/

import java.util.Scanner;

public class Unidad3Tarea14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double suma = 0;
		int contador = 0;

		while (contador < 5) {
			System.out.print("Introduce la nota " + (contador + 1) + " (entre 0 y 10): ");
			double nota = scanner.nextDouble();

			if (nota >= 0 && nota <= 10) {
				suma += nota;
				contador++;
			} else {
				System.out.println("Nota inválida. Debe estar entre 0 y 10.");
			}
		}

		scanner.close();

		double media = suma / 5;
		System.out.println("La media de las notas es: " + media);
	}
}
