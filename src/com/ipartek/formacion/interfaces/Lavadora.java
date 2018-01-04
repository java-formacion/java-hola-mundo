package com.ipartek.formacion.interfaces;

public class Lavadora extends Aparato {

	public int alto, ancho;

	public Lavadora(int consumo, int precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}

}
