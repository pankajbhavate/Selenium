package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.orangehrm.com/");
 //WebElement  m = driver.findElement(By.cssSelector("[align=\"center\"]"));
 String m = "orange";
 
         File f =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         File  dest = new File("C:\\Users\\DELL\\Pictures\\Saved Pictures\\"+m+".jpg");
         String s ="C:\\Users\\DELL\\Pictures\\Saved Picture";
     
        		 FileUtils.copyFile(f, dest);
         
         
        		// C:\Users\DELL\Pictures
         
        		// C:\Users\DELL\Pictures
         
	}

}
