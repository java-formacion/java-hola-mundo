package com.ipartek.formacion.ejercicios.herencia;

public class Canario extends Ave {
	
	
	public String sexo;
	public int edad;
	public float tamanio;
	
	public Canario(String sexo, int edad, float tamanio) {
		super(sexo, edad);
		this.sexo = sexo;
		this.edad = edad;
		this.tamanio = tamanio;
	}
	
	

}
