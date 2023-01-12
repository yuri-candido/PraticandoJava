package dominio;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}
	
	// sobrescrita do m�todo. 
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05; 
	}


	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}
}
