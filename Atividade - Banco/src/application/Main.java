package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaBancaria bancox; // vari�vel bancox � do tipo ContaBancaria;		
		
		
		System.out.print("Digite o n�mero da sua Conta: ");
		int numConta = sc.nextInt(); 
		
		System.out.print("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine(); 
		
		System.out.print("Voc� deseja realizar um dep�sito inicial (y/n)?");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'y') { // estrutura condicional para instanciar o objeto j� com seus respectivos valores
			System.out.print("Digite um valor para dep�sito: ");
			double valor = sc.nextDouble();
			 bancox = new ContaBancaria(numConta, nome, valor); // instanciando o objeto
		}
		 
		else {
			 bancox = new ContaBancaria(numConta , nome); // instanciando o objeto com o depositoInicial valendo 0
		}		 
		 
		 System.out.println(bancox.toString()); // lista para mostrar os dados
		 
		 System.out.print("Digite um valor de dep�sito: ");	 
		 double valormais = sc.nextDouble(); /* vari�vel que vai como par�metro no m�todo update
		 pra incluir um dep�sito, mudando o atributo depositoInicial*/
		 bancox.update(valormais); //execu��o do uptade 
		 System.out.println(bancox.toString()); // lista para mostrar os dados 
		 System.out.print("Digite um valor de saque: ");
		 double saque = sc.nextDouble(); // vari�vel que vai como par�metro no m�todo saque
		 bancox.saque(saque); // execu��o do saque
		 System.out.print(bancox.toString()); // lista pra mostrar os dados
		 
		 sc.close(); // fechamento do scanner		 
	}

}
