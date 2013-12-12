package Arrays;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int numero;
		System.out.println("Indica un numero para obtener la serie Fibonacci");
		numero = teclado.nextInt();
		
		int [] fib = new int [2+numero];
		
		fib[0]=0; //posicion 0 siempre tendrá valor de 0
		fib[1]=1; //posicion 1 siempre tendra valor de 1
		
		for (int i=0; i< numero;i++){
			fib[2+i] = fib[1+i] + fib[i]; //fib 2+i para la posición 2 en la cual se almacena 1+0+0=1
		}
		
		for (int a=0; a < fib.length; a++){
			System.out.print(fib[a] + " ");
		}
		
		int num;
		
		do{
			
			System.out.println("\nindica un numero");
			num=teclado.nextInt();
			boolean esta = false;
			
			for(int f=0; f<fib.length;f++){
				if(num==fib[f] && num!=0){ //ya es true si se cumple la condicion
					//System.out.println("Si esta en Fib");
					esta=true;
					break;
				}
			}
			
			if(esta){
				System.out.println("Si esta en Fib");
			}else{
				System.out.println("No esta en Fib");
			}
			
		}while(num>0);
		
		

	    
	}

}
