package interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

	@Override
	public void load() {
		System.out.println("Carregando arquivo");
	}

	@Override
	public void remove() {
		System.out.println("Deletando arquivos");		
	}
	
	
}
