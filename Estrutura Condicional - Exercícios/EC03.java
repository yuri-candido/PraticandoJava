import java.util.Scanner;

public class EC03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = sc.nextInt();
		System.out.print("Digite um segundo n�mero inteiro: ");
		int num2 = sc.nextInt();
		
		if ( num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("Os n�meros s�o m�ltiplos!");
		}
		
		else {
			System.out.print("Os n�meros n�o s�o m�ltiplos!");
		}		
		sc.close();
	}

}
