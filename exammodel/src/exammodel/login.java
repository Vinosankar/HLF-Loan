package exammodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class login {
	public WebDriver driver;


	@Test
	public void function()
	{
		WebElement login = driver.findElement(By.xpath("//*[@id=\'txtUsername\']"));
		login.sendKeys("Admin");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement possword = driver.findElement(By.xpath("//*[@id=\'txtPassword\']"));
		possword.sendKeys("admin123");
		WebElement submit =driver.findElement(By.id("btnLogin"));
		submit.click();
	}	
		@BeforeMethod
		public void funct()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validatecredentials");
		}
	}

