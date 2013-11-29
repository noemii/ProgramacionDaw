package Grafico;

import graphics.Canvas;
import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;
public class coche {


	public static void main(String[] args) throws InterruptedException {
	
	Ellipse rueda;
	rueda = new Ellipse(50,90,60,60);
	
	
	rueda.setColor(Color.ORANGE);
	rueda.draw();
	rueda.fill();
	
	Ellipse rueda2;
	rueda2 = new Ellipse(200,90,60,60);
	
	rueda2.setColor(Color.ORANGE);
	rueda2.draw();
	rueda2.fill();
	
	Rectangle rectangulo;
	rectangulo = new Rectangle(10, 10, 300, 100);
	
	rectangulo.setColor(Color.BLACK);
	rectangulo.draw();
	rectangulo.fill();
	
	Rectangle rectangulo1;
	rectangulo1= new Rectangle(270, 0, 50, 50);
	
	rectangulo1.setColor(Color.WHITE);
	rectangulo1.draw();
	rectangulo1.fill();
	
	Rectangle rectangulo2;
	rectangulo2= new Rectangle(190, 0, 50, 50);
	
	rectangulo2.setColor(Color.WHITE);
	rectangulo2.draw();
	rectangulo2.fill();
	
	Rectangle ventana;
	ventana = new Rectangle(40,20,40,40);
	ventana.setColor(Color.WHITE);
	ventana.draw();
	ventana.fill();
	
	Rectangle ventana2;
	ventana2 = new Rectangle(110,20,40,40);
	ventana2.setColor(Color.WHITE);
	ventana2.draw();
	ventana2.fill();

	
	//como hacer bucle 
	//for(algo inicial; condicion; algo en siguiente paso);
	int i=0;
	
	do{
	
		for(; i<200; i++){
			Thread.sleep(1000/60);
			int x = 2;
			//System.out.println(i); para probar
			rueda.translate(x, 0);
			rueda2.translate(x, 0);
			rectangulo.translate(x, 0);
			rectangulo1.translate(x, 0);
			rectangulo2.translate(x, 0);
			ventana.translate(x, 0);
			ventana2.translate(x, 0);
		}
		
		if(i==200){

			for(; i>0; i--){
				Thread.sleep(1000/60);
				int x = 2;
				//System.out.println(i); para probar
				rueda.translate(-x, 0);
				rueda2.translate(-x, 0);
				rectangulo.translate(-x, 0);
				rectangulo1.translate(-x, 0);
				rectangulo2.translate(-x, 0);
				ventana.translate(-x, 0);
				ventana2.translate(-x, 0);
			}
		}
		
			
	}while(i<120 );
		
	
	}
	
	//translate 1 se mueve 1, funciona incrementando lo que le estoy pasando.
	
	//objeto.translate
	//Thread.sleep(); parar la ejecución.
}

	


