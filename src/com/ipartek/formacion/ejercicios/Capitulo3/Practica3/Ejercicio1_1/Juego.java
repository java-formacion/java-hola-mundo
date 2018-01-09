package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Ejercicio1_1;

public class Juego {

	public int numVidas;

	
	public Juego(int numVidas) {
		super();
		this.numVidas = numVidas;
	}
	
	public void MuestraVidasRestantes() {
		System.out.println("Numero de vidas: "+numVidas);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Juego j=new Juego(5);
		
		j.MuestraVidasRestantes();
		
		j.numVidas-=1;
		
		j.MuestraVidasRestantes();
		
		Juego j1=new Juego(5);
		
		j1.MuestraVidasRestantes();
		j.MuestraVidasRestantes();
		
	}
	
}
