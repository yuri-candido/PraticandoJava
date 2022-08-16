package application;
import Entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class programaAluno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno student; // variável student é do tipo Aluno
		student = new Aluno(); // instânciando o objeto
		
		System.out.print("Digite o nome do aluno(a)");
		student.name = sc.nextLine(); // o nome do aluno vai para variável student.name
		
		System.out.print("Digite as 3 notas: ");
		student.nota1 = sc.nextDouble(); a primeira nota vai pra variável student.nota1
		student.nota2 = sc.nextDouble(); a segunda nota vai pra variável student.nota2
		student.nota3 = sc.nextDouble(); a terceira nota vai pra variável student.nota3
		
		System.out.printf("GRADE FINAL: %.2f \n" , student.notaFinal()); // Exibição da nota final por meio do médoto notaFinal
		
		// estrutura condicional para exibir aprovação ou reprovação do aluno baseado na nota final
		if (student.notaFinal() < 60 ) {
			System.out.print("REPROVADO! \n");
			System.out.print("Faltam: " + student.resultadoFinal() + "pontos!");
		}
		
		else {
			System.out.print("Aprovado!");
		}
	}

}
