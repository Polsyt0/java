package Unidad_3;

import java.util.Scanner;

/*
Crear un método crearContrasenya que devuelva un String con la contraseña creada.

El método solicitará 5 nombres de frutas y compondrá la contraseña utilizando 
los dos primeros caracteres de cada fruta insertada.

Desde el método main invocaremos al método y pintaremos la contraseña.
 * */

	public class Unidad3Tarea18 {

	    
	    public static String crearContrasenya() {
	        Scanner scanner = new Scanner(System.in);
	        String contrasenya = "";

	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Introduce el nombre de la fruta " + i + ": ");
	            String fruta = scanner.nextLine();

	            
	            if (fruta.length() >= 2) {
	                contrasenya += fruta.substring(0, 2); 
	            } else {
	                System.out.println("La fruta debe tener al menos 2 caracteres. Inténtalo de nuevo.");
	                i--; 
	            }
	        }
	        return contrasenya;
	    }

	    
	    public static void main(String[] args) {
	        
	        String contrasenya = crearContrasenya();
	        
	        System.out.println("La contraseña generada es: " + contrasenya);
	    }
	}


