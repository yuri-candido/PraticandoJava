import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		double num1 = sc.nextDouble(); 
		System.out.println("Digite um segundo n�mero: ");
		double num2 = sc.nextDouble();
		
		double soma = num1 + num2;
		System.out.println("A soma dos n�meros digitados �: " + soma);	
		
		sc.close();		
	}

}
