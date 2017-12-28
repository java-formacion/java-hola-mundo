package com.ipartek.formacion.helloworld.capitulo2;

public class ArrayBurbuja {

	static int[] aBailarines = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };

	public static void main(String[] args) {
		System.out.println("Array desordenado: ");
		System.out.println("------------------------------------");
		listar();
		System.out.println("\n------------------------------------");
		ordenarBurbuja(aBailarines);
		System.out.println("Array ordenado: ");
		System.out.println("------------------------------------");
		listar();
		System.out.println("\n------------------------------------");


	}

	public static void listar() {
		for (int i = 0; i < aBailarines.length; i++) {
			System.out.print(aBailarines[i]+" ");
		}
	}
	public static void ordenarBurbuja(int array[]) {
		for(int i = 0; i < array.length; i++){
			 for (int j = i + 1; j < array.length; j++){
				 if(array[j]< array[i]){
					 int  aux = array[i];
					 array[i] = array[j];
					 array[j] = aux;
					 
				 }
				 
			 }
			
		}
		
	}
}
