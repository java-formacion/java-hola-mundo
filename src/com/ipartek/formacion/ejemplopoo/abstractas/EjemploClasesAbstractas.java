package com.ipartek.formacion.ejemplopoo.abstractas;

public class EjemploClasesAbstractas {

	public static void main(String[] args) {

		Number[] numeros = new Number[2];

		numeros[0] = new Integer(5);
		numeros[1] = new Double(2.3);

		for (Number numero : numeros) {
			System.out.println(numero.doubleValue());
		}

	}

}
