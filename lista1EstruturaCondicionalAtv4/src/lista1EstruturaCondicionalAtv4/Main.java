package lista1EstruturaCondicionalAtv4;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Números quadrados perfeitos são aqueles cuja raiz quadrada é um
		número inteiro. Exemplo 144. Fazer um algoritmo que dado um
		número inteiro positivo, calcule e escreva se este é ou não quadrado
		perfeito.
		 		*/
		int numero; 
		float calculo, raiz;
		numero = 0;
		calculo = 0;
		raiz = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro positivo: ");
		
		numero = lerTeclado.nextInt();
		raiz =  (float) Math.sqrt(numero);
		calculo = (float) numero % raiz;
		
		
		if(calculo == 0) {
			System.out.println("O numero é um quadrado perfeito e sua raiz é: " + raiz);
			
		}
		/* resolução com 2 if´s
		if(calculo != 0) {
			System.out.println("O numero não forma um quadrado perfeito");
			
		}*/
		else { System.out.println("O numero não forma um quadrado perfeito");
		}

	}
}