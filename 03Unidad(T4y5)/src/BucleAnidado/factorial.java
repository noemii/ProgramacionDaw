package BucleAnidado;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		//Escribe un programa que pida un número con el fin de calcular el factorial de dicho número. 
		//Hay que validar que el número insertado sea positivo (incluido el 0). Si no es así, se volverá a pedir dicho número. 
		//Posteriormente, el programa le preguntará al usuario si quiere insertar otro número, 
		//con un mensaje como este: "¿Quiere insetar otro número [s/n]?". Debes validar también esta respuesta.

	Scanner teclado = new Scanner (System.in);
		
		int n1 = 0;
		
		String respuesta ="";
		
		System.out.println("Calculo de factoriales");
		
		do{
			do{
				System.out.println("\nIndica un numero");
					n1=teclado.nextInt();
			}while(n1<0);
			
			//calcular el factorial
			double factorial=1.0;
				if(n1!=0){
				
					for(int i=1; i<=n1; n1--){  //pongo i porque asi para cada bucle empieza desde ahi
					factorial = factorial*n1;				
					}
				
					System.out.println("el numero factorial es: " + factorial);
					}else if (n1==0){
						System.out.println("el numero factorial es: " + 0);
					}
		
					
					do {
                        System.out.println("\n¿Quiere insetar otro número [s/n]?");
                        respuesta=teclado.next();
                      } while (!respuesta.equals("s") && !respuesta.equals("n"));
			
			}while (respuesta.equals("s"));
		}
	}

				
		
	
			
		
		 /* PROFESOR
		  * 
              int numero=-1;
              String respuesta;
              Scanner teclado;
              double factorial;
              
              teclado= new Scanner(System.in);
              
              System.out.println("Cálculo de factoriales");
              
              do{
              
                      do {
                           // pedir numero
                              System.out.print("\nDame un número positivo: ");
                              numero=teclado.nextInt();
                      } while (numero<0);
                      
                      // calcular factorial de numero
                      factorial=1.0;
                      if (numero!=0) {
                              for(int i=1;i<=numero;i++)
                                      factorial=factorial*i;
                      }
                      
                      System.out.println("El factorial de " + numero + " es " + factorial);
                              
                      do {
                        System.out.println("\n¿Quiere insetar otro número [s/n]?");
                        respuesta=teclado.next();
                      } while (!respuesta.equals("s") && !respuesta.equals("n"));
                      
              } while (respuesta.equals("s"));
      }

}
}*/
				



