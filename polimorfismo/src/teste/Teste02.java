package teste;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;

public class Teste02 {

	public static void main(String[] args) {
		
		/*Diferente da classe teste, é possível declarar um objeto do tipo
		 produto e fazer a instância de uma subclasse - computador, tomate.
		 Utilizando, portanto, o polimorfismo. 
		 Apenas o que há na classe produto e o derivado da implementação podem ser utilizados.*/
		
		
		Produto produto = new Computador("Ryzen 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
		
		System.out.println("------------------");
		Produto produto2 = new Tomate("Tomate brasileiro", 20);
		System.out.println(produto2.getNome());
		System.out.println(produto2.getValor());
		System.out.println(produto2.calcularImposto());
	}

}
