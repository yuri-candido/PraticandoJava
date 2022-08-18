package application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Product;

public class Produtos {
	
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	Product prodt = new Product(); // instânciando o objeto
	
	System.out.println("Insira dos dados do produto: ");
	System.out.print("Nome: ");
	prodt.nome = sc.nextLine();  // o nome digitado vai pra variável prodt.nome
	
	System.out.print("Preco: ");
	prodt.preco = sc.nextDouble(); // o preco digitado vai pra variável prodt.preco
	 
	System.out.print("Quantidade no estoque: ");
	prodt.quantidade = sc.nextInt();
	System.out.println();  // o preco digitado vai pra variável prodt.preco
	
	System.out.println("Informacoes do produto: " + prodt); // prodt está vinculado ao toString
	System.out.println();
	System.out.print("Numero de produtos adicionados ao estoque ");
	int quantidade = sc.nextInt(); // variável que vai como parâmetro logo abaixo
	prodt.addProducts(quantidade); // atualiza a quantidade do produto
	System.out.println();
	System.out.println("Dados atualizados: " +  prodt);
	System.out.println();
	System.out.print("Numeros de produtos removidos do estoque: ");
	quantidade = sc.nextInt(); // variável que será usada como parâmetro logo abaixo
	prodt.removeProducts(quantidade); // remove a quantidade do produto
	System.out.println();
	System.out.println("Dados atualizados: " +  prodt);
	sc.close();
	}
}
