package com.ipartek.formacion.ejercicios.interfaces1;

public class TV extends Aparato {

	char teletexto;
	int antiguedad;

	public TV(double consumo, double precio, char teletexto, int antiguedad) {

		super(consumo, precio);
		this.teletexto = teletexto;
		this.antiguedad = antiguedad;
	}
}
