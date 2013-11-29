package BucleAnidado;

public class todaslastablas_anidadas {

	public static void main(String[] args) {
		
		int linea;
		int multiplicacion;
		int numero;
		
	for(numero=1;numero<=10;numero++){
		multiplicacion=numero;
	linea=1;
		for(int j=0;j<10;j++) System.out.println("");
		System.out.println("Tabla del " + numero);

		while (linea <= 10){
			System.out.println(numero + " x " + linea + " = " + (multiplicacion));
			linea++;
			multiplicacion = multiplicacion + numero;
			}
		}
	}

}
