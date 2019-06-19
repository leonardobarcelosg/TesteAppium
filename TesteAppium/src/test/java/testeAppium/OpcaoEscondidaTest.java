package testeAppium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.core.BaseTest;
import Appium.core.Driverfactory;
import page.MenuPage;

public class OpcaoEscondidaTest extends BaseTest {

	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		WebDriverWait wait = new WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text='Formulário']")));
		System.out.println("Começando");
		menu.scrollDown();
		menu.clickByText("Opção bem escondida");
		Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
		menu.clickByText("OK");
	}
}
