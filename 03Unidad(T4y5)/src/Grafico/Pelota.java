package Grafico;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Pelota {

	public static void main(String[] args) throws InterruptedException {

		Ellipse pelota;
		Color color;
		
		int movimiento_x;
		int movimiento_y;
		int borde = 400;
		int diametro = 40;
		
		pelota = new Ellipse (200, 200,diametro, diametro);
		color = new Color(
							(int)(Math.random()*256), //256 para que dé de 0 a 255 colores
							(int)(Math.random()*256),
							(int)(Math.random()*256));
		
		pelota.setColor(color);
		pelota.fill();

		
		Rectangle tablero;
		tablero = new Rectangle(0,0,borde,borde);
		tablero.draw();
		tablero.setColor(color);
		
		//(int) (Math.random() * (max-min+1)) + min
		
		movimiento_x=(int) (Math.random() * 7) -3;  // (3-(-3  = 6
		movimiento_y=(int) (Math.random()*7)-3;
		
		if (movimiento_x==0) movimiento_x++;  // (3-(-3  = 6
		if( movimiento_y==0) movimiento_y++;
		
		while(true){ //infinito
			
			pelota.translate(movimiento_x,movimiento_y);
			if (pelota.getX()>(borde-diametro-1) || pelota.getX()<0) 
				movimiento_x=-movimiento_x;
			
			if (pelota.getY()>(borde-diametro-1) || pelota.getY()<0) 
				movimiento_y=-movimiento_y;
		
			// if ((pelota.getX()+40)>400 || pelota.getX()<0) movimiento_x=-movimiento_x;
			Thread.sleep(1000/60);
			
		}
	}

}
