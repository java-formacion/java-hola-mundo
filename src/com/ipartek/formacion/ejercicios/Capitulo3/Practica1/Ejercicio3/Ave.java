package com.ipartek.formacion.ejercicios.Capitulo3.Practica1.Ejercicio3;
/**
 * La clase Ave tendrá un nuevo atributo llamado nombres de la clase DatosPersonales.
 * @author java
 *
 */
public abstract class Ave {

	private char sexo;
	public int edad;
	public static int avesCreadas = 0;
	public DatosPersonales nombres;
	
	public DatosPersonales getNombres() {
		return nombres;
	}
	public void setNombres(DatosPersonales nombres) {
		this.nombres = nombres;
	}
	public Ave(char sexo, int edad, String nombreAve,String nombreDueno) {
		this.sexo = sexo;
		this.edad = edad;
		this.nombres = new DatosPersonales(nombreAve, nombreDueno);
		avesCreadas++;
	}
	public abstract void cantar();

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if(sexo!='m' && sexo!='h') {
			System.out.println("El sexo es erroneo se pondra macho HEMBRA por defecto");
			this.sexo='h';
		}
		this.sexo = sexo;
	}

	
	public void QuienSoy(Piolin p) {
		System.out.println("Sexo: " + p.getSexo() + " edad: " + edad);
	}

	public void QuienSoy(Loro l) {
		System.out.println("Sexo: " + l.getSexo() + " edad: " + edad);

	}

	public static void numAves() {
		System.out.println("Numero de aves creadas: " + avesCreadas);
	}

}
