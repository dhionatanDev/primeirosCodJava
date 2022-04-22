package lista2EstruturaCondicionalAtv3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Criar um algoritmo que leia a idade de uma pessoa e que mostre a
		sua classe eleitoral:
		• Não-eleitor (abaixo de 16 anos);
		• Eleitor Obrigatório (entre 18 e 65 anos);
		• Eleitor facultativo (entre 16 e 17 anos e maior de 65 anos).
		  */
		int idade;
		idade = 0;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe a idade: ");
		idade = lerTeclado.nextInt();
		
		if(idade<16) {
			System.out.println("Não-eleitor (abaixo de 16 anos)");
		}
		else {
			if(idade >= 18 && idade <= 65) {
				System.out.println("Eleitor Obrigatório (entre 18 e 65 anos)");
			}
			else {
				System.out.println("Eleitor facultativo (entre 16 e 17 anos e maior de 65 anos).");
			}
		}
		
	}

}
