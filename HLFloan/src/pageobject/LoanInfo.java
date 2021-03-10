package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoanInfo {
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74\"]/ul/li[4]/a")
	public static WebElement Loaninfo1;
	@FindBy(id="form_Id1:j_idt74:pan")
	public static WebElement Application;
	@FindBy(id="form_Id1:j_idt74:panHolderName")
	public static WebElement ApplicationName;
	@FindBy(id="form_Id1:j_idt74:fatherName1")
	public static WebElement Fathername;
	@FindBy(id="form_Id1:j_idt74:motherName")
	public static WebElement Mothername;
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74:nationality1\"]/div[3]/span")
	public static WebElement Nationality;
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74:gender1\"]/div[3]/span")
	public static WebElement Gender;
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74:birthDate1\"]/button/span[1]")
	public static WebElement Dateofbirth;
	@FindBy(id="//*[@id=\"form_Id1:j_idt74:status1\"]/div[3]/span")
	public static WebElement Status;
	@FindBy(id="form_Id1:j_idt74:dependents1")
	public static WebElement Dependents;
	/*@FindBy(id="form_Id1:j_idt74:incorporationDtae_input")
	public static WebElement dateofincorporation;*/
	@FindBy(id="form_Id1:j_idt74:loc_input")
	public static WebElement Location;
	@FindBy(id="form_Id1:j_idt74:j_idt401")
	public static WebElement Applicationno;
	@FindBy(id="form_Id1:j_idt74:j_idt405")
	public static WebElement Source;
	@FindBy(id="form_Id1:j_idt74:j_idt412")
	public static WebElement NameofDSA;
	@FindBy(id="form_Id1:j_idt74:j_idt416")
	public static WebElement Loanamout;
	@FindBy(id="form_Id1:j_idt74:j_idt420")
	public static WebElement rateofinterest;
	@FindBy(id="form_Id1:j_idt74:amt")
	public static WebElement termbox; 
	
	

}
