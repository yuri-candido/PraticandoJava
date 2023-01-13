package dominio;

public class Tomate extends Produto {
	
	public static final double imposto_por_cento = 0.80;
	
	public Tomate(String nome, double valor) {
		super(nome, valor);
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do tomate");
		return this.valor * imposto_por_cento;
	}
	
	
}
