package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFramework {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	FileInputStream ff = new FileInputStream("C:\\Users\\DELL\\Documents\\data.xlsx");
	   Workbook w =   WorkbookFactory.create(ff);
	    org.apache.poi.ss.usermodel.Sheet s =      w.getSheet("Sheet1");
	         String m =     s.getRow(1).getCell(0).getStringCellValue();
	            String f =       s.getRow(1).getCell(1).getStringCellValue();
	           
	          
			driver.findElement(By.id("email")).sendKeys(m);
			driver.findElement(By.id("pass")).sendKeys(f);
	}
	
	//‪C:\Users\DELL\Documents\data.xlsx

	}


