package Appium.core;

import java.io.File;

import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseTest {

//	@AfterClass
//	public static void finalizaClasse() {
//		Driverfactory.killDriver();
//	}
	
	@Rule
	public TestName testName = new TestName();
	
	@After
	public void TearDown()
	{
		GerarScreenshot();
		Driverfactory.killDriver();
	}
	
	public void GerarScreenshot() {
		try {
			File imagem = ((TakesScreenshot) Driverfactory.Getdriver()).getScreenshotAs(OutputType.FILE);
			org.apache.commons.io.FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
