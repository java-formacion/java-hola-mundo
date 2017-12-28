package com.ipartek.formacion.ejercicios.Clases;

public class Loro extends Ave{

	private static char region;
	private static String color;
	
	
	public Loro(char s, int e,char r,String c) {
		super(s, e);
		region = r;
		color=c;
	}

	public static void main(String[] args) {
		deDondeEres();

	}

	private static void deDondeEres() {
		/*switch (region) {
		case n:
			
			break;

		default:
			break;
		}*/
		
	}

}
