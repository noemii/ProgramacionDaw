package Codicionales;

import java.util.Scanner;

public class TiendaPrecios {

	public static void main(String[] args) {
		// 3.	Una tienda hace un descuento del 10% por compras menores de 20€, un 20% por compras entre 20 y 50€ y un 25% si
		//	la compra es mayor.Escribe un programa que pida el precio de un producto y muestre su precio final en las rebajas.
		Scanner teclado = new Scanner(System.in);
		double precio;
		
		System.out.println("Indique el precio del producto");
		precio = teclado.nextInt();
		
		if (precio < 20){
			System.out.println("El precio tiene un descuento del 10% y su precio final es : " + (precio - (precio * 10) / 100));
		}else if (precio >= 20 && precio <= 50){
			System.out.println("El precio tiene un descuento del 20% y su precio final es : " + (precio - (precio * 20) / 100));
		}else{
			System.out.println("El precio tiene un descuento del 25% y su precio final es : " + (precio - (precio * 25) / 100));
		} 
	}

}
