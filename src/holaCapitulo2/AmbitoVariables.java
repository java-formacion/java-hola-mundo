package holaCapitulo2;

/**
 * Ejercicio ambito de las variables <br>
 * Pueden ser de clase, metodo, bloque de codigo <br>
 * 
 * @author java
 *
 */
public class AmbitoVariables {
	
	static int variableClaseGlobal=89; //accesible desde cualquier parte de la clase
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int varibleMetodoLocal=31; //accesible solo dentro del main
		
		if(true) {
			int variableBloque=9; //accesible solo en el bloque
			System.out.println("variables 1 "+variableClaseGlobal+varibleMetodoLocal+variableBloque);
		} 
		//System.out.println("variables 2 "+variableClaseGlobal+varibleMetodoLocal+variableBloque);
	}
	void otroMetodo() {
	//System.out.println("variables 3 "+variableClaseGlobal+varibleMetodoLocal+variableBloque);
	}
}
	
