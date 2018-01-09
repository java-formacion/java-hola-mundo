package com.ipartek.formacion.ejemplopoo.presentacionConsola;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		/*Object o=new Object();
		//System.out.println(o.toString());
		
		Vector v=new Vector();
		v.add(new Object());
		Number[] n=new Number[2];
		n[0]=new Integer(5);
		n[1]=new Double(2.3);
		
		for(Number numero:n) {
			System.out.println(numero.doubleValue());	
		}		*/
		
		//EXCEPCIONES: "no soluciona", parchea una solucion especifica con excepciones diferentes
		int a=2, b=1, div;
		try {
			div=a/b;
			int [] arr = new int [2];
			arr[5]=3;
		}catch (ArithmeticException e) {
			div=4;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
			System.out.println(e.getMessage());
			return;
		}
		//excepciones genericas, no esperadas, sin solucion concreta, tiene que ir el ultimo xq los Exception 
		//especificos son hijos de la clase Exception
		catch(Exception e){
			System.out.println("error fatal");
			System.out.println(e.getMessage());
			return;
		}
		//finally se ejecuta siempre, para cerrar ficheros o conexiones, etc
		finally {
			System.out.println("ejecuntandose finally");
		}
		
		System.out.println(div);
	}
}