package Ejercicio.repaso;

public class Aplicacion {

	
	public static void main(String[] args) {
		
		
		
		Juego juego1 = new Juego(5);
		Juego juego2 = new Juego(7);
		juego1.quitarVida();
		juego1.mostrarVidasRestantes();
		juego1.reiniciarPartida();
		juego1.mostrarVidasRestantes();
		juego1.actualizaRecord();
		juego2.actualizaRecord();
	}
}
