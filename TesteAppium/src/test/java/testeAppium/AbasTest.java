package testeAppium;

import org.junit.Test;

import Appium.core.BaseTest;
import junit.framework.Assert;
import page.AbasPage;
import page.MenuPage;

public class AbasTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void deveInteragirComAbas() {
		
		menu.acessarAbas();
		Assert.assertTrue(page.isAba1());
		page.selecionarAba2();
		Assert.assertTrue(page.isAba2());
	}
}
