package Appium.core;

import static Appium.core.Driverfactory.Getdriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class BasePage {
	public void sendKeys(By by, String text)
	{
		Getdriver().findElement(by).sendKeys(text);
	}
	
	public String getText(By by)
	{
		return Getdriver().findElement(by).getText();
	}
	
	public void selectComboBox(By by, String value)
	{
		Getdriver().findElement(by).click();
		Getdriver().findElement(by.xpath("//android.widget.CheckedTextView[@text='"+value+"']"));
	}
	
	public void clickByText(String text)
	{
		click(By.xpath("//*[@text='"+text+"']"));
	}
	
	public boolean existeElementoPorTexto(String texto) {
		List<MobileElement> elementos = Getdriver().findElements(By.xpath("//*[text='"+texto+"']"));
		return elementos.size()>0;
	}
	
	public void click(By by) 
	{
		Getdriver().findElement(by).click();
	}
	
	public boolean isChecked(By by)
	{
		return Getdriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	public void tap(int x, int y) {
		new TouchAction(Getdriver()).tap(PointOption.point(x,y)).perform();
	}
	
	public String obterTituloAlerta() {
		return getText(By.id("android:id/alertTitle"));
	}
	
	public String obterMensagemAlerta() {
		return getText(By.id("android:id/message"));
	}
	
	public void scroll(double inicio, double fim) {
		Dimension size = Getdriver().manage().window().getSize();
		
		int x = size.width / 2;
		int yInicial = (int) (size.getHeight() * inicio); 
		int yFinal = (int) (size.getHeight() * fim);
		
		new TouchAction(Getdriver())
			.press(PointOption.point(x, yInicial))
			//.waitAction(Duration.ofMillis(500))
			.moveTo(PointOption.point(x, yFinal))
			.release()
			.perform();
	}
	
	public void swipe(double inicio, double fim) {
		Dimension size = Getdriver().manage().window().getSize();
		
		int y = size.height / 2;
		
		int xInicial = (int) (size.getWidth() * inicio); 
		int xFinal = (int) (size.getWidth() * fim);
		
		new TouchAction(Getdriver())
		.press(PointOption.point(xInicial, y))
		//.waitAction(Duration.ofMillis(500))
		.moveTo(PointOption.point(xFinal, y))
		.release()
		.perform();
	}
	
	public void swipeElement(MobileElement element, double inicio, double fim) {
		Dimension size = Getdriver().manage().window().getSize();
		
		int y = element.getLocation().y + (element.getSize().height / 2);
	
		int start_x = (int) (element.getSize().width * inicio);
		int end_x = (int) (element.getSize().width * fim);
		
		new TouchAction(Getdriver())
		.press(PointOption.point(start_x, y))
		.moveTo(PointOption.point(end_x, y))
		.release()
		.perform();
		
	}
	
	public void scrollDown() {
		scroll(0.9, 0.1);
	}
	
	public void scrollUp() {
		scroll(0.1, 0.9);
	}
	
	public void swipeLeft() {
		scroll(0.1, 0.9);
	}
	
	public void swipeRight() {
		scroll(0.9, 0.1);
	}
}
