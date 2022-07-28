import java.util.Scanner;

public class ER01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha para entrar: ");
		int senha = sc.nextInt();
		
		while( senha != 2002 ) {
			System.out.println("Senha inválida!");
			System.out.print("Faça uma nova tentativa: ");
			senha = sc.nextInt();				
		}
		
		System.out.print("Acesso Permitido!");
	}

}
