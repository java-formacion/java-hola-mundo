package com.ipartek.formacion.capitulo3;

public class Piolin extends Canario {

	
	int numeroDePeliculas;

	
	
	
	public Piolin(String sexo, int edad, float tamaño, int numeroDePeliculas) {
		super(sexo, edad, tamaño);
		this.numeroDePeliculas = numeroDePeliculas;
		
		
	}




	public static void main(String[] args) {
	
		Piolin p = new Piolin("H", 10, 16, 5);
		Loro l = new Loro("M", 35, "S", "rojo");
		
		p.quienSoy();
		l.quienSoy();
		p.calcularAltura(p);
		l.deDondeEres(l);
		l.region="N";
		numAvesCreadas();
		
	}
	
}
