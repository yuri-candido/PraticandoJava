import java.io.Closeable;
import java.util.Scanner;

public class EC02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int num1 = sc.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.print("O n�mero digitado � par!");
		}
		
		else {
			System.out.print("O n�mero digitado � �mpar!");
		}
		
		sc.close();
	}

}
