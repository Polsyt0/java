package Unidad_3;

import java.util.Scanner;

//Solicita 5 nombres y almacenarlos en un string separados por coma (utilizar el bucle for)

public class Unidad3Tarea10 {

	public static void main(String[] args) {
		
		String nombres = "";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un nombre: ");
		
		for (int contador = 0; contador < 5; contador++) {
			nombres += sc.next() + ",";
		};
		System.out.println(nombres);
		
		sc.close();
	}

}
