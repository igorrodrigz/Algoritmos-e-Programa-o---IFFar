package Numeros;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		

double peso, engordou, emagreceu ;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa da Atividade D, calcular o peso.");
		
		System.out.print("Digite o peso da pessoa: ");
		peso = entrada.nextDouble();
		
		engordou = peso * 0.15;
		emagreceu = peso * 0.20;
		
		
		
		System.out.printf("O peso aumentou, o total é: %.2f. \n",(peso + engordou));
		System.out.printf("O peso reduziu, o total: %.2f. \n",(peso - emagreceu));
		
		entrada.close();

	}
}
//Atividade 4 D. Faça um programa que receba o peso de uma pessoa, calcule e mostre: 

//a) o novo peso se a pessoa engordar 15% sobre o peso digitado; 

//b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
