package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Retangulo;

public class programaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo rect; // vari�vel rect � do tipo retangulo
		rect = new Retangulo(); // inst�nciando o objeto
					
		System.out.print("Digite a altura ");  
		rect.altura = sc.nextDouble();  // A altura vai para a vari�vel rect.altura, atributo criado na classe Retangulo
		System.out.print("Digite a largura ");
		rect.largura = sc.nextDouble(); // A largura vai para a vari�vel rect.largura, atributo criado na classe Retangulo
		
		System.out.printf("�REA: %.2f \n" , rect.area()); // utiliza��o do m�todo area, o qual retorna o valor da �rea do ret�ngulo		
		System.out.printf("PER�METRO: %.2f \n" , rect.perimetro()); // utiliza��o do m�todo perimetro, o qual retorna o valor do per�metro do ret�ngulo
		System.out.printf("DIAGONAL: %.2f \n" , rect.diagonal()); // utiliza��o do m�todo diagonal, o qual retorna o valor do per�metro do ret�ngulo		

	}

}
