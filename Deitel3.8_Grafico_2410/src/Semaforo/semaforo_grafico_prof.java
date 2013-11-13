package Semaforo;


import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;

public class semaforo_grafico_prof {

	public static void main(String[] args) {
		
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		
		caja = new Rectangle(10,10,60,110);
		caja.draw();
		
		palo = new Rectangle(38, 120, 5, 100);
		palo.draw();
		
		palo.fill();
		
		verde = new Ellipse(25,80,20,20);
		//verde.setColor(new Color (225, 125, 210));
		Color color_verde = new Color(0,200,0);
		verde.setColor(color_verde);
		ambar=new Ellipse(25,60,20,20);
		ambar.setColor(new Color(255,255,0));
		rojo=new Ellipse(25,40,20,20);
		rojo.setColor(new Color(255,0,0));
		
		verde.draw();
		ambar.draw();
		rojo.draw();
		
		verde.fill();
		ambar.fill();
		rojo.fill();
		
		

	}

}
