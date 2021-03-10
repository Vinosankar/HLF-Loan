package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Companyinfo {
	@FindBy(xpath="//*[@id=\"form_Id1:j_idt74\"]/ul/li[2]/a")
	public static WebElement companyid;
	/*@FindBy(id="form_Id1:j_idt74:companyPan1")
	public static WebElement Pannum;
	/*@FindBy(id="form_Id1:j_idt74:j_idt94")
	public static WebElement verify;
	@FindBy(id="form_Id1:j_idt74:gstNo")
	public static WebElement GSTNo;
	@FindBy(id="form_Id1:j_idt74:j_idt101")
	public static WebElement verify1;
	@FindBy(id="form_Id1:j_idt74:j_idt104")
	public static WebElement CINNo;*/
	@FindBy(id="form_Id1:j_idt74:codee")
	public static WebElement code;
	@FindBy(id="form_Id1:j_idt74:typeOfIndustryy")
	public static WebElement Typeofindustry;
	@FindBy(id="form_Id1:j_idt74:naddress")
	public static WebElement address;
	@FindBy(id="form_Id1:j_idt74:Pincode")
	public static WebElement pincode;
	@FindBy(id="form_Id1:j_idt74:cityTown")
	public static WebElement city;
	@FindBy(id="form_Id1:j_idt74:State")
	public static WebElement State;
	@FindBy(id="form_Id1:j_idt74:contactNowithSTDCode")
	public static WebElement STDno;
	@FindBy(id="form_Id1:j_idt74:emailId")
	public static WebElement emailid;
	@FindBy(id="form_Id1:j_idt74:yearsInCurrentBusiness")
	public static WebElement yerasofcurrent;
	@FindBy(id="form_Id1:j_idt74:totalNoOfYearsInBusiness")
	public static WebElement Employeenum;
	@FindBy(id="form_Id1:j_idt74:businessIncome1")
	public static WebElement Bussiness;
	@FindBy(id="form_Id1:j_idt74:otherIncome")
	public static WebElement otherincome;
	@FindBy(id="form_Id1:j_idt74:source")
	public static WebElement source;
	@FindBy(id="form_Id1:j_idt74:totalIncome")
	public static WebElement totalincome;
	@FindBy(id="form_Id1:j_idt74:yourMonthlyExpenditure")
	public static WebElement monthlyincome;
	@FindBy(id="form_Id1:j_idt74:monthlyInstalment")
	public static WebElement monthlyinstal;
	@FindBy(id="form_Id1:j_idt74:ifProfessional")
	public static WebElement select;
	@FindBy(id="form_Id1:j_idt74:typeOfOrganaization")
	public static WebElement organization;
	@FindBy(id="form_Id1:j_idt74:typeOfBusiness")
	public static WebElement bussdrop;
	@FindBy(id="form_Id1:j_idt74:proofAvailable")
	public static WebElement Available;
	

}
