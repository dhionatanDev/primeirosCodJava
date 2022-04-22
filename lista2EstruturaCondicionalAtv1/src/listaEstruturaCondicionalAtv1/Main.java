package listaEstruturaCondicionalAtv1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Desenvolver um algoritmo que leia os coeficientes (A,B e C) de uma
		equação do segundo grau ( Ax2 + Bx + C =0) e que calcule
		suas raízes. O algoritmo deve mostrar, quando possível, o valor das
		raízes calculadas e a classificação das mesmas: “RAÍZES
		IMAGINÁRIAS”, “RAIZ ÚNICA” ou “RAÍZES DISTINTAS”.
		 */
		double valorA, valorB, valorC, delta, x1, x2;
		valorA = 0;
		valorB = 0;
		valorC = 0;
		delta = 0;
		x1 = 0;
		x2 = 0;
		
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		valorA = lerTeclado.nextDouble();
		System.out.println("Informe o valor de B: ");
		valorB = lerTeclado.nextDouble();
		System.out.println("Informe o valor de C: ");
		valorC = lerTeclado.nextDouble();
		
		delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
		
		
		if(delta < 0) {
			System.out.println("Não existe Raiz Real");
		}
		else {
			if(delta == 0) {
				
				x1 = (- valorB + Math.sqrt(delta)) / (2 * valorA);
				System.out.printf("Raiz única %.2f",x1);
				
			}
			else {
				
				x1 = (- valorB + Math.sqrt(delta))/ (2 * valorA);
				x2 = (- valorB - Math.sqrt(delta))/ (2 * valorA);
				System.out.printf("Raizes distintas X': %.2f  x'': %.2f ",x1 , x2);
			}
		}
		
		
		
		
	}

}
