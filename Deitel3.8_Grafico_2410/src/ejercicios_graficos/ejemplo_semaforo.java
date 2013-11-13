package ejercicios_graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;
import graphics.Ellipse;

public class ejemplo_semaforo {

	public static void main(String[] args) throws InterruptedException {
		
		Canvas cuadro;
		cuadro = Canvas.getInstance();
	
		
		Rectangle rectangulo;
		rectangulo = new Rectangle(0,0,50,150); //0,0 es para indicar donde empieza el rectangulo
		rectangulo.setColor(Color.BLACK);
		rectangulo.draw();
		rectangulo.fill();
		
		Ellipse circulo;
		circulo = new Ellipse(10, 10, 30, 30);
		circulo.draw();
		circulo.setColor(Color.RED);
		circulo.fill();
		
		Thread.sleep(1000);
		
		Ellipse circulo2 = new Ellipse(10,60,30,30);
		circulo2.draw();
		circulo2.setColor(Color.YELLOW);
		circulo2.fill();
		
		Thread.sleep(1000);
		
		Ellipse circulo3 = new Ellipse (10,110,30,30);
		circulo3.draw();
		circulo3.setColor(Color.GREEN);
		circulo3.fill();
		
		
		
		
		
		
		
	}

}
