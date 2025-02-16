package PageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase {
	static  WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver ;
	   driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Testpage  pp  = new Testpage();
		pp.Testpage(driver);
		 pp.openap();
		 pp.username("dkdk");
		 pp.pass("99999");
		 pp.log();
		 driver.close();
		

	}

}
