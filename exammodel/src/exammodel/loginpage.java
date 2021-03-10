package exammodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpage {
	public WebDriver driver;
	@Test
	public void method()
	{
		WebElement fin1 =driver.findElement(By.id("email"));
		WebElement fin2 =driver.findElement(By.id("pass"));
		fin1.sendKeys("vinothini");
		fin2.sendKeys("1234567");
	}
	@BeforeMethod
	public void method2()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterMethod
	public void after()
	{
	driver.close();	
	}
	
	

}
