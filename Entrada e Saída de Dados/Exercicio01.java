import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b ,c , d , y, z;
		
		
		System.out.println("Digite um número: ");
		a = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		b = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		c = sc.nextDouble();
		System.out.println("Digite o quarto número: ");
		d = sc.nextDouble();
		
		 y = a*b;
		 z = a*d;
		 
		 System.out.printf("A diferença entre " + y + " e " + z + " é " + Math.abs((y-z)));
		 
		 sc.close();
		
	}

}
