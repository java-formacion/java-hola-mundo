package com.ipartek.formacion.capitulo2;

public class BubbleSort {

	static int[] aNumeros = {3,0,1,8,7,6,5,4,6,9};
	
	
	static int[] ordenar() {
		int aux;
		for (int i = 0; i < aNumeros.length; i++) {
			if (aNumeros[i] > aNumeros[i+1]) {
				aux = aNumeros[i+1];
				aNumeros[i+1] = aNumeros[i];
				aNumeros[i] = aux;	
			}
		}
		return aNumeros;
	}
	
	public static void main(int[] args) {

		ordenar();
		
	}

}
