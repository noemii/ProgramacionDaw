package ejercicios_graficos;

import graphics.Line;
import graphics.Rectangle;
import graphics.Color;
import graphics.Text;

public class euribor {

	public static void main(String[] args) throws InterruptedException {
		
		Line linea;
		linea = new Line(40, 530, 1000, 530);
		linea.draw();
		
		Line linea2;
		linea2 = new Line(40, 0, 40, 530);
		linea2.draw();
		
		crearmillones(10, 500, "1M");
		crearmillones(10, 400, "2M");
		crearmillones(10, 300, "3M");
		crearmillones(10, 200, "4M");
		crearmillones(10, 100, "5M");
		crearmillones(10, 0, "6M");
		
		
		creartexto(150, 530, "2009");
		creartexto(340, 530, "2010");
		creartexto(540, 530, "2011");
		creartexto(740, 530, "2012");
			
		
		//España - azul
		//Francia - rosa
		//Alemania - verde
		//Italia - naranja
			
		
		//2009
		crearRectangulo(80,180,30,350, new Color (141,217,255)); //4.1
		
		crearRectangulo(120,350,30,180, new Color (220,76,172));//2.7
		
		crearRectangulo(160,280,30,250, new Color(227,255,114)); //3.3
		
		crearRectangulo(200,420,30,110, new Color(246,214,127));//1.9
		
		
		//2010
		crearRectangulo(280,150,30,380, new Color (141,217,255)); //4.6
		
		crearRectangulo(320,340,30,190, new Color (220,76,172));//2.8
		
		crearRectangulo(360,320,30,210, new Color(227,255,114)); //2.9
		
		crearRectangulo(400,405,30,125, new Color(246,214,127));//2.09
		
		
		//2011
		crearRectangulo(480,110,30,420, new Color (141,217,255)); //5
		
		crearRectangulo(520,350,30,180, new Color (220,76,172));//2.7
		
		crearRectangulo(560,340,30,190, new Color(227,255,114)); //2.4
		
		crearRectangulo(600,410,30,120, new Color(246,214,127));//2.0
		
		//2012
		crearRectangulo(680,70,30,460, new Color (141,217,255)); //5.8
		
		crearRectangulo(720,320,30,210, new Color (220,76,172));//3
		
		crearRectangulo(760,330,30,200, new Color(227,255,114)); //2.3
		
		crearRectangulo(800,390,30,140, new Color(246,214,127));//2.7
		
		
		crearDefinicion(600,10,10,10, new Color(141,217,255), "España");
		
		crearDefinicion(680,10,10,10, new Color(220,76,172), "Francia");
		
		crearDefinicion(760,10,10,10, new Color(227,255,114), "Alemania");
		
		crearDefinicion(850,10,10,10, new Color(246,214,127), "Italia");
		
		
		}
		

	private static void crearmillones(int i, int j, String string) {
		Text millones;
		millones = new Text(i, j, string);//x,y
		millones.draw();
	}


	private static void creartexto(int i, int j, String string) {
		Text año1;
		año1 = new Text(i, j, string);
		año1.draw();
		
	}


	private static void crearDefinicion(int i, int j, int k, int l, Color color, String titulo) {
		Rectangle definicion;
		definicion = new Rectangle(i,j,k,l);
		definicion.draw();
		definicion.setColor(color);
		definicion.fill();
		Text dato;
		dato = new Text(i+18,j-4,titulo);
		dato.draw();
		
		
	}

	private static void crearRectangulo(int i, int j, int k, int l, Color color) throws InterruptedException {
		Rectangle rectangulo;
		rectangulo = new Rectangle(i,j,k,l); //x,y ancho, alto
		rectangulo.draw();
		rectangulo.setColor(color);
		rectangulo.fill();//4,1	
		
	}

}
