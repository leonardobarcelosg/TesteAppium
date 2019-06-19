package page;

import org.openqa.selenium.By;

import Appium.core.BasePage;
import Appium.core.Driverfactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeListPage extends BasePage {

	public void swipeElementLeft(String opcao) {
		swipeElement(Driverfactory.Getdriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void swipeElementRight(String opcao) {
		swipeElement(Driverfactory.Getdriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}
	
	public void clicarBotaoMais(){
		MobileElement botao = Driverfactory.Getdriver().findElement(By.xpath("//*[@text='(+)']/.."));
		TouchAction a = new TouchAction(Driverfactory.Getdriver());
		a.press(PointOption.point(-50, 0))
		.perform();
	}
}
