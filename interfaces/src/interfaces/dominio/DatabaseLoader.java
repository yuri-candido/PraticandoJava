package interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

	/* é possível adicionar várias implementações na classe.
	   Como o método da interface é, por padrão, abstrato,
	   é necessário implementá-lo aqui. */
	
	
	
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

	/* é possível sobrescrever um método default da interface, porém, se o modificador fosse outro, não seria possível*/
	@Override
	public void checkPermission() {
		System.out.println("Checando permissão no banco de dados");		
	}  	
	
	
}
