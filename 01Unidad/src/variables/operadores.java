package variables;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		boolean variable;
		variable = 5 > 4 ;
		
		System.out.println(("5 > 4 = " + variable));
		
		variable = true;
		
		System.out.println("5 > (4+2); = " + (5 > (4 + 2)));
		
		boolean congela;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Dame la temperatura del agua: ");
		if (teclado.nextInt()<0) congela=true; //tengo una variable para saber si lo que guarde ahi es cierto o falso.
		else congela=false;
		if (congela) System.out.println("pon la calefaccion.");
		
		variable = 6 > 2 && 4 <= 7;
		
	}

}
