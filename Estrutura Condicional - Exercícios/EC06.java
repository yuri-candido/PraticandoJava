import java.util.Locale;
import java.util.Scanner;

public class EC06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite um valor de 0 a 100: ");
		double valor = sc.nextDouble();
		
		if (valor >=0 && valor <= 25) {
			System.out.print("Intervalo [0 , 25]");
		}
		else if (valor >25 && valor <= 50) {
			System.out.print("Intervalo (25 , 50]");
		}
		
		else if (valor > 50 && valor <= 75) {
			System.out.print("Intervalo (50 , 75]");
		}
		
		else if(valor > 75 && valor <= 100) {
			System.out.print("Intervalo (75 , 100)");
		}
		
		else {
			System.out.print("Fora de intervalo");
		}
		
	    sc.close();
		
	}

}
