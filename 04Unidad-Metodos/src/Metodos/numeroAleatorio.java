package Metodos;

import graphics.Rectangle;

public class numeroAleatorio {

	public static void main(String[] args){
		
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++)
				numAleatorio();
			System.out.println();
			
		}

	}

	public static void numAleatorio() {
		int num=(int) (Math.random()*10);
		System.out.print(num);
	}

}

/*public class numeroAleatorio {

public static void main(String[] args){
	
	Scanner teclado = new Scanner(System.in);
	
	int tama�o = teclado.nextInt();
	
	for(int i=0;i<tama�o;i++){
		lineaAleatorios(tama�o);  //numero por linea	
	}
}

public static void lineaAleatorios(int tam){  //la variable tama�o solo se usa en este metodo
	for(int j=0;j<tam;j++){
		numAleatorio();
		}
	System.out.println();
	
	
}

public static void numAleatorio() {
	int num=(int) (Math.random()*10);
	System.out.print(num);
}

}*/

