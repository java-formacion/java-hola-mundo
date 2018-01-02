package com.ipartek.formacion.ejercicios.herencia;

public class Piolin extends Canario {
	
	String sexo;
	int edad;
	int numPeliculas;
	public Piolin(String sexo, int edad, float tamanio, int numPeliculas) {
		super(sexo, edad, tamanio);
		this.numPeliculas = numPeliculas;
	}

}
