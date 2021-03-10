package helloworld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title =driver.getTitle();
		System.out.println("Title name:"+title);
		if (title.equals("Facebook – log in or sign up"))
		{
		System.out.println("testcases pass");
		}
		else
		{
			System .out.println("testcases fail");
		}
		String url =driver.getCurrentUrl();
		System.out.println("url"+url);

		

	}

}
