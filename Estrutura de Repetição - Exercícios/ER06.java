import java.util.Locale;
import java.util.Scanner;

public class Ex03parte4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Saída de Dados*/
		System.out.print("Digite a quantidade de médias que você quer realizar: ");
		/*Entrada de Dados*/
		int qnt = sc.nextInt();		
		
		/*Estrutura de Repetição para processar as médias de acordo com a quantidade informada anteriormente */
		for (int i=0; i <qnt; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;	
			
			/*A média é exibida a cada incremento da variável i*/
			System.out.printf("Média Ponderada: %.1f", media);
		}
		/*Fechamento do Scanner*/
		sc.close();
	}

}
