package testeAppium;

import org.junit.Assert;
import org.junit.Test;

import Appium.core.BasePage;
import page.MenuPage;

public class SwipeTest extends BasePage {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		menu.acessarSwipe();
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
		//swipe para direita
		menu.swipeRight();
		Assert.assertTrue(menu.existeElementoPorTexto("E veja se"));
		menu.clickByText(">");
		//verificar texto Chegar até o fim!
		Assert.assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
		menu.swipeLeft();
		//Clicar botão esquerda
		menu.clickByText("<");
		Assert.assertTrue(menu.existeElementoPorTexto("a esquerda"));
	}
}
