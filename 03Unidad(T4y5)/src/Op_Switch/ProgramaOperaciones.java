package Op_Switch;
 
import java.util.Scanner;

public class ProgramaOperaciones {

	public static void main(String[] args) {
		// 3.	Escribe un programa que pida dos números enteros. El usuario después indicará una operación: *, +, -, /.
		//El programa visulizará el resultado de esa operación, o error si no se corresponde con ninguna.
		int n1,n2;
		String operacion;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("indica el primer numero entero");
		n1 = teclado.nextInt();
		
		
		System.out.println("Indica la operacion a realizar");
		operacion = teclado.next();
		
		System.out.println("indica el segundo numero entero");
		n2 = teclado.nextInt();
		
		//para que lo lea todo en una linea
		// n1 = teclado.nextInt();
		//operacion = teclado.next();
		//n2 = teclado.nextInt();
		
		switch(operacion){
		case "+": 
			System.out.println("El resultado es: " +  (n1 + n2));
			break;
		case "-": 
			System.out.println("El resultado es: " + (n1-n2));
			break;
		case "*": 
			System.out.println("El resultado es: " + (n1*n2));
			break;
		case "/":
			System.out.println("El resultado es: " + (n1/n2));
			break;
			
		default:
			System.out.println("error");
				
		}
		teclado.close();
		
	}
		/*
		 * Con if
		 * if(respuesta.equals("+")){
		 * 	system.out.println("el resultado de la suma es: " (n1+n2));
		 * }else if (respuesta.equals("-")){
		 * system.out.println("el resultado de la resta es: " (n1-n2));
		 * }else if (respuesta.equals("*")){
		 * system.out.println("el resultado de la multiplicacion es: " (n1*n2));
		 * }else if(respuesa.equals("/"));{
		 * system.out.println("el resultado de la division es: " (n1/n2));
		 * }else{
		 * system.out.println("Error, operacion no disponible.");
		 *
		 * */
		 
	}


