package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	WebElement skill=	driver.findElement(By.cssSelector("[id=\"Skills\"]"));
		Select s = new Select(skill);
		  List<WebElement> w   = s.getOptions();

		       
		      for(int d=0;d<w.size();d++) {
		    	   String t = w.get(d).getText();
		    	   System.out.println(t);
		    	   if(t.equals("Android")) {
		    		  w.get(d).click();
		    	   }
		    		   
		    	   
		      }
		         
	}

}
