package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Primavera \n"
				+ "2) Verano \n"
				+ "3) Otoño \n"
				+ "4) Invierno \n"
				+ "Introduzca el numero de su opción:");
		
		int option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Su estación favorita es la Primavera");
			break;
		case 2:
			System.out.println("Su estación favorita es el Verano");
			break;
		case 3:
			System.out.println("Su estación favorita es el Otoño");
			break;
		case 4:
			System.out.println("Su estación favorita es el invierno");
		default:
			System.out.println("Opcion incorrecta");
			
			sc.close();
			
		}
	}

}
