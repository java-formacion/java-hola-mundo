package com.ipartek.formacion.ejemplopoo.presentacionconsola;

import com.ipartek.formacion.ejemplopoo.tipos.Poligono;
import com.ipartek.formacion.ejemplopoo.tipos.Poligono14;
import com.ipartek.formacion.ejemplopoo.tipos.Punto;
import com.ipartek.formacion.ejemplopoo.tipos.PuntoException;
import com.ipartek.formacion.ejemplopoo.tipos.PuntoNombre;

public class Main {
	public static void main(String[]args) {
		PuntoNombre ptn;
		try
		{
			ptn = new PuntoNombre("Santutxu", 5, 1);
		}
		catch(PuntoException pe)
		{
			System.out.println("Se ha detectado un punto no válido");
			System.out.println("Se utilizará un punto por defecto");
			ptn = new PuntoNombre("Bilbao");
		}
		
		System.out.println(ptn);
	}
	public static void mainPoligonoPuntoNombre(String[] args) {
		Poligono pol = new Poligono();
		
		pol.add(new Punto(1,2));
		pol.add(new PuntoNombre("Bilbao"));
		pol.add(new PuntoNombre("Santutxu", 2, 3));
		
		System.out.println(pol);
	}
	
	public static void mainPuntoNombre(String[] args){
		PuntoNombre ptn;
		ptn = new PuntoNombre("Bilbao");
		
		//ptn.setNombre("Bilbao");
		System.out.println(ptn.getNombre());
		
		ptn.setX(10);
		System.out.println(ptn.getX());
		System.out.println(ptn);
	}
	public static void mainPoligono(String[] args) {
		Poligono pol = new Poligono();
		
		pol.add(new Punto(1,2));
		pol.add(new Punto(3,4));
		
		System.out.println(pol);
		
		System.out.println(pol.getPunto(0));
	}
	public static void mainPoligono14(String[] args) {
		Poligono14 pol = new Poligono14();
		
		pol.add(new Punto(1,2));
		pol.add(new Punto(3,4));
		
		System.out.println(pol);
		
		System.out.println(pol.getPunto(0));
	}
	public static void mainPunto(String[] args) {
		Punto p;
		p = new Punto(6, 4);
		p.setX(5);
		System.out.println(p);

		Object o = p;
		System.out.println(o);

		if (o instanceof Punto) {
			Punto pt2 = (Punto) o;

			System.out.println(pt2);
			
			pt2 = null;
		} else {
			System.out.println("No ha colado");
		}
		
		o = null; p = null;
		
		Object o2 = new Object();

		if (o2 instanceof Punto) {
			Punto pt3 = (Punto) o2;

			System.out.println(pt3.getX());
		} else {
			System.out.println("PEAZO BURROOOOOO");
		}
	}

}
