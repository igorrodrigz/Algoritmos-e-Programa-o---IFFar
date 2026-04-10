package Numeros;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		
		int camiseta_p, camiseta_m, camiseta_g, valor_p, valor_m, valor_g, total_p, total_m, total_g;
		double  total_arrecadado;
		
		valor_p = 10;
		valor_m = 12;
		valor_g = 15;
		
		total_p = 0;
		total_m = 0;
		total_g = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 13, Calcular a quantidade de camisetas p,m,g  pelo usuário e de valor arrecadado.");
		System.out.println("***** CALCULADORA DE VALOR ARRECADADO *****");
		
		System.out.print("Digite a quantidade de camisetas P vendidas: ");
		camiseta_p = entrada.nextInt();
		total_p = camiseta_p * valor_p;
		
		System.out.print("Digite a quantidade de camisetas M vendidas: ");
		camiseta_m = entrada.nextInt();
		total_m = camiseta_m * valor_m;
		System.out.print("Digite a quantidade de camisetas G vendidas: ");
		camiseta_g = entrada.nextInt();
		total_g = camiseta_g * valor_g;
		
		total_arrecadado = total_p + total_m + total_g;
		System.out.printf("O total arrecadado nas vendas foi de: R$ %.2f !",+ total_arrecadado );
		
		entrada.close();

	}
}
//13. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, 
//cada uma sendo vendida respectivamente por 10, 12 e 15 reais. 
//Construa um programa em que o usuário forneça a quantidade de camisetas pequenas, médias e grandes 
//referentes a uma venda, e a máquina informe quanto será o valor arrecadado. 