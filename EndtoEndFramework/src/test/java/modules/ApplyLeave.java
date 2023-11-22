package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import base.BaseTestPjct;

public class ApplyLeave {
	
	WebDriver driver;
	
	ApplyLeave() throws IOException
	{
	BaseTestPjct bt = new BaseTestPjct();
	 driver =bt.appLogin();
	}
	
	
	By button_applyleave= By.xpath("//button[@title='Apply Leave']");
	By button_leavelist= By.xpath("//a[text()='Leave List']");
	
		
    @Test(priority=1)
	public void applyLeaveIcon()
	{
		driver.findElement(button_applyleave).click();
	}
    @Test(priority=2)
	public void leaveListButton()
	{
		driver.findElement(button_leavelist).click();
	}
	
}
