package page;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import Appium.core.BasePage;
import Appium.core.Driverfactory;
import io.appium.java_client.TouchAction;

public class CliquesPage extends BasePage{
	TouchActions action = new TouchActions(Driverfactory.Getdriver());
	
	public void longClick() {
		action.longPress((Driverfactory.Getdriver().findElement(By.xpath("//*[@text='Clique Longo']")))).perform();
		//new TouchAction(Driverfactory.Getdriver()).longPress((Driverfactory.Getdriver().findElement(By.xpath("//*[@text='Clique Longo']"))));
	}
	
	public String getFieldText() {
		return Driverfactory.Getdriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}
	
	public void doubleClick() {
		action.doubleClick((Driverfactory.Getdriver().findElement(By.xpath("//*[@text='Clique Longo']")))).perform();
	}
}
