package Exercicios;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 5, solicite dois números ao usuário e exiba na tela sua soma, sua subtração, sua multiplicação e sua divisão.");
		System.out.print("Digite o primeiro número: ");
		double numero1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double numero2 = entrada.nextDouble();
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		System.out.println("A soma dos números digitados é: "+ soma);
		System.out.println("A subtração dos números digitados é: "+ subtracao);
		System.out.println("A multiplicação dos números digitados é: "+ multiplicacao);
		System.out.println("A divisão dos números digitados é: "+ divisao);
		entrada.close();
	}
}
