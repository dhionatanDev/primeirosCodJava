package basicoJava5;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	double cod1, qnt1, valor1, cod2, qnt2, valor2, calculo;
	cod1 = 0;
	qnt1 = 0;
	valor1 =0;
	cod2 = 0;
	valor2 = 0;
	qnt2 = 0 ;
	
	Locale.setDefault(Locale.US);
	Scanner lerTeclado = new Scanner(System.in);
	
	System.out.println("Informe o Cod do produto 1: ");
	cod1 = lerTeclado.nextDouble();
	System.out.println("Informe a quantidade do produto 1 : ");
	qnt1 = lerTeclado.nextDouble();
	System.out.println("Informe o valor do produto 1: ");
	valor1 = lerTeclado.nextDouble();
	System.out.println("Informe o Cod do produto 2: ");
	cod2 = lerTeclado.nextDouble();
	System.out.println("Informe a quantidade do produto 2 : ");
	qnt2 = lerTeclado.nextDouble();
	System.out.println("Informe o valor do produto 2: ");
	valor2 = lerTeclado.nextDouble();
	
	calculo = ( qnt1 * valor1) + ( qnt2 * valor2);
	
	System.out.printf("Valor Total a pagar R$ %.2f", calculo);
	
	lerTeclado.close();

	}

}
