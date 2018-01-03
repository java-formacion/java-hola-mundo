package com.ipartek.formacion.herencia.ejercicio2;

public class Piolin extends Canario {

	public int numPelis;

	public Piolin(char sexo, int edad, int tamano, int numPelis) {
		super(sexo, edad, tamano);
		this.numPelis = numPelis;
	}

	public static void main(String[] args) {

		Piolin pio = new Piolin('M', 5, 32, 20);
		Loro lor = new Loro('H', 3, 'S', "Azul");

		pio.quienSoy();
		lor.quienSoy();

		pio.getAltura();

		lor.deDondeEres();

		pio.tamano = 12;

		pio.getAltura();

		lor.region = 'N';

		Ave.getNumAvesCreadas();

	}

}
