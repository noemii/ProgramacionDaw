package operadores;

public class ejercicio2_logicos {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		
		System.out.println("a	b	a&&b	a||b	not a	not b"); 
		
		a = 3 > 5;
		b = 12!=8;
		 
		
		System.out.print(("3 > 5")+ "\t");
		System.out.print(("12!=8") + "\t");
		System.out.print((a&&b) + "\t");		
		System.out.print((a||b)+ "\t");
		System.out.print((!a)+ "\t");		
		System.out.print((!b)+ "\n" );
		
		a = 5 >= 6;
		b = 3 != 3;
		
		System.out.print(("5 >= 6")+ "\t");
		System.out.print(("3 != 3") + "\t");
		System.out.print((a&&b) + "\t");		
		System.out.print((a||b)+ "\t");
		System.out.print((!a)+ "\t");		
		System.out.print((!b)+ "\n" );
		
		
		a = -7 == 8;
		// b= 22;
		
		System.out.print(("-7 = 8")+ "\t");
		System.out.print(("22") + "\t");
		System.out.print("error" + "\t");		
		System.out.print("error" + "\t");
		System.out.print("error" + "\t");		
		System.out.print("error" + "\n" );
		
		a = 21!= 12;
		b = true;
		
		System.out.print(("21!= 12")+ "\t");
		System.out.print(("TRUE") + "\t");
		System.out.print((a&&b) + "\t");		
		System.out.print((a||b)+ "\t");
		System.out.print((!a)+ "\t");		
		System.out.print((!b)+ "\n" );		//para negar una sola cosa, si son dos !=
		
		
		a = 4==2;
		b = 7>= -9;
		
		System.out.print(("4=2")+ "\t");
		System.out.print(("7>= -9") + "\t");
		System.out.print((a&&b) + "\t");		
		System.out.print((a||b)+ "\t");
		System.out.print((!a)+ "\t");		
		System.out.print((!b)+ "\n" );
		
		
		 
	
	}
	

}
