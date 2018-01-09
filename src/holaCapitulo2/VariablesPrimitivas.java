package holaCapitulo2;
//el siguiente codigo crea info de las clases se ve pasando por encima como la info de las variables java
/**
 * Ejercicio definir variables primitivas java <br>
 * Solo las mas usadas <br>
 * <ul>
 * 		<li>int</li>
 * 		<li>float</li>
 * 		<li>char</li>
 * 		<li>boolean</li>
 * </ul>
 * @author java
 *
 */
public class VariablesPrimitivas {

	public static void main(String[] args) {
		System.out.println("varable numerica entera \"int\" tiene un rango ("+Integer.MIN_VALUE+" a "+Integer.MAX_VALUE+")");
		int numeroAlumnos=15;
		
		float dineroEnBanco=123456.434f;
		char sexo='h'; 
		boolean mayorEdad=true;
		
		String numeroExcrito="12";
		int numero=Integer.parseInt(numeroExcrito);
	}
}
