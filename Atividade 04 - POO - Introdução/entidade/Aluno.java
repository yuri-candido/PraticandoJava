package Entities;

public class Aluno {
					
	public String name;
	public double nota1;   // atributos
	public double nota2;		
	public double nota3;
	
	// m�todos
	
	public double notaFinal() { // m�todo para calcular a soma das 3 notas
		return nota1 + nota2 + nota3;
	}
	
	public double resultadoFinal() {
		if (notaFinal() < 60) {  // m�todo com estrutura condicional. Tem o intuito de informar qual a pontua��o que falta para aprova��o
			return 60.0 - notaFinal();
		}
		
		else {
			return 0.0;
		}
		
	}
}
