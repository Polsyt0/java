package unidad_2;

/** X, Y y Z son variables de tipo boolean.
Los valores que toman las variables son:

X = false, 
Y = true, 
Z = true 

Determina el valor de las siguientes expresiones lógicas:

(X || Y) && (X || Z)
!(Y && Z) || (X && Z)
(X || !Y) && (!X || Z)
 X || Y && Z
Muestra la operación con los resultados por consola. **/

public class Unidad2Tarea8 {

	public static void main(String[] args) {
		
		        boolean X = false;
		        boolean Y = true;
		        boolean Z = true;
		       
		        boolean exp1 = (X || Y) && (X || Z);
		        boolean exp2 = !(Y && Z) || (X && Z);
		        boolean exp3 = (X || !Y) && (!X || Z);
		        boolean exp4 = X || (Y && Z);

		        System.out.println("(false OR true) AND (false OR true) = " + exp1);
		        System.out.println("NOT (true AND true) OR (false AND true) = " + exp2);
		        System.out.println("(false OR NOT true) AND (NOT false OR true) = " + exp3);
		        System.out.println("false OR (true AND true) = " +exp4);


	}

}
