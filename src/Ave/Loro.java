package Ave;

public  class Loro extends Ave{
	

	private char region;
	private String color;
	
	public char getRegion() {
		return region;
	}
	
	public void setRegion(char r) {
		if(r!='N'&& r!='O'&& r!='E'&& r!='S') {
			region='N';
		}
		region=r;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String c) {
		color=c;
	}
	
	public Loro(char sexo, int edad, char region, String color, String nAve, String nDueño) {
		super(sexo, edad,nAve,nDueño);
		this.region=region;
		this.color=color;
	}

	public void deDondeEres (char region) {
		if(region=='N') {
			System.out.println("norte");
		}
		if(region=='S') {
			System.out.println("sur");
		}
		if(region=='E') {
			System.out.println("este");
		}
		if(region=='O') {
			System.out.println("oeste");
		}
	}
	
	public void Cantar() {
		System.out.println("soy un loro");
	}

}
