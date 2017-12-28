package com.ipartek.formacion.ejercicios.Clases;

public class Ave {

	private static char sexo;
	private static int edad;
	
	public Ave(char s,int e) {
		sexo=s;
		edad=e;
	}
	
	public static void main(String[] args) {
		numAves();
		sacarPorPantalla();
	}

	private static void sacarPorPantalla() {
		System.out.println("Sexo: "+sexo+" edad: "+ edad);
		
	}

	private static void numAves() {
		
	}

}
