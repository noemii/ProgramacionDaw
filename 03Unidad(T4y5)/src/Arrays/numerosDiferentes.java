package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class numerosDiferentes {

	public static void main(String[] args) {
	// Escribe un programa que pida dos números. Si los dos números dados son iguales, se visualizará un mensaje informando de esto y 
	//se volverán a pedir otros dos números.El programa termina cuando los dos números no son iguales y se imprime el mayor de los dos.

		Scanner teclado = new Scanner(System.in);
		
		int [] numero;
		numero= new int [2];
		
		int n1;
		int n2;
		String suma=" ";
		
		System.out.println("Indica dos numeros");
		n1=teclado.nextInt();
		n2=teclado.nextInt();
		
	while(n1==n2){
			System.out.println("Indica dos numeros");
			
			for(int i=0;i<1;i++){
			n1=teclado.nextInt();
			n1=numero[i]=n1;
			//suma=suma+n1+" ";
			}
		
			for(int i=1;i<numero.length;i++){
				n2=teclado.nextInt();
				numero[i]=n2;
				}
	}
	
		if(n1 != n2){
		
			if(n1<n2){
			System.out.println(n2);
			}else if(n1>n2){
			System.out.println(n1);
			}
			
		}
	
	} 
}		
		
		
		//System.out.println(suma);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int n1;
		int n2;
		
		do{
			System.out.println("Indica un numero");
			
			n1=teclado.nextInt();
			
			System.out.println("Indica un numero");
			
			n2=teclado.nextInt();
		}while(n1==n2);
		
		if(n1>n2){
			System.out.println("El numero mayor es: " + n1 );
		}else{
			System.out.println("El numero mayor es: " + n2 );
		} */


