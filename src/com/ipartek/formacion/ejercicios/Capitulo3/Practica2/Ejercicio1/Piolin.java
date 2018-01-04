package com.ipartek.formacion.ejercicios.Capitulo3.Practica2.Ejercicio1;



public class Piolin extends Ave {

	// Sexo, Edad, Canta y NºPeliculas

	private int numPeliculas;
	private boolean canta;

	public Piolin(char sexo, int edad, int numPeliculas, boolean canta) {
		super(sexo, edad);
		this.numPeliculas = numPeliculas;
		this.canta = canta;
	}

	public int getNumPeliculas() {
		return numPeliculas;
	}

	public void setNumPeliculas(int numPeliculas) {
		this.numPeliculas = numPeliculas;
	}

	public boolean isCanta() {
		return canta;
	}

	public void setCanta(boolean canta) {
		this.canta = canta;
	}

	public static void main(String[] args) {

		/*
		 * Empleado arrayObjetos[]=new Empleado[3];
		 * 
		 * //Creamos objetos en cada posicion arrayObjetos[0]=new Empleado("Fernando",
		 * "Ureña", 23, 1000); arrayObjetos[1]=new Empleado("Epi", "Dermis", 30, 1500);
		 * arrayObjetos[2]=new Empleado("Blas", "Femia", 25, 1200);
		 */

		Object arrayobjetos[] = new Object[10];

		arrayobjetos[0] = new Alumno("Iker", 23, "Biologia", "Primer curso");
		arrayobjetos[1] = new Profesor("Alberto", 30, "Despacho gorbea", "Alberto@gmail.com");
		arrayobjetos[2] = new Bedel("Javier", 33, "turno de tarde", 3);
		arrayobjetos[3] = new Canario('m', 22, true);
		arrayobjetos[4] = new Loro('f', 5, 's', "Rojo");
		arrayobjetos[5] = new Buitre('m', 10, 20.6, 9.5);
		arrayobjetos[6] = new Piolin('m', 5, 6, false);
		arrayobjetos[7] = new Tv(5.6, 720.4, true, 8);
		arrayobjetos[8] = new Radio(8.6, 20.4, 32.6, true);
		arrayobjetos[9] = new Lavadora(88.6, 300.4, 2.4, 1.1);

		//Mejor
		/*for(Object o: arrayobjetos) {
			
		}*/
		for (int i = 0; i < arrayobjetos.length; i++) {
			if (arrayobjetos[i] instanceof Hablador) {//Para saber el objeto es instancia de hablador
				//arrayobjetos[i].hablar() no es correcto porque
				//es un tipo object y no tiene el metodo hablar
				Hablador mostrar = (Hablador) arrayobjetos[i];
				//pasar de tipo de dato object a un tipo hablador
				//para obtener el metodo hablar de hablador
				mostrar.hablar();

			}
		}
		

	}

}
