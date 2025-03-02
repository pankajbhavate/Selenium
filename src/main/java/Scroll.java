import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); // https://www.amazon.in/
		driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com/");
             Actions a = new Actions(driver);
        WebElement w =     driver.findElement(By.xpath("//h3[text()=\"Contact Info\"]"));
              WebElement e =            driver.findElement(By.cssSelector("[class=\"wpr-feature-list-url\"]"));
             a.scrollToElement(w).perform();
             Thread.sleep(2000);
             a.scrollToElement(e).perform();
          

	}

}
