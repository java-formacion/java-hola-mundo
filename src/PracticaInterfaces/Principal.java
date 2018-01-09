package PracticaInterfaces;

import PracticaInterfaces3.*;
import PracticaInterfaces2.*;

public class Principal {

	public static void main(String[] args) {
		
		Persona per=new Persona (23, "PEPE");
		Ave a=new Ave ('H', 12);
		Aparato apa=new Aparato (220, 165);
		Buitre b=new Buitre ('H', 12, 43.6, 21);
		Canario c=new Canario ('M', 6, 'S');
		Loro l=new Loro ('M', 14, 'N', "VERDE");
		Piolin pio=new Piolin ('M', 4, 'N', 5);
		Alumno al=new Alumno (19, "jose", "ingenieria", 3);
		Profesor pro=new Profesor (88, "isabel", 3, "ingenieriamail");
		Bedel bed=new Bedel (44, "maria", "mañana", 3);
		Radio r=new Radio (220, 165, 's', 220);
		TV tv=new TV (220, 165, 'n', 10);
		
		Object [] aClases= {per, a, apa, b, c, l, pio, al, pro, bed, r, tv};
		
		for (int i = 0; i < aClases.length; i++) {
		//for (Object o : aClases){}	
			//Solo accede al los metodos de Hablador
			if(aClases[i] instanceof Hablador) {
				//Se puede castear solo si los parametros tienen parentesco descendente Object a Hablador
				Hablador h =(Hablador)aClases[i];
				h.Hablar();
				//((Hablador)aClases[i]).Hablar();
			/*Para poder acceder a los metodos de los alumnos se hace lo siguiente:
				if(aClases[i] instanceof Alumno) {
				Alumno alum =(Alumno)aClases[i];
				alum.getCurso();
				}*/
			}
		}
	}
}
