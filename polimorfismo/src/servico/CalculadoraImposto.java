package servico;

import dominio.Computador;
import dominio.Tomate;

public class CalculadoraImposto {
	
	public static void calcularImpostoComputador(Computador computador) {
		System.out.println("Relat�rio de imposto do computador");
		double imposto = computador.calcularImposto();
		System.out.println("Nome do computador " + computador.getNome());
		System.out.println("Valor " + computador.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
	}
	
	public static void calcularImpostoTomate(Tomate tomate) {
		System.out.println("Relat�rio de imposto do tomate");
		double imposto = tomate.calcularImposto();
		System.out.println("Nome do tomate " + tomate.getNome());
		System.out.println("Valor " + tomate.getValor());
		System.out.println("Imposto a ser pago: " + imposto);
	}
	
}
