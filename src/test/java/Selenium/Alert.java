package Selenium;

import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
//     org.openqa.selenium.Alert  al =   driver.switchTo().alert();
//        al.accept();
        driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
     org.openqa.selenium.Alert  a =  driver.switchTo().alert();
     Select s  = new Select(null);
     
     Thread.sleep(2000);
          a.dismiss();
         
          
          
        
        
        
        
        
        
		
				

	}

}
