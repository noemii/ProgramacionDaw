import java.util.Scanner;

public class actividad5b {

	public static void main(String[] args) {
		double tama�o, velocidad;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("�Cual es el tama�o del archivo?");
		tama�o = teclado.nextDouble();
		
		System.out.println("�Cual es la velocidad de tu l�nea (Mbps)");
		velocidad = teclado.nextDouble();
		
		tama�o = tama�o * 1024 * 1024 * 8; // = tama�o * (Math.pow(2,20) * 8
		velocidad = velocidad * 1000000;
		
		System.out.println("Datos:" + tama�o + "bits");
		System.out.println("\n Velocidad: " + velocidad + " bit por segundo");  // \n intro
		System.out.println("\n Tiempo para transmitir: " + tama�o/velocidad  );
	}

}
