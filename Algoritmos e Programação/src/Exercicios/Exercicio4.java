package Exercicios;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 4, Calcular a Média Aritmética de 3 números.");
		System.out.print("Digite o primeiro numero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo numero: ");
		double n2 = entrada.nextDouble();
		System.out.print("Digite o terceiro numero: ");
		double n3 = entrada.nextDouble();
		double media = (n1 + n2 + n3)/3;
		System.out.println("A média aritmética dos numeros inseridos é: "+ media);

	}
}
