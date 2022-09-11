package entities;

import java.util.Scanner;

public class ContaBancaria {
	
	private int numeroConta; // atributos da classe ContaBancaria
	private String nomeTitularConta;
	private double depositoInicial;
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	// construtor para iniciar os atributos com seus respectivos valores
	public ContaBancaria(int numeroConta, String name, double depositoInicial) {
		this.numeroConta = numeroConta;
		this. nomeTitularConta = name;
		this.depositoInicial = depositoInicial;
	}
	
	// construtor para iniciar os atributos com seus respectivos valores. O intuito � deixar o depositoInicial valendo 0
	public ContaBancaria (int numeroConta, String name) {
		this.numeroConta = numeroConta;
		this.nomeTitularConta = name;
	}
	
	
	
	// m�todos da classe ContaBancaria 		
	
	public void update(double incremento) {
		this.depositoInicial = depositoInicial + incremento;
	}
	
	
	public void saque(double decremento) {
		this.depositoInicial = depositoInicial - 5 - decremento;		
	}
	
	
	// m�todo para exibir as informa��es no Main
	public String toString() {
		name = "ATUALIZA��O: Titular da Conta: " + nomeTitularConta + ", N�mero da Conta: " + numeroConta + 
		", Saldo: " + depositoInicial;
		return name;
	}
	
}
