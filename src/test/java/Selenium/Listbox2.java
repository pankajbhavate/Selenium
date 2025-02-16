package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement size =	 driver.findElement(By.tagName("select"));
	         Select  ss = new Select(size);
	              List<WebElement> li =   ss.getOptions();
	                 System.out.println(li.size());
	                 for(WebElement w:li) {
	                String m =	 w.getText();
	                System.out.println(m);
	                if(m.equals("Aruba")) {
	                	w.click();
	                }
	                	 
	                 }
	}
	              
	
	
	
	
	
	
	

	

}
