package entities;

public class Triangle {
	
	public double a;  // atributo da classe Triangle
	public double b;  // atributo da classe Triangle
	public double c;  // atributo da classe Triangle
	
	// M�todo da classe Triangle para calcular a �rea. Pode ser usada por qualquer objeto, basta instanci�-lo.
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // retorno da fun��o
	}
}
