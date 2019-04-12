package BusinessObject;
import java.util.Scanner;
import model.Cliente;
import model.Contato;
import DAO.ClienteDAO;
import DAO.ContatoDAO;
import DataSource.DataSource;

public class MenuCliente {
	Scanner sc = new Scanner(System.in);
	DataSource conecta = new DataSource();
	public MenuCliente() {
		conecta.conexao();    
	}
	public boolean inicial() {
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
			return true;
		}
		
		if(num == 2) {
			Cliente c = new Cliente();
			addCliente(c);
			return true;
		}else {
			return false;
		}
	}
	
	private void addContato(Contato contato) {
		
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		System.out.println("DIGITE O NOME DO CONTATO: ");
		String nome = add.nextLine();
		contato.setNome(nome);
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

	public boolean addCliente(Cliente c) {
		Contato contato = new Contato();
		@SuppressWarnings("resource")
		Scanner add = new Scanner(System.in);
		
		System.out.println("DIGITE O CÓDIGO DO CLIENTE: ");
		int codigo = Integer.parseInt(add.nextLine());
		c.setClienteId(codigo);
		System.out.println("DIGITE O CPF DO CLIENTE: ");
		String cpf = add.nextLine();
		c.setCpf(cpf);
		System.out.println("DIGITE A DATA DE NASCIMENTO DO CLIENTE: (PADRAO DD/MM/AA) ");
		String dataNascimento= add.nextLine();
		c.setDataNascimento(dataNascimento);
		System.out.println("DIGITE A NOME DO CLIENTE: ");
		String nome= add.nextLine();
		c.setContato(contato).setNome(nome);
		
		ClienteDAO cd = new ClienteDAO();
		cd.inserirCliente(c);
		return true;
		}
	}
	
	
	

	
	
