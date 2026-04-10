package Numeros;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		
double total_cavalos, ferraduras, total_ferraduras, n_patas;

		ferraduras = 4;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 15, Calcular o total de ferraduras a comprar.");
		System.out.println("***** CALCULADORA DE SALÁRIO *****");
		
		System.out.print("Digite o numero de cavalos: ");
		total_cavalos = entrada.nextDouble();
		
		total_ferraduras = ferraduras * total_cavalos;
		
		System.out.printf("O total de ferraduras a serem compradas é: %.0f Ferraduras \n", total_ferraduras );
		
		entrada.close();

	}
}
//15. Faça um programa para calcular quantas ferraduras são necessárias para equipar todos os cavalos comprados
//para um haras. 