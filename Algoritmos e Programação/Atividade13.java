package Numeros;

import java.util.Scanner;

public class Atividade13 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Double diaria, dias ;
		
		System.out.println("Digite o Numero de dias: ");
		dias = entrada.nextDouble();
		
		if (dias > 15) {
			System.out.println(">15");
			diaria = 5.50;
			diaria = (dias * (60 + diaria)) ;
			System.out.println("O cliente ficou "+ dias +"E o valor da estadia foi:R$ "+ (diaria));
		} else if (dias == 15) {
			System.out.println("== 15");
			diaria = 6.0;
			diaria = (dias * (60 + diaria)) ;
			System.out.println("O cliente ficou "+ dias +"E o valor da estadia foi:R$ "+ (diaria));
		} else if (dias < 15 ){
			System.out.println("<15");
			diaria = 8.0;
			diaria = dias * ((60 + diaria));
			System.out.println("O cliente ficou "+ dias +"E o valor da estadia foi:R$ "+ (diaria));
		}
		
		
		entrada.close();

	}
}
/*13. Um hotel cobra R$ 60.00 a diária e mais uma taxa de serviços. A taxa de serviços é de: 
•R$ 5.50 por diária, se o número de diárias for maior que 15;
•R$ 6.00 por diária, se o número de diárias for igual a 15;
•R$ 8.00 por diária, se o número de diárias for menor que 15.			
Construa um programa que leia o número de diárias de um cliente e mostre o seu nome e o total da conta.
*/