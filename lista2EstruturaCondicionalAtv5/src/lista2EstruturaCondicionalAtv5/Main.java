package lista2EstruturaCondicionalAtv5;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	Criar um algoritmo que leia o nome, o número da conta e o saldo
			bancário total semestral de uma pessoa e calcule a tarifa bancária
			em que a mesma se enquadra:
			• Básica (saldo médio mensal inferior a R$ 1.000,00) tarifa de R$
			25,00;
			• Prata (saldo médio mensal entre R$ 1.000,01 e R$ 2.000,00)
			tarifa de R$ 20,00;
			• Ouro (saldo médio mensal entre R$ 2.000,01 e R$ 3.500,00)
			tarifa de R$ 13,00;
			• Prêmio (saldo médio mensal superior a R$ 3.500,00) tarifa
			isenta.
		 
		 */
		float saldo, conta;
		conta = 0;
		saldo = 0;
		String nome;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o Nome do Titular da Conta: ");
		nome = lerTeclado.next();
		System.out.println("Informe o numero da conta: ");
		conta = lerTeclado.nextFloat();
		System.out.println("Informe o saldo total semestral:  ");
		saldo = lerTeclado.nextFloat();
		
		if((saldo/6) < 1000) {
			System.out.println("Titular: " + nome + " Conta nº: " + conta + " Tipo de tarifa basica: R$ 25,00" );
		}
		else {
			if((saldo/6) > 1000 && (saldo/6)<= 2000 ) {
			System.out.println("Titular: " + nome + " Conta nº: " + conta + " Tipo de tarifa basica: R$ 20,00" );
		}
			else {
			if((saldo/6) > 2000 && (saldo/6)<= 3500 ) {
				System.out.println("Titular: " + nome + " Conta nº: " + conta + " Tipo de tarifa basica: R$ 13,00" );
			}
			else {
				System.out.println("Titular: " + nome + " Conta nº: " + conta + " Tipo de tarifa basica: isenta" );
			}
			}
		}
	}

}
