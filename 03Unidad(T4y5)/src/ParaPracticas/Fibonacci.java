package ParaPracticas;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//1.	Crea una colección con los primeros X números de la serie de Fibonacci, donde X es un número que pedirás al usuario.
		//Después pregunta números y di si está en esa serie o no. El programa terminará cuando el usuario introduzca un 0.
		//0,1,1,2,3,5,8,13,21
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica un numero");
		
		int serie;
		serie = teclado.nextInt();
		int numeroA=0;
		int resultado=1;
		int pregunta = 0;
		
		System.out.print(numeroA + " ");
		
		for(int i=0; i<=serie; i++){
			System.out.print(resultado + " ");
			resultado=numeroA+resultado; //1
			numeroA=resultado-numeroA; //restamos el anterior
		}
		
		System.out.println();
		
		do{
			System.out.println("indica un numero");
			pregunta=teclado.nextInt();
			
			if(pregunta==resultado){
				System.out.println("Gola");
			}
		}while(pregunta>0);
						
		}
				
					/* 

					 do{
			            System.out.print("Introduce numero mayor que 1: ");
			            numero = sc.nextInt();
			        }while(numero<=1);
			        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");  
			
			 
			
			        fibo1=1;
			        fibo2=1; 
			
			        System.out.print(fibo1 + " ");
			        for(i=2;i<=numero;i++){
			             System.out.print(fibo2 + " ");
			             fibo2 = fibo1 + fibo2;
			             fibo1 = fibo2 - fibo1;
			        }
			        System.out.println();
			    }*/
	}

	

