package Grafico;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;

public class ejemplo_semaforo {

	public static void main(String[] args) throws InterruptedException {
		
		Canvas cuadro;
		cuadro = Canvas.getInstance();
		int i=0;
		
		while(true){
			for(; i<10; i++){
					Rectangle rectangulo;
					rectangulo = new Rectangle(0,0,50,150); //0,0 es para indicar donde empieza el rectangulo
					rectangulo.setColor(Color.BLACK);
					rectangulo.draw();
					rectangulo.fill();
					
					crearEllipse(10, 10, 30, 30, Color.RED);
					Thread.sleep(4000);
					crearEllipse(10, 10, 30, 30, Color.BLACK);
					
					crearEllipse(10,60,30,30, Color.YELLOW);
					Thread.sleep(2000);
					crearEllipse(10,60,30,30, Color.BLACK);
					
					crearEllipse(10,110,30,30, Color.GREEN);
					Thread.sleep(4000);
					crearEllipse(10,110,30,30, Color.BLACK);
					
					
					
			}
		}
					//SI NO QUIERO MOVIMIENTO LE QUITO LOS CIRCULOS DE COLOR NEGRO Y EL THREAD SLEEP.
					//TAMBIEN TENDRE QUE QUITAR EL FOR Y WHILE
			
	}

	private static void crearEllipse(int i, int j, int k, int l, Color color) {
		Ellipse circulo;
		circulo = new Ellipse(i, j, k, l);
		circulo.draw();
		circulo.setColor(color);
		circulo.fill();
		
	}
}


