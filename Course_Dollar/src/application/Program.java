package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ConversorDeMoeda;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dólar?");
		double precoDollar = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados?");
		double quantia = sc.nextDouble();
		
		double resultado = ConversorDeMoeda.dollarParaReal(quantia, precoDollar);
				
		System.out.printf("Valor a ser pago em reais = %.2f%n", resultado);
		
		sc.close();
	}

}
