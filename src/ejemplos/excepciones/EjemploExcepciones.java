package ejemplos.excepciones;

public class EjemploExcepciones {

	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 0;
		int div;
		
		try {
			div=a/b;
		}catch(ArithmeticException ae) {
			
			System.out.println("aritmet");
			div = Integer.MAX_VALUE;
		}
		finally { //se ejecuta siempre
			
			System.out.println("Cierre de conexiones, ficheros, etc...");
		}
		
	
		
		System.out.println(div);
		

	}

}
