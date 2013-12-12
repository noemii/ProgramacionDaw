import java.util.Scanner;


public class uno {

	public static void main(String[] args) {
		String nombre;
		//String mensaje; otra forma de hacerlo
		Scanner input;
		
		 input= new Scanner (System.in);
		 System.out.println ("¿Cómo te llamas?");
		 
		 nombre = input.nextLine();
		// mensaje = "Hola, " + nombre;
		 //System.out.println("mensjae");
		 System.out.println("Hola, " + nombre);
		 input.close();
	}

}
