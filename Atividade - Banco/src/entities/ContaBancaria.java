package entities;

import java.util.Scanner;

public class ContaBancaria {
	
	private int numeroConta; // atributos da classe ContaBancaria
	private String nomeTitularConta;
	private double depositoInicial;
	private String name;
	
	Scanner sc = new Scanner(System.in);
	
	
	// m�todos da classe ContaBancaria
	public void deposito(int resposta) {
			if (resposta == 1) {
				System.out.print("Digite a quantia que deseja depositar: ");
				this.depositoInicial = sc.nextDouble();
			} 
			
			else {
				this.depositoInicial = 0;
			}			
	}
	
	
	
	
	public void update(double incremento) {
		this.depositoInicial = depositoInicial + incremento;
	}
	
	
	public void saque(double decremento) {
		this.depositoInicial = depositoInicial - 5 - decremento;
		
	}
	
	
	/* getters e setters para manipula��o dos atributos, seja pra alterar ou resgatar 
	 alguma informa��o*/
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroconta(int numero) {
		this.numeroConta = numero;
	}


	public String getNomeTitularConta() {
		return nomeTitularConta;
	}

	public void setNomeTitularConta(String nomeTitularConta) {
		this.nomeTitularConta = nomeTitularConta;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}	
	
	// m�todo para exibir as informa��es no Main
	public String toString() {
		name = "ATUALIZA��O: Titular da Conta: " + nomeTitularConta + ", N�mero da Conta: " + numeroConta + 
		", Saldo: " + depositoInicial;
		return name;
	}
	
}
