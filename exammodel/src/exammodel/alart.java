package exammodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		WebElement submit =driver.findElement(By.name("submit"));
		submit.click();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.switchTo().alert().dismiss();
		System.out.println("success");
		

	}

}
