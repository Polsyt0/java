package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea15 {
	
	public static void opt1 () {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un string de al menos 5 letras:");
		String input1 = sc.nextLine();

		if (input1.length() >= 5) {
			System.out.println("La longitud del String introducido es: " + input1.length());
		} else {
			System.out.println("ERROR: El String debe tener una longitud de al menos 5 letras");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int opcion = 0;

		do {
			System.out.println("\n**********************************");
			System.out.println("Seleccione una opción:");
			System.out.println("1) String de 5 o más letras");
			System.out.println("2) ¿Contiene la 'S'?");
			System.out.println("3) Salir");
			System.out.println("**********************************");
			
			if(scanner.hasNextInt() == true) {
			opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {

			case 1:
				System.out.println("Introduce un string de al menos 5 letras:");
				String input1 = scanner.nextLine();

				if (input1.length() >= 5) {
					System.out.println("La longitud del String introducido es: " + input1.length());
				} else {
					System.out.println("ERROR: El String debe tener una longitud de al menos 5 letras");
				}
				break;
			case 2:
				System.out.println("Introduce un String que contenga la letra 'S': ");
				String input2 = scanner.nextLine();

				if (input2.toLowerCase().contains("s")) {
					System.out.println("La palabra " + input2 + " contiene la letra S");
				} else {
					System.out.println("La palabra" + input2 + "no contiene una 'S' ");

				}
				;
				break;
			case 3:
				System.out.println("Fin del programa");
				break;
			}
			}else {
				scanner.next();
				System.out.println("ERROR introduce un numero");
			};

		} while (opcion != 3);

	}
}
