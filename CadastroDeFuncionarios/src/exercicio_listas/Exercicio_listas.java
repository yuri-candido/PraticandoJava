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
		
		Funcionario funcionario; // variável do tipo classe 
		int qnt, respostaId;	// variáveis do tipo inteiro			
		
		System.out.print("Digite quantos funcionarios você quer cadastrar: ");
		qnt = sc.nextInt();
		 Funcionario[] vect = new Funcionario[qnt]; // declaração do tamanho do vetor, o qual é um vetor da classe Funcionario.
		
		//sc.nextLine();
		for(int i = 0; i < qnt; i++) { /* estrutura de repetição que vai armazenar
		 as informações que o usuário digitar dentro de um vetor na posição da variável i.
		 Para isso, é usado um construtor. */
			System.out.print("Digite um id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite o salário: ");
			Double salario = sc.nextDouble();
			
			vect[i] = new Funcionario(id, nome, salario);
			
		} 
		
		// armazenamento do id que será modificado 
		System.out.println("Digite o id do funcionário que você deseja aumentar o salário: ");
		int id = sc.nextInt();
		
		for( int i = 0; i < qnt; i++) { // laço de repetição para verificar em qual posição do vetor está o id procurado.
			if(vect[i].getId() == id) { // e, por meio do método(aumentoSalario), realizar o aumento salarial.
				System.out.println("Digite a porcentagem de aumento do salário: ");
				double aumento = sc.nextDouble();
				aumento = aumento /100;
				vect[i].aumentoSalario(aumento);
				respostaId = i; 				
			}		
		}
		
		// laço para exibição 
		for(int i = 0; i < qnt; i++) {
			System.out.println(vect[i].getId());
		}
	}

}
