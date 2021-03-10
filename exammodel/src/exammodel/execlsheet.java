package exammodel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class execlsheet {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		Workbook w = Workbook.getWorkbook(new File("D:\\Selenium\\Book1.xls"));
		 Sheet s =w.getSheet(0);
		 for (int i =0; i<3; i++)
		 {
			 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				d.get("http://demo.guru99.com/test/newtours/");
				WebElement user = d.findElement(By.name("userName"));
				WebElement pass = d.findElement(By.name("password"));
				user.sendKeys(s.getCell(0, i).getContents());
				
		 
	
		for (int j= 0 ;j<3;j++)
		{
		pass.sendKeys(s.getCell(1, 0).getContents());
		break;
		}

	}

}
}