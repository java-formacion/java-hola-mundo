package com.ipartek.formacion.helloworld;

import org.omg.Messaging.SyncScopeHelper;

/**
 * Ejercicio para aprender el ambito de las variables
 * Pueden ser de CLASE, METODO o BLOQUE DE CODIGO.
 *  
 *  
 */

public class AmbitoVariables {

	// Accesible desde cualquier lugar de la clase
	int variableClaseGlobal = 89;		
	
	public static void main(String[] args) {
		
	// Accesible solo dentro de este metodo 'main'
		
	int variableMetodoLocal = 12;
		
		if (true) {
			
			int variableBloque = 9;
			
			// Sacar por pantalla todas las variables

			System.out.println(variableMetodoLocal);
			System.out.println(variableBloque);
		}
	}
}
