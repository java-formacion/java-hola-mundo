package com.ipartek.formacion.herencia.ejercicio3;

public class Piolin extends Canario {

	public int numPelis;

	public Piolin(char sexo, int edad, double tamano, int numPelis) {
		super(sexo, edad, tamano);
		this.numPelis = numPelis;
	}

	public int getNumPelis() {
		return numPelis;
	}

	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}

	public static void main(String[] args) {
		
		Piolin[] jaula = new Piolin[3];
		Piolin pio = new Piolin('M', 20, 16.5, 8);
		
		
	}

}
