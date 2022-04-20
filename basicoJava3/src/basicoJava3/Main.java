package basicoJava3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int a, b, c, d, calculo;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		calculo = 0;
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		a = lerTeclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		b = lerTeclado.nextInt();
		System.out.println("Informe o terceiro numero: ");
		c = lerTeclado.nextInt();
		System.out.println("Informe o quarto numero: ");
		d = lerTeclado.nextInt();
		
		calculo = (a*b) - (c*d);
		
		System.out.println("DIFERENÇA = " + calculo);
		
		

	}

}
