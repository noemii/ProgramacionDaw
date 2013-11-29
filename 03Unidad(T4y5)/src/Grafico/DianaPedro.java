package Grafico;

import graphics.Color;
import graphics.Ellipse;

public class DianaPedro {

	public static void main(String[] args) {
		int circulo=100;
		int separacion=10;
		
		for(int i=0;i<circulo;i++){
			int diametro=(separacion*(circulo-i)*2);
			
			Ellipse diana = new Ellipse(separacion*(i+1),separacion*(i+1),diametro,diametro);
			
			diana.setColor(new Color(r(),r(),r()));
			diana.fill();
		}

	}

	private static int r() {
		return (int) (Math.random()*255);
	}

}
