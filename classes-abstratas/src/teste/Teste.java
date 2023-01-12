package teste;

import dominio.Desenvolvedor;
import dominio.Gerente;

public class Teste {

	public static void main(String[] args) {
		
	/* o intuito da classe abstrata � servir de modelo para as subclasses.
	 	A classe abstrada n�o pode ser instanciada.
	 	� necess�rio criar um construtor na subclasse quando ela estender uma superclasse.
	 	No m�todo abstrato, o m�todo n�o pode ter corpo. 
	  */
		
		Gerente gerente = new Gerente("Nami", 4000); 
		Desenvolvedor desenvolvedor = new Desenvolvedor("Jo�o", 3500);
		
		System.out.println(gerente);
		System.out.println(desenvolvedor);
	}

}
