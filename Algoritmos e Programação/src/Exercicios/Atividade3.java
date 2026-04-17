package Numeros;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		

double salario_fixo, valor_pagar, vendas ;




		Scanner entrada = new Scanner(System.in);
			System.out.println("Programa da Atividade C, calcular o salario.");

		System.out.print("Digite o salário fixo do colaborador: ");
		salario_fixo = entrada.nextDouble();

		System.out.print("A quantidade de Vendas: ");
		vendas = entrada.nextDouble() * 0.04;

		System.out.printf("O total a ser pago é: R$%.2f. \n",vendas  );

		valor_pagar = (salario_fixo + vendas);
		System.out.printf("O total a ser pago é: R$%.2f. \n",valor_pagar  );



		entrada.close();

		}

	}
//Atividade 3 Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas. 
//Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas, 
//calcule e mostre a comissão e o salário final do funcionário.  