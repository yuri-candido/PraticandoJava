import java.util.Scanner;

public class Ex02parte4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// declara��o de vari�veis
		int in = 0;
		int out = 0;
		
		System.out.print("Quantos n�meros voc� quer digitar? ");
		int numero = sc.nextInt();
		
		/*Vari�vel i vai de 0 at� a quantidade de vezes que o usuario quer
		 digitar. A cada incremento da vari�vel, todo c�digo dentro estrutura
		 de repeti��o � executado. */ 
		for (int i = 0; i < numero; i++) {
			System.out.print("Digite um n�mero: ");
			int numero1 = sc.nextInt();	
			
			if (numero1 >= 10 && numero1 < 20 ) {				
				in = in +1;
			}
			
			else {				
				out = out + 1;
			}

		}
		// Sa�da de Dados
		System.out.println("Quantidade de n�meros dentro do intervalo: " + in);
		System.out.print("Quantidade de n�meros fora do intervalo: " + out);
		
		sc.close();
	}
}

