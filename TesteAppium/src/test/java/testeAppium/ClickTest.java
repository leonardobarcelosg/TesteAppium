package testeAppium;

import org.junit.Before;
import org.junit.Test;

import Appium.core.BaseTest;
import junit.framework.Assert;
import page.CliquesPage;
import page.MenuPage;

public class ClickTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();
	
	@Before
	public void Setup() {
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() {
		//menu.acessarCliques();
		page.longClick();
		Assert.assertEquals("Clique Longo", page.getFieldText());
	}
	
	@Test
	
	public void deveRealizarCliqueDuplo() {
		//menu.acessarCliques();
		//page.clickByText("Clique duplo");
		//page.clickByText("Clique duplo");
		page.doubleClick();
		
		Assert.assertEquals("Duplo clique", page.getFieldText());
	}
	
}
