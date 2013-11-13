package if_ifelse;
 
import java.util.Scanner;

public class Ejercicio_nummayor {

	public static void main(String[] args) {
		// Escribe un programa que pida dos números y 
		//que visualice el número que sea mayor de los dos. Si los dos son iguales, imprimirá cualquiera de ellos
		
		Scanner teclado;
		teclado = new Scanner (System.in);
		
		int numero1,numero2;
		System.out.println("Indica dos numeros");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		
		if(numero1>numero2){
			System.out.println("El mayor es " + numero1);
		}else
			System.out.println("El mayor es: " + numero2);
			
		//OTRA FORMA
		/*if(numero1>numero2){
			System.out.println("El mayor es " + numero1);
		}else if(numero1 == numero2)
			System.out.println("SON IGUALES");
		else{
			System.out.println("el numero mayor es: " + numero2);
		}*/
	}

}

