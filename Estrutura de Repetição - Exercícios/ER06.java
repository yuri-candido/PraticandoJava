import java.util.Locale;
import java.util.Scanner;

public class Ex03parte4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Sa�da de Dados*/
		System.out.print("Digite a quantidade de m�dias que voc� quer realizar: ");
		/*Entrada de Dados*/
		int qnt = sc.nextInt();		
		
		/*Estrutura de Repeti��o para processar as m�dias de acordo com a quantidade informada anteriormente */
		for (int i=0; i <qnt; i++) {
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			double num3 = sc.nextDouble();
			double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;	
			
			/*A m�dia � exibida a cada incremento da vari�vel i*/
			System.out.printf("M�dia Ponderada: %.1f", media);
		}
		/*Fechamento do Scanner*/
		sc.close();
	}

}
