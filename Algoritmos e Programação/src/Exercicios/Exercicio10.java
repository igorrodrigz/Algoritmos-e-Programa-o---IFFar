package Numeros;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		double media_consumo, distancia, velmedia;
		int tempo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 10, Calcular a média de consumo de um veículo.");
		System.out.println("***** CALCULADORA DE MÉDIA DE CONSUMO *****");
		
		System.out.print("Digite o tempo gasto na viagem: ");
		tempo = entrada.nextInt();
		
		System.out.print("Digite a velocidade média empregada na viagem: ");
		velmedia = entrada.nextDouble();
		
		distancia = (velmedia * tempo);
		media_consumo = (distancia / 12);
		System.out.printf("A distancia percorrida na viagem foi: %.2f KM e o consumo de combustível foi %.2f Litros ", distancia, media_consumo );
		System.out.println("\nVelocidade média: "+ velmedia);
		entrada.close();

	}
}
//10. Faça um programa que calcule a quantidade de litros de combustível gasta em uma viagem,
//utilizando um automóvel que faz 12Km por litro. Para obter o cálculo, o usuário deve fornecer
//o tempo gasto na viagem e a velocidade média durante ela. Desta forma, 
//será possível obter a distância percorrida com a fórmula: 