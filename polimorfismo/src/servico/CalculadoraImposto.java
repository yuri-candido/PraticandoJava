package servico;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;

public class CalculadoraImposto {
	
	/*Com o uso do polimorfismo, � poss�vel criar um m�todo gen�rico para receber
	 um objeto*/
	public static void calcularImposto(Produto produto) {
		System.out.println("Relat�rio de imposto: ");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Pre�o: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
	}
	
}
