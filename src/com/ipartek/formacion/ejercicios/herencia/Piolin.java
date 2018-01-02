package com.ipartek.formacion.ejercicios.herencia;

public class Piolin extends Canario {
	
	String sexo;
	int edad;
	int numPeliculas;
	
	public Piolin(String sexo, int edad, double tamanio, int numPeliculas) {
		super(sexo, edad, tamanio);
		this.numPeliculas = numPeliculas;
	}
	
	public static void main(String[] args) {
		
		Piolin p = new Piolin("M", 12, 1.20, 2);
		Loro l = new Loro("H", 10, 'N', "blanco");
		
		p.quienSoy("H");
		l.quienSoy("M");
		
		p.altura(1.25);
		
		l.deDondeEres('N');
		
		
	}

}
