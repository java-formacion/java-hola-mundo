package com.ipartek.formacion.ejercicios.clasepersona;

public class Principal {

	public static void main(String[] args) {
		Persona p = new Persona("Pavel", "Goikoetxea", 25, "688619488");
		Persona.estatico++;
		System.out.println(p.estatico);
		Persona p1 = new Persona("Alberto", "Gomez", 30, "601335876");
		Persona.estatico++;
		System.out.println(p1.estatico);
		Persona p2 = new Persona("Roberto", "Gimenez", 19, "665449112");
		System.out.println(p2.estatico);
		Persona p3 = new Persona("Sebastian", "Loeb", 38, "666001443");
		System.out.println(p3.estatico);
		
		Persona p4 = new Persona("Ane", "Fuentes", 28);
		Persona p5 = new Persona("Ane", "Prieto", 23);
		Persona p6 = new Persona("Monica", "Lozano", 28);
		

	}

}
