import java.util.Scanner;

public class EC04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a hora de in�cio, em horas, do jogo: ");
		int hora1 = sc.nextInt();
		
		System.out.print("Digite a hora de t�rmino, em horas, do jogo: ");
		int hora2 = sc.nextInt();
		
		int duracao; 
		
		if ( hora2 > hora1) {
			duracao = hora2 - hora1;
		}
		
		else {
			duracao = 24 - hora1 + hora2;
		}
		
		System.out.printf("A dura��o do jogo foi de %d horas" , duracao);

		sc.close();
	}

}
