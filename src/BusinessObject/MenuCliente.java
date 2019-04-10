package BusinessObject;
import java.util.Scanner;
import model.Cliente;
import model.Contato;
import DAO.ClienteDAO;
import DAO.ContatoDAO;

public class MenuCliente {
	Scanner sc = new Scanner(System.in);
	
	public void inicial() {
		System.out.println( "____________________CLIENTES________________________\r\n" + 
				"\r\n" + 
				"Para prosseguir digite uma das opções abaixo:\r\n" + 
				"\r\n" + 
				"1 - Adicionar Contato\r\n" +
				"2 - Adicionar Clientes\r\n" + 
				"3 - Remover Clientes\r\n" + 
				"4 - Alterar Cadastro\r\n" + 
				"\r\n" + 
				"Digite 0 para voltar ao menu principal.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		if(num == 1) {
			Contato contato = new Contato();
			addContato(contato);
		}
		
		if(num == 2) {
			Cliente c = new Cliente();
			addCliente(c);
		}
	}
	
	private void addContato(Contato contato) {
		
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		System.out.println("DIGITE O NOME DO CLIENTE: ");
		String nome = add.nextLine();
		contato.setNome(nome);
		System.out.println("DIGITE O NÚMERO DA CASA DO CLIENTE: ");
		int numero = Integer.parseInt(add.nextLine());
		contato.setNumero(numero);
		System.out.println("DIGITE O RUA DO CLIENTE: ");
		contato.setRua(add.nextLine());
		System.out.println("DIGITE O BAIRRO DO CLIENTE: ");
		contato.setBairro(add.nextLine());
		System.out.println("DIGITE O TELEFONE DO CLIENTE: ");
		contato.setTelefone(add.nextLine());
		
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserirContato(contato);
		
	}

	public void addCliente(Cliente c) {
		
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		System.out.println("DIGITE O CPF DO CLIENTE: ");
		String cpf = add.nextLine();
		c.setCpf(cpf);
		System.out.println("DIGITE A DATA DE NASCIMENTO DO CLIENTE: (PADRAO DD/MM/AA) ");
		String dataNascimento= add.nextLine();
		c.setDataNascimento(dataNascimento);
		
		/*
		*/
		//c.setContato(co);
		ClienteDAO cd = new ClienteDAO();
		cd.inserirCliente(c);
	}
	
	
	

	
	
}
