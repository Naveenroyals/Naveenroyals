package Basepack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Baseclass {
	public static WebDriver driver;
	public static Properties obj;
  @BeforeTest
  public void Prechecks() throws IOException 
  {
	  System.setProperty("webDriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\My Driver\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      
      FileInputStream  f = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\src\\Data\\java\\TestDataPack\\My data");
      obj = new Properties();
      obj.load(f);
      System.out.println(obj.getProperty("N"));
      
  }
}
