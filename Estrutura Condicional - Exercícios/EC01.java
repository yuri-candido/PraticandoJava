import java.util.Locale;
import java.util.Scanner;

public class EC01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		if (num1 >= 0) {
			System.out.print("N�mero n�o negativo!");
		}
		
		else {
			System.out.print("N�mero negativo!");
		}
			
		sc.close();
	}

}
