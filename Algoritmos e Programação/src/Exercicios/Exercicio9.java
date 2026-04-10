package Numeros;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		double valor, saldo, cheque;
		saldo = 500;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 9, Calcular o saldo de um cliente no banco.");
		System.out.println("***** BEM VINDO AO BANCO JAVA DO IFFAR *****");
		System.out.println("ATUALMENTE SEU SALDO É: "+ saldo);
		System.out.print("Digite o valor do cheque a ser descontado: ");
		cheque = entrada.nextDouble();
		
		saldo = saldo - cheque;
		
		System.out.printf("SEU SALDO ATUAL É: R$%.2f ", saldo);
		entrada.close();

	}
}
//Um cliente de um banco tem um saldo positivo de R$500,00.
// Faça um programa que leia um 
//cheque que foi descontado e calcule o saldo,
//mostrando (escrevendo) o saldo na tela.