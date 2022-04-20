import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double vlrA, vlrB, vlrC, triangulo, circulo, trapezio, quadrado, retangulo; 
		Locale.setDefault(Locale.US);
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		vlrA = lerTeclado.nextDouble();
		System.out.println("Informe o valor de B: ");
		vlrB = lerTeclado.nextDouble();
		System.out.println("Informe o valor de C: ");
		vlrC = lerTeclado.nextDouble();
		
		triangulo = (vlrA * vlrC)/2;
		circulo = 3.14159 * Math.pow(vlrC, 2);
		trapezio = ((vlrA + vlrB)*vlrC)/2;
		quadrado = vlrB * vlrB;
		retangulo = vlrA * vlrB;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		lerTeclado.close();

	}

}
