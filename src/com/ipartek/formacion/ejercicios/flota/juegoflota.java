package com.ipartek.formacion.ejercicios.flota;

import java.util.Scanner;

public class juegoflota {
	
	static int [] [] aMar= {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,1,1}};
	static char [] [] aMapa= {{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'},{'O','O','O','O','O'}};
	
	public static void main(String[] args) {
		do{
			int cont=5;
			int aciertos=0;
			boolean a=false;
			System.out.println("tienes 15 intentos");
			
			System.out.println("mapa actual:");
			
			for (int i = 0; i < aMapa.length; i++) {
				for (int j = 0; j < aMapa[i].length; j++) {
					
					System.out.print(aMapa[i][j] +"\t");	
				}
			
				System.out.println();
				System.out.println("--------------------------------------");
			}
			
			do {
			
			int c=pideColumna();
			int f=pideFila();
			if(comparativa(c, f, a)) {aciertos++;}
			cont--;
			System.out.println("-------------------------------");
			System.out.println("te quedan "+cont+" intentos");
			mostrarMapa(c, f);
			System.out.println("Llebas "+aciertos+" aciertos");
			
			}while((aciertos!=2)||(cont>0));
			
			//boolean jugar = volverJugar();
		}while(volverJugar());
	}

	private static boolean volverJugar() {
		// TODO Auto-generated method stub
		System.out.println("Quieres volver a jugar? S/N");
		Scanner sc = new Scanner(System.in);
		String respuesta = sc.next();
		if(respuesta.equals("s")) {
			return true;
		}else {
			return false;
		}
	}

	private static void mostrarMapa(int c, int f) {
		System.out.println("mapa actual:");
		
		for (int i = 0; i < aMapa.length; i++) {
			for (int j = 0; j < aMapa[i].length; j++) {
				
				System.out.print(aMapa[i][j] +"\t");	
			}
			System.out.println();
			System.out.println("--------------------------------------");
		}
	}

	private static boolean comparativa(int c, int f, boolean a) {
		
		for (int i = 0; i < aMar.length; i++) {
			for (int j = 0; j < aMar[i].length; j++) {
				
				if((i==f)&&(j==c)) {
					if(aMar[i][j]==1) {
						aMapa[i][j]='X';
						System.out.println("Has dado a un barco");
						a=true;
					}else {
						aMapa[i][j]='A';
						System.out.println("AGUA!!");
						a=false;
					}
				}
			}
	  }	return a;
	}

	private static int pideFila() {
		// TODO Auto-generated method stub
		System.out.println("introduce coordenadas de 0 a 4:");
		System.out.println("Fila: ");
		int f=leeCifra();
		return f;
	}

	private static int pideColumna() {
		// TODO Auto-generated method stub
		System.out.println("introduce coordenadas de 0 a 4:");
		System.out.println("Columna: ");
		int c=leeCifra();
		return c;
		
	}
	private static int leeCifra() {
		
		boolean valor=false;
		int numero;
		do {
		Scanner sc = new Scanner(System.in);
		numero = sc.nextInt();
		//System.out.println(numero);
		if((numero>4)||(numero<0)) {
			System.out.println("numero erroneo introduce del 0 al 4");
			valor=true;
		}else {
			valor=false;
			System.out.println("valor correcto");
		}
		}while(valor==true);
		return numero;
	}
}
