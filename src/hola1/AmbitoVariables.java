package hola1;
 	/**
 	 * Ejercicio para aprender el ambito de las variables. <br>
 	 * 
 	 * Pueden ser de  CASE, METODO o BLOQUE DE CÓDIGO. <br>
 	 * 
 	 *
 	 */
public class AmbitoVariables {
	
	// accesible desde cualquier parte de esta clase
	
	static int variableDeClaseGloval = 89;

	public static void main(String[] args) {
		
		// acessible solo dentro de este método
		
		int variableDeMetodoLocal = 12;
		
		if (true) {
			
			int  variableBloque = 9;
			
			//sacar por pantalla todas las variables
			//System.out.println(variableBloque);
			//System.out.println(variableDeMetodoLocal);
			//System.out.println(variableDeClaseGloval);
			}
		//sacar por pantalla todas las variables
		//System.out.println(variableBloque);
		//System.out.println(variableDeMetodoLocal);
		System.out.println(variableDeClaseGloval);
		}
	}


