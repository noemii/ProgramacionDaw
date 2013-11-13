package Actividades;

public class seis {
	
	public static void main(String[] args) {
		int X,Y,Z;
		boolean A,B,C,D,E,F;
		double PI;
		
		PI=Math.PI;
		
		X = 7; Z = 2; Y = 4; PI = 3.14;

	
		A=((4-2)*(5+1)/2)>2-(4+3);
		
		B=(6+3)>8 && (6-1) * 2 < 8 || 23==8;
		C=(1.0 < X) && (X < Z+7.0); //donde X=7 y Z=2
		
		D=(PI * Math.pow(X, 2) > Y || 2 * PI * X <= Z); //donde X01, Y=4, Z=10, PI=3.14
		
		X=1; Y=4; Z=10;
		E= X>3 && Y==4 || X + Y <= Z; //donde X=1, Y=4, Z=10		
		F=X>3 && (Y==4 || X + Y <= Z); //donde X=1, Y=4, Z=10

		
		System.out.println("A es igual " + A);
		System.out.println("B es igual " + B);
		System.out.println("C es igual " + C);
		System.out.println("D es igual " + D);
		System.out.println("E es igual " + E);
		System.out.println("F es igual " + F);
	}
}
