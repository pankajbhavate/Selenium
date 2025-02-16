package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();    // https://www.amazon.in/
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
//	WebElement w =	driver.findElement(By.cssSelector("[class=\"hm-icon nav-sprite\"]"));
	
	org.openqa.selenium.interactions.Actions ac  = new org.openqa.selenium.interactions.Actions(driver);
WebElement e =	driver.findElement(By.cssSelector("[type=\"range\"]"));
	  
	 // ac.dragAndDrop(w, w);
	  ac.moveToElement(e, 0, 2);
	 
	//	org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		// ac.moveToElement(w);
		// ac.doubleClick(w);
		// ac.contextClick(w);
	
	
	
	
	}
}
