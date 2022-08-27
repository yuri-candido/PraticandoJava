package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciando o objeto bancox, que � do tipo contaBancaria
		ContaBancaria bancox = new ContaBancaria();
		
		
		System.out.print("Digite o n�mero da sua Conta: ");
		int numConta = sc.nextInt(); /* vari�vel que tem intuito de ser usada como par�metro 
		no m�todo abaixo para adicionar o n�mero da conta ao bancox */
		bancox.setNumeroconta(numConta); // inser��o do n�mero
		
		System.out.print("Digite o nome do titular da conta: ");
		 String nome = sc.next(); /* vari�vel que tem intuito de ser usada como par�metro 
			no m�todo abaixo para adicionar o nome do titular da conta ao bancox */
		bancox.setNomeTitularConta(nome); // inser��o do nome
		 
		 System.out.print("Voc� deseja realizar um dep�sito inicial? 1 = sim e 0 = n�o");
		 int resposta = sc.nextInt(); /* vari�vel que tem intuito de ser usada como par�metro 
			no m�todo deposito para executar se haver� deposito inicial ou n�o */
		 
		 bancox.deposito(resposta); // execu��o do m�todo
		 
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
