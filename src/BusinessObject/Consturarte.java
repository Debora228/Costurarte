
package BusinessObject;

import java.util.Scanner;

public class Consturarte {

	
	
	public static void main(String[] args) {
		
		Menu();
		
	}
	public static void Menu() {
		MenuCliente menucliente = new MenuCliente();
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
				"\r\n" + 
				"Digite 0 para encerrar a aplicação.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		if(num == 1) {
			menucliente.inicial();
			
		}else if(num == 2) {
			menuadm.inicial();
		}else {
			System.out.println("###NÚMERO INVÁLIDO####");
		}
		
		}
}
