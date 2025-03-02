package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("pankaj");
	   Actions ac =new Actions(driver);
	   ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
      

       // Copy (CTRL + C)
       ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
       
       // TAB press karke password field pe move karein
       ac.sendKeys(Keys.TAB).perform();
      
       // Paste (CTRL + V)
       ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
      
	    		  
		

	}

}
