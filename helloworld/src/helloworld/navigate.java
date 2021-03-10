package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.navigate().to("https://www.google.com/search?q=instragrem&oq=instragrem&aqs=chrome..69i57.15558j0j7&sourceid=chrome&ie=UTF-8");
		d.navigate().back();
		d.navigate().forward();
		d.close();

	}

}
