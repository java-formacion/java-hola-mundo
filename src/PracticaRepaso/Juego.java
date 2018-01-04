package PracticaRepaso;

public class Juego {

	private int vidas, vidasInicio;
	static int record=0;
	
	public Juego(int vidas, int vidasInicio) {

		this.vidas = vidas;
		this.vidasInicio = vidasInicio;
	}

	public Juego(int vidas) {

		this.vidas = vidas;

	}

	public void MuestraVidasRestantes() {

		System.out.println("Te quedan " + vidas + " vidas");

	}
	
	
	public void QuitaVida() {
		boolean meQuedanVidas;
		vidas=vidas-1;
		if (vidas == 0) {
			System.out.println("GAME OVER");
			meQuedanVidas=false;
			
			}
		else
			System.out.println("Sigue jugando");
			meQuedanVidas=false;
	}
	
	
	public void ReiniciaPartida() {
		//Añadir un método ReiniciaPartida que asigne al atributo vidas el número de
		//vidas que se habían indicado al llamar al constructor del objeto. Para ello utilizará el
		//nuevo atributo que se ha añadido.
		
		
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public int getVidasInicio() {
		return vidasInicio;
	}

	public void setVidasInicio(int vidasInicio) {
		this.vidasInicio = vidasInicio;
	}

	public static void main(String Args[]) {

		Juego v = new Juego(5);// Crea una instancia de la clase Juego indicando que el número de vidas es 5.

		v.MuestraVidasRestantes();// Llama al método MuestraVidasRestantes del objeto creado.

		v.setVidas(v.getVidas() - 1);// Resta una vida al valor del atributo con las vidas y vuelve a llamar a
										// MuestraVidasRestantes.
		v.MuestraVidasRestantes();

		Juego vi = new Juego(5);// Crea otra instancia de la clase Juego indicando que el número de vidas es
								// también de 5.

		vi.MuestraVidasRestantes();// Llama al método MuestraVidasRestantes de la nueva instancia y luego al de la
									// instancia anterior
		v.MuestraVidasRestantes();

	}
}
