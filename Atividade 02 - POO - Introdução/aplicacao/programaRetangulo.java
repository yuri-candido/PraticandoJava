package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Retangulo;

public class programaRetangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Retangulo rect; // variável rect é do tipo retangulo
		rect = new Retangulo(); // instânciando o objeto
					
		System.out.print("Digite a altura ");  
		rect.altura = sc.nextDouble();  // A altura vai para a variável rect.altura, atributo criado na classe Retangulo
		System.out.print("Digite a largura ");
		rect.largura = sc.nextDouble(); // A largura vai para a variável rect.largura, atributo criado na classe Retangulo
		
		System.out.printf("ÁREA: %.2f \n" , rect.area()); // utilização do método area, o qual retorna o valor da área do retângulo		
		System.out.printf("PERÍMETRO: %.2f \n" , rect.perimetro()); // utilização do método perimetro, o qual retorna o valor do perímetro do retângulo
		System.out.printf("DIAGONAL: %.2f \n" , rect.diagonal()); // utilização do método diagonal, o qual retorna o valor do perímetro do retângulo		

	}

}
