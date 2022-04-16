import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		double horaSaida, tempoViagem, fusoDestino, soma, resto;
		horaSaida = 0;
		tempoViagem = 0;
		fusoDestino = 0;
		soma = 0;
		resto = 24;
		Scanner lerTeclado = new Scanner(System.in);
		System.out.println("Informe a hora de sáida: ");
		horaSaida = lerTeclado.nextDouble();
		System.out.println("Informe o tempo de viagem: ");
		tempoViagem = lerTeclado.nextDouble();
		System.out.println("Diferença de fuso horario do destino com relação a origem : ");
		fusoDestino = lerTeclado.nextDouble();
		soma = (horaSaida + tempoViagem + fusoDestino) % resto;
		
		if (soma < 0) {
			soma = soma + 24;
			System.out.println("Você chegará ao destino ás: " + soma);
		}
		else { 
			
			System.out.println("Você chegará ao destino ás: " + soma + " HORAS");
			
		}
		

	}

}
