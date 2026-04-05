package Exercicios;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double celcius;
		double farenheit;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa do Exercício 7, conversor de temperatura Farenheit p/ Celcius.");
		System.out.print("Digite a temperatura em graus Farenheit: ");
		farenheit = entrada.nextDouble();
		celcius = ((farenheit - 32) * 5/9);
		System.out.printf("A conversão de temperatura é: %.2f°C." ,celcius);
		entrada.close();
	}
}
