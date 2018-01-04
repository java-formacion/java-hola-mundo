package com.ipartek.formacion.interfaces;

public class Radio extends Aparato implements Hablador {

	public String casette;
	public int potencia;
	
	public Radio(int consumo, int precio, String casette, int potencia) {
		super(consumo, precio);
		this.casette = casette;
		this.potencia = potencia;
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		
	}

}
