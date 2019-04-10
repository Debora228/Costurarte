package BusinessObject;

import java.util.Scanner;

public class MenuAdministracao{
	Scanner sc = new Scanner(System.in);

	public int inicial(){
		System.out.println("\r\n" + 
				"______________ADMINISTRAÇÃO_________________________\r\n" + 
				"\r\n" + 
				"Para prosseguir digite uma das opções abaixo:\r\n" + 
				"\r\n" + 
				"1 - Adicionar Produtos\r\n" + 
				"2 - Remover Produtos\r\n" + 
				"\r\n" + 
				"Digite 0 para voltar ao menu principal.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		return num;
	}

}
