import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int cod1 = sc.nextInt();
		System.out.println("Digite o número de peças do primeiro produto: ");
		int num1 = sc.nextInt();
		System.out.println("Digite o valor unitário de cada peça do primeiro produto: ");
		double valor1 = sc.nextDouble();
		
		System.out.println("Digite o código do segundo produto: ");
		int cod2 = sc.nextInt();
		System.out.println("Digite o número de peças do segundo produto: ");
		int num2 = sc.nextInt();
		System.out.println("Digite o valor unitário de produto: ");
		double valor2 = sc.nextDouble();
		
		double total = (num1 * valor1) + (num2*valor2);
		
		System.out.printf("O total a pagar é R$ %.2f" , total);
		sc.close();
	}

}
