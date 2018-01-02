package com.ipartek.formacion.clases;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona("sdvbf", "rfkfm", 28, 123456789);
		Persona.estatico++;
		System.out.println(p.estatico);

		Persona p1 = new Persona("sdrg", "vbnhm", 20, 123456789);
		Persona.estatico++;
		System.out.println(p1.estatico);

		Persona p2 = new Persona("sgwz", "dfsb", 21, 123456789);
		System.out.println(p2.estatico);

		Persona p3 = new Persona("ujkgh", "aqerm", 22, 123456789);
		System.out.println(p3.estatico);

		Persona p4 = new Persona("dfbdgn", "sfkbs", 23, 123456789);
		System.out.println(p4.estatico);

		Persona p5 = new Persona("lxqkp", "rdty", 25);
		System.out.println(p5.estatico);

	}

}
