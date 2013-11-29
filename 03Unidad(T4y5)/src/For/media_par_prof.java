package For;

import java.util.Scanner;

public class media_par_prof {

	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int i, media=0,suma=0,n=0,total=0;
	boolean pares = false;
	
	System.out.println("Cuantos numeros quieres?");
	
	total = teclado.nextInt();
	for (i=total; i>0; i--){
			System.out.println("Introduce un numero");
			n=teclado.nextInt();
			suma=suma+n;
		//	media = (media + suma)/2;
			if(n%2 == 0) pares = true;
	}
	
	System.out.println("La media es: " + (double)suma / (double)total); //va ha hacer numeros reales. Si la suma es 5/3 en nmero entero daria 1 se come ls decimales
	if(pares) System.out.println("Has utilizado nº pares: " +  pares);
	}

}
