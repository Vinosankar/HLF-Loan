package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tngclass {
	
	public WebDriver driver;

	@Test
	public void f()
	{
		WebElement first =driver.findElement(By.id("email"));
		first.sendKeys("90000000000");
		WebElement second =driver.findElement(By.id("pass"));
		second.sendKeys("vino");
	}
 @BeforeMethod
 public void beforeMethod()
 {
	 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
 }
 @AfterMethod
 public void after()
 {
	 driver.close();
 }
 
 
 
}



