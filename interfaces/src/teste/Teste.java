package teste;

import interfaces.dominio.DatabaseLoader;
import interfaces.dominio.FileLoader;

public class Teste {

	public static void main(String[] args) {
		
		DatabaseLoader databaseLoader = new DatabaseLoader();
		FileLoader fileLoader = new FileLoader();
		
		databaseLoader.load();
		fileLoader.load();
		
		databaseLoader.remove();
		fileLoader.remove();
		
		databaseLoader.checkPermission();
	}

}
