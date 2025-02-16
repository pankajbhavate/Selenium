package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
	    WebElement day =    driver.findElement(By.cssSelector("[title=\"Day\"]"));
			 WebElement month =    driver.findElement(By.cssSelector("[title=\"Month\"]"));
			   WebElement year = driver.findElement(By.cssSelector("[title=\"Year\"]"));
			   Listbox3.tt(day, "3");
			    Listbox3.tt(year, "2014");
			   Listbox3.tt(month, "Jul");
			   
	}
	public static void tt(WebElement ele,String value) {
		Select s = new Select(ele);
		s.selectByVisibleText(value);
		

	}

}
