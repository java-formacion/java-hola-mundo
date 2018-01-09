package com.ipartek.formacion.ejemplo.poo.presentacionconsolas;

import javax.swing.plaf.synth.SynthScrollBarUI;

import com.ipartek.formacion.ejemplo.poo.tipos.Poligono14;
import com.ipartek.formacion.ejemplo.poo.tipos.Punto;

public class Main {

	public static void main(String[] args) {
		Poligono14 pol=new Poligono14();
		pol.add(new Punto(1,2));
		pol.add(new Punto(3,4));
		
		System.out.println(pol);
		
		// TODO Sirve para recordar que hacer o por donde continuar
		System.out.println("Hola");
		Punto p;
		p = new Punto(6, 4);
		p.setX(5);
		System.out.println(p);

		Object o = p;
		System.out.println(o.toString());

		Punto pt2 = (Punto) o;
		System.out.println(pt2);

		Object o2 = new Object();

		if (o2 instanceof Punto) {
			Punto pt3 = (Punto) o2;

		}
		else {
			System.out.println("Burro");
		}

		System.out.println(pt3.getX());

	}

}
