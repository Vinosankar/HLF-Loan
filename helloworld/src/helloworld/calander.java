package helloworld;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calander {
	WebDriver driver;
	String Month="June 2019";
	String date ="13";
	
	@Test
	public void travels() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		 WebElement drop =driver.findElement(By.xpath("//div[@class='kd-example-runner tabstrip-container']/div[4]/div/div/span/span/span/span/span"));
		 drop.click();
		 Thread.sleep(200);
		WebElement  mon =driver.findElement(By.xpath("//div[@class='k-animation-container']/div/div/div[1]/a[2]"));
		while(true)
		{
			if(mon.getText().contains(Month))
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//div[@class='k-animation-container']/div/div/div[1]/a[1]")).click();
				Thread.sleep(1000);
			}
		}
		driver.findElement(By.xpath("//div[@class='k-animation-container']/div/div/div[2]/table/tbody/tr[3]/td[5]/a[contains(text(),'"+date+"')]")).click();;
		
		
	}
	

}
