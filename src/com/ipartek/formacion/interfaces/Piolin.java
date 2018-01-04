package com.ipartek.formacion.interfaces;

public class Piolin extends Canario implements Hablador {

	public int numPelis;

	public Piolin(char sexo, int edad, String canta, int numPelis) {
		super(sexo, edad, canta);
		this.numPelis = numPelis;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

}
