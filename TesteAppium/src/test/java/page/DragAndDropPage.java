package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;

import Appium.core.BasePage;
import Appium.core.Driverfactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;

public class DragAndDropPage extends BasePage {

	public void arrastar(String origem, String destino) {
		MobileElement inicio = Driverfactory.Getdriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = Driverfactory.Getdriver().findElement(By.xpath("//*[@text='"+destino+"']"));
	
		TouchActions action = new TouchActions(Driverfactory.Getdriver());
		//action.longPress(inicio).dragAndDrop(origem, destino);
		
//		new TouchAction(Driverfactory.Getdriver())
//			.longPress(inicio)
//			.
			
	}
	
	public String[] obterLista() {
		List<MobileElement> elements = Driverfactory.Getdriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for (int i = 0; i<elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
			//System.out.print("\""+ retorno[i]+ "\", ");
		}
		return retorno;
	}
	
}
