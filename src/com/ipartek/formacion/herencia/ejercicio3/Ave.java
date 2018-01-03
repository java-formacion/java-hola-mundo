package com.ipartek.formacion.herencia.ejercicio3;

public class Ave {

	private char sexo;
	public int edad;
	public static int numAves = 0;
	public DatosPersonales nombres;

	public Ave(char sexo, int edad, String nombreAve, String nombreDueno) {
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = new DatosPersonales(nombreAve, nombreDueno);
		Ave.numAves++;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if ((sexo != 'M') && (sexo != 'H')) {
			System.out.println("El sexo es erroneo se pondrá HEMBRA por defcto");
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}

	}

	public void quienSoy() {

		System.out.println("Mi sexo es: " + sexo);
		System.out.println("Mi edad es: " + edad);

	}

	public static void getNumAvesCreadas() {

		System.out.println("Se han creado: " + numAves + " aves");

	}

	public void cantar() {

		if (this.getClass() == Piolin.class) {
			System.out.println("Pio-pio soy un Piolín");
		} else if (this.getClass() == Loro.class) {
			System.out.println("Piiio-piiiio loro bonito");
		} else {
			System.out.println("No sé lo que pio...");
		}

	}

}
