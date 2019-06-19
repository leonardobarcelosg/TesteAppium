package testeAppium;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;
import Appium.core.BaseTest;
import Appium.core.Driverfactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import page.FormularioPage;
import page.MenuPage;

public class junitTestCase extends BaseTest
{
	private AndroidDriver<MobileElement> driver;
	
	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();
	
	@Before
	public void appiumInitialize() throws MalformedURLException
	{
		menu.accessFormulario();
	}

	
	@Test
	public void preencherCampoTexto() throws MalformedURLException 
	{
	    //List<MobileElement> elementosEncontrados = driver.findElements(By.className("android.widget.TextView"));
	    //elementosEncontrados.get(1).click();
	
		page.writeName("Leonardo");
		Driverfactory.Getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Leonardo']")));
		
		//verificar nome inserido
		assertEquals("Leonardo", page.getName());  
	}
	
	private WebDriverWait WebDriverWait(AndroidDriver<MobileElement> getdriver, int i) {
		// TODO Auto-generated method stub
		return null;
	}


	@Test
	public void InteragirCombo() throws MalformedURLException 
	{
	    //clicar na combo
		page.selectCombo("PS4");
		
	    //verificar valor selecionado

	    Assert.assertEquals("PS4", page.getComboValue());
	}
	
	@Test
	public void InteragirSwitchCheckBox() throws MalformedURLException 
	{
		
		//MobileElement checkBox = driver.findElement(By.className("android.widget.CheckBox"));
		//MobileElement switchh = driver.findElement(MobileBy.AccessibilityId("switch"));
		
		//verificar status dos elementos
		Assert.assertFalse(page.isCheckBoxMarked());
		Assert.assertTrue(page.isSwitchMarked());
		
		//clicar nos elementos
		page.clickCheckBox();
		page.clickSwitch();
		
		//verificar estados alterados
		Assert.assertTrue(page.isCheckBoxMarked());
		Assert.assertFalse(page.isSwitchMarked());
	}
	
	@Test
	public void makeCadastro() throws MalformedURLException
	{
		//preencher campos
		page.writeName("Leonardo");
		page.clickCheckBox();
		page.clickSwitch();
		page.selectCombo("PS4");
		page.save();
		
		//verificações
		Assert.assertEquals("Nome: Leonardo", page.getCadastredName());
		Assert.assertEquals("Nome: Leonardo", page.getCadastredConsole());
		Assert.assertEquals("Nome: Leonardo", page.getCadastredSwitch().endsWith("Marcado"));
		Assert.assertEquals("Nome: Leonardo", page.getCadastredCheckBox().endsWith("Off"));
	}
	
	@Test
	public void deveAlterarData() {
		page.clickByText("01/01/2000");
		page.clickByText("20");
		page.clickByText("OK");
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}
	
	@Test
	public void deveAlterarHora() {
		page.clickByText("06:00");
		page.click(MobileBy.AccessibilityId("10"));
		page.click(MobileBy.AccessibilityId("40"));
		Assert.assertTrue(page.existeElementoPorTexto("10:40"));
	}
	
	@Test
	public void deveInteragirComSeekbar() {
		page.clicarSeekbar(0.65);
		
		page.save();
	}
	
}
	

