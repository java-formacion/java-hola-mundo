package com.ipartek.formacion.interfaces;

public class Buitre extends Ave {

	public int velocidadVuelo, peso;

	public Buitre(char sexo, int edad, int velocidadVuelo, int peso) {
		super(sexo, edad);
		this.velocidadVuelo = velocidadVuelo;
		this.peso = peso;
	}

}
