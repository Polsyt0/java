package Unidad_3;

import java.util.Scanner;

public class Unidad3Ejemplo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Opcion 1 \n2) Opcion2 \n3 Opcion3 \nIntroduzca una opción:");
		
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Ha seleccionado la opcion 1");
			break;
		case 2:
			System.out.println("Ha seleccionado la opcion 2");
			break;
		case 3:
			System.out.println("Ha seleccionado la opcion 3");
			break;
		default:
			System.out.println("Opcion incorrecta");
		}
		sc.close();
		
		
		
		

	}

}
