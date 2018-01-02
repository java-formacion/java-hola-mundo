package com.ipartek.formacion.ejercicios.Capitulo3.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona("Mikel","Larruzea",25,655754421);
		//se le tiene que asignar las variable por obligacion.
		//p.estatico++;
		//System.out.println(p.estatico);
		
		Persona p1 = new Persona("Mikel","Larruzea",25,655754421);
		//p1.estatico++;
		//variable statica es comun para todas las instancias
		//variable estatica es una para todas las instancias
		//no hace falta crear una instancia pra acceder a una variable static
		
		
		Persona p2 = new Persona("Mikel","Larruzea",25,655754421);
		//System.out.println(p2.estatico);
		
		Persona p3 = new Persona("Mikel","Larruzea",25,655754421);
		//System.out.println(p3.estatico);
		
		Persona p4 = new Persona("Mikel", "Larruzea", 25);
		//System.out.println(p4.estatico);
		
		System.out.println(Persona.estatico);
	}

}
