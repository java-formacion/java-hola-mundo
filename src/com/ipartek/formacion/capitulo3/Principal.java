package com.ipartek.formacion.capitulo3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona p = new Persona("Borja", "Gonzalez", 26, "123456789");
		Persona.estatico++;
		System.out.println(Persona.estatico);
		Persona p2 = new Persona("Borja", "Gonzalez", 26, "123456789");
		Persona.estatico++;
		System.out.println(Persona.estatico);
		Persona p3= new Persona("Borja", "Gonzalez", 26, "123456789");
		System.out.println(Persona.estatico);
		Persona p4 = new Persona("Borja", "Gonzalez", 26, "123456789");
		System.out.println(Persona.estatico);
		Persona p5 = new Persona("Borja", "Gonzalez", 26, "123456789");
		System.out.println(Persona.estatico);
		
		Persona per = new Persona("Borja", "Gonzalez", 26);
		System.out.println(Persona.estatico);
		
		
	}

}
