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

public class readexcel {

	public static void main(String[] args) throws BiffException, IOException {
		Workbook w = Workbook.getWorkbook(new File("D:\\Selenium\\excelbook.xls"));
		 Sheet  s =w.getSheet(0);
		 for(int i=0;i<3;i++) {
			 System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe" );
			 WebDriver driver= new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 WebElement fun1=driver.findElement(By.id("email"));
			 WebElement fun2 =driver.findElement(By.id("pass"));
			 fun1.sendKeys(s.getCell(0, i).getContents());
			 for (int j=i;j<3;j++)
			 {
				 System.out.println(s.getCell(1, j).getContents());
				 fun2.sendKeys(s.getCell(1, j).getContents());
				 break;
			 }
			 
		 }
		

	}

}
