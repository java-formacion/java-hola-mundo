package Ave;

public  abstract class Ave {
	private char sexo;
	private int edad;
	public static int nAves;
	public DatosPersonales nombres;

	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char s) {
		if (sexo!='H'&&sexo!='M') {
			this.sexo=s;}else {
			sexo=s;}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setSexo(int e) {
		edad=e;
	}
	
	public Ave(char sexo, int edad, String nAve, String nDueño) {
		this.nombres=new DatosPersonales(nAve,nDueño);
		this.sexo=sexo;
		this.edad=edad;
		nAves++;
	}
	
	public static void NumeroAves() {
		System.out.println("aves recibidas "+nAves);
	}
	
	public void quienSoy() {
		System.out.println(sexo);
		System.out.println(edad);
	}
	
	public abstract void Cantar();
}



