package ejemplo.grafico;

import graphics.Canvas; //lienzo o ventana
import graphics.Color;
import graphics.Rectangle;

public class Grafico1 {

	public static void main(String[] args) {

		Canvas lienzo;
		Rectangle rectangulo;
		
		lienzo = Canvas.getInstance();//es privado (static) y no deja crear constructor. CLASE.METODO
		
//constructos:Manera de crear un objeto. Es un metodo especial que tiene un nombre (q el nombre del metodo es el de la clase) pero en realidad es un metodo.

		rectangulo = new Rectangle(10,10,50,100); //llamo al metodo llamado rectangulo
		
		rectangulo.draw();
		
		Canvas.pause(); //ventanita del OK
		
		rectangulo.translate(250,0);//mueve el rectangulo a otro punto
		
		rectangulo.setColor(Color.ORANGE);//Despues del OK cambia el color del rectangulo a naranja
		
		rectangulo.fill(); //No el borde, si no el relleno.
		
		Canvas.pause();
		
		Color gris;
		
		gris = new Color(200,200,200);
		
		rectangulo.setColor(gris);
		
		
	}

}
