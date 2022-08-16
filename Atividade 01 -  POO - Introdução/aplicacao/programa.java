package appication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; // Classe utilizada 


public class Atividade_1melhorada {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// PROGRAMA PARA CALCULAR ÁREA DO TRIÂNGULO
		
		// As variáveis x e y são do tipo Triangle, que é uma classe.
		/* A utilização da linguagem orientada a objeto no lugar da linguagem estruturada
	  		facilita a conexão e aplicação do código, dependendo do caso*/
		
		Triangle x, y; // Definição de variáveis estáticas
		x = new Triangle(); // Instância da variável x sem construtores
		y = new Triangle(); // Instância da variável y sem construtores
		
		
		System.out.println("Digite os lados do triangulo X:");
		x.a = sc.nextDouble(); // Entrada de dados do tipo double, na variável x, com o atributo a.
		x.b = sc.nextDouble(); // Entrada de dados do tipo double, na variável x, com o atributo b.
		x.c = sc.nextDouble(); // Entrada de dados do tipo double, na variável x, com o atributo c.
		
		System.out.println("Digite os lados do triangulo Y:");
		y.a = sc.nextDouble(); // Entrada de dados do tipo double, na variável y, com o atributo a.
		y.b = sc.nextDouble(); // Entrada de dados do tipo double, na variável y, com o atributo b.
		y.c = sc.nextDouble(); // Entrada de dados do tipo double, na variável y, com o atributo c.
		
		double areaX = x.area();	// variável areaX recebe o valor do retorno do método area()  
		double areaY = y.area();        // variável areaY recebe o valor do retorno do método area()
		
		System.out.printf("Triângulo X - área: %.4f%n", areaX); // Saída de dados
		System.out.printf("Triângulo Y - área: %.4f%n", areaY); // Saída de dados
		
		// estrutura condicional para saber qual área é maior, com o intuito de a exibir para o usuário.
		if (areaX > areaY) {  
			System.out.println("Maior área: X");
		}
		else {
			System.out.println("Maior área: Y");
		}
		
		sc.close(); // fechamento do Scanner
	}

}
