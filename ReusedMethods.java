package Testingpack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ReusedMethods extends Executing{

	public WebElement XP(String n)
	{
		return driver.findElement(By.xpath(obj.getProperty(n)));
	}

	public void t(int h) throws InterruptedException
	{
		int y = h*1000;
		Thread.sleep(y);
	}

	public void ss(String p) throws IOException
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      File tgt= new File("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\TestEvidences\\"+p+".jpg");
	      FileHandler.copy(src, tgt);
	}
	

}
	
	
	
	


	
	

