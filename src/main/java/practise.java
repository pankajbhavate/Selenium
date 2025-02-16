import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class practise  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[href=\"/r.php?entry_point=login\"]")).click();
		Thread.sleep(2000);
     WebElement day =   driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
          WebElement month =       driver.findElement(By.cssSelector("[id=\"month\"]"));
                WebElement year =          driver.findElement(By.cssSelector("[aria-label=\"Year\"]"));
       
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Select   day1  = new Select(day);
	   List<WebElement>  day2 =    day1.getOptions();
	   for(int d=1;d<day2.size();d++) {
		 String t = day2.get(d).getText();
		 System.out.println(t);
		 
		 
			 day2.get(d).click();
	   }
		  
		 
	   Select month1 =    new Select(month);
	   List<WebElement>  mon =   month1.getOptions();
	       for(int m=1;m<mon.size();m++) {
	    String mo =	   mon.get(m).getText();
	    	    mon.get(m).click();}
	    		   Thread.sleep(2000);
	    	  
	       
	       Select year1 =  new Select(year);
	      List<WebElement>ye =    year1.getOptions();
	          for(int y=1;y<ye.size();y++) {
	           String tt =      ye.get(y).getText();
	                 ye.get(y).click();
		   
		   
	   
	          }}}
		   
		   
	   
	       
