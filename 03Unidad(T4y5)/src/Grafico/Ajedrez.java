package Grafico;

import graphics.Color;
import graphics.Rectangle;

public class Ajedrez {

	public static void main(String[] args) {
		int dimension = 20;
		int tablero=8;
		int inicio = 10;
		for(int x=0;x<tablero;x++){
			for(int y=0;y<tablero;y++){
				if((x+y)%2 > 0)continue;
				int cX= inicio + (x*dimension);
				int cY= inicio + (y*dimension);
				Rectangle cuadro = new Rectangle(cX,cY,dimension,dimension);
				cuadro.fill();			
			}
		}
		
	/*	int tamaño=20;

		for(int i=0;i<8;i++){
			
			for(int j=0;j<8;j++){
				
				if(i%2==0 && j%2==0 || i%2 !=0 && j%2 !=0 ){
					Rectangle Casilla;
					Casilla = new Rectangle(j*tamaño,i*tamaño,tamaño,tamaño);
					Casilla.fill();
				}
			}
		}*/
		

	}

}
