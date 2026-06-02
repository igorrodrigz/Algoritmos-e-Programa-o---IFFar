package Numeros;

import java.util.Scanner;

public class Atividade12 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int N ;
		
		System.out.println("Digite o Numero N: ");
		N = entrada.nextInt();
		
		if (N <=10) {
			System.out.println("F1");
		} else if (N > 10 && N <= 100) {
			System.out.println("F2");
		} else if (N > 100 ){
		
			System.out.println("F3");
		}
		
		
		
		
		/*switch (num) {
		case 1: 
			System.out.println("dia corespondente DOMINGO : "+num);
			break;
		case 2:
			System.out.println("dia corespondente SEGUNDA : "+num);
			break;
		default: 
			System.out.println("Entrada Inválida para dia da semana.");
		}*/
		entrada.close();

	}
}
/*12. Faça um programa que leia um número N e imprima “F1”, “F2” ou “F3”, conforme a condição:	
• “F1”, se N <= 10
• “F2”, se N > 10 e N <= 100 
• “F3”, se n > 100 */