package com.ipartek.formacion.helloworld.capitulo2;

public class Burbuja {
	static int [] numeros = {8,5,7,10,2,3,6,1,4,9};
	public static void main(String[] args) {
		mostrarArray();
		ordenarArray();
		mostrarArray();
	}
	private static void mostrarArray() {
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
	}
	private static void ordenarArray() {
		for (int i = 0; i < numeros.length-1; i++) {
			for (int j = 1; j < numeros.length; j++) {
				if(numeros[j]<numeros[j-1]) {
					int temp=numeros[j];
					numeros[j] = numeros[j-1];
					numeros[j-1] = temp;
					
				}
			}
		}
		
	}
}
