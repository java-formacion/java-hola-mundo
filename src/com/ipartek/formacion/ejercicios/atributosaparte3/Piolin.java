package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Piolin extends Canario {

	// public char sexo;
	// public int edad;
	// int tamano;
	public int peliculas;

	public Piolin(char sexo, int edad, int tamano, int peliculas) {

		super(sexo, edad, tamano);//llamada al constructor del padre (no a la variable)
		this.peliculas = peliculas;

	}
	
	public static void main(String[] args) {

		Piolin pio = new Piolin ('M',10,12,6);
		Loro lor = new Loro('H', 12, 'N', "Azul");
		
		pio.quienSoy();
		lor.quienSoy();
		
		pio.altura();
		lor.deDondeEres();
		
		pio.tamano = 15;
		pio.altura();
		
		lor.setRegion() = 'S';
		lor.deDondeEres();
		
		

	}

}