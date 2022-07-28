import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número do funcionário: ");
		int numero = sc.nextInt();
		System.out.print("Digite as horas trabalhadas");
		double horas = sc.nextDouble();
		System.out.print("Digite o valor do recebimento por hora: ");
		double valor = sc.nextDouble();
		
		double salario = valor*horas;
		
		System.out.printf("Number: %d \nSalary = U$ %.2f " , numero , salario);
		sc.close();
	}

}
