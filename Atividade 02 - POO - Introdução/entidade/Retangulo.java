package Entities;

public class Retangulo {		
			
			public double altura; // atributos
			public double largura;
			
			public double area() {    // método cujo retorno é a área do retângulo
				return altura * largura;
			}
			
			public double perimetro() { // método cujo retorno é o perímetro do retângulo
				return (2*altura) + (2*largura);
			}
			
			public double diagonal() { // método cujo retorno é a diagonal do retângulo	
				return Math.sqrt(altura * altura + largura * largura);
			}
	}

