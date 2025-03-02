package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		 WebElement a=   driver.findElement(By.id("angular"));
		   WebElement b =        driver.findElement(By.cssSelector("[class=\"dragged\"]"));
		  Actions ac = new Actions(driver);
		  ac.dragAndDrop(a, b).perform();
		

	}

}
