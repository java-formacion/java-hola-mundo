package com.ipartek.formacion.interfaces;

public class Main {

	public static void main(String[] args) {

		Object[] variado = new Object[12];

		Persona per1 = new Persona("aa", 80);
		Ave av1 = new Ave('M', 45);
		Aparato ap1 = new Aparato(6544, 1561);

		Buitre bui = new Buitre('H', 15, 100, 50);
		Canario can = new Canario('M', 30, true);
		Loro lor = new Loro('H', 2, 'N', "Azul");
		Piolin pio = new Piolin('H', 6, true, 10);
		Alumno alum = new Alumno("Marta", 22, "Informatica", 3);
		Profesor prof = new Profesor("Jesus", 35, "555-D", "txus@email.com");
		Bedel bed = new Bedel("Dani", 40, "Tarde", 10);
		Tv t = new Tv(100, 30000, true, 10);
		Radio rad = new Radio(50, 15000, false, 25);

		variado[0] = per1;
		variado[1] = av1;
		variado[2] = ap1;
		variado[3] = bui;
		variado[4] = can;
		variado[5] = lor;
		variado[6] = pio;
		variado[7] = alum;
		variado[8] = prof;
		variado[9] = bed;
		variado[10] = t;
		variado[11] = rad;

		for (int i = 0; i < variado.length; i++) {
			if (variado[i] instanceof Hablador) {
				((Hablador) variado[i]).hablar(); //el cast es necesario porque Object no tiene hablar()
				System.out.println();
			}
		}

	}

}
