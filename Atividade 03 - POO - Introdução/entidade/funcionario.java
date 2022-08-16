package Entities;

public class funcionario {
	
	public String nome; // atributos
	public double salarioBruto;
	public double taxaImposto;
	
	// m�todos
	public double salarioLiquido() {  // m�todo para calcular o sal�rio l�quido
		return salarioBruto - taxaImposto;
	}
	
	public void aumentoSalario(double porcentagem) { // m�todo do tipo void n�o apresenta retorno.
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() { // converte o objeto para string
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
