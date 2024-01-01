package Testingpack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Basepack.Baseclass;

public class Executing extends Baseclass{
  @Test
  public void TestCases() throws InterruptedException, AWTException, IOException {
	  
	  Scriptcoding s = new Scriptcoding();
	  
	    s.Login();   // Scripting method-----> login
	  s.addoneemp(); // Scripting --->add one employee
	  //s.addoneempexcel();
	 //s. multiempexcel();
	  //s. EditoneEmpoloyee();
	   //s.EditmultiEmpoloyee();
	   //s.delemp();
  }
}
