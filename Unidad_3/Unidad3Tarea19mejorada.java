package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea19mejorada {

	public static void pintar1(int filas) {
		for (int i = 1; i <= filas; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void pintar2(int filas) {
		for (int i = 0; i < filas; i++) {
			for (int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {

			System.out.println("************");
			System.out.println("Menú:");
			System.out.println("1) Pintar 1");
			System.out.println("2) Pintar 2");
			System.out.println("3) Salir");
			System.out.print("Selecciona una opción: ");
			opcion = scanner.nextInt();

			switch (opcion) {
			case 1:

				System.out.print("Introduce el número de filas (1-9): ");
				int filas1 = scanner.nextInt();

				if (filas1 >= 1 && filas1 <= 9) {
					pintar1(filas1);
				} else {
					System.out.println("Número de filas inválido. Debe estar entre 1 y 9.");
				}
				break;

			case 2:

				System.out.print("Introduce el número de filas (1-9): ");
				int filas2 = scanner.nextInt();

				if (filas2 >= 1 && filas2 <= 9) {
					pintar2(filas2);
				} else {
					System.out.println("Número de filas inválido. Debe estar entre 1 y 9.");
				}
				break;

			case 3:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		} while (opcion != 3);

		scanner.close();
	}

}
