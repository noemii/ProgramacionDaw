import java.util.Scanner;


public class dos {

	private static Scanner teclado;

	public static void main(String[] args) {
		float numero1,numero2;
		float producto, suma, media;
		
		teclado = new Scanner(System.in);
		
		System.out.println("Dame dos número, y calcularé con ellos: ");
		numero2 = teclado.nextFloat();
		numero1 = teclado.nextFloat();
		
		suma = numero1+numero2;
		producto = numero1*numero2;
		media = ((numero1+numero2)/2);
		
		System.out.println("Numero 1 es:" + numero1);
		System.out.println("numero 2 es:" + numero2);
		System.out.println("La suma es " + suma);
		System.out.println("El producto es" + producto);
		System.out.println("la media es" + media);
		
	}

}
