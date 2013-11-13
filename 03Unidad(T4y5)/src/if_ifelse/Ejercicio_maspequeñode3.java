package if_ifelse;

import java.util.Scanner;
public class Ejercicio_maspequeñode3 {

	public static void main(String[] args) {
		// Escribe un programa que visualice el más pequeño de tres números.
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		System.out.println("Indique 3 numeros");
		int n1,n2,n3;
		
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		n3 = teclado.nextInt();
		
		if(n1<n2 && n1<n3){
			System.out.print(("El menor es: ") + n1);
		}else if (n2<n3){
			System.out.println("El menor es: " + n2);
		}else{
			System.out.println("El menor es: " + n3);
		}
				
		/*if (n1<=n2){
			if(n1<=n3)
				System.out.println("numero menor" + n1);
			else
				System.out.println("numero menor:" + n3);
		}else{
			if ()
		*/
				
		}
	}


