package holaCapitulo2;

public class OrdenarArray {
	
	static int [] numeros= {3,0,1,8,7,2,5,4,6,9};
			
	public static void main(String[] args) {
		Ordenar();
	}

	static void Ordenar() {
		for (int i = 0; i < numeros.length; i++) {
			
			
			if((i < numeros.length-1)&&(numeros[i]>numeros[i+1])) {
				
				int variable=numeros[i];
				numeros[i]=numeros[i+1];
				numeros[i+1]=variable;
			}
			System.out.print(numeros[i]+" ");
		}
	}
}
