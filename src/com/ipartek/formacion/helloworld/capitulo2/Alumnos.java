package com.ipartek.formacion.helloworld.capitulo2;

public class Alumnos {
	static String [] alumnos = {"Eder","Janair","Ander","Edu",
								"Borja","Mikel","Judith","  -",
								"Adrian","Paul","Pavel","Ivan",
								"  -", "Mikel P", "Jagoba","Eritz"
	};
	public static void main(String[] args) {
		
		System.out.println("- Numero alumnos es: "+ numeroAlumnos());
		//Listar();
		System.out.println("************************************************");
		System.out.println("Vision alumno:\n");
		listarVisionAlumno();
		System.out.println("\nVision Profesor: \n");
		listarVisionProfesor();
		System.out.printf("\n\nLe toca leer a: " + selecLector());
		
	}
	/**
	 * Selecciona alumno random
	 * @return
	 */
	private static String selecLector() {
		int r;
		do {
			r = (int)(Math.random()*16);			
		}
		while(alumnos[r].equals("  -")); 
		
		return alumnos[r];
	}

	/**
	 * Muestra por consola todos los alumnos/as
	 */
	static void Listar() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(i + " - " + alumnos[i]);
		}
	}
	
	/**
	 * Devuelve int tamaño array de alumnos/as.
	 * @return
	 */
	static int numeroAlumnos() {
		return alumnos.length;
		
	}
	static void listarVisionProfesor() {
		int i;
		for ( i = alumnos.length-1; i >=0; i--) {
			System.out.printf("   "+alumnos[i] + " ");
			calcSeparacion( i,1);
		
		}
	}
	static void listarVisionAlumno() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.printf("   "+alumnos[i] + " ");
			calcSeparacion( i,0);
			
			
		}
	}
	/**
	 * Ordenar de 4 en cuatro y que todos los nombres ocupen lo mismo
	 * @param i
	 * @param p
	 */
	static void calcSeparacion(int i, int p) {
		//Que haya la misma distancia entre palabras
		int difNombre = 8-alumnos[i].length();
		for (int j = 1; j <= difNombre; j++) {
			if(j<difNombre) {					
			System.out.print(" ");
			}else if (j==difNombre){
				System.out.printf("|");
			}
		}
		//Salto de linea para alumnos
		if((i+1)%4==0 && p==0) {
			System.out.println();
		//Salto de linea para profesores
		}else if((i)%4==0 && p==1) {
			System.out.println();
		}
	}
}
