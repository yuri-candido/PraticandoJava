package interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

	/* � poss�vel adicionar v�rias implementa��es na classe.
	   Como o m�todo da interface �, por padr�o, abstrato,
	   � necess�rio implement�-lo aqui. */
	
	
	
	/*O modificador de acesso da sobrescrita nunca pode ser mais restritivo 
	 que a da interface.  private -> default -> protected -> public*/
	
	@Override
	public void load() {
		System.out.println("Carregando dados do banco de dados!");
	}

	@Override
	public void remove() {
		System.out.println("Removendo dados");		
	}

	/* � poss�vel sobrescrever um m�todo default da interface, por�m, se o modificador fosse outro, n�o seria poss�vel*/
	@Override
	public void checkPermission() {
		System.out.println("Checando permiss�o no banco de dados");		
	}  	
	
	
}
