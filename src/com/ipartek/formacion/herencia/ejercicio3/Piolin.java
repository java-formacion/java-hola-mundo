package com.ipartek.formacion.herencia.ejercicio3;

public class Piolin extends Canario {

	private int numPelis;

	public Piolin(char sexo, int edad, int tamano, String nombreAve, String nombreDueno, int numPelis) {
		super(sexo, edad, nombreDueno, nombreDueno, tamano);
		this.numPelis = numPelis;
	}

	public int getNumPelis() {
		return numPelis;
	}

	public void setNumPelis(int numPelis) {
		this.numPelis = numPelis;
	}
	
	public void cantar() {

		System.out.println("Pio-pio soy un Piolín");

	}

	public static void main(String[] args) {

		/*Piolin[] jaula = new Piolin[3];

		Piolin pio1 = new Piolin('M', 5, 32, "dfgdf", "wrg", 20);
		jaula[0] = pio1;

		Piolin pio2 = new Piolin('H', 10, 25, "efgbdf", "wegr", 10);
		jaula[1] = pio2;

		Piolin pio3 = new Piolin('M', 12, 40, "sgvbfd", "wefdf", 15);
		jaula[2] = pio3;

		pio1.nombres.setNombreAve("Pajarito");
		pio1.nombres.setNombreDueno("Juan");

		Loro lor = new Loro('H', 3, "werg", "wegr", 'S', "Azul");

		lor.cantar();
		pio1.cantar();
		pio2.cantar();
		pio3.cantar();

		System.out.println(pio1.nombres.getNombreAve());
		System.out.println(pio1.nombres.getNombreDueno());*/

	}

}
