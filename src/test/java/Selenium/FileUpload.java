package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
	WebElement w =	driver.findElement(By.cssSelector("[type=\"file\"]"));
	  w.sendKeys("C:\\Users\\DELL\\Documents\\email.xlsx");
	  
	//  ‪C:\Users\DELL\Documents\email.xlsx

	}

}
