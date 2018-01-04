package com.ipartek.formacion.ejercicios.interfaces1;

/**
 * 
 * @author java Main para la ejecucion del programa
 *
 */
public class Main {

	public static void main(String[] args) {

		Persona p = new Persona("Janai", 25);
		Alumno a = new Alumno("Paco", 18, "Programacion", "Java");
		Profesor pro = new Profesor("Pacome", 30, "20B", "pacopacome@comepaco.me");
		Bedel b = new Bedel("Dora", 48, "Noche", 18);

		Object[] objetos = new Object[4];// creacion de un objeto tipo object

		objetos[0] = p;
		objetos[1] = a;
		objetos[2] = pro;
		objetos[3] = b;

		// for (int i=0;i<objetos.length;i++) ambos for son lo mismo
		for (Object o : objetos) {
			if (o instanceof Hablador) {// comprobacion para ver si la persona (dentro del objeto) sable hablar.
				Hablador h = (Hablador) o;// conversion de dato tipo object a hablador
				h.hablar();
				// ((Hablador) o).hablar(); Exactamente lo mismo que las dos lineas de arriba
			}

		}
	}

}
