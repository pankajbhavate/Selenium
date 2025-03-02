package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {
     static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>m =  driver.getWindowHandles();
		Iterator<String> f =   m.iterator();
		         String pa =    f.next();
		         System.out.println(pa);
		         String ch =  f.next();
		         driver.switchTo().window(ch);
		         driver.findElement(By.id("alertBox")).click();
		      org.openqa.selenium.Alert a =   driver.switchTo().alert();
		    System.out.println(a.getText()); a.getText();
		    
		   
	}

}
