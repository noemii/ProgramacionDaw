package ParaPracticas;

import java.util.Scanner;

public class CapicuaInternet {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			long numero;
			
			System.out.println("Indica un numero");
			numero = teclado.nextInt();
			
			long falta,numeroInvertido,resto;

			while(numero<=0);
			falta=numero;
			  numeroInvertido=0;
			  resto=0;
			
			// El código que viene a continuación da la vuelta a un numero
			while(falta!=0)
			{
			 resto=falta%10;
			 numeroInvertido=numeroInvertido*10+resto;
			 falta=falta/10;		 		 
			}
			
			// Si el número origen y el destino son el mismo, es que es capicua
			if(numeroInvertido==numero)
			 System.out.println("El numero es capicua\n");
			else
			 System.out.println("El numero no es capicua\n");
					
		}

	}

