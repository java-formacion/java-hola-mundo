package Ejercicio.repaso;

public abstract class Juego {

	
	private int vidas;
	private int vidasIniciales;
	private int record = 0;
	
	
	
	public Juego(int vidas) {
		
		this.vidas = vidas;
		this.vidasIniciales = vidas;
	}


	


	public int getVidas() {
		return vidas;
	}





	public void setVidas(int vidas) {
		this.vidas = vidas;
	}





	public int getVidasIniciales() {
		return vidasIniciales;
	}





	public void setVidasIniciales(int vidasIniciales) {
		this.vidasIniciales = vidasIniciales;
	}





	public int getRecord() {
		return record;
	}





	public void setRecord(int record) {
		this.record = record;
	}





	public void mostrarVidasRestantes() {
		
		
		System.out.println("Vidas restantes : "+ vidas);
	}
	
	
	public boolean quitarVida() {
		
		vidas --;
		if (vidas > 0) {
			return true;
		}
		else {
			System.out.println("Juego terminado, no te quedan mas vidas");
			return false;
			
		}
	}
	
	public int reiniciarPartida() {
		
		this.vidas = vidasIniciales;
		
		return this.vidas;
	}
	
	public void actualizaRecord() {
		
		if(record == vidas)System.out.println("Se ha alcanzado el record");
		else if(record < vidas) {
			record = vidas;
			System.out.println("Se ha batido el record!! su nuevo valor es" + record);
			
			
		}
	}
	
	
	public abstract void juega();
	
	
	
	
}
