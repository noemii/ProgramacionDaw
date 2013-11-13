package Actividades;
import java.util.Scanner;

public class actividad3d {
//Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x1, x2, y1, y2;
		double area;
		
		System.out.println(" Introduce la coordenada x1");
		x1 = teclado.nextInt();
		
		System.out.println(" Introduce la coordenada y1");
		y1 = teclado.nextInt();
		
		System.out.println(" Introduce las coordenadas x2");
		x2= teclado.nextInt();
		
		System.out.println(" Introduce las coordenadas y2");
		y2= teclado.nextInt();
		
		teclado.close();
		
		area = (x2-x1) * (y2-y1);
		
		System.out.println("EL areadel rectangulo según las coordenadas es " + area);
		
		
	}

}
