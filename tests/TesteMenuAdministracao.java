package testes;

import static org.junit.jupiter.api.Assertions.*;
import model.Produto;
import BusinessObject.MenuAdministracao;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BusinessObject.MenuCliente;
import model.Cliente;

class TesteMenuAdministracao {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInicial() {
		MenuAdministracao menuadm = new MenuAdministracao();
		assertEquals(false, menuadm.inicial());
		assertEquals(true, menuadm.inicial());
	}

	@Test
	void testAddProduto() {
		MenuAdministracao menuadm= new MenuAdministracao();
		Produto p = new Produto();
		
		assertEquals(true, menuadm.addProduto(p));
	}
}
