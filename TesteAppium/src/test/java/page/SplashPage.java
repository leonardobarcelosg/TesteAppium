package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Appium.core.BasePage;
import Appium.core.Driverfactory;

public class SplashPage extends BasePage {
	
	public boolean isTelaSplashVisivel() {
		
		return existeElementoPorTexto("Splash!");
	}
	
	public void aguardarSplashSumir() {
		//Driverfactory.Getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(Driverfactory.Getdriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}
}
