package com.ipartek.formacion.ejercicios.herencia;

public class Ave {
	public String sexo;
	public int edad;
	public static int numAves=0;
	
	public Ave(String sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
		
	}
	
	public void quienSoy(String sexo) {
		System.out.println("soy " + sexo);
		
	}

}
