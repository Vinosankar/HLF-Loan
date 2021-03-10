package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfun.commonfun;
import pageobject.borrowserinfo;

public class Borrow extends commonfun {
	
	@Test (priority=0)
	public void Borrowser() throws InterruptedException 
	{
	    PageFactory.initElements(driver,borrowserinfo.class);
		
		borrowserinfo.Borrowser.click();
		Thread.sleep(2000);
		
		borrowserinfo.City.sendKeys(properties.getProperty("City"));
		borrowserinfo.City1.sendKeys(properties.getProperty("City1"));
		borrowserinfo.CurrentAddress.sendKeys(properties.getProperty("Current"));
		borrowserinfo.Emailiid.sendKeys(properties.getProperty("Emailid"));
		borrowserinfo.Moblienumber.sendKeys(properties.getProperty("mobile"));
		borrowserinfo.Nearestlandmark.sendKeys(properties.getProperty("nearestlocation"));
		borrowserinfo.PermanentAddress.sendKeys(properties.getProperty("permenated"));
		borrowserinfo.PinCode.sendKeys(properties.getProperty("pincode1"));
		borrowserinfo.Pincode1.sendKeys(properties.getProperty("pincode2"));
		borrowserinfo.state.sendKeys(properties.getProperty("State"));
		borrowserinfo.State1.sendKeys(properties.getProperty("State1"));
		borrowserinfo.landmark.sendKeys(properties.getProperty("landmark"));
		borrowserinfo.checkbox.click();
	
		
	}
	
	

}
