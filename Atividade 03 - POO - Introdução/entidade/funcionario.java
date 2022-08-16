package Entities;

public class funcionario {
	
	public String nome; // atributos
	public double salarioBruto;
	public double taxaImposto;
	
	// métodos
	public double salarioLiquido() {  // método para calcular o salário líquido
		return salarioBruto - taxaImposto;
	}
	
	public void aumentoSalario(double porcentagem) { // método do tipo void não apresenta retorno.
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() { // converte o objeto para string
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}
}
