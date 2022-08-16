package entities;

public class Triangle {
	
	public double a;  // atributo da classe Triangle
	public double b;  // atributo da classe Triangle
	public double c;  // atributo da classe Triangle
	
	// Método da classe Triangle para calcular a área. Pode ser usada por qualquer objeto, basta instanciá-lo.
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // retorno da função
	}
}
