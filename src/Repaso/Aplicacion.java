package Repaso;

public class Aplicacion {

	public static void main(String[] args) {
		int v=5;
		Juego j=new Juego (v);
		j.MuestraVidasRestantes();
		v=v-1;
		j.MuestraVidasRestantes();
		Juego j2=new Juego (5);
		j.MuestraVidasRestantes();
		j2.MuestraVidasRestantes();
		
		j.QuitaVida();
		j.MuestraVidasRestantes();
		j.ReiniciarPartida();
		j.MuestraVidasRestantes();
		j.ActualizarRecord();
		j2.ActualizarRecord();
	}
}
