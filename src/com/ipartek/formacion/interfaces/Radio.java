package com.ipartek.formacion.interfaces;

public class Radio extends Aparato implements Hablador {

	private boolean casette;
	private int potencia;

	public Radio(int consumo, float precio, boolean casette, int potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}

	public boolean isCasette() {
		return casette;
	}

	public void setCasette(boolean casette) {
		this.casette = casette;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void hablar() {

		System.out.println("Soy una Radio");

	}

}
