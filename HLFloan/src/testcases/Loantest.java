package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfun.commonfun;
import pageobject.LoanInfo;

public class Loantest extends commonfun {
	
	
	

	public void Loantestcases()
	
	{
		PageFactory.initElements(driver,LoanInfo.class);
		LoanInfo.Loaninfo1.click();
		LoanInfo.Application.sendKeys(properties.getProperty("application"));
		LoanInfo.ApplicationName.sendKeys(properties.getProperty("Applicationname"));
		LoanInfo.Applicationno.sendKeys(properties.getProperty("ApplicationNo"));
		
		
		LoanInfo.Dependents.sendKeys(properties.getProperty("Dependents"));
		LoanInfo.Fathername.sendKeys(properties.getProperty("Fathername1"));
		
		LoanInfo.Loanamout.sendKeys(properties.getProperty("Loanamout"));
		LoanInfo.Location.sendKeys(properties.getProperty("Location4"));
		LoanInfo.Mothername.sendKeys(properties.getProperty("Mothername2"));
		LoanInfo.NameofDSA.sendKeys(properties.getProperty("NameofDSA"));
		LoanInfo.Nationality.sendKeys(properties.getProperty("Nationality"));
		LoanInfo.rateofinterest.sendKeys(properties.getProperty("rateofinterest"));
		LoanInfo.Source.sendKeys(properties.getProperty("Source"));
		LoanInfo.termbox.sendKeys("9000");
		
		
		
		
	}
	public void Select()
	{
		PageFactory.initElements(driver,LoanInfo.class);
		LoanInfo.Gender.click();
		List<WebElement> Gender1 =driver.findElements(By.xpath("//ul[@id='form_Id1:j_idt74:gender1_items']//following::li"));
		for (WebElement webElement :Gender1)
		{
		String Text=webElement.getText();
		if (Text.contains("Female"))
		{
			webElement.click();
			break;
		}
		}
	}





public void calender() throws InterruptedException {
	
		String  Month="June 2019";
	
	
	
	WebElement calander =driver.findElement(By.xpath("//div[@class='ui-panelgrid-cell ui-grid-col-3']/span/button/span[1]"));
	calander.click();
	WebElement cick =driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	while(true)
	{
		if(cick.getText().contains(Month))
		{
			break;
		}
		else
		{
			WebElement fun=driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all']/a[1]"));
			fun.click();
		Thread.sleep(1000);
		}
	}
	/*driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[7]/a[contains(text(),'"+date+"')]")).click();*/





	/*@Test(priority=2)
	public void calander()
	{
		driver.findElement(By.id("form_Id1:j_idt74:birthDate1_input")).click();
	}


/*public void Dateofbirth() {
	PageFactory.initElements(driver,LoanInfo.class);
	LoanInfo.Dateofbirth.click();
	List<WebElement> dateofbirth =driver.findElements(By.id(""));
	
	for(WebElement webElement : dateofbirth)
	{
		String text=webElement.getText();
		if(text.contains(""))
		{
			webElement.click();
			break;
		}
	}
	
}
	public void status() {
		PageFactory.initElements(driver,LoanInfo.class);
		List<WebElement> status1 =driver.findElements(By.id(""));
		for (WebElement webElement : status1)
		{
			String text =webElement.getText();
			if(text.contains(""))
			{
				webElement.click();
				break;
			}
		}
	}*/
}
@Test
public void element() throws InterruptedException
{
	Loantestcases();
	 Select();
	 calender();
	
}
}


	

