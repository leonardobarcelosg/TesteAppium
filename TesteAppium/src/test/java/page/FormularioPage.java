package page;

import org.openqa.selenium.By;

import Appium.core.BasePage;
import Appium.core.Driverfactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage{
	
	public void writeName(String name)
	{
		sendKeys(MobileBy.AccessibilityId("Nome"), name);
	}
	
	public String getName()
	{
		return getText(MobileBy.AccessibilityId("Nome"));
	}
	
	public void selectCombo(String value)
	{
		getText(MobileBy.AccessibilityId(value));
	}
	
	public String getComboValue()
	{
		return getText(By.xpath("//android.widget.Spinner/andoid.widget.TextView"));
	}
	
	public void clickCheckBox()
	{
		click(By.className("android.widget.CheckBox"));
	}
		
	public void clickSwitch()
	{
		click(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckBoxMarked()
	{
		return isChecked(By.className("android.widget.CheckBox")); 
	}
	
	public boolean isSwitchMarked()
	{
		return isChecked(MobileBy.AccessibilityId("switch")); 
	}
	public void save()
	{
		clickByText("SALVAR");
	}
	
	public void clicarSeekbar(double posicao) {
		int delta = 50;
		MobileElement seek = Driverfactory.Getdriver().findElement(MobileBy.AccessibilityId("slid"));
		int y = seek.getLocation().y + (seek.getSize().height / 2);
		System.out.println(y);
		
		int xinicial = seek.getLocation().x + delta;
		int x = (int) (xinicial + ((seek.getSize().width - 2*delta) * posicao));
		System.out.println(x);
		
		tap(x, y);
	}
	
	public String getCadastredName()
	{
		return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
	}
	
	public String getCadastredConsole()
	{
		return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String getCadastredCheckBox()
	{
		return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}
	
	public String getCadastredSwitch()
	{
		return getText(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}
}
