package Unidad_3;

import java.util.Scanner;

public class Unidad3Tarea12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int numero = -1;
        String continuar = "si";

        do { 
            String operacion = "";
            int resultado = 1;
            System.out.println("Introduzca un numero positivo:");
            do { 
                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    if (numero < 0) {
                        System.out.println("ERROR: SÓLO SE ACEPTAN NÚMEROS MAYORES O IGUALES A CERO");
                    }
                } else {
                    String error = sc.next();
                    System.out.println("ERROR: SÓLO SE ACEPTAN NÚMEROS ENTEROS: " + error);
                }

            } while (numero < 0);

            for(int n = numero ; n>=1 ; n--) {
                resultado = resultado * n;
                operacion = operacion + " * " + n;
            }
            System.out.println("Factorial de " + numero + "! = " + operacion.substring(2) + " = " + resultado);

        } while (continuar.equalsIgnoreCase("si"));
        sc.close();


    }


}

