package ParaPracticas;

import java.util.Arrays;
import java.util.Scanner;

public class numerosDistintos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int[]numeros=new int[10];
		int tam_numeros=0;
		
		System.out.println("Dime un numero (max.10)");
		
		boolean cero=false;
		int i=0;
		
		while(i<10 && !cero){
			//leer
			int numero = teclado.nextInt();
			
			if(numero==0){
				cero = true;
			}else{
				//insertar si no esta
				boolean encontrado=false; //por defecto no esta
				
				for(int j=0;j<tam_numeros;j++)
					if (numero==numeros[j]) encontrado = true;
					
					
					if(!encontrado){
						numeros[tam_numeros]=numero;
						tam_numeros++;
					}
			}
			
			i++;
		}
		
		System.out.println("numeros distintos " + tam_numeros);
			System.out.println(Arrays.toString(numeros));
		
		
	}
}

		
		
		
		
		/*
		int cantidad;
		int n;
		
		System.out.println("Indica la cantidad de numeros que vas a introducir");
		cantidad=teclado.nextInt();
		
		int[]numero = new int [cantidad];
		
		System.out.println("Indica los numeros");
		
		for(int i=0; i<numero.length;i++){  //largo de un array
			
			n=teclado.nextInt();
			
				
			numero[i]=n;
			
		}
		for(int a=0; a<numero.length;a++){
			System.out.print(numero[a] + " ");  //recorre numero 0 numero 1...
			
			
				
			}
		}
		
		//numeros diferentes
		
		*/
