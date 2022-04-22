package atividadeEstruturaCondicional2;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
			/* 2. Fazer um algoritmo que calcule e imprima o salário reajustado de um
			funcionário de acordo com as seguintes regras:
			• Salários de até R$ 1050,00 reajuste de 50%;
			• Salários maiores que R$ 1050,00 reajuste de 30%.*/
		float salario;
		salario =0;
				
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o valor do Sálario do funcionario: ");
		salario = lerTeclado.nextFloat();
		if (salario <= 1050) {
			salario = (float) (salario + salario * 0.5);
			System.out.printf("O valor do salario reajustado é de R$ %.2f", salario);	
		}
		/* Resolução da questão com 2 If´s 
		 if (salario > 1050) {
			salario = (float) (salario + salario * 0.3);
			System.out.printf("O valor do salario reajustado é de R$ %.2f", salario);	
		}
		 */
		
		else {
			salario = (float) (salario + salario * 0.3);
			System.out.printf("O valor do salario reajustado é de R$ %.2f", salario);
		}
	}

}
