package dominio;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		
	}
	
	
	// sobrescrita do método. 
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.10;
	}


	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}
}
