
package BusinessObject;

import java.util.Scanner;

public class Consturarte {

	public static void main(String[] args) {
		
		MenuCliente menucliente = new MenuCliente();
		MenuCompra menucompra = new MenuCompra();
		MenuAdministracao menuadm = new MenuAdministracao();
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("\r\n" + 
				"______________BEM VINDO AO COSTURARTE!______________\r\n" + 
				"\r\n" + 
				"Para prosseguir digite uma das opções abaixo:\r\n" + 
				"\r\n" + 
				"1 - Clientes\r\n" + 
				"2 - Administração\r\n" + 
				"3 - Compras\r\n" + 
				"\r\n" + 
				"Digite 0 para encerrar a aplicação.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		if(num == 1) {
			menucliente.inicial();
			
		}else if(num == 2) {
			menuadm.inicial();
		}else if(num == 3) {
			menucompra.inicial();
		}else {
			System.out.println("###NÚMERO INVÁLIDO####");
		}
//		System.out.println("Informe a idade do aluno:");
//		int idade = sc.nextInt();

		
	}
}
