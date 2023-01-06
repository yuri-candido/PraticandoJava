package teste;

import dominio.Cliente;
import dominio.TipoCliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		
		// o intuito é tornar obrigatório a utilização de um dos atributos pf ou pj
		
		Cliente cliente = new Cliente("João", TipoCliente.PESSOA_FISICA); 
		Cliente cliente1 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA);
		
		System.out.println(cliente.getNome() + " " + cliente.getTipoCliente());
		System.out.println(cliente1.getNome() + " " + cliente1.getTipoCliente());
	}

}
