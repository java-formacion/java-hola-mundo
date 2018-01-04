package P2Interfaces;

public class main {

	public static void main (String[] args) {

		
		Object [] arrayDeOjbetos = new Object [7];
		
		
		
		arrayDeOjbetos [0]=new loro(10, "Paco", "Norte", "azul");
		arrayDeOjbetos [1]=new piolin(5, "Lola", " lalala soy un piolin", 7);
		arrayDeOjbetos [2]=new Alumno(28, "Judit", "Ingeniera Telecomunicaciones", "primero");
		arrayDeOjbetos [3]=new Profesor(32, "Aitor", "555-d", "aitor@blabla.es");
		arrayDeOjbetos [4]=new Bedel(50, "Juanita", "Tardes", "10 años");
		arrayDeOjbetos [5]=new TV(1000, 452.62, "si", 10);
		arrayDeOjbetos [6]=new Radio(900, 50.23, "no", 50);
		
		//tamiben sepuede hace así
		//loro l = new loro(10, "Paco", "Norte", "azul");
		//arrayDeOjbetos [0]=l;
		
		
		
		 //for (Object o: arrayDeOjbetos) {} ES LO MISMO QUE EL FOR DE ABAJO
		for (int i=0; i< arrayDeOjbetos.length; i++) {
			
			if (arrayDeOjbetos[i] instanceof Hablador) {
				// NO PUEDO HACER--> i.hablar();-- o ---o.hablar();
				//porque i es objeto y el metodo hablar no esta implementado en el objeto, esta implementado en persona, bedel, etc.
				// tranformamos el objeto en interfaz
				//Hablador h = (Hablador) o;
				Hablador h= (Hablador) arrayDeOjbetos[i];
				h.hablar();
				h.misDatos();
				System.out.println();
			}
			else
				
			System.out.println("No habla");
			
			
		}
		
		//loro l = new loro(10, "Paco", "Norte", "azul");
		//l.hablar();
		//int edad, String nombre, String region, String color
		//System.out.println("Mi nombre es: "+ l.nombre);
		//System.out.println("Mi edad es: "+ l.edad);
		//System.out.println("Mi región es: "+ l.region);
		//System.out.println("Mi nombre es: "+ l.nombre);
		
		
	}
}
