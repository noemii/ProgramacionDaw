import java.util.Scanner;


public class actividad2 {

	public static void main(String[] args) {
		double numero1,numero2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame dos numeros, y calculare con ellos:" );
		numero1 = teclado.nextDouble();
		numero2 = teclado.nextDouble();
		
		System.out.println("numero 1 " + numero1);
		System.out.println("numero 2 " + numero2);
		System.out.println("La suma es " + (numero1+numero2));
		System.out.println("El producto es " + (numero1*numero2));
		System.out.println("la media es " + (numero1+numero2)/2);
		
		teclado.close();
	}

}
