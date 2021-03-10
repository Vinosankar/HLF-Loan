package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public WebDriver d;
	
	@Given("Enter (.*) and (.*)")
	public void Login_Details(String uname, String pswd) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demo.guru99.com/test/newtours/");
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("password")).sendKeys(pswd);
	}
	
	@When("If the Credentials are coorect login")
	public void login() {
		d.findElement(By.name("submit")).click();
	}
	
	@Then("Close the application")
	public void app_close(){
		d.close();
	}
}
