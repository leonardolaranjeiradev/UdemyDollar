package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o preço do dólar?");
		double preco = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados?");
		double quantidade = sc.nextDouble();
		
		System.out.println("Valor a ser pago em reais = ");
		
		sc.close();
	}

}
