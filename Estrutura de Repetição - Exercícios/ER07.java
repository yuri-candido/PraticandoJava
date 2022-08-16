import java.util.Locale;
import java.util.Scanner;

public class Ex04parte4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pares você deseja digitar?");
		int qnt = sc.nextInt();
		
		/* Repetição da quantidade de pares que o usuário quer digitar.
		  a variável i será incrementada enquanto ela for menor que a quantidade.*/
		for ( int i = 0; i < qnt; i++) {
			System.out.print("Digite o par: "); 
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			// se o segundo número for 0, a divisão será impossível.
			if (num2 == 0) {
				System.out.println("Divisão impossível");
			}
			
			else {  // senão, a divisão ocorrerá normalente. 
				double media = num1 / num2;
				System.out.println(num1 / num2);
			}
			
		}
		
		// Fechamento do scanner.
		sc.close();
	}

}
