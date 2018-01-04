package com.ipartek.formacion.capitulo3;

public class Piolin extends Canario implements Hablador {

	
	public int numeroDePeliculas;

	
	
	
	public Piolin(String sexo, int edad, float tamaño, int numeroDePeliculas) {
		super(sexo, edad, tamaño);
		this.numeroDePeliculas = numeroDePeliculas;
		
		
	}
	
	public  void cantar() {
		
		System.out.println("Pio - Pio soy un Piolin");
	}


	
	public void hablar() {
		
		System.out.println("Hola soy un PIOLIN y se hablar");
		System.out.println("Sexo: " + sexo + "        Edad: " + edad);
		System.out.println("Tamaño: " + tamano + "          nº peliculas: " + numeroDePeliculas );
		System.out.println("");
	}


	
	
	
	public static void main(String[] args) {
	
		
		
		Piolin p1 = new Piolin("H", 10, 16, 5);
		Piolin p2 = new Piolin("M", 5, 13, 2);
		Piolin p3 = new Piolin("H", 6, 34, 3);
		Piolin[] piolines = {p1,p2,p3};
		
		p1.nombres.setNombreAve("Pakirrin");
		p1.nombres.setNombreDueno("Borja");
		
		Loro l = new Loro("M", 35, "S", "rojo");
		
		l.cantar();
		p1.cantar();
		p2.cantar();
		p3.cantar();
		System.out.println("Nombre del ave : " + p1.nombres.getNombreAve() + " nombre del dueño: " + p1.nombres.getNombreDueno());
		l.hablar();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Object[] clases = new Object[10];
		
		//l,p,alumno,profesor,bedel,TV,Radio
		
		Persona per = new Persona("Borja", 27);
		Aparato aparato1 = new Aparato(10, 150);
		Canario c = new Canario("H", 16,38);
		Alumno alum = new Alumno("Marta", 22, "Informatica", 3);
		Profesor prof = new Profesor("Jesus", 35, "555-D", "txus@gmail.com");
		Bedel bed = new Bedel("Dani", 40, "tarde", 10);
		TV tele = new TV(100, 300000, 'S', 28);
		Radio rad = new Radio(50, 15000, 'N', 25);
		
		
		clases[0] = l;
		clases[1] = p1;
		clases[2] = per;
		clases[3] = aparato1;
		clases[4] = c;
		clases[5] = alum;
		clases[6] = prof;
		clases[7] = bed;
		clases[8] = tele;
		clases[9] = rad;
		
		/**
		 * Recorrer un array de objetos preguntando en cada posicion si la
		 * clase es una instancia de la interface Hablador
		 * Si lo es convertir a una referencia de la interfaz y llamar al metodo hablar
		 */
		
		//for(Object o : clases){} hace lo mismo que e de abajo, recorre todo el array
		for (int i = 0; i < clases.length; i++) {
			
			if(clases[i] instanceof Hablador) { //linea para comprobar si es una instancia de Hablador
				Hablador mostrar = (Hablador) clases[i]; //convertir a referencia Hablador, sigue siendo su tipo de clase
				mostrar.hablar();
				
				
				
				
			}
			
		}
		
		
	}

	
}
