import java.util.Locale;
import java.util.Scanner;

public class Ex04parte4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos pares voc� deseja digitar?");
		int qnt = sc.nextInt();
		
		/* Repeti��o da quantidade de pares que o usu�rio quer digitar.
		  a vari�vel i ser� incrementada enquanto ela for menor que a quantidade.*/
		for ( int i = 0; i < qnt; i++) {
			System.out.print("Digite o par: "); 
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			
			// se o segundo n�mero for 0, a divis�o ser� imposs�vel.
			if (num2 == 0) {
				System.out.println("Divis�o imposs�vel");
			}
			
			else {  // sen�o, a divis�o ocorrer� normalente. 
				double media = num1 / num2;
				System.out.println(num1 / num2);
			}
			
		}
		
		// Fechamento do scanner.
		sc.close();
	}

}
