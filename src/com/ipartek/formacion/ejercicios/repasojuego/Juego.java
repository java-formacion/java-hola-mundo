package com.ipartek.formacion.ejercicios.repasojuego;

/**
 * Main para el juego
 * @author java
 *
 */
public class Juego {

	/**
	 * 
	 * @param args
	 */
	
	private int vidas=5;
	
	
	
	public int getVidas() {
		return vidas;
	}



	public void setVidas(int vidas) {
		this.vidas = vidas;
	}



	public Juego(int vidas) {
		
		this.vidas = vidas;
		System.out.println("El juego empieza con "+vidas+" vidas restantes.");
	}

	public void muestraVidasRestantes() {
		System.out.println("El numero de vidas restantes es de: "+ vidas);
	}


	public static void main(String[] args) {
		
		
		
		

	}

}