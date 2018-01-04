package com.ipartek.formacion.interfaces;

public class Tv extends Aparato implements Hablador{

	private boolean teletexto;
	private int antiguedad;

	public Tv(int consumo, float precio, boolean teletexto, int antiguedad) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}

	public boolean isTeletexto() {
		return teletexto;
	}

	public void setTeletexto(boolean teletexto) {
		this.teletexto = teletexto;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public void hablar() {

		System.out.println("Soy una TV");

	}

}
