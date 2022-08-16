import java.util.Scanner;

public class Ex02parte4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declaração de variáveis
		int in = 0;
		int out = 0;
		
		System.out.print("Quantos números você quer digitar? ");
		int numero = sc.nextInt();
		
		/*Variável i vai de 0 até a quantidade de vezes que o usuario quer
		 digitar. A cada incremento da variável, todo código dentro estrutura
		 de repetição é executado. */ 
		for (int i = 0; i < numero; i++) {
			System.out.print("Digite um número: ");
			int numero1 = sc.nextInt();	
			
			if (numero1 >= 10 && numero1 < 20 ) {				
				in = in +1;
			}
			
			else {				
				out = out + 1;
			}

		}
		// Saída de Dados
		System.out.println("Quantidade de números dentro do intervalo: " + in);
		System.out.print("Quantidade de números fora do intervalo: " + out);
		
		sc.close();
	}
}

