package teste;

import dominio.Computador;
import dominio.Produto;
import dominio.Tomate;
import servico.CalculadoraImposto;

public class Teste {

	public static void main(String[] args) {
		
		Computador computador = new Computador("NUC10i7" , 11000);
		Tomate tomate = new Tomate("Tomate", 10);	
	
		CalculadoraImposto.calcularImposto(computador);
		System.out.println("------------------");
		CalculadoraImposto.calcularImposto(tomate);
	}

}
