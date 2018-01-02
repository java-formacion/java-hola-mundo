package com.ipartek.formacion.javapoo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Mikel", "Parra", 26);
		Persona p2 = new Persona("Mikel", "Parra", "605679860", 26);
		
		System.out.println(Persona.numPersonas);
		Persona.numPersonas = 2;
		System.out.println(Persona.numPersonas);
		System.out.println(Persona.numPersonas);
		
	}

}
