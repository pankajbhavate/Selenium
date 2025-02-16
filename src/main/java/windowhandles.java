import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("[href=\"http://www.orangehrm.com\"]")).click();
		Set<String> m = 	driver.getWindowHandles();
        Iterator<String> c = m.iterator();
                    String pa = c.next();
                    String ch = c.next();
                    driver.switchTo().window(ch);
	
	              
		driver.findElement(By.name("EmailHomePage")).sendKeys("papapapa");

	}

}
