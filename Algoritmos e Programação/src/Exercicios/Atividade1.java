package Numeros;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		
int qtd_pao, qtd_broa;
double valor_pao, valor_broa, poupanca, total_pao, total_broa, valor_total;
		
		valor_pao = 0.12;
		valor_broa = 1.50;
		poupanca = 0;
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa da Atividade 1, Calcular o valor total em vendas, fração de poupança, e quantidade de itens vendidos.");
		
		System.out.print("Digite a quantidade de pães vendidos no dia: ");
		qtd_pao = entrada.nextInt();
		total_pao = (qtd_pao * valor_pao);
		System.out.printf("O total de pães vendidos é: R$%.2f. \n",total_pao  );
		
		System.out.print("Digite a quantidade de broas vendidas no dia: ");
		qtd_broa = entrada.nextInt();
		total_broa = qtd_broa * valor_broa;
		System.out.printf("O total de pães vendidos é: R$%.2f. \n",total_broa  );
		
		valor_total = (total_broa + total_pao);
		System.out.printf("============== PADARIA HOTPÃO ============. \n");
		System.out.printf("=============== CUPOM FISCAL =============. \n");
		System.out.printf("Valor total arrecadado no dia é: R$%.2f. \n", valor_total);
		
		poupanca = ((valor_total / 100) * 10);
		System.out.printf("valor a ser depositado em poupança: R$%.2f.\n", poupanca);
		System.out.printf("================ OBRIGADO! ===============. \n");
		

		entrada.close();

	}
}
//Atividade 1 - A. A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
//Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber 
//quanto arrecadou com a venda dos pães e broas (juntos), 
//e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
//Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos, 
//faça um programa para ler as quantidades de pães e de broas, e depois calcular os dados solicitados. 