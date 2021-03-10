package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/radio.html");
		WebElement option =d.findElement(By.id("vfb-7-2"));
		option.click();
		WebElement check =d.findElement(By.id("vfb-6-1"));
		check.click();
		
		if(option.isSelected())
		{
			System.out.println("select");
		}
		else
		{
			System.out.println("not selected");
		
		}

	}

}
