package Exercicios;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 1, ver o Antecessor e Sucessor de um número inteiro?");
		System.out.print("Digite um número: ");
		int numero = entrada.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		System.out.println("O número digitado é: "+ numero);
		System.out.println("O Sucessor é: "+ sucessor);
		System.out.println("O Antecessor é: "+ antecessor);
	}
}
