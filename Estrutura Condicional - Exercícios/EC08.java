import java.util.Locale;
import java.util.Scanner;

public class EC08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário");
		Double salario = sc.nextDouble();
		
		if (salario <= 2000 ) {
			int imposto = 0;
			System.out.print("Imposto a ser pago: ISENTO");
		}
		
		else if (salario <= 3000) {
			double imposto = (salario - 2000) * 0.08;
			System.out.printf("Imposto a ser pago: R$ %.2f" , imposto);
		}
		
		else if (salario <= 4500 ) {
			double imposto = 0.08 * 1000 + (salario - 3000) * 0.18;
					
			System.out.printf("Imposto a ser pago: R$ %.2f" , imposto);			
		}
		
		else { 
			double imposto = (0.08 * 1000) + (1500 * 0.18) + (salario - 4500) * 0.28; 
			System.out.printf("Imposto a ser pago: %.2f" , imposto);
		}
	}

}
