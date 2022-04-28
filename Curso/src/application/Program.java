package application;

import java.util.Scanner;

import entites.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double calculoPa, calculoPb, areaA, areaB;
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		calculoPa = 0;
		areaA = 0;
		areaB = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do lado A do primeiro Triangulo: ");
		x.a = lerTeclado.nextDouble();
		System.out.println("Informe o valor do lado B do primeiro Triangulo: ");
		x.b = lerTeclado.nextDouble();
		System.out.println("Informe o valor do lado C do primeiro Triangulo: ");
		x.c = lerTeclado.nextDouble();
		System.out.println("Informe o valor do lado A do segundo Triangulo: ");
		y.a = lerTeclado.nextDouble();
		System.out.println("Informe o valor do lado B do segundo Triangulo: ");
		y.b = lerTeclado.nextDouble();
		System.out.println("Informe o valor do lado C do segundo Triangulo: ");
		y.c = lerTeclado.nextDouble();
		
		areaA = x.area();
		areaB = y.area();
		
		
		
		System.out.printf("Triangle X area: %.4f%n", areaA);
		System.out.printf("Triangle Y area: %.4f%n", areaB);
		
		if (areaA > areaB) {
			System.out.printf("Lager area X");
					}
		else {
			System.out.printf("Lager area Y");
		}
		
		lerTeclado.close();
	}

}
