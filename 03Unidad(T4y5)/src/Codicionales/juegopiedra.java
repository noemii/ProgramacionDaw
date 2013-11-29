package Codicionales;

import java.util.Scanner;

public class juegopiedra {

	public static void main(String[] args) {
		int ordenador;
		String juego_ordenador;
		
		//ordenador elige su juego
		ordenador = (int) (Math.random() * 3 + 1);
		
		if (ordenador == 1) juego_ordenador="piedra";
		else if (ordenador == 2) juego_ordenador ="papel";
		else juego_ordenador = "tijera";
		
		Scanner teclado = new Scanner (System.in);
		
		//usuario elige su juego
		
		System.out.println("--Juego Piedra/papel/tijera --");
		System.out.println("¿Que sacas? [Piedra, papel, tijera]");
		
		String juego_usuario;
		
		juego_usuario=teclado.next();
		juego_usuario=juego_usuario.toLowerCase();
		
		System.out.println("Mi elección: " + juego_ordenador);
		
		
		//comprobar qien gana
		
		if ( !(juego_usuario.equals("piedra") || juego_usuario.equals("papel") || juego_usuario.equals("tijera")))
		{
			System.out.println("ERROR: no has escrito un juego correcto");
		}else{
			if (juego_usuario.equals(juego_ordenador)){
				System.out.println("Empate");
			}else if (juego_usuario.equals("piedra") && juego_ordenador.equals("tijera")||
			 juego_usuario.equals("papel") && juego_ordenador.equals("piedra") ||
			 juego_usuario.equals("tijera") && juego_ordenador.equals("papel")){
				System.out.println("GANASTE");
			}else {
				System.out.println("PERDISTE");
			}
		}

	}

}
