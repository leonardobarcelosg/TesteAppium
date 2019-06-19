package testeAppium;

import org.junit.Assert;
import org.junit.Test;

import Appium.core.BaseTest;
import page.MenuPage;
import page.SplashPage;

public class SplashTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
	@Test
	public void DeveAguardarSplashSumir() {

		menu.accessarSplash();
		page.isTelaSplashVisivel();
		page.aguardarSplashSumir();
		Assert.assertTrue(page.existeElementoPorTexto("Formulário"));
}
}
