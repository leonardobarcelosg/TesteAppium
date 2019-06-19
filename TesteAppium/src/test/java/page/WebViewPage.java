package page;

import java.util.Set;

import org.openqa.selenium.By;

import Appium.core.BasePage;
import Appium.core.Driverfactory;

public class WebViewPage extends BasePage{

	public void entrarContextoWeb() {
		Set<String> contextHandles = Driverfactory.Getdriver().getContextHandles();
//		for(String valor: contextHandles) {
//			System.out.println(valor);
//		}
		Driverfactory.Getdriver().context((String) contextHandles.toArray()[1]);
	}
	
	public void sairContextoWeb() {
		
		Driverfactory.Getdriver().context((String) Driverfactory.Getdriver().getContextHandles().toArray()[0]);
	}
	
	public void setEmail(String valor) {
		Driverfactory.Getdriver().findElement(By.id("email"));	
	}
	
	public void setSenha(String senha) {
		Driverfactory.Getdriver().findElement(By.id("senha")).sendKeys(senha);
	}
	
	public void Entrar() {
		click(By.xpath("//button[@type = 'submit']"));
	}
	
	public String getMessage() {
		return getText(By.xpath("//div[@class='alert_alert-success']"));
	}
}
