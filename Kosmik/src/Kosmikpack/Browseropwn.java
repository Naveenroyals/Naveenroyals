package Kosmikpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.sdk.logs.data.Body;

public class Browseropwn {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webDriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php");
         driver.findElement(By.xpath("//input[@name='username']")).sendKeys("kosmik");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("kosmik");
         driver.findElement(By.xpath("//input[@name='submit']")).click();
         driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/a")).click();
         driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/ul/li[1]/a")).click();
         Select S=new Select(driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[1]/td[2]/select")));
         S.selectByIndex(2);
         Select F=new Select(driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[2]/td[2]/select")));
         F.selectByIndex(1);
         driver.findElement(By.name("PNT_NAME")).sendKeys("gghbnvhh");
         driver.findElement(By.name("MIDDLE_NAME")).sendKeys("hjhgfgvhg");
         driver.findElement(By.name("LAST_NAME")).sendKeys("vvgvvtffc");
         driver.findElement(By.name("DOB")).sendKeys("01/01/2001");
         driver.findElement(By.name("AGE")).sendKeys("23");
         Select I=new Select(driver.findElement(By.name("SEX")));
         I.selectByIndex(1);
         Select W=new Select(driver.findElement(By.name("MTRL_STATUS")));
         W.selectByIndex(1);
         Select f=new Select(driver.findElement(By.name("RELIGION")));
         f.selectByIndex(1);
         Select s=new Select(driver.findElement(By.name("PLANGUAGE")));
         s.selectByIndex(3);
         Select t=new Select(driver.findElement(By.name("RELATION")));
         t.selectByIndex(4);
         driver.findElement(By.name("MOTHER_NAME")).sendKeys("Varamma");
         Select u=new Select(driver.findElement(By.name("PAT_IDENTITY")));
         u.selectByIndex(4);
         driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("0987654321");
         Select i=new Select(driver.findElement(By.name("NATIONALITY")));
         i.selectByIndex(1);
         Select a=new Select(driver.findElement(By.name("IS_MLC")));
         a.selectByIndex(2);
         Thread.sleep(2000);
         Select x=new Select(driver.findElement(By.name("EDUCATION")));
         x.selectByIndex(2);
         Select C=new Select(driver.findElement(By.name("OCCUPATION")));
         C.selectByIndex(2);
         Select V=new Select(driver.findElement(By.name("BLOOD_GRP_CODE")));
         V.selectByIndex(6);
         Select b=new Select(driver.findElement(By.name("CITIZENSHIP")));
         b.selectByIndex(2);
         Select n=new Select(driver.findElement(By.name("SC_PROOF")));
         n.selectByIndex(1);
         driver.findElement(By.name("ADDRESS1")).sendKeys("yyyyyy,jjjj,kikk");
         driver.findElement(By.name("MOBILE_NO")).sendKeys("9999999999");
         driver.findElement(By.name("EMAIL_ID")).sendKeys("ueywtwu@gmail.com");
         Select mm=new Select(driver.findElement(By.name("COUNTRY_CODE")));
         mm.selectByIndex(1);
         driver.findElement(By.name("ADDRESS2")).sendKeys("uhf8y0rg,oivhg3ru");
         driver.findElement(By.name("ZIP")).sendKeys("324222");
         Actions AA=new Actions(driver);
         WebElement L=driver.findElement(By.name("image"));
         Thread.sleep(2000);
         AA.moveToElement(L).click().perform();
         StringSelection P=new StringSelection("‪‪‪‪‪‪C:\\Users\\Dell\\eclipse-workspace\\Kosmik\\photos");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(P, null);
         Thread.sleep(2000);
         Robot K=new Robot();
         K.keyPress(KeyEvent.VK_CONTROL);
         K.keyPress(KeyEvent.VK_V);
         
         
         K.keyRelease(KeyEvent.VK_CONTROL);
         K.keyRelease(KeyEvent.VK_V);
         Thread.sleep(2000);
         
         K.keyPress(KeyEvent.VK_ENTER);
         K.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[18]/td[2]/input")).click();//save
         Thread.sleep(2000);
         K.keyPress(KeyEvent.VK_ENTER);
         K.keyRelease(KeyEvent.VK_ENTER);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[1]/ul/li[4]/a")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/table[2]/tbody/tr/td[10]/a[2]")).click();
         K.keyPress(KeyEvent.VK_ENTER);
         K.keyRelease(KeyEvent.VK_ENTER); 
	}

}
