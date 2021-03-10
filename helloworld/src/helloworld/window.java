package helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://toolsqa.com/automation-practice-switch-windows");
		WebElement first =d.findElement(By.className("menu-text"));
		first.click();

	}

}
