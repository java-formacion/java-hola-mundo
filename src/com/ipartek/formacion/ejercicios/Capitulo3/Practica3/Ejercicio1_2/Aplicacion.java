package com.ipartek.formacion.ejercicios.Capitulo3.Practica3.Ejercicio1_2;

public class Aplicacion {

	public static void main(String[] args) {
		Record r = new Record(3);
		Juego j= new Juego(5, 5, r);
		
		if(!j.QuitarVida()) {
			System.out.println("gameover");
		}		
		
		j.MuestraVidasRestantes();
		j.reiniciarVidas();
		j.MuestraVidasRestantes();
		
		j.actualizarRecord();
		
		Juego j1= new Juego(3, 3, r);
		j1.actualizarRecord();
	}

}
