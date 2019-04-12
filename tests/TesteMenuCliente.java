package testes;
import static org.junit.jupiter.api.Assertions.*;
import model.Cliente;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import BusinessObject.MenuCliente;
class TesteMenuCliente {

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
		MenuCliente menucliente = new MenuCliente();
		assertEquals(false, menucliente.inicial());
		assertEquals(true, menucliente.inicial());
	}

	@Test
	void testAddCliente() {
		MenuCliente menucliente = new MenuCliente();
		Cliente c = new Cliente();
		
		assertEquals(true, menucliente.addCliente(c));
	}
}
