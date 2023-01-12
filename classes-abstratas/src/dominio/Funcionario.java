package dominio;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	// m�todo abstrato para for�ar toda as subclasses a adicionarem este m�todo.
	// em uma classe abstrata, h� m�todos abstratos ou concretos. J� nas classes concretas, n�o pode haver m�todo abstrato.
	public abstract void calculaBonus();

	
}
