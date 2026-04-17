package Numeros;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		

double preco_kilo, kilo, valor_pagar ;
		
		preco_kilo = 12;
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa da Atividade 2, Calcular o valor total em vendas, fração de poupança, e quantidade de itens vendidos.");
		
		System.out.print("Digite o peso do total do prato: ");
		kilo = entrada.nextInt();
		valor_pagar = (kilo * preco_kilo);
		System.out.printf("O total a ser pago é: R$%.2f. \n",valor_pagar  );
		
		

		entrada.close();

	}
}
//Atividade 2 - B. O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. 
//Escreva um programa que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. 
//Assuma que a balança já desconte o peso do prato.  