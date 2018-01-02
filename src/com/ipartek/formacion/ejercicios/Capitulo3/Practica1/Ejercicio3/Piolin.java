package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

public class Piolin extends Canario {

	private int numPelicualas;

	public int getNumPelicualas() {
		return numPelicualas;
	}

	public void setNumPelicualas(int numPelicualas) {
		this.numPelicualas = numPelicualas;
	}

	public Piolin(char sexo, int edad, double tamano, int numPeliculas) {
		super(sexo, edad, tamano);
		this.numPelicualas = numPeliculas;
	}

	public static void main(String[] args) {
		Piolin p = new Piolin('m', 20, 5.6, 8);
		p.QuienSoy(p);
		p.altura(p);
		p.setTamano(20);
		p.altura(p);

		Loro l = new Loro('m', 10, 's', "rojo");
		l.QuienSoy(l);
		l.deDondeEres(l);
		l.setRegion('n');
		System.out.println("Numero de aves creadas: " + Ave.getAvesCreadas());
	}

}
