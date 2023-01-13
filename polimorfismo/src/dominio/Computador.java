package dominio;

public class Computador extends Produto {
	
	public static final double imposto_por_cento = 0.21;
	
	public Computador(String nome, double valor) {
		super(nome, valor);		
	}

	@Override
	public double calcularImposto() {
		System.out.println("Calculando imposto do computador!");
		return this.valor * imposto_por_cento ;
	}
	
	
}
