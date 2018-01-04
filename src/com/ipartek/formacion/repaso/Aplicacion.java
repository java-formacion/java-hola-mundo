package com.ipartek.formacion.repaso;

public class Aplicacion {

	public static void main(String[] args) {
		
		Juego j1 = new Juego(10);

		j1.mostrarVidasRestantes();

		j1.quitarVida();
		j1.mostrarVidasRestantes();
		
		j1.reiniciarPartida();
		j1.mostrarVidasRestantes();
		
		j1.actualizarRecord();

	}

}
