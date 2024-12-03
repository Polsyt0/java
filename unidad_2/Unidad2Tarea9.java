package unidad_2;

/**Declara una variable de tipo String que contenga tu nombre completo.

Con la ayuda de los métodos de la clase String:

Pinta por consola la longitud de tu nombre.
Muestra el primer carácter de tu nombre.
Muestra el último carácter de tu nombre.
Indicar si vuestro nombre contiene la letra 'a' y en caso afirmativo la posición en la que se encuentra.**/

public class Unidad2Tarea9 {
    public static void main(String[] args) {
    	
       
        String nombreCompleto = "Pablo";
        int posicion = nombreCompleto.indexOf("a");

        
        System.out.println("La longitud de tu nombre es: " + nombreCompleto.length());        
        System.out.println("El primer carácter de tu nombre es: " + nombreCompleto.charAt(0));     
        System.out.println("El último carácter de tu nombre es: " + nombreCompleto.charAt(nombreCompleto.length() - 1));
        	
        if (nombreCompleto.contains("a")) {
			System.out.println("Tu nombre si contiene la letra a" );
			System.out.println("La posicion de la letra a es = " + posicion);
        }
			else {
				System.out.println("Tu nombre no contiene la letra a");
				
			}
			
		}
     }




