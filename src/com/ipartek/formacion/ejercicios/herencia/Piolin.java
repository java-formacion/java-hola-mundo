package com.ipartek.formacion.ejercicios.herencia;

public class Piolin extends Canario {
	
	int numPeliculas;
	
	public Piolin(String sexo, int edad, double tamanio, int numPeliculas) {
		super(sexo, edad, tamanio);
		this.numPeliculas = numPeliculas;
	}
	
	//Getters y Setters
	

	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}

	public static void main(String[] args) {
		
		Piolin p = new Piolin("M", 12, 1.20, 2);
		Loro l = new Loro("H", 10, 'N', "blanco");
		
		p.quienSoy("H");
		l.quienSoy("M");
		
		p.altura(1.25);
		
		l.deDondeEres('N');
		
		p.setTamanio(1.20);
		System.out.println("El tamaño modificado del piolin es " + p.getTamanio());
		
		
		l.getRegion();
		l.setRegion('O');
		l.deDondeEres(l.getRegion());
		
		System.out.println("El numero de aves creadas es " + numAves);
		
		p.nombres.setNombreAve("Piolin");
		p.nombres.setNombreDuenio("Rodolfo");
		
		Piolin[] piolin = new Piolin[3];
		
		
		
		
	}

}
