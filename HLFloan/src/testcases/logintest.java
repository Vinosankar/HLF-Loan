package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import commonfun.commonfun;
import pageobject.Companyinfo;
import pageobject.loginpage;

public class logintest extends commonfun{
	
	public void login()
	{  
		PageFactory.initElements(driver,loginpage.class);
	loginpage.username.sendKeys(properties.getProperty("username"));	
	loginpage.password.sendKeys(properties.getProperty("Password"));
	loginpage.loginbutton.click();
	loginpage.lab.click();
	loginpage.add.click();
	loginpage.company.click();
	loginpage.Barrow.click();
	
	}
	public void selectaction()
	{
		PageFactory.initElements(driver,Companyinfo.class);
		Companyinfo.select.click();
		List<WebElement> dropdown1=driver.findElements(By.xpath("//ul[@id='form_Id1:j_idt74:ifProfessional_items']//following::li"));
		
	     for(WebElement webElement :dropdown1)
	    	{
				String text =webElement.getText();
					if(text.contains("Doctor"))
					{
	                  webElement.click();
						break;
						}
				}
	}
	
	public void Oraganization()	
	{
		PageFactory.initElements(driver,Companyinfo.class);
		Companyinfo.organization.click();
		List<WebElement> Dropdown2=driver.findElements(By.xpath("//ul[@id='form_Id1:j_idt74:typeOfOrganaization_items']//following::li"));
		for(WebElement webElement :Dropdown2)
		{
			String text =webElement.getText();
			if(text.contains("Pvt.Ltd"))
			{
				webElement.click();
				break;
			}
		}
		
	}
	public void Bussiness()
	{
		PageFactory.initElements(driver,Companyinfo.class);
		Companyinfo.bussdrop.click();
	List<WebElement>dropdown2	=driver.findElements(By.xpath("//ul[@id='form_Id1:j_idt74:typeOfBusiness_items']//following::li"));
	for(WebElement webElement:dropdown2)
	{
		String text=webElement.getText();
		if(text.contains("Service"))
		{
			webElement.click();
			break;
		}
	}
	}
	public void Available()
	{
		PageFactory.initElements(driver,Companyinfo.class);
		Companyinfo.Available.click();
		List<WebElement>Dropdown3=driver.findElements(By.xpath("//ul[@id='form_Id1:j_idt74:proofAvailable_items']//following::li"));
		for(WebElement webElement:Dropdown3)
		{
			String text =webElement.getText();
			if(text.contains("Yes"))
			{
				webElement.click();
				break;
			}
		}
	}
	
		
	
	
	
	public void company() 
	{
		PageFactory.initElements(driver,Companyinfo.class);
         Companyinfo.companyid.click();
		
		/*Companyinfo.Pannum.sendKeys(properties.getProperty("Pannumber"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		 WebElement Verify =wait.until(ExpectedConditions.elementToBeClickable(By.id("form_Id1:j_idt74:j_idt94")));
		Verify.click();
		
		Companyinfo.CINNo.sendKeys(properties.getProperty("CIN"));
		Companyinfo.GSTNo.sendKeys(properties.getProperty("GST"));
		Companyinfo.verify1.click();*/
		
		Companyinfo.Typeofindustry.sendKeys(properties.getProperty("Typeofindustry"));
		Companyinfo.code.sendKeys(properties.getProperty("Code"));
		Companyinfo.address.sendKeys(properties.getProperty("Address"));
		
		Companyinfo.pincode.sendKeys(properties.getProperty("Pincode"));
		Companyinfo.city.sendKeys(properties.getProperty("City"));
		Companyinfo.State.sendKeys(properties.getProperty("State"));
		Companyinfo.STDno.sendKeys(properties.getProperty("STD"));
		Companyinfo.emailid.sendKeys(properties.getProperty("Emailid"));
		Companyinfo.yerasofcurrent.sendKeys(properties.getProperty("Totalyearbussiness"));
        Companyinfo.Employeenum.sendKeys(properties.getProperty("Totalyearbussiness"));
		Companyinfo.Bussiness.sendKeys(properties.getProperty("Totalyearbussiness"));
		Companyinfo.otherincome.sendKeys(properties.getProperty("otherincome"));
		Companyinfo.source.sendKeys(properties.getProperty("Source"));
		Companyinfo.totalincome.sendKeys(properties.getProperty("Totalincome"));
		Companyinfo.monthlyincome.sendKeys(properties.getProperty("Yourmonth"));
		Companyinfo.monthlyinstal.sendKeys(properties.getProperty("monthlyins"));
		/*Companyinfo.CINNo.sendKeys(properties.getProperty("CIN"));
		/*Companyinfo.Pannum.sendKeys(properties.getProperty("Pannumber"));
		WebDriverWait wait = new WebDriverWait(driver,20);
		 WebElement Verify =wait.until(ExpectedConditions.elementToBeClickable(By.id("form_Id1:j_idt74:j_idt94")));
		Verify.click();
	     WebDriverWait wait1 = new WebDriverWait(driver,20);
	      WebElement verify1 =wait1.until(ExpectedConditions.elementToBeClickable(By.id("form_Id1:j_idt74:j_idt101")));
		
	        verify1.click();*/
	
		
		
		
	}
	
	
	@Test
	public void Testcases() 
	{
		login();
		selectaction();
		company();
		 Oraganization();
		 Bussiness();
		 Available();
	
		
	}
	
}


	
