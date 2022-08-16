import java.util.Scanner;

public class Ex01parte4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Saída de Dados
		System.out.print("Digite um valor: ");
		
		int valor = sc.nextInt();
		/* Estrutura de repetição para garantir que o número digitado
		 seja um valor permitido */
		while (valor < 1 || valor > 1000) {
			System.out.print("Digite um valor permitido");
			valor = sc.nextInt();
			
		}
/* Estrutura para mostrar os números primos que existem até
 o número digitado, por meio da estrutura de repetição e controle  */
			for ( int i = 1; i <= valor; i++) {
				if ( i % 2 != 0) {
					System.out.print( i + "\n");			
				}
			}
		 sc.close();
	}

}
