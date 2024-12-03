package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea13 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        String resultado = "";

        while (true) {
            System.out.print("Introduce un número (0 para terminar): ");
            int numero = scanner.nextInt();

            if (numero == 0) break;  

            suma += numero;
            resultado += numero + " + ";  
        }

        scanner.close();

        
        if (!resultado.isEmpty()) {
            resultado = resultado.substring(0, resultado.length() - 3);
            System.out.println(resultado + " = " + suma);
        } else {
            System.out.println("No se introdujeron números.");
        }
    }
}


