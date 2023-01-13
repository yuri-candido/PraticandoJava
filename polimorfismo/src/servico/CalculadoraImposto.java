package servico;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;

public class CalculadoraImposto {
	
	/*Com o uso do polimorfismo, é possível criar um método genérico para receber
	 um objeto*/
	public static void calcularImposto(Produto produto) {
		System.out.println("Relatório de imposto: ");
		double imposto = produto.calcularImposto();
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Preço: " + produto.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
	}
	
}
