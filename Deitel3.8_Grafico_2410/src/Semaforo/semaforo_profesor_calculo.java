package Semaforo;


import graphics.Rectangle;
import graphics.Ellipse;
import graphics.Color;

public class semaforo_profesor_calculo {

	public static void main(String[] args) {
		
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo, disco, disco1,disco2;
		int ancho, alto, centro_x, centro_y, diametro_disco,separacion;
		
		//inicializamos los valores de dibujo del semaforo
		ancho=100;
		alto=300;
		centro_x=300;
		centro_y=300;
		diametro_disco=ancho/2;
		separacion=100;
		
		caja = new Rectangle(centro_x - ancho/2,centro_y - alto/2,ancho,alto); //para calcular la esquina de arriba es el centro menos el ancho/2 y menos el alto/2
		caja.draw();
		
		palo = new Rectangle(centro_x - (ancho/5)/2,centro_y + alto/2,ancho/5,alto-100); //entre 5 porque es una quinta parte y entre dos porque queremos la mitad
		palo.draw();
		palo.fill();
		
		
		disco = new Ellipse (centro_x - (diametro_disco/2), centro_y - (diametro_disco/2), diametro_disco, diametro_disco);// divido entre os para dar la mitad, el 50%
		disco.draw();
				
		disco1 = new Ellipse (centro_x - (diametro_disco/2), centro_y - (diametro_disco/2) - separacion, diametro_disco, diametro_disco);// divido entre os para dar la mitad, el 50%
		disco1.draw();
		
		disco2 = new Ellipse (centro_x - (diametro_disco/2), centro_y + (diametro_disco/2) - separacion, diametro_disco, diametro_disco);// divido entre os para dar la mitad, el 50%
		disco2.draw();
		
		/*		
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
		*/
		

	}

}