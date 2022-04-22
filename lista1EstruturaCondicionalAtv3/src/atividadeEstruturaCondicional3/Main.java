package atividadeEstruturaCondicional3;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	3. O número 3025 possui a seguinte característica:
			30 + 25 = 55
			55*55(55 elevado ao quadrado) = 3025
		*/
		int numero, div, rest,calculo, soma;
		numero = 0;
		div = 0;
		rest = 0;
		soma =0;
		calculo =0;
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		numero = lerTeclado.nextInt();
		div = numero/100;
		rest = numero%100;
		soma = div + rest;
		calculo = (int) Math.pow(soma, 2);
		
			if(numero == calculo) {
			System.out.println("O numero " + numero + " Possui a seguinte característica: ");
			System.out.println(div + " + " + rest + " = " + soma);
			System.out.println(soma + "² = " + calculo);
						
		}
			/*Usando 2 IF 
			 if(numero != calculo)
			{
				System.out.println("O numero não possui a caracteristica ");
			}
			*/
			
			
			else {
			System.out.println("O numero não possui a caracteristica ");
		}
	}

}
