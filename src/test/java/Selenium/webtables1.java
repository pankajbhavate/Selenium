package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
	List<WebElement> row =	driver.findElements(By.xpath("//table[@id=\"customers\"]//tr"));
	     List<WebElement>data =   driver.findElements(By.xpath("//table[@id=\"customers\"]//tr//th"));
	     System.out.println(data);
	   
	   for(int r=2;r<=row.size();r++) {
		    for(int d=1;d<=data.size();d++) {
		String m =   driver.findElement(By.xpath("//table[@id=\"customers\"]//tr["+r+"]//td["+d+"]")).getText();
		    	
		    	System.out.print(m);
		    	System.out.print("||");}
		    System.out.println();
		    	
		    	
		    	
		    
		   
	   }
	}

}
