package application;
import java.util.Locale;
import java.util.Scanner;
import Entities.funcionario;

public class programaFuncionario {
	
	public static void main(String[] args) {
		
		// Programa para aumento salarial 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 // A vari�vel func � do tipo da classe (funcionario)
		funcionario func;
		func = new funcionario(); // inst�nciando o objeto func
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine(); // adicionando o nome � vari�vel func.nome
		
		System.out.print("Sal�rio Bruto: ");
		func.salarioBruto = sc.nextDouble(); // adicionando o salario bruto � vari�vel func.salarioBruto
		
		System.out.print("Imposto: ");
		func.taxaImposto = sc.nextDouble(); // adicionando a taxa de imposto � vari�vel func.taxaImposto
		
		System.out.println();
		System.out.println("Funcion�rio " + func); // a vai�vel func est� relacionada com o m�todo toString
		System.out.println();
		System.out.print("Qual porcentagem voc� quer incluir no sal�rio? ");
		double porcentagem = sc.nextDouble(); // vari�vel que vai como par�metro na fun��o abaixo
		
		func.aumentoSalario(porcentagem); // adicionando o par�metro porcentagem ao m�todo aumentoSalarario
		System.out.println();
		System.out.println("Updated data: " + func); // Sa�da de dados
		sc.close(); 
	}
}