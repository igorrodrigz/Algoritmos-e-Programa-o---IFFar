package Numeros;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		double idade, ano, dias_vividos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 12, Calcular a quantidade de dias vividos pelo usuário.");
		System.out.println("***** CALCULADORA DE DIAS VIVIDOS *****");
		
		System.out.print("Digite sua idade: ");
		idade = entrada.nextDouble();
		
		ano = 365;
		dias_vividos = ano * idade;
		System.out.printf("Você já viveu %.0f dias!", dias_vividos );
		
		entrada.close();

	}
}
//12 Escreva um programa para ler a idade de uma pessoa, e exibir quantos dias de vida ela possui. 
//Considere sempre anos completos, e que um ano possui 365 dias. 
//Ex: uma pessoa com 19 anos possui 6935 dias de vida; 
//veja um exemplo de saída: VOCÊ JÁ VIVEU 6935 DIAS 