package com.ipartek.formacion.capitulo3;

public class Lavadora extends Aparato {
	
	
	public int alto;
	public int ancho;
	
	
	public Lavadora(int consumo, int precio, int alto, int ancho) {
		super(consumo, precio);
		this.alto = alto;
		this.ancho = ancho;
	}
	
	

}
