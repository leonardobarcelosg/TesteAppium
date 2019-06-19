package testeAppium;

import org.junit.Before;
import org.junit.Test;

import Appium.core.BaseTest;
import junit.framework.Assert;
import page.AlertaPage;
import page.MenuPage;

public class AlertTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();
	
	@Before
	public void setup() {
		menu.acessarAlerta();
	}
	
	@Test
	public void deveConfirmarAlerta() {
		
		page.clicarAlertaConfirm();
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlerta());
		page.confirmar();
		Assert.assertEquals("Confirmado", page.obterMensagemAlerta());
		page.sair();
	}
	
	@Test
	public void deveClicarForaAlerta() throws InterruptedException {
		page.clicarAlertaSimples();
		wait(1000);
		page.clicarForaCaixa();
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
