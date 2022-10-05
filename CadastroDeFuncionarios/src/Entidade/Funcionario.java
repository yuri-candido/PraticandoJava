package Entidade;

import java.util.List;

public class Funcionario {
	
	Integer id; 		// atributos da classe funcionario
	String nome;
	Double salario;
	
	//public Funcionario() {
		
	//}
	
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;		// construtor para instanciar o objeto com valores
		this.nome = nome;
		this.salario = salario;
	}
	
	
	// método para aumento salarial
	public void aumentoSalario(double aumento) {
		this.salario = this.salario + (this.salario * aumento);
	}

	// método para buscar o id do funcionario
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public List ToString(List<Funcionario> list) {
		return list;
	}
}
