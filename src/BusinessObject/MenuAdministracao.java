package BusinessObject;

import java.util.Scanner;

import DAO.CategoriaDAO;
import DAO.ProdutoDAO;
import model.Categoria;
import model.Produto;

public class MenuAdministracao{
	Scanner sc = new Scanner(System.in);

	public int inicial(){
		System.out.println("\r\n" + 
				"______________ADMINISTRAÇÃO_________________________\r\n" + 
				"\r\n" + 
				"Para prosseguir digite uma das opções abaixo:\r\n" + 
				"\r\n" + 
				"1 - Adicionar Categorias\r\n" +
				"2 - Adicionar Produtos\r\n" + 
				"3 - Remover Produtos\r\n" + 
				"\r\n" + 
				"Digite 0 para voltar ao menu principal.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		if(num == 1) {
			Categoria categoria = new Categoria();
			addCategoria(categoria);
		}if(num == 2) {
			Produto produto = new Produto();
			addProduto(produto);
		}if(num == 3) {
			ProdutoDAO p = new ProdutoDAO();
			System.out.println("DIGITE O CODIGO DO PRODUTO");
			int cod = sc.nextInt();
			p.removerProduto(cod);
		}
		return num;
		
	}
	
	public void addProduto(Produto produto) {
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		
		System.out.println("DIGITE O CÓDIGO DO PRODUTO: ");
		int codigo= Integer.parseInt( add.nextLine());
		produto.setCod(codigo);
		
		System.out.println("DIGITE O NOME DO PRODUTO: ");
		String nome = add.nextLine();
		produto.setNome(nome);

		System.out.println("DIGITE O PRECO DO PRODUTO: ");
		double preco = add.nextDouble();
		produto.setPrecoCusto(preco);
		
		add.nextLine();
		
		System.out.println("DIGITE A DESCRICAO DO PRODUTO: ");
		String descricao = add.nextLine();
		produto.setDescricao(descricao);

		System.out.println("DIGITE A COR DO PRODUTO: ");
		String cor = add.nextLine();
		produto.setCor(cor);

		System.out.println("DIGITE A MARCA DO PRODUTO: ");
		String marca = add.nextLine();
		produto.setMarca(marca);

		System.out.println("DIGITE O PRECO VENDA DO PRODUTO: ");
		double precovenda = add.nextDouble();
		produto.setPrecoVenda(precovenda);
		
		add.nextLine();
		
		Categoria categoria = new Categoria();
		
		System.out.println("DIGITE O CÓDIGO DA CATEGORIA: ");
		int cod = Integer.parseInt(add.nextLine());
		produto.setCategoria(categoria).setCod(cod);
	
		//Categoria categoria = new Categoria();
		//addCategoria(categoria);
		
		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.inserirProduto(produto);
	}

	private void addCategoria(Categoria categoria) {
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		System.out.println("DIGITE O NOME DA CATEGORIA:");
		String nome = add.nextLine();
		categoria.setNome(nome);
		
		CategoriaDAO c = new CategoriaDAO();
		c.inserirCategoria(categoria);
		/*
		System.out.println("DIGITE O CODIGO DA CATEGORIA:");
		int cod = Integer.parseInt(add.nextLine());
		categoria.setCod(cod);
		*/
	}
	

}
