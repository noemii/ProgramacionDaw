package Arrays;

import graphics.Color;
import graphics.Ellipse;
public class ColoresAleatorios {

	public static void main(String[] args) throws InterruptedException {
		Color[] colores;//{new Color(255,0,0),Color.Cyan};
		
		colores = new Color [5];  //Array de 5 colores. Creamos el espacio para guardar 5 objetos.
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.YELLOW;
		colores[3] = Color.GRAY;
		colores[4] = Color.ORANGE;
		
		Ellipse circulo = new Ellipse(100,100,300,300);
		
		while(true){
			circulo.setColor(colores[(int) (Math.random()*5)]);
			circulo.fill();
			Thread.sleep(500);
		}
		
	}
	

}
