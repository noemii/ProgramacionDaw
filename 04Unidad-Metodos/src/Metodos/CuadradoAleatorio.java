package Metodos;

import graphics.Color;
import graphics.Rectangle;

public class CuadradoAleatorio {


		public static void main(String[] args) {
			dibujarCuadrado();
			

		}

		public static void dibujarCuadrado() {  //void = hace unas tareas(no devuelve nada)
			int num=(int) (Math.random()*100+1);
			System.out.println("el numero alearorio es " + num);
			Rectangle rectangulo  = new Rectangle(0,0,num,num);
			rectangulo.fill();
			rectangulo.setColor(Color.CYAN);
		}
		
		public static int numAleatorio(){
			
			return 0;
		}

}
