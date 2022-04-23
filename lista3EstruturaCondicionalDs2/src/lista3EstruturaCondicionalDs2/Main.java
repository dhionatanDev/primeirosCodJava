package lista3EstruturaCondicionalDs2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		  */
		 int numero = 0 ;
		 Scanner lerTeclado = new Scanner(System.in);
		 System.out.println("Digite um numero: ");
		 numero = lerTeclado.nextInt();
		 
		 numero = numero % 2;
		 
		 if(numero == 0) {
			 System.out.println("O numero digitado é par ");
		 }
		 else {
			 System.out.println("O numero digitado é impar");
		 }
	}

}
