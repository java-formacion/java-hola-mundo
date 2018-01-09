package com.ipartek.formacion.ejemplo.poo.excepciones;

public class EjemploExcepciones {

	public static void main(String[] args) {

		int a = 5, b = 1, div;

		String s = null;

		try {

			div = a / b;
			int[] arr = new int[2];
			arr[2] = 5;

			System.out.println(s.toUpperCase());
		} catch (ArithmeticException ae) {

			div = Integer.MAX_VALUE;

		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("Cagadon en array");
			System.out.println(aioobe.getMessage());
			return;
		}catch (Exception e) {
			System.out.println("Error no esperado");
			System.out.println(e.getMessage());
			return;
		}

		System.out.println(div);

	}

}
