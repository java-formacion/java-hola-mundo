package com.ipartek.formacion.variables;

/**
 * Ejercicio para aprender el ambito de las variables.<br>
 * Pueden ser de CLASE, METODO o BLOQUE CODIGO.<br>
 * @author java
 *
 */

public class AmbitoVariables {
	
	static int variableClase = 89; //accesible desde cualquier parte de esta clase

	public static void main(String[] args) {
		int variableMetodo = 12; //accesible solo dentro de este metodo 'main'
		
		if(true) {
			int variableBloque = 9;
			//Sacar por pantalla todas las variables
			
			//System.out.println(variableBloque);
			System.out.println(variableMetodo);
			System.out.println(variableClase);
		}
		//Sacar por pantalla todas las variables
		//System.out.println(variableBloque);
		//System.out.println(variableMetodo);
		System.out.println(variableClase);

	}

}
