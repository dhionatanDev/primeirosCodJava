package lista3EstruturaCondicionalDS7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valorX = 0, valorY = 0;
		
	Scanner lerTeclado = new Scanner(System.in);
	
	System.out.println("Informe o valor de X: ");
	valorX = lerTeclado.nextFloat();
	
	System.out.println("Informe o valor de Y: ");
	valorY = lerTeclado.nextFloat();
	
	if(valorX > 0 && valorY > 0) {
		System.out.println("Q1");
	}
	if(valorX < 0 && valorY > 0) {
		System.out.println("Q2");
	}
	if(valorX < 0 && valorY < 0) {
		System.out.println("Q3");
	}
	if(valorX > 0 && valorY < 0) {
		System.out.println("Q4");
	}
	if(valorX == 0 && valorY == 0) {
		System.out.println("Origem");
	}

	}

}
