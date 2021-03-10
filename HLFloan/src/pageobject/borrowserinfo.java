package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class borrowserinfo {
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74\"]/ul/li[3]/a")
	public static WebElement Borrowser;
	@FindBy(id="form_Id1:j_idt74:mobileNo")
	public static WebElement Moblienumber;
	@FindBy(id="form_Id1:j_idt74:email")
	public static WebElement Emailiid;
	
	@FindBy(id="form_Id1:j_idt74:statePincode")
	public static WebElement  PinCode;
	@FindBy(id="form_Id1:j_idt74:city")
	public static WebElement City;
	@FindBy(id="form_Id1:j_idt74:state")
	public static WebElement State;
	@FindBy(id="form_Id1:j_idt74:caddress")
	public static WebElement CurrentAddress;
	@FindBy(id="form_Id1:j_idt74:paddress")
	public static WebElement PermanentAddress;
	@FindBy(id="form_Id1:j_idt74:borrPin")
	public static WebElement Pincode1;
	@FindBy(id="form_Id1:j_idt74:city1")
	public static WebElement City1;
	@FindBy(id="form_Id1:j_idt74:nearestLandMark1")
	public static WebElement Nearestlandmark;
	@FindBy(id="form_Id1:j_idt74:statePincode1")
	public static WebElement state;
	@FindBy(id="form_Id1:j_idt74:state")
	public static WebElement State1;
	@FindBy(id="form_Id1:j_idt74:nearestLandMark")
	public static WebElement landmark;
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74:j_idt312\"]/div[2]")
	public static WebElement checkbox;
	
	
	
	

}
