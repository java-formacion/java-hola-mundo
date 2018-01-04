package com.ipartek.formacion.interfaces;

public class Piolin extends Canario implements Hablador {

	private int numPelis;

	public Piolin(char sexo, int edad, boolean canta, int numPelis) {
		super(sexo, edad, canta);
		this.numPelis = numPelis;
	}

	public int getNumPelis() {
		return numPelis;
	}

	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

	public void hablar() {

		System.out.println("Soy un Piolin");

	}

}
