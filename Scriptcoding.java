package Testingpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.math3.ode.events.Action;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Scriptcoding extends ReusedMethods{
	
	
	
	
	private static final CharSequence emid = null;

	public void Login() throws IOException
	{
		  driver.get(obj.getProperty("URL"));
		  XP("XUSER").sendKeys("selenium");
		  XP("XPWD").sendKeys("selenium");
		  XP("XSUB").click();
		  ss("Before Save");
	}

    
	public void addoneemp() throws InterruptedException, AWTException, IOException
	{
		 t(2);
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 XP("XADD").click();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 t(1);
		 XP("XID").clear();
		 t(1);
		 XP("XID").sendKeys("5565");
		 XP("XLAST").sendKeys("kumar");
		 XP("XFIRST").sendKeys("lakshmi");
		 XP("XMID").sendKeys("prasana");
		 XP("XNICK").sendKeys("RAJ");
		 t(1);
		 A.moveToElement(XP("XPHOTO")).click().perform();
		 t(1);
		 StringSelection s = new StringSelection("E:\\MY PICTTURES\\IMAGES\\school group pic.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 t(1);
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyPress(KeyEvent.VK_ENTER);
		 
		 t(1);
		 XP("XSAVE").click();
		 
		 t(1);
		 XP("XBACK").click();
		 ss("After save");
	}

	public void addoneempexcel() throws InterruptedException, AWTException, IOException
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\src\\Data\\java\\OrangeHRMData.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("Create employee");
		// String eid = sht.getRow(1).getCell(0).getStringCellValue();
		 int eid   = (int)sht.getRow(1).getCell(0).getNumericCellValue();
		 String efirst = sht.getRow(1).getCell(1).getStringCellValue();
		 String elast = sht.getRow(1).getCell(2).getStringCellValue();
		 String emid = sht.getRow(1).getCell(3).getStringCellValue();
		 String enick = sht.getRow(1).getCell(4).getStringCellValue();
		 t(2);
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 XP("XADD").click();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 t(1);
		 XP("XID").clear();
		 t(1);
		 XP("XID").sendKeys(String.valueOf(eid));
		 XP("XLAST").sendKeys(efirst);
		 XP("XFIRST").sendKeys(elast);
		 XP("XMID").sendKeys(emid);
		 XP("XNICK").sendKeys(enick);
		 t(1);
		 A.moveToElement(XP("XPHOTO")).click().perform();
		 t(1);
		 StringSelection s = new StringSelection("D:\\mt picures\\imagrs\\school group pic.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 t(1);
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyPress(KeyEvent.VK_ENTER);
		 ss("Before Save");
		 t(1);
		 XP("XSAVE").click();
		 
		 t(1);
		 XP("XBACK").click();
		 ss("After save");
	}

	public void multiempexcel() throws InterruptedException, AWTException, IOException
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\src\\Data\\java\\OrangeHRMData.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("Create employee");
		 for(int i=1;i<=sht.getLastRowNum();i++)
		 {
		// String eid = sht.getRow(1).getCell(0).getStringCellValue();
		 int eid   = (int)sht.getRow(i).getCell(0).getNumericCellValue();
		 String efirst = sht.getRow(i).getCell(1).getStringCellValue();
		 String elast = sht.getRow(i).getCell(2).getStringCellValue();
		 String emid = sht.getRow(i).getCell(3).getStringCellValue();
		 String enick = sht.getRow(i).getCell(4).getStringCellValue();
		 t(2);
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 XP("XADD").click();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 t(1);
		 XP("XID").clear();
		 t(1);
		 XP("XID").sendKeys(String.valueOf(eid));
		 XP("XLAST").sendKeys(efirst);
		 XP("XFIRST").sendKeys(elast);
		 XP("XMID").sendKeys(emid);
		 XP("XNICK").sendKeys(enick);
		 t(1);
		 A.moveToElement(XP("XPHOTO")).click().perform();
		 t(1);
		 StringSelection s = new StringSelection("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\photos\\"+efirst+".jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 t(1);
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 t(1);
		 
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyPress(KeyEvent.VK_ENTER);
		 ss("Before Save"+efirst);
		 t(1);
		 XP("XSAVE").click();
		 
		 t(1);
		 XP("XBACK").click();
		 ss("After save"+efirst);
		 driver.switchTo().defaultContent();
		 t(1);
	}
	
	}
	
	public void EditoneEmpoloyee() throws IOException, InterruptedException
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\src\\Data\\java\\OrangeHRMData.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("Edit Employee");
		 t(1);
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 t(1);
		 XP("XEMP1").click();
		 XP("XEDIT").click();
		 XP("XMID").clear();
		 t(1);
		 XP("XMID").sendKeys("Macharla");
		 XP("XSAVE1").click();
		 t(1);
		 XP("XBACK").click();
		 driver.switchTo().defaultContent();
		 driver.quit();
	}
	
	public void EditmultiEmpoloyee() throws IOException, InterruptedException
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\OrangeHRM1\\src\\Data\\java\\OrangeHRMData.xlsx");
		 XSSFWorkbook w = new XSSFWorkbook(fis);
		 XSSFSheet sht = w.getSheet("Edit Employee");
		 t(1);
		 for(int i=1;i<=5;i++)
		 {	 
	     String elast= sht.getRow(i).getCell(2).getStringCellValue();
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 t(1);
		 driver.findElement(By.xpath("//*[@id=\"standardView\"]/table/tbody/tr["+i+"]/td[3]/a")).click();
		 driver.switchTo().defaultContent(); 
		 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"rightMenu\"]")));
		 XP("XEDIT").click();
		 XP("XLAST").clear();
		 t(1);
		 XP("XLAST").sendKeys(elast);;
		 XP("XSAVE1").click();
		 t(1);
		 XP("XBACK").click();
		 driver.switchTo().defaultContent();
		 t(1);
	}
	}
	
	public void delemp() throws InterruptedException 
	{
		 t(2);
		 Actions A = new Actions(driver);
		 A.moveToElement(driver.findElement(By.xpath(obj.getProperty("XPIM")))).perform();
		 t(1);
		 XP("XEMPLIST").click();
		 t(1);
		 driver.switchTo().frame(XP("XFRAME"));
		 for(int i=1;i<=5;i++);
		 {
		 t(1);
		 XP("XCHECK").click();
		 XP("XDEL").click();
		
	}	
	}
}
	
	

	


