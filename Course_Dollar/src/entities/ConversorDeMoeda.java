package entities;

public class ConversorDeMoeda {
	
	public static double IOF = 0.06;
	
	public static double dollarParaReal(double quantia, double precoDollar) {
		return quantia * precoDollar * (1.0 + IOF);
		}
	
}
