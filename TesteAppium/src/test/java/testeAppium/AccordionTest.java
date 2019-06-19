package testeAppium;

import org.junit.Test;
import Appium.core.BasePage;
import junit.framework.Assert;
import page.AccordionPage;
import page.MenuPage;

public class AccordionTest extends BasePage {

	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		menu.acessarAccordion();
		page.selecionarOp1();
		page.aguardarPage();
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
		
	}
}
