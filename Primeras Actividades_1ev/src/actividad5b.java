import java.util.Scanner;

public class actividad5b {

	public static void main(String[] args) {
		double tamaño, velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cual es el tamaño del archivo?");
		tamaño = teclado.nextDouble();
		
		System.out.println("¿Cual es la velocidad de tu línea (Mbps)");
		velocidad = teclado.nextDouble();
		
		tamaño = tamaño * 1024 * 1024 * 8; // = tamaño * (Math.pow(2,20) * 8
		velocidad = velocidad * 1000000;
		
		System.out.println("Datos:" + tamaño + "bits");
		System.out.println("\n Velocidad: " + velocidad + " bit por segundo");  // \n intro
		System.out.println("\n Tiempo para transmitir: " + tamaño/velocidad  );
	}

}
