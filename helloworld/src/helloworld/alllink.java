package helloworld;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class alllink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.getCurrentUrl();
		
		List<WebElement> links =driver.findElements(By.tagName("a"));
		int count =links.size();
		System.out.println("number of link"+count);
		for(int i=0; i<count; i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.close();
		
		
	

	}

}
