package Exercicios;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 2, Calcular a Área de um Triangulo");
		System.out.print("Digite a base do Triangulo: ");
		double base = entrada.nextDouble();
		System.out.print("Digite a altura do Triangulo: ");
		double altura = entrada.nextDouble();
		double calculo = (base * altura)/2;
		System.out.println("A área do Triangulo é: "+ calculo);

	}
}
