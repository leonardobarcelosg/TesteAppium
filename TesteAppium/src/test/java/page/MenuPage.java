package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.core.BasePage;
import Appium.core.Driverfactory;

public class MenuPage extends BasePage{
	
	public void accessFormulario()
	{
		clickByText("Formulário");
	}
	
	public void accessarSplash()
	{
		clickByText("Splash!");
	}
	
	public void acessarAlerta()
	{
		clickByText("Alertas");
	}
	
	public void acessarAbas()
	{
		clickByText("Abas");
	}
	
	public void acessarAccordion()
	{
		clickByText("Accordion");
	}
	
	public void acessarCliques() {
		clickByText("Cliques");
	}
	
	public void acessarSwipe() {
		clickByText("Swipe");
	}
		
	public void clicarSwipeList() {
		WebDriverWait wait = new WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text='Formulário']")));
		scrollDown();
		clickByText("Swipe List");
	}
	
	public void clicarDragAndDrop() {
		WebDriverWait wait = new WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text='Formulário']")));
		scrollDown();
		clickByText("Drag and drop");
	}
	
	public void acessarSBHibrido() {
		clickByText("SeuBarriga Híbrido");
	}
}
