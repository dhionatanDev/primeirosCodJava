package lista1EstruturaCondicionalAtv5;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Tendo como dados de entrada a altura e o sexo de uma pessoa,
		construa um algoritmo que calcule seu peso ideal, utilizando as
		seguintes expressões:

		• Para homens: 72.7 * h −58 ;
		• Para mulheres: 62.1* h −44.7.
		*/
		float altura, calculo;
		altura = 0;
		calculo = 0;
		char  sexo; 
		
			
		
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o Sexo, M para Masculino F para feminino: ");
		sexo = lerTeclado.next().charAt(0);
		
		if (sexo != 'M' && sexo !='F'){
			System.out.println("Informe a variavel correta: M para masculino F para feminino");
			
		}
		else {
		
		System.out.println("Informe a altura: ");
		altura = lerTeclado.nextFloat();
		
		
		if (sexo != 'M' && sexo !='F'){
			System.out.println("Informe a variavel correta: M para masculino F para feminino");
			
		}
		
		if (sexo == 'M'){
			calculo = (float) (72.7 * altura - 58);
			System.out.printf("Seu peso perfeito é: %.1f" , calculo);
			
		}
		
		/* Resolução com Else
		 	else {
			if (sexo == 'F'){
			calculo = (float) (62.1 * altura - 44.7);
			System.out.println("Seu peso perfeito é: " + calculo);
			
		}
			else {
				System.out.println("Informe a variavel correta: M para masculino F para feminino");
			}
			}
			*/
		
		if (sexo == 'F'){
			calculo = (float) (72.7 * altura - 58);
			System.out.printf("Seu peso perfeito é: %.f" , calculo);
			
		}
		
		
		
		}
		
	
	}

}
