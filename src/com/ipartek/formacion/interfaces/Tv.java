package com.ipartek.formacion.interfaces;

public class Tv extends Aparato implements Hablador {

	public String teletexto;
	public int antig;
	
	public Tv(int consumo, int precio, String teletexto, int antig) {
		super(consumo, precio);
		this.teletexto = teletexto;
		this.antig = antig;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

}
