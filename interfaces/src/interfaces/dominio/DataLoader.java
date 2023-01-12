package interfaces.dominio;

public interface DataLoader {
		
	public static final int max_data_size = 24; // atributo é sempre constante.
	
	void load(); // por padrão, é público e abstrato. 	
	
	// método concreto. não precisa ser implementado
	public default void checkPermission() { 
		System.out.println("Checando permissão!");
	}
	
	
}
