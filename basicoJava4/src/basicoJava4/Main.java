package basicoJava4;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int numero, horas;
		double salarioH, calculo;
		numero = 0;
		horas = 0;
		salarioH = 0;
		
		Locale.setDefault(Locale.US);
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe o numero do Funcionario: ");
		numero = lerTeclado.nextInt();
		System.out.println("Informe a quantidade de Horas trabalhadas: ");
		horas = lerTeclado.nextInt();
		System.out.println("Informe o  valor do salario por horas : ");
		salarioH = lerTeclado.nextDouble();
		calculo = horas * salarioH;
		
		System.out.println("O numero do funcionario é: " + numero + " E o salario é: " + calculo);
		
		lerTeclado.close();

	}

}
