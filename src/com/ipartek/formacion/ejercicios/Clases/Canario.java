package com.ipartek.formacion.ejercicios.Clases;

public class Canario extends Ave{

	private static double tamano;
	

	public Canario(char s, int e) {
		super(s, e);
	}

	public Canario(char s, int e,double t) {
		super(s, e);
		tamano=t;
	}
	public static void main(String[] args) {
		altura();
	}

	private static void altura() {
		if(tamano>30) {
			System.out.println("Alto");
		}else if(tamano<30 && tamano>15) {
			System.out.println("Mediano");
		}else if(tamano<15) {
			System.out.println("Pequeño");
		}
		
	}

}
