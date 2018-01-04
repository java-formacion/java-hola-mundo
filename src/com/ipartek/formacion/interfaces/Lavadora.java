package com.ipartek.formacion.interfaces;

public class Lavadora extends Aparato {

	private int ancho;
	private int alto;

	public Lavadora(int consumo, float precio, int ancho, int alto) {
		super(consumo, precio);
		this.ancho = ancho;
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

}
