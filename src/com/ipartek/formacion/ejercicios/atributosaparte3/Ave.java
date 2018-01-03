package com.ipartek.formacion.ejercicios.atributosaparte3;

public class Ave {

	private char sexo;// cambiamos este a private para que no se pueda definir otro numero que no sea
						// H o M
	public int edad;
	static int numAves = 0;
	
	public DatosPersonales nombres;

	public Ave(char sexo, int edad,String nombreAve,String nombreDueno) {

		this.sexo = sexo;
		this.edad = edad;
		this.nombres=new DatosPersonales(nombreDueno, nombreAve);
		Ave.numAves++;

	}

	public int avesCreadas() {

		System.out.println("El numero total de aves es" + numAves);
		return numAves;

	}

	public void quienSoy() {

		System.out.println("El sexo es " + this.sexo);
		System.out.println("La edad es " + this.edad);

	}

	public void setSexo(char sexo) {// aqui podremos poner las condiciones necesarias para hacer la llamada
		if (sexo != 'M' && sexo != 'H') {
			System.out.println("El sexo es erroneo, se pondra hembra por defecto");
			this.sexo = 'H';
		} else {
			this.sexo = sexo;
		}
	}

}