package Exercicios;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		
		double comprimento, largura, altura, volume;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 8, Calcular o valor do volume de uma caixa retangular.");
		System.out.print("Digite o comprimento da caixa: ");
		comprimento = entrada.nextDouble();
		System.out.print("Digite a largura da caixa: ");
		largura = entrada.nextDouble();
		System.out.print("Digite a altura da caixa: ");
		altura = entrada.nextDouble();
		volume = (comprimento * largura * altura);
		System.out.printf("O Volume da caixa é: %.2f cm³ ", volume);
		entrada.close();

	}
}
