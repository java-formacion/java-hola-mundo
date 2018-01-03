package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Piolin extends Canario {

	// public char sexo;
	// public int edad;
	// int tamano;
	private int peliculas;

	public Piolin(char sexo, int edad, int tamano,String nombreAve,String nombreDueno, int peliculas) {

		super(sexo, edad, nombreAve, nombreDueno, tamano);//llamada al constructor del padre (no a la variable)
		this.peliculas = peliculas;

	}
	
	public int getpeliculas() {
		return peliculas;
	}
	
	public void setNumPelis() {
		this.peliculas = peliculas;
	}
	
	public static void main(String[] args) {

		Piolin pio = new Piolin('M', 9, 13, "Piolin", "Janai", 20);
		Loro lor = new Loro('H', 30, "Green", "Patri", 'S', "Verde");
		
		pio.quienSoy();
		lor.quienSoy();
		
		pio.altura();
		lor.deDondeEres();
		
		pio.tamano = 15;
		pio.altura();
		
		lor.setRegion = 'S';
		lor.deDondeEres();
		
		

	}

}