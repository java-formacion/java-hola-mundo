package com.ipartek.formacion.ejemplopoo.excepciones;

public class EjemploExcepciones {

	public static void main(String[] args) {

		int a = 5, b = 1, div;

		try {

			div = a / b;
			int[] arr = new int[2];
			arr[1] = 5;

			String s = null;

			System.out.println(s.toUpperCase());

		} catch (ArithmeticException ae) {

			div = Integer.MAX_VALUE;

		} catch (ArrayIndexOutOfBoundsException aioobe) {

			System.out.println("Error interno de array");
			System.out.println(aioobe.getMessage());
			return;

		} catch (Exception e) {

			System.out.println("Error no esperado");
			System.out.println(e.getMessage());
			return;

		} finally {

			System.out.println("Me ejecuto por MIS NARICES");
			System.out.println("Cierres de conexiones, ficheos, etc");

		}

		System.out.println(div);

	}

}
