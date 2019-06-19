package testeAppium;

import org.junit.Assert;
import org.junit.Test;

import Appium.core.BaseTest;
import page.MenuPage;
import page.SwipeListPage;

public class SwipeElementTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();
	
	@Test
	public void resolverDesafio() {
		menu.clicarSwipeList();
		page.swipeElementRight("Opção 1");
		page.clickByText("(+)");
		Assert.assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
		page.swipeElementRight("Opção 4");
		page.clickByText("(-)");
		Assert.assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
		page.swipeElementLeft("Opção 5 (-)");
		Assert.assertTrue(page.existeElementoPorTexto("Opção 5"));
	}
}
