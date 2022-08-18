package Entities;

public class Product {
	
	public String nome; // atributos do produto
	public double preco;
	public int quantidade;
	
	public double valorTotalEstoque() {  // método para calcular o valor total do estoque.
		return preco * quantidade;
	}
	
	public void addProducts(int quantity) {  // método para adicionar a quantidade de um produto
		this.quantidade += quantidade;
	}
	
	public void removeProducts(int quantity) {  // método pra remover a quantidade de um produto
		this.quantidade -= quantidade;
	}
	
	public String toString() {  // // converte o objeto para string
	return nome
	+ ", $ "
	+ String.format("%.2f", price)
	+ ", "
	+ quantidade
	+ " unidades, Total: $ "
	+ String.format("%.2f", valorTotalEstoque());

	}
}
