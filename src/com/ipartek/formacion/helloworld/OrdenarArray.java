package com.ipartek.formacion.helloworld;
import java.util.*;
public class OrdenarArray {

	/**
	 * 
	 * Ordenar array 3 0 1 8 7 2 5 4 6 9
	 * 
	 */

	public static void main(String[] args) {
		int [] numeros = {3, 0, 1, 8, 7, 2, 5, 4, 6, 9};
		Arrays.sort(numeros);

		for (int n : numeros) {
		       System.out.println(n);
		}
		
	}
}
