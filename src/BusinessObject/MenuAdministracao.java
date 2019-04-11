package BusinessObject;

import java.util.Scanner;

import DAO.ContatoDAO;
import model.Categoria;
import model.Contato;

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
		}
		return num;
		
	}
	
	public void addCategoria(Categoria c) {
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		
		System.out.println("DIGITE O CÓDIGO DO PRODUTO: ");
		int codigo= Integer.parseInt( add.nextLine());
		c.setCod(codigo);
		System.out.println("DIGITE O NOME DO PRODUTO: ");
		String nome = add.nextLine();
		c.setNome(nome);
		System.out.println("DIGITE O NÚMERO DA CASA DO CONTATO: ");
		int numero = Integer.parseInt(add.nextLine());
		contato.setNumero(numero);
		System.out.println("DIGITE O RUA DO CONTATO: ");
		contato.setRua(add.nextLine());
		System.out.println("DIGITE O BAIRRO DO CONTATO: ");
		contato.setBairro(add.nextLine());
		System.out.println("DIGITE O TELEFONE DO CONTATO: ");
		contato.setTelefone(add.nextLine());
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserirContato(contato);
	}

}
