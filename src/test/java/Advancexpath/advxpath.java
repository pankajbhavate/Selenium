package Advancexpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class advxpath {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=728858856234&hvpos=&hvnetw=g&hvrand=2533921751346032329&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9183000&hvtargid=kwd-64107830&hydadcr=14452_2409549&gad_source=1");
         // driver.findElement(By.xpath("//img[@class=\"product-image\"]//ancestor::span")).click();
          driver.findElement(By.xpath("//img[@class=\"product-image\"]")).click();
	}

}
