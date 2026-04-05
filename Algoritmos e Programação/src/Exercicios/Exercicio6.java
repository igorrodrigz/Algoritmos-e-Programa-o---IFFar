package Exercicios;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double celcius;
		double farenheit;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 6, conversor de temperatura Celcius p/ Farenheit.");
		System.out.print("Digite a temperatura em graus Celcius: ");
		celcius = entrada.nextDouble();
		farenheit = ((celcius * 9/5 )+ 32);
		System.out.printf("A conversão de temperatura é: %.2f° Farenheit." ,farenheit);
		entrada.close();
	}
}
