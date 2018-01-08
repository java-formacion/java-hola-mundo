package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Excepciones;

public class EjemploExcepcion {

	public static void main(String[] args) {
		int a=6,b=2,div;
		
		try {
			div = a/b;
			//cuando busca el error salta al cach y no ejecuta las lineas siguientes
			int[] arr=new int[2];
			arr[2]=5;
		}catch (ArithmeticException e) {
			div = Integer.MAX_VALUE;//el mallor numero posible
		}catch(ArrayIndexOutOfBoundsException ai) 
		{
			System.out.println("Error interno array");
			System.out.println(ai.getMessage());
			return;
		}
		finally {
			System.out.println("Cierres de conexiones, ficheros, etc");
		}
		
		System.out.println(div);

	}

}
