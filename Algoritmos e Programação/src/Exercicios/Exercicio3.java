package Exercicios;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 3, Calcular o valor de uma prestação em atraso");
		System.out.print("Digite o valor da Taxa: ");
		double Taxa = entrada.nextDouble();
		System.out.print("Digite o Valor inicial da Prestação: ");
		double Valor = entrada.nextDouble();
		System.out.print("Digite o número de meses em atraso: ");
		double Tempo = entrada.nextDouble();
		double Prestacao = (Valor + (Valor * (Taxa/100) * Tempo));
		System.out.println("O valor da Prestação a ser pago é: "+ Prestacao);

	}
}
