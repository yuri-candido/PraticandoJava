package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciando o objeto bancox, que é do tipo contaBancaria
		ContaBancaria bancox = new ContaBancaria();
		
		
		System.out.print("Digite o número da sua Conta: ");
		int numConta = sc.nextInt(); /* variável que tem intuito de ser usada como parâmetro 
		no método abaixo para adicionar o número da conta ao bancox */
		bancox.setNumeroconta(numConta); // inserção do número
		
		System.out.print("Digite o nome do titular da conta: ");
		 String nome = sc.next(); /* variável que tem intuito de ser usada como parâmetro 
			no método abaixo para adicionar o nome do titular da conta ao bancox */
		bancox.setNomeTitularConta(nome); // inserção do nome
		 
		 System.out.print("Você deseja realizar um depósito inicial? 1 = sim e 0 = não");
		 int resposta = sc.nextInt(); /* variável que tem intuito de ser usada como parâmetro 
			no método deposito para executar se haverá deposito inicial ou não */
		 
		 bancox.deposito(resposta); // execução do método
		 
		 System.out.println(bancox.toString()); // lista para mostrar os dados
		 
		 System.out.print("Digite um valor de depósito: ");	 
		 double valormais = sc.nextDouble(); /* variável que vai como parâmetro no método update
		 pra incluir um depósito, mudando o atributo depositoInicial*/
		 bancox.update(valormais); //execução do uptade 
		 System.out.println(bancox.toString()); // lista para mostrar os dados 
		 System.out.print("Digite um valor de saque: ");
		 double saque = sc.nextDouble(); // variável que vai como parâmetro no método saque
		 bancox.saque(saque); // execução do saque
		 System.out.print(bancox.toString()); // lista pra mostrar os dados
		 
		 sc.close(); // fechamento do scanner
		 
	}

}
