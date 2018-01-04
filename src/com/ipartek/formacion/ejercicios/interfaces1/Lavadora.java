package com.ipartek.formacion.ejercicios.interfaces1;

public class Lavadora extends Aparato {

	double alto;
	double ancho;

	public Lavadora(double consumo, double precio, double alto, double ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}

}
