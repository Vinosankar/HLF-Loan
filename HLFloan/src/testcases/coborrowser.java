package testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonfun.commonfun;
import pageobject.CoBorrowser;




public class coborrowser extends commonfun {
	
	
	@Test
	
	public void openfunction() throws InterruptedException, AWTException
	{ 
		PageFactory.initElements( driver,CoBorrowser.class);
		CoBorrowser.coborrowser1click.click();
		 WebElement click2 =driver.findElement(By.linkText("eKYC"));
		 click2.click();
		 Thread.sleep(2000);
		 WebElement drop =driver.findElement(By.id("form_Id1:j_idt74:coBorrowerTabview:0:coBorrowerPersonalDetails:idProof"));
			drop.click();
			Thread.sleep(2000);
    WebElement click3 =driver.findElement(By.xpath("//*[@id=\"form_Id1:j_idt74:coBorrowerTabview:0:coBorrowerPersonalDetails:j_idt920\"]/div[1]/span"));
		 click3.click();
		 StringSelection selection = new StringSelection("D:\\2_23_01_2021_12_36_24_F.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 
		 Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	JavascriptExecutor js =(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
		
	
		 
		 
		 
		
				 
				 
		 
			}

}
