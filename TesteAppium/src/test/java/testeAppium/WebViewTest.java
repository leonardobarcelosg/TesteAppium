package testeAppium;

import org.junit.After;
import org.junit.Test;

import Appium.core.BaseTest;
import junit.framework.Assert;
import page.MenuPage;
import page.WebViewPage;

public class WebViewTest extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() {
		menu.acessarSBHibrido();
		page.entrarContextoWeb();
		page.setEmail("teste@teste.com");
		page.Entrar();
		Assert.assertEquals("Bem vundo, Wagner!", page.getMessage());
	}
	
	@After
	public void tearDown() {
		page.sairContextoWeb();
	}
}
