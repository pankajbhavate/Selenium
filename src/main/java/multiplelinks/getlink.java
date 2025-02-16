package multiplelinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
      List<WebElement> link =   driver.findElements(By.tagName("a"));
      
      System.out.println(link.size());
      for(WebElement w : link) {
    	  System.out.println(w.getText());
    	  System.out.println(w.getAttribute("href"));
      }
      
	}

}
