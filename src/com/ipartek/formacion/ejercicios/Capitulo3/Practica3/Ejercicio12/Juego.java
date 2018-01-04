package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Ejercicio12;

import sun.tools.jar.resources.jar;

public class Juego {

	private int numVidas;
	private int gNumVidas;
	public Record r;

	public Record getR() {
		return r;
	}

	public void setR(Record r) {
		this.r = r;
	}

	public Juego(int numVidas, int gNumVidas, Record r) {
		super();
		this.numVidas = numVidas;
		this.gNumVidas = gNumVidas;
		this.r = r;
	}

	public void MuestraVidasRestantes() {
		//System.out.println("Numero de vidas: " + getNumVidas());
		System.out.println();
	}

	public boolean QuitarVida() {
		/*setNumVidas(getNumVidas() - 1);
		if(getNumVidas()>0) {
			return true;
		}else {
			return false;
		}*/
		return false;
	}
	public static void reiniciarVidas() {
		
		
	}

	public static void main(String[] args) {
		
		//Juego j = new Juego(5, 5, 7);
		
		/*if(!QuitarVida()) {
			System.out.println("Juego terminado!!");
		}*/
		reiniciarVidas();
	}

	
	

}
