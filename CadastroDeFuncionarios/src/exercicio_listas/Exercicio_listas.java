package exercicio_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidade.Funcionario;

public class Exercicio_listas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario; // vari�vel do tipo classe 
		int qnt, respostaId;	// vari�veis do tipo inteiro			
		
		System.out.print("Digite quantos funcionarios voc� quer cadastrar: ");
		qnt = sc.nextInt();
		 Funcionario[] vect = new Funcionario[qnt]; // declara��o do tamanho do vetor, o qual � um vetor da classe Funcionario.
		
		//sc.nextLine();
		for(int i = 0; i < qnt; i++) { /* estrutura de repeti��o que vai armazenar
		 as informa��es que o usu�rio digitar dentro de um vetor na posi��o da vari�vel i.
		 Para isso, � usado um construtor. */
			System.out.print("Digite um id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o sal�rio: ");
			Double salario = sc.nextDouble();
			
			vect[i] = new Funcionario(id, nome, salario);
			
		} 
		
		// armazenamento do id que ser� modificado 
		System.out.println("Digite o id do funcion�rio que voc� deseja aumentar o sal�rio: ");
		int id = sc.nextInt();
		
		for( int i = 0; i < qnt; i++) { // la�o de repeti��o para verificar em qual posi��o do vetor est� o id procurado.
			if(vect[i].getId() == id) { // e, por meio do m�todo(aumentoSalario), realizar o aumento salarial.
				System.out.println("Digite a porcentagem de aumento do sal�rio: ");
				double aumento = sc.nextDouble();
				aumento = aumento /100;
				vect[i].aumentoSalario(aumento);
				respostaId = i; 				
			}		
		}
		
		// la�o para exibi��o 
		for(int i = 0; i < qnt; i++) {
			System.out.println(vect[i].getId());
		}
	}

}
