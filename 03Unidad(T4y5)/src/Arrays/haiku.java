package Arrays;

import java.util.Scanner;

public class haiku {

	public static void main(String[] args) {
		String verso;
		Scanner teclado = new Scanner (System.in);
		
		String [] frase = new String[40];
		
		int i = 0;
		String respuesta="";
		String s="s";
		String n="n";
		System.out.println("Escribe las frases para haiku");
		
		
			for(; i<frase.length;i++){
		
			verso=teclado.nextLine();
			if(i>=3 && verso.equals("*")){
				break;
			}
			frase[i]=verso;
			}
		do{
			for(int a = 0; a < 3; a++){
				
				int r = (int) (Math.random()*(1+i));
				System.out.println(frase[r]);
			}
			
			System.out.println("Desea obtener mas haiku?[s/n]");
			respuesta=teclado.nextLine();
			
			if (respuesta.equals(n)){
				break;
			}
		}while(respuesta.equals(s) && !respuesta.equals(n));
		
	}

}
