package Numeros;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		
		double salario_bruto, salario_liquido,previdencia, imposto, salario;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 11, Calcular o salário liquido do trabalhador.");
		System.out.println("***** CALCULADORA DE MÉDIA DE CONSUMO *****");
		
		System.out.print("Digite o salario bruto do colaborador: ");
		salario_bruto = entrada.nextDouble();
		
		previdencia = salario_bruto - (salario_bruto * 0.10);
		imposto = salario_bruto - (salario_bruto * 0.5);
		salario_liquido = previdencia - imposto;
		//salario_liquido = salario_bruto - imposto;
		System.out.printf("O salário liquido que deverá ser pago ao colaborador é: %f", salario_liquido );
		
		entrada.close();

	}
}
//11. Considere a seguinte situação: descontam-se inicialmente 10% do salário bruto do trabalhador 
//como contribuição à previdência social. Após esse desconto, há um outro desconto de 5% sobre o 
//valor restante do salário bruto, a título de um determinado imposto. 
//Faça um programa que leia o salário bruto de um cidadão e imprima o seu salário líquido. 