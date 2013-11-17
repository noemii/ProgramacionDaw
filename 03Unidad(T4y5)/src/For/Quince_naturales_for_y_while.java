package For;

public class Quince_naturales_for_y_while {

	public static void main(String[] args) {
		// 2.	Visualizar los 15 primeros números naturales del 15 al 1. Primero utilizar una estructura while, luego una for.
		int numero = 15;
		
		
		while(numero>=1){
			System.out.print(numero + "\t");
			numero--;
		}
		
		System.out.println("");
		
		for(numero = 15; numero>=1; numero--){  //Cuidado no poner ; antes de una {
			System.out.print(numero + "\t");
		
		}
		
	}	
	

}
