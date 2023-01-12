package dominio;

public abstract class Funcionario {
	
	protected String nome;
	protected double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	// método abstrato para forçar toda as subclasses a adicionarem este método.
	// em uma classe abstrata, há métodos abstratos ou concretos. Já nas classes concretas, não pode haver método abstrato.
	public abstract void calculaBonus();

	
}
