package Ave;

public  class Piolin extends Canario{
	

	private int peliculas;
	
	public int getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(int peliculas) {
		this.peliculas = peliculas;
	}

	public Piolin (char sexo, int edad, double tamaño, int peliculas, String nAve, String nDueño) {
	
		super(sexo, edad, tamaño,nAve,nDueño);
		this.peliculas=peliculas;
	}
	
	public Piolin (char sexo, int edad, int peliculas, String nAve, String nDueño) {
		
		super(sexo, edad,nAve,nDueño);
		this.peliculas=peliculas;
	}

	public static void main(String[] args) {
		
	Piolin p= new Piolin('H', 39, 22.6, 2,"ARTURO", "JOSE");
	Loro l= new Loro('H', 33, 'N', "verde","ARTURO", "JOSE");
	
	p.quienSoy();
	l.quienSoy();
	p.altura(p.getTamaño());
	l.deDondeEres(l.getRegion());
	p.setTamaño(14.2);
	p.altura(p.getTamaño());
	l.setRegion('E');
	Ave.NumeroAves();
	
	Piolin aPiolin[]=new Piolin[3];
	
	aPiolin[0]=new Piolin('H', 12, 11.5, 2, "ARTURO", "JOSE");
	aPiolin[1]=new Piolin('H', 54, 9.5, 4, "JUAN", "FELIX");
	aPiolin[2]=new Piolin('M', 88, 35.6, 5, "ARTURO", "JOSE");
	
	System.out.println(aPiolin[0].nombres.getNave());
	System.out.println(aPiolin[0].nombres.getNdueño());
	p.Cantar();
	l.Cantar();
	}
	
	public void Cantar() {
		System.out.println("soy un piolin");
	}
}
