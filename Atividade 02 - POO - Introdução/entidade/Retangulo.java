package Entities;

public class Retangulo {		
			
			public double altura; // atributos
			public double largura;
			
			public double area() {    // m�todo cujo retorno � a �rea do ret�ngulo
				return altura * largura;
			}
			
			public double perimetro() { // m�todo cujo retorno � o per�metro do ret�ngulo
				return (2*altura) + (2*largura);
			}
			
			public double diagonal() { // m�todo cujo retorno � a diagonal do ret�ngulo	
				return Math.sqrt(altura * altura + largura * largura);
			}
	}

