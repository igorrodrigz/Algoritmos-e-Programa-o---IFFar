package Numeros;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		
double preco_litro, litros, valor_pago;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 16, Calcular o total de litros abastecido.");
		System.out.println("***** CALCULADORA DE LITROS *****");
		
		System.out.print("Digite preço do combustível: ");
		preco_litro = entrada.nextDouble();
		
		System.out.print("Digite o valor pago: ");
		valor_pago = entrada.nextDouble();
		litros = valor_pago / preco_litro;
		System.out.printf("O total de litros abastecido é: %.0f Litros \n", litros );
		
		entrada.close();

	}
}
//16. Um motorista deseja colocar no seu tanque X reais de gasolina. 
//Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento, 
//e exibir quantos litros ele conseguiu colocar no tanque.