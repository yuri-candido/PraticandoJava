package appication;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle; // Classe utilizada 


public class Atividade_1melhorada {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// PROGRAMA PARA CALCULAR �REA DO TRI�NGULO
		
		// As vari�veis x e y s�o do tipo Triangle, que � uma classe.
		/* A utiliza��o da linguagem orientada a objeto no lugar da linguagem estruturada
	  		facilita a conex�o e aplica��o do c�digo, dependendo do caso*/
		
		Triangle x, y; // Defini��o de vari�veis est�ticas
		x = new Triangle(); // Inst�ncia da vari�vel x sem construtores
		y = new Triangle(); // Inst�ncia da vari�vel y sem construtores
		
		
		System.out.println("Digite os lados do triangulo X:");
		x.a = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel x, com o atributo a.
		x.b = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel x, com o atributo b.
		x.c = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel x, com o atributo c.
		
		System.out.println("Digite os lados do triangulo Y:");
		y.a = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel y, com o atributo a.
		y.b = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel y, com o atributo b.
		y.c = sc.nextDouble(); // Entrada de dados do tipo double, na vari�vel y, com o atributo c.
		
		double areaX = x.area();	// vari�vel areaX recebe o valor do retorno do m�todo area()  
		double areaY = y.area();        // vari�vel areaY recebe o valor do retorno do m�todo area()
		
		System.out.printf("Tri�ngulo X - �rea: %.4f%n", areaX); // Sa�da de dados
		System.out.printf("Tri�ngulo Y - �rea: %.4f%n", areaY); // Sa�da de dados
		
		// estrutura condicional para saber qual �rea � maior, com o intuito de a exibir para o usu�rio.
		if (areaX > areaY) {  
			System.out.println("Maior �rea: X");
		}
		else {
			System.out.println("Maior �rea: Y");
		}
		
		sc.close(); // fechamento do Scanner
	}

}
