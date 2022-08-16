package application;
import java.util.Locale;
import java.util.Scanner;
import Entities.funcionario;

public class programaFuncionario {
	
	public static void main(String[] args) {
		
		// Programa para aumento salarial 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 // A variável func é do tipo da classe (funcionario)
		funcionario func;
		func = new funcionario(); // instânciando o objeto func
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine(); // adicionando o nome à variável func.nome
		
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble(); // adicionando o salario bruto à variável func.salarioBruto
		
		System.out.print("Imposto: ");
		func.taxaImposto = sc.nextDouble(); // adicionando a taxa de imposto à variável func.taxaImposto
		
		System.out.println();
		System.out.println("Funcionário " + func); // a vaiável func está relacionada com o método toString
		System.out.println();
		System.out.print("Qual porcentagem você quer incluir no salário? ");
		double porcentagem = sc.nextDouble(); // variável que vai como parâmetro na função abaixo
		
		func.aumentoSalario(porcentagem); // adicionando o parâmetro porcentagem ao método aumentoSalarario
		System.out.println();
		System.out.println("Updated data: " + func); // Saída de dados
		sc.close(); 
	}
}