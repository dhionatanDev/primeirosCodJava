package javaBasic1;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		/* 1. Fazer um algoritmo que leia um número inteiro e mostre uma
		mensagem indicando se este número é par ou ímpar.*/
		
		int numero, calculo;
		numero = 0;
		calculo =0;
		
		Scanner lerTeclado = new Scanner (System.in);
		
		System.out.println("Informe o numero: ");
		numero = lerTeclado.nextInt();
		calculo = numero % 2;
		if (calculo == 0) {
			System.out.println("O numéro é par");
		}
		/* Programa com Else 
		 else {
			System.out.println("O numero é impar");
		}*/
		// Abaixo programa com outro If
		if(calculo != 0) {
			System.out.println("Onumero é impar");
		}
		lerTeclado.close();
		
	}

}
