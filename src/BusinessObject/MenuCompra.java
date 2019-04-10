package BusinessObject;

import java.util.Scanner;

public class MenuCompra{
	Scanner sc = new Scanner(System.in);
	public int inicial() {
		System.out.println( "\r\n" + 
				"______________COMPRAS_______________________________\r\n" + 
				"\r\n" + 
				"Para prosseguir digite uma das opções abaixo:\r\n" + 
				"\r\n" + 
				"1 - Realizar Compras\r\n" + 
				"2 - Fechar Compra\r\n" + 
				"\r\n" + 
				"Digite 0 para voltar ao menu principal.\r\n" + 
				"\r\n" + 
				"____________________________________________________");
		int num = sc.nextInt();
		return num;
	}
}
