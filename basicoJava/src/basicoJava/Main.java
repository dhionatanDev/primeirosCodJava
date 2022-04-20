package basicoJava;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int numero1, numero2, calculo;
		numero1 = 0;
		numero2 = 0;
		calculo = 0;
		
		Scanner lerTeclado = new Scanner (System.in);
		
		System.out.println("Informe o primeiro numero: ");
		numero1 = lerTeclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		numero2 = lerTeclado.nextInt();
		calculo = numero1 + numero2;
		
		System.out.println("A soma é: " + calculo);

	}

}
