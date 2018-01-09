package holaCapitulo2;

public class Alumnos {
/**
 * muestra x consola todos los alumnos
 */
	static String [] aAlumnos= {"Eder","Janai", "Ander","Edu",
								"Borja","Mikel","Judit","",
								"Adrian","Paul","Pavel","Ivan",
								"MikelP","Jagoba", "Eritz"};
	
	
	static void listar() {
		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.print(i+" - ");
			System.out.println(aAlumnos[i]);
		}
	}
	
	static void listarVisionAlumno() {
	
		for (int j = 0; j < aAlumnos.length; j++) {
					
			if(j%4==0) {System.out.println();
			}System.out.print(aAlumnos[j]+" ");
			}
		}
	
	
static void listarVisionProfesor() {
	for (int j = aAlumnos.length-1; j >=0; j--) {
		
		System.out.print(aAlumnos[j]+" ");
		if(j%4==0) {System.out.println();
		}
		}
}
	
	static int numeroAlumnos() {
		return aAlumnos.length;
	}
	
	static String voluntario() {
		
		int numeroAleatorio=(int) (Math.random()*aAlumnos.length);
		return aAlumnos[numeroAleatorio];
	}

	public static void main(String[] args) {
		listar();
		//numeroAlumnos();
		System.out.println("numero alumnos: "+numeroAlumnos());
		listarVisionAlumno();
		System.out.println();
		System.out.println();
		listarVisionProfesor();
		System.out.println();
		System.out.println("----------------------------");
		System.out.print("voluntsrio: ");
		System.out.println(voluntario());
		//voluntario();
	}
}
