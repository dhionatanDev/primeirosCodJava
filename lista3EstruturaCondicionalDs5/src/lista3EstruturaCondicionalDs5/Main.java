package lista3EstruturaCondicionalDs5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float cod = 0, qnt = 0;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o Cod do produto: ");
		cod = lerTeclado.nextFloat();
		System.out.println("Informe a quantidade do produto: ");
		qnt = lerTeclado.nextFloat();
		
		if( cod == 1) {
			qnt = (float) (qnt * 4.00); 
			System.out.printf("Total: R$ %.2f", qnt);
		}
		else if( cod == 2) {
			qnt = (float) (qnt * 4.50); 
			System.out.printf("Total: R$ %.2f", qnt);
		}
		else if( cod == 3) {
			qnt = (float) (qnt * 5.00); 
			System.out.printf("Total: R$ %.2f", qnt);
		}
		else if( cod == 4) {
			qnt = (float) (qnt * 2.00); 
			System.out.printf("Total: R$ %.2f", qnt);
		}
		else {
			qnt = (float) (qnt * 1.50); 
			System.out.printf("Total: R$ %.2f", qnt);
		}
	}

}
