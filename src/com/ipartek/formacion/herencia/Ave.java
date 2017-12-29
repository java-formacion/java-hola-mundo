package com.ipartek.formacion.herencia;

public class Ave {

	public char sexo;
	public int edad;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Ave(char sexo, int edad) {
		this.sexo = sexo;
		this.edad = edad;
	}

	public void quienSoy() {
		System.out.println("Mi sexo es " + sexo);
		System.out.println("Mi edad es " + edad);
	}

}
