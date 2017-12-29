package com.ipartek.formacion.herencia;

public class Piolin extends Canario {

	public int numPelis;

	public static void main(String[] args) {
		Piolin pio = new Piolin('M', 20, 16.5, 8);
		Loro lor = new Loro('H', 50, 'S', "Azul");
	}

	public Piolin(char sexo, int edad, double tamano, int numPelis) {
		super(sexo, edad, tamano);
		this.numPelis = numPelis;
	}

}
