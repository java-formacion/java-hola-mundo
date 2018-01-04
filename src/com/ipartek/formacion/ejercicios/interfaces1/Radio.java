package com.ipartek.formacion.ejercicios.interfaces1;

public class Radio extends Aparato {

	char cassete;
	double potencia;

	public Radio(double consumo, double precio, char cassete, double potencia) {
		super(consumo, precio);
		this.cassete = cassete;
		this.potencia = potencia;
	}

}
