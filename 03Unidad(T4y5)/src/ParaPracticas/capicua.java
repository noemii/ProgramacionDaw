package ParaPracticas;

import java.util.Scanner;

public class capicua {

	public static void main(String[] args) {
		// Lee un número por consola y comprueba si es palíndromo (capicúa).
		//Pista: si creas un número con los dígitos en orden inverso al leido, y al compararlos
		//resulta que son iguales, será capicúa.
		
		Scanner teclado = new Scanner(System.in);
		
		long numero;
		
		System.out.println("Indica un numero");
		numero = teclado.nextInt();
		
		long falta; //numeros que faltan para dar la vuelta
		long numeroInvertido; //almacenará el numero dado la vuelta
		long resto; //dejaremos los restos de las divisiones 
		
		
		//Iniciamos las variables a 0
		while(numero<=0);
			falta=numero;
			numeroInvertido=0;
			resto=0;//falta tiene ahora el numero del que substraemos digitos
			
		
		while(falta!=0){
			//11811
			resto=falta%10; //%=1  //%=1  //%=8  //%=1 //%1
			numeroInvertido=numeroInvertido*10+resto;//1 + 11 + 11*10+8=118 +  118*10+1=1181   + 11810+1=11811
			falta=falta/10; //1181 -> 118 ->11 ->1
			}
			//comprobamos si son iguales
			if(numeroInvertido==numero){
				 System.out.println("\nEl numero es capicua\n");
			}else{
				 System.out.println("\nEl numero no es capicua\n");
			}
		
		
		//1.Para obtener el ultimo digito del numero lo haremos con el resto de una 
			//division entre 10. Es decir, si de 4224 queremos obtener el ultimo
			//digito lo haremos d la siguiente forma. 4224%10 = 4
		
		//2.Del numero original hay que quitarle el ultimo digito. En este caso utiliamos
		//la division entre 10.  4224/10=422
		
		//3.Guardaremos el nºsubstraido. PAra ello lo sumaremos al numero que tengamos
			//multiplicao por 10. En el primer caso lo haremos sobre el 0. Las secuencias
			//para el numero 4224 sera
			//0*10+4=4
			//4*10+2=42
			//42*10+2=422
			//422*10+4=4224
		
		//todo esto se repite mientras haya algo por analizar.
		}
	}


