import java.util.Locale;
import java.util.Scanner;

public class EC07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("digite dois n�meros para determinar quadrade do ponto: ");
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.print("Seu ponto est� no primeiro quadrante!");			
		}
		
		else if ( x > 0 && y < 0) {
			System.out.print("Seu ponto est� no quarto quadrante!");
		}
		
		else if ( x < 0 && y > 0) {
			System.out.print("Seu ponto est� no segundo quadrante!");
		}
		
		else if ( x < 0 && y < 0) {
			System.out.print("Seu ponto est� no terceiro quadrante!");
		}
		
		else if (y == 0 && x == 0) {
			System.out.print("Seu ponto est� na origem!");
		}
		
		else if ( x == 0 ) {
			System.out.print("Seu ponto est� no eixo Y!");
		}
		
		else {
			System.out.print("Seu ponto est� no eixo X!");
		}

	}

}
