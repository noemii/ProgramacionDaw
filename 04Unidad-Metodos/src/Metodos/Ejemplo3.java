package Metodos;
 //crear un metodo que devuelva un numero aleatorio entre un minimo y un maximo
public class Ejemplo3 {

	public static void main(String[] args) {
		
		int max=3;
		int min=1;
		
		for(int i=0;i<100;i++){
			int aleatorio = devolverAleatorio(min,max); //los valores que indiquemos aqui, se pasan a los de abaajo //int minimo, maximo
			System.out.println(aleatorio);
			
			if(aleatorio<min || aleatorio>max){
				System.out.println("getAleatorio se ha ido del rango!! ");
			}
			
		}

	}

		private static int devolverAleatorio(int minimo, int maximo) {
	
		int aleatorio = (int) (Math.random()* ((maximo - minimo) + 1))+ minimo;
		
		return aleatorio;  //return termina el proceso. En cuanto se ejecuta se finaliza
	}

		
}
