package com.ipartek.formacion.ejemplopoo.excepciones;

public class EjemploExcepciones {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int a = 5, b = 1, div = 0;
		String s = null;
		
		try 
		{
			div = a / b;
			int[] arr = new int[2];
			arr[1] = 5;
			
			System.out.println(s.toUpperCase());
		} 
		catch(ArithmeticException ae) 
		{
			div = Integer.MAX_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("Error interno de array");
			System.out.println(aioobe.getMessage());
			return;
		}
		catch(Exception e)
		{
			System.out.println("Error no esperado");
			e.printStackTrace(System.err);
			System.out.println(e.getMessage());
			return;
		}
		finally
		{
			System.out.println("Cierres de conexiones, ficheros, etc");
		}
		
		System.out.println(div);
	}

}
