package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseTestPjct;

public class MyTimesheet {
	
	WebDriver driver;
	MyTimesheet() throws IOException
	{
		BaseTestPjct bt = new BaseTestPjct();
		driver=bt.appLogin();
	}
	
   By button_mytimesheet=By.xpath("//button[@title = 'My Timesheet']");
   
   @Test
   public void myTimeSheetIcon()
   {
	   driver.findElement(button_mytimesheet).click();
   }
    

}
