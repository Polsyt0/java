package Unidad_3;

import java.util.Scanner;

public class Unidad3Ejemplo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad = sc.nextInt();
		
		System.out.println("Introduce tu año de nacmiento");
		
		
		//estructura de seleccion
			
		
		boolean conCarnet = false;
		
		if (edad == 5 && conCarnet == false) {
			System.out.println("edad es igual a 5 y no tiene carnet");
		}   else if(edad == 6) {
			System.out.println("Edad es igual a 6");}
		else {System.out.println("edad es mayor que 6");} 
		sc.close();
	}

}
