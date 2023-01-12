package teste;

import dominio.Desenvolvedor;
import dominio.Gerente;

public class Teste {

	public static void main(String[] args) {
		
	/* o intuito da classe abstrata é servir de modelo para as subclasses.
	 	A classe abstrada não pode ser instanciada.
	 	É necessário criar um construtor na subclasse quando ela estender uma superclasse.
	 	No método abstrato, o método não pode ter corpo. 
	  */
		
		Gerente gerente = new Gerente("Nami", 4000); 
		Desenvolvedor desenvolvedor = new Desenvolvedor("João", 3500);
		
		System.out.println(gerente);
		System.out.println(desenvolvedor);
	}

}
