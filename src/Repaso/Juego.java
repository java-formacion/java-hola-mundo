package Repaso;

public abstract class Juego {
	private int vidas;
	private int vidasIniciales;
	private static int record=0;
	
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

	public Juego(int vidasIniciales) {
		super();
		this.vidasIniciales = vidasIniciales;
	}
	
	public void MuestraVidasRestantes() {
		System.out.println("Te quedan "+this.vidas+" vidas");
	}
	
	public boolean QuitaVida () {
		this.vidas--;
		boolean a=true;
		if(this.vidas==0) {
			System.out.println("Te quedan "+this.vidas+" vidas");
			a=true;
		}else {
			System.out.println("Juego terminado, vidas: "+this.vidas);
			a=false;
		}
		return a;
	}
	
	public void ReiniciarPartida() {
		this.vidas=this.vidasIniciales;
	}
	
	public void ActualizarRecord() {
		if(this.vidas==this.record) {
			System.out.println("Record alcanzado!!");
		}else if(this.vidas>this.record) {
			this.record=this.vidas;
			System.out.println("El record se ha batido");
			System.out.println("El nuevo record es, "+this.record);
			}else {System.out.println("No has llegado al record");}
	}
	public abstract void Juega();
}
