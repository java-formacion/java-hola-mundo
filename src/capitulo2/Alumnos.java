package capitulo2;

public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Numero de alumnos: " + numeroAlumnos());
		System.out.println("---------------------------");
		listar();
		System.out.println("");
		listarVisionProfesor();
		System.out.println("");
		listarVisionAlumno();
		System.out.println("");
		System.out.println("Agrupar hungaros");
		agruparHungaros(aHungaros);
		quienLee();
		
	}

	static String[] aAlumnos = { "Eder", "Janai", "Ander", "Edu", 
			"Borja", "Mikel", "Judit","Vacio", 
			"Adrian", "Paul", "Pavel","Ivan",
			"Vacio","Vacio","Jagoba", "Eritz"};
	
	
	static int[] aHungaros= {3,0,1,8,7,2,5,4,6,9};
	

	/**
	 * Muestra por consola todos los alumnos/as con su posicion
	 * 0 - Eder ...
	 */
	static void listar() {

		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.println(i+ "-"+ aAlumnos[i]);

		}
		
			
		}



	static int numeroAlumnos() {
		return aAlumnos.length;
	}
	
	static void listarVisionAlumno() {
		System.out.println("Listado Alumnos vista del alumno");
		System.out.println("-----------------------------------");
		System.out.println(aAlumnos[0] + "|" + aAlumnos[1] + "|" + aAlumnos[2] + "|" + aAlumnos[3]);
		System.out.println(aAlumnos[4] + "|" + aAlumnos[5] + "|" + aAlumnos[6] + "|" + aAlumnos[7]);
		System.out.println(aAlumnos[8] + "|" + aAlumnos[9] + "|" + aAlumnos[10] + "|" + aAlumnos[11]);
		System.out.println(aAlumnos[12] + "|" + aAlumnos[13] + "|" + aAlumnos[14] + "|" + aAlumnos[15]);
		
		System.out.println("--------------------------------");
		System.out.println("Listado alumnos vista del alumno FOR");
		int cont=0;
		for (int i = 0; i < aAlumnos.length; i++) {
			
			if (cont == 4) {
				System.out.print("\n");
				cont=0;
			}
			System.out.print(aAlumnos[i] + "|");
			cont ++;
			
		}
		System.out.println("");
		
	}
	
	static void listarVisionProfesor() {
		
		System.out.println("Listado Alumnos vista del profesor");
		System.out.println("-----------------------------------");
		System.out.println(aAlumnos[15] + "|" + aAlumnos[14] + "|" + aAlumnos[13] + "|" + aAlumnos[12]);
		System.out.println(aAlumnos[11] + "|" + aAlumnos[10] + "|" + aAlumnos[9] + "|" + aAlumnos[8]);
		System.out.println(aAlumnos[7] + "|" + aAlumnos[6] + "|" + aAlumnos[5] + "|" + aAlumnos[4]);
		System.out.println(aAlumnos[3] + "|" + aAlumnos[2] + "|" + aAlumnos[1] + "|" + aAlumnos[0]);
		
		System.out.println("--------------------------------");
		System.out.println("Listado alumnos vista del profesor FOR");
		int cont=0;
		for (int i = aAlumnos.length -1; i >= 0; i--) {
			
			if (cont == 4) {
				System.out.print("\n");
				cont=0;
			}
			System.out.print(aAlumnos[i] + "|");
			cont ++;
			
		}
		System.out.println("");
		
		
		
	}
	
	static void agruparHungaros(int[] a){
		
		int aux;
		for (int i = 0; i < a.length; i++) {
			
			for( int j = i+1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
				
			}
		System.out.println(a[i]);
		}
		
	}
	
	static void quienLee() {
		int numAleatorio = (int) (Math.random()* (15 - 0) + 1);
		System.out.println(numAleatorio);
		
		System.out.println("Le toca leer a :" + aAlumnos[numAleatorio]);
		
		
	}
	
	 
	

}
