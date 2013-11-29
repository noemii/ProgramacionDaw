package Grafico;

import graphics.Color;
import graphics.Ellipse;
public class Diana {

	public static void main(String[] args) throws InterruptedException {
		//Diana: Escribir un programa que dibuje 10 círculos concéntricos en la pantalla. 
		//Puedes utilizar Math.Random() para obtener valores de color aleatorio
		Color[] colores;//{new Color(255,0,0),Color.Cyan};
		
		colores = new Color [7];  //Array de 5 colores. Creamos el espacio para guardar 5 objetos.
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.YELLOW;
		colores[3] = Color.GRAY;
		colores[4] = Color.ORANGE;
		colores[5] = Color.RED;
		colores[6] = Color.BLUE;
			
		int separacion=15;
		int centro_x = 200;
		int centro_y = 200;
		int anterior = -1;
		
		
		for (int i=10; i>0;i--){
			//diana = new Ellipse (centro_x-separacion/2, centro_y-separacion/2, separacion, separacion);
			
			Ellipse circulo;
			int actual;
			
			circulo = new Ellipse (centro_x-i*separacion,centro_y-i*separacion,separacion*i*2,separacion*i*2);
			
			do{
				actual=(int)(Math.random()*5);
			}while(anterior==actual);
			
			circulo.setColor(colores[actual]);
			circulo.fill();
			anterior=actual;

			
			
		}
			
	}
}
