package interfaces.dominio;

public interface DataLoader {
		
	public static final int max_data_size = 24; // atributo � sempre constante.
	
	void load(); // por padr�o, � p�blico e abstrato. 	
	
	// m�todo concreto. n�o precisa ser implementado
	public default void checkPermission() { 
		System.out.println("Checando permiss�o!");
	}
	
	
}
