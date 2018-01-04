package com.ipartek.formacion.capitulo3;

public class Radio extends Aparato implements Hablador {

	
	public char cassete;
	public int potencia;
	
	public Radio(int consumo, int precio, char cassete, int potencia) {
		super(consumo, precio);
		this.cassete = cassete;
		this.potencia = potencia;
	}

	
	public void hablar() {
		
		System.out.println("Hola soy una RADIO y se hablar");
		
	}
	
	
}
