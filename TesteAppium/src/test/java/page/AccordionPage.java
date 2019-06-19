package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.core.BasePage;
import Appium.core.Driverfactory;

public class AccordionPage extends BasePage {

	public void selecionarOp1() {
		clickByText("Opção 1");
	}
	
	public String obterValorOp1() {
		return getText(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
	
	public void aguardarPage() {
		//Driverfactory.Getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView")));
	}
}
