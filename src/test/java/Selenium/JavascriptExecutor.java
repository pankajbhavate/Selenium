package Selenium;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
	WebElement w =	  driver.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
	   WebElement e=      driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]"));
	       WebElement r =           driver.findElement(By.cssSelector("[value=\"sign up\"]"));
	 org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='"+"pankaj"+"';", w);
		 Thread.sleep(2000);
		 js.executeScript("arguments[0].value='"+"bhavate"+"';", e);
	
	WebElement wd =	 driver.findElement(By.cssSelector("[class=\"link facebook\"]"));
	    WebElement d=              driver.findElement(By.xpath("//h2[text()=\"Register\"]"));
		js.executeScript("arguments[0].scrollIntoView()",wd); //scrolldown
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",d); //scrollUp
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",wd); //scrolldown
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",d); //scrollUp
		
		

	}

}
