package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria bancox; // variável bancox é do tipo ContaBancaria;		
		
		
		System.out.print("Digite o número da sua Conta: ");
		int numConta = sc.nextInt(); 
		
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine(); 
		
		System.out.print("Você deseja realizar um depósito inicial (y/n)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') { // estrutura condicional para instanciar o objeto já com seus respectivos valores
			System.out.print("Digite um valor para depósito: ");
			double valor = sc.nextDouble();
			 bancox = new ContaBancaria(numConta, nome, valor); // instanciando o objeto
		}
		 
		else {
			 bancox = new ContaBancaria(numConta , nome); // instanciando o objeto com o depositoInicial valendo 0
		}		 
		 
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
