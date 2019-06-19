package testeAppium;

import org.junit.Assert;
import org.junit.Test;

import Appium.core.BaseTest;
import page.DragAndDropPage;
import page.MenuPage;

public class DragAndDropTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private DragAndDropPage page = new DragAndDropPage();
	
	private String[] estadoInicial = new String[] {"Esta", "é uma lista", "Drag em Drop!",
			"Faça um clique longo", "e arraste para", "qualquer local desejado."};

	private String[] estadoIntermediario = new String[] {"é uma lista", "Drag em Drop!",
			"Faça um clique longo", "e arraste para","Esta", "qualquer local desejado."};

	@Test
	public void deveEfetuarDragAndDrop() {
		
		menu.clicarDragAndDrop();
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		page.arrastar("Esta", "e arraste para");
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
		
		
	}
}
