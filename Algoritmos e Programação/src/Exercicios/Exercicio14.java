package Numeros;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		
double salario_bruto, salario_liquido, aumento, imposto, descontado, salario_final;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 14, Calcular o salário liquido do trabalhador.");
		System.out.println("***** CALCULADORA DE SALÁRIO *****");
		
		System.out.print("Digite o salario bruto do colaborador: ");
		salario_bruto = entrada.nextDouble();
		
		aumento = salario_bruto + (salario_bruto * 0.15);
		// System.out.print(aumento);
		descontado = aumento - (aumento * 0.8);
		// System.out.print(salario_final);
		
		System.out.printf("O salário incial que deveria ser pago ao colaborador é: %f \n", salario_bruto );
		System.out.printf("O salário com aumento que deveria ser pago ao colaborador é: %f \n", aumento );
		salario_final = aumento - descontado;
		System.out.printf("O salário liquido que deverá ser pago ao colaborador é: %f \n", salario_final );
		
		entrada.close();

	}
}
//14. Faça um programa para ler o salário de um funcionário e aumentá-lo em 15%. 
//Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.