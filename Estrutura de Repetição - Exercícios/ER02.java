import java.util.Locale;
import java.util.Scanner;

public class ER02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("digite dois números para determinar quadrade do ponto: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y!= 0) {
		
		if (x > 0 && y > 0) {
			System.out.print("Seu ponto está no primeiro quadrante!");			
		}
		
		else if ( x > 0 && y < 0) {
			System.out.print("Seu ponto está no quarto quadrante!");
		}
		
		else if ( x < 0 && y > 0) {
			System.out.print("Seu ponto está no segundo quadrante!");
		}
		
		else if ( x < 0 && y < 0) {
			System.out.print("Seu ponto está no terceiro quadrante!");
		}
		
		//else if (y == 0 && x == 0) {
	//		System.out.print("Seu ponto está na origem!");
	//	}
		
		//else if ( x == 0 ) {
		//	System.out.print("Seu ponto está no eixo Y!");
		//}
		
		//else {
		//	System.out.print("Seu ponto está no eixo X!");
		//}
		
		System.out.print("Digite duas coordenadas novamente");
		x = sc.nextInt();
		y = sc.nextInt();
	}
		
		System.out.print("Você digitou uma coordenada zero.Programa encerrado!");
	}

}


	
