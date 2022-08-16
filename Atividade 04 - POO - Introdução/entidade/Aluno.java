package Entities;

public class Aluno {
					
	public String name;
	public double nota1;   // atributos
	public double nota2;		
	public double nota3;
	
	// métodos
	
	public double notaFinal() { // método para calcular a soma das 3 notas
		return nota1 + nota2 + nota3;
	}
	
	public double resultadoFinal() {
		if (notaFinal() < 60) {  // método com estrutura condicional. Tem o intuito de informar qual a pontuação que falta para aprovação
			return 60.0 - notaFinal();
		}
		
		else {
			return 0.0;
		}
		
	}
}
