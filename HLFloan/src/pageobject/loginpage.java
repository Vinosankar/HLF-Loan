package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	
	@FindBy(id="form:username")
	public static WebElement username;
	@FindBy(id="form:password")
	public static WebElement password;
	@FindBy(id="form:j_idt13")
	public static WebElement loginbutton;
	@FindBy(id="form_Id1:j_idt19")
	public static WebElement lab;
	@FindBy(id="form_Id1:j_idt64")
	public static WebElement add;
	@FindBy(xpath="//*[@class='ui-radiobutton-box ui-widget ui-corner-all ui-state-default']")
	public static WebElement company;
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74\"]/ul/li[2]/a")
	public static WebElement Barrow;
	

}
