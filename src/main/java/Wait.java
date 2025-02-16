import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement w =	driver.findElement(By.cssSelector("[role=\"combobox\"]"));
		//expicitely wait
		WebDriverWait e = new WebDriverWait(driver, Duration.ofSeconds(20));
		
WebElement ss =	e.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[role=\"combobox\"]")));
ss.sendKeys("lll");
	}

}
