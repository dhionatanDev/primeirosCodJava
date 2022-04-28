package aplication;

import java.util.Scanner;

import entites.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lerTeclado = new Scanner(System.in);
		Rectangle retangulo = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = lerTeclado.nextDouble();
		retangulo.height = lerTeclado.nextDouble();
		System.out.printf("AREA = %.2f%n" , retangulo.area());
		System.out.printf("PERIMETER = %.2f%n" , retangulo.perimeter());
		System.out.printf("DIAGONAL = %.2f%n" , retangulo.diagonal());
	}

}
