package com.ipartek.formacion.capitulo3;

public class TV extends Aparato implements Hablador{

	
	public char teletexto;
	public int pulgadas;
	
	public TV(int consumo, int precio, char teletexto, int pulgadas) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.pulgadas = pulgadas;
	}

	
	public void hablar() {
		
		System.out.println("Hola soy una TV y se hablar");
		
	}
	
	
	
}
