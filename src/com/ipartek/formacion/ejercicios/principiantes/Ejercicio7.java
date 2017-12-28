package com.ipartek.formacion.ejercicios.principiantes;

public class Ejercicio7 {

	public static boolean esMultiplo(int n1,int n2){
		if (n1%n2==0)
			return true;
		else
			return false;
	}	
	public static void main(String[] args) {
		
		int c= 5;
		
		
		
		if (c>0) {
			System.out.println("el numero es positivo" + " " + c);
		}
		
		else {
			System.out.println("el numero es negativo");
		}
		
		if (c<100) {
			System.out.println("el numero es menor a 100.");
		}
		else {
			System.out.println("el numero es mayor a 100.");
		}
		
		if (c < 0) {
			System.out.println("el numero es negativo");
			
		}
		
		if (c%2==0) {
			System.out.println("el numero introducido es par");
		}
		else {
			System.out.println("el numero introducido es impar");
		}
	
		
		
		}
	}

