package Appium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driverfactory {

	private static AndroidDriver <MobileElement> driver;
	
	public static AndroidDriver <MobileElement> Getdriver()
	{
		if (driver == null)
		{
			createDriver();
			//para o testeobject, usar abaixo
			//createTestObjectDriver();
		}
		return driver;
	}

	private static void createDriver()
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "Default");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\eclipse-workspace\\TesteAppium\\src\\test\\resources\\CTAppium-1-1.apk");

		try 
		{
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		Driverfactory.Getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	private static void createTestObjectDriver()
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		//chave da API gerada em app.testobject.com
		desiredCapabilities.setCapability("testobject_api_key", "");
		//conferir versao do appium
		desiredCapabilities.setCapability("appiumVersion", "");
		//desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "Default");
		//desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\eclipse-workspace\\TesteAppium\\src\\test\\resources\\CTAppium-1-1.apk");

		try 
		{
			driver = new AndroidDriver<MobileElement>(new URL("https://us1.appium.testobject.com/wd/hub"), desiredCapabilities);
		} 
		catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		Driverfactory.Getdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public static void killDriver()
	{
		if (driver != null)
		{
			driver.quit();
			driver = null;
		}
	}
}
