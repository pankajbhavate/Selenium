package Advancexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AndOrxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_buttoon\"or @name=\"login\"]")).click();
          // in this way we are find the xpath locator to use the and or operator 
		// T and T =true;
		// f and t = false;
		// t and f  = false;
		//  f and f  = false ;
		
		//  or operator 
		// t or t  = true;
		// f or t  = true;
		//  t or f  = true;
		//  f or f = false;
		
		
		
		
		
	}

}
