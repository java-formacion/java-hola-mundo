package herenciaPaquetes;


public class canario extends ave {

	public int tamano;

	public canario(char sexo, int edad) {
		super(sexo, edad);

	}
	

	public canario(char sexo, int edad, int tamano) {
		super(sexo, edad);
		this.tamano = tamano;
	}

	public void tamano() {
		if (tamano > 30)
			System.out.println(" ave alta");
		else if (15 > tamano)
			System.out.println(" ave baja");
		else
			System.out.println(" ave mediana");
	}

}