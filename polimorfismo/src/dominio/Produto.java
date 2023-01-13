package dominio;

public abstract class Produto implements Taxavel {
	// classe abstrata produto, implementa a interface taxavel.
	// Logo, todas as subclasses de produto precisam adicionar o método da intercace.
	protected String nome;
	protected double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
	
}
