package herenciaPaquetes;


import java.util.Scanner;

public class piolin extends canario {

	public int numeroPeliculas;

	public piolin(char sexo, int edad, int numeroPeliculas) {
		super(sexo, edad);
		this.numeroPeliculas = numeroPeliculas;
	}

	public static void main(String Args[]) {
		int edad;
		char sexo;
		int tamano;		
		String s;
		
			//Scanner sc= new Scanner(System.in);
			
			//System.out.println("introduce edad");
			//edad= sc.nextInt();
			
			//System.out.println("introduce sexo");
			//s= sc.nextLine();
			//sexo = s.charAt(0);
			
			//System.out.println("introduce tamaño");
			//tamano= sc.nextInt();
			
			piolin p= new piolin ('H', 3, 20);
			
			loro l = new loro ('M',3,'N',"AZUL");
			
			p.quienSoy();
			
			l.deDondeEres();
			
			p.tamano=12;
			l.region='E';
			
			
			numeroavescreadas();
			
			
		

	}
}
