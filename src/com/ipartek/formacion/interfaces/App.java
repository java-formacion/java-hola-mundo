package com.ipartek.formacion.interfaces;

public class App {

	public App() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Object[] objs = new Object[12];
		
		Persona persona = new Persona("Mikel", 26);
		Ave ave = new Ave('M', 5);
		Aparato aparato = new Aparato(5, 20);
		Buitre buitre = new Buitre('H', 15, 20, 50);
		Canario canario = new Canario('M', 2, "no");
		Loro loro = new Loro('H', 50, 'N', "rojo");
		Piolin piolin = new Piolin('M', 40, "si", 5);
		Alumno alumno = new Alumno("Juan", 15, "indianapolis", 5);
		Profesor profesor = new Profesor("Alberto", 0, "uno muy bonito", "alberto@profesor.com");
		Bedel bedel = new Bedel("Fer", 55, "mañana", 10);
		Tv tv = new Tv(50, 2000, "no", 1);
		Radio radio = new Radio(20, 100, "si", 500);
		
		objs[0] = persona;
		objs[1] = ave;
		objs[2] = aparato;
		objs[3] = buitre;
		objs[4] = canario;
		objs[5] = loro;
		objs[6] = piolin;
		objs[7] = alumno;
		objs[8] = profesor;
		objs[9] = bedel;
		objs[10] = tv;
		objs[11] = radio;
		
		for (Object arr : objs) {
			if(arr instanceof Hablador) {
				((Hablador) arr).hablar();
			}
		}

	}

}
