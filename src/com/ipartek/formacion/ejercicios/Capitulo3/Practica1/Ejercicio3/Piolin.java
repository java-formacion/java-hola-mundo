package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;

public class Piolin extends Canario{

	private int numPelicualas;

	public int getNumPelicualas() {
		return numPelicualas;
	}

	public void setNumPelicualas(int numPelicualas) {
		this.numPelicualas = numPelicualas;
	}

	
	public Piolin(char sexo, int edad, String nombreAve, String nombreDueno, int numPelicualas) {
		super(sexo, edad, nombreAve, nombreDueno);
		this.numPelicualas = numPelicualas;
	}
	public void cantar() {
		System.out.println("Pio-pio soy un Piolín");
	}

	public static void main(String[] args) {
		
		Piolin arrayPiolin[]=new Piolin[3];
		arrayPiolin[0]=new Piolin('m', 20, "aa", "Mikel", 8);
		arrayPiolin[1]=new Piolin('h', 10, "aa", "Ander", 7);
		arrayPiolin[2]=new Piolin('h', 16, "cc", "Igor",11);
		
		
		arrayPiolin[0].nombres.setNombreAve("Manolo");
		arrayPiolin[0].nombres.setNombreDueno("Javier");
		
		Loro l=new Loro('m', 7, "dd", "Iker", 'e', "Rojo");
		l.setRegion('n');
		
		for (int i = 0; i < arrayPiolin.length; i++) {
			arrayPiolin[i].cantar();
			System.out.println();
			
		}
		
		l.cantar();
		System.out.println();
		
		System.out.println("El animal se llama "+arrayPiolin[0].getNombres().getNombreAve()+" y su dueño es: "+arrayPiolin[0].getNombres().getNombreDueno());
		
	}

}
