import java.util.Locale;
import java.util.Scanner;

public class EC05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Código ---- Especificação ---- Preço \n"
				+ "1 ---- Cachorro Quente ---- R$ 4,00 \n"
				+ "2 ---- X-Salada ---- R$ 4,50 \n"
				+ "3 ---- X-Bacon ---- R$ 5,00 \n"
				+ "4 ---- Torrada Simples ---- R$ 2,00 \n"
				+ "5 ---- Refrigerante ---- R$ 1,50 \n\n");
		
		
		System.out.print("Digite um código de um item e a quantidade deste item respectivamente ");
		int codigo = sc.nextInt(); 
		double qnt = sc.nextDouble();
		double total = 0; 
		
		switch (codigo) {
			case 1: 
				total = 4.00 * qnt;
				break;			
			case 2: 
				total = 4.50 * qnt;
				break;						
			case 3: 
				total = 5.00 * qnt;
				break;						
			case 4: 
				total = 2.00 * qnt;
				break;						
			case 5: 
				total = 1.50 * qnt;
				break;			
		 }
		
		System.out.printf("TOTAL A PAGAR: R$ %.2f" , total);
	}	

}
