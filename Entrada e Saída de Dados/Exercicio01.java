import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b ,c , d , y, z;
		
		
		System.out.println("Digite um n�mero: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		c = sc.nextDouble();
		System.out.println("Digite o quarto n�mero: ");
		d = sc.nextDouble();
		
		 y = a*b;
		 z = a*d;
		 
		 System.out.printf("A diferen�a entre " + y + " e " + z + " � " + Math.abs((y-z)));
		 
		 sc.close();
		
	}

}
