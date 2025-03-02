package Selenium;

import java.util.logging.Logger;


import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); // https://www.amazon.in/
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
//	WebElement w =	driver.findElement(By.cssSelector("[class=\"hm-icon nav-sprite\"]"));
	
	org.openqa.selenium.interactions.Actions ac  = new org.openqa.selenium.interactions.Actions(driver);
WebElement e =	driver.findElement(By.cssSelector("[type=\"range\"]"));
	org.apache.log4j.Logger lo = org.apache.log4j.Logger.getLogger("log is created");
	      PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\src\\test\\resources\\Config\\log4j.properties");

	  ac.clickAndHold(e).moveByOffset(7,9).release().perform();
	 lo.info("action performed");
	//	org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		// ac.moveToElement(w);
		// ac.doubleClick(w);
	//	 ac.contextClick(e).perform();
	
	 
	
	
	}
}
