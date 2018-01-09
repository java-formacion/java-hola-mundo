package capitulo2;
/**
 * Ejercicio para aprender el ambito de las variables.<br>
 * pueden ser de CLASE, METODO o BLOQUE CODIGO.<br>
 * 
 * @author java
 *
 */

public class AmbitoVariable {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("unused")
		int variableMetodo = 12; //accesible solo dentro de este metodo
		
		if (true) {
			
			int variableBloque = 9;//accesible dentro del bloque if
		}

	}
	
	
	int variableClade = 89; //accesible desde cualquier parte de esta clase
	
	
	
	
	

}
