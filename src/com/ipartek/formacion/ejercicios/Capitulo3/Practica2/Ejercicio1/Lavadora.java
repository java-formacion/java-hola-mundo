package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;

public class Lavadora extends Aparato {

	private double alto, ancho;

	public Lavadora(double consumo, double precio, double alto, double ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}

}
