package PageobjectModel;

import org.apache.poi.sl.usermodel.GroupShape;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testpage {
	

	
		// TODO Auto-generated method stub
		
		WebDriver driver;
	private	@FindBy(css = "[name=\"email\"]")
		WebElement username;
		 @FindBy(css = "[name=\"pass\"]")
		WebElement password;
		@FindBy(css = "[name=\"login\"]")
		WebElement login;
		private WebDriver driver2;
		

	public void Testpage(WebDriver driver) {
		  this.driver =  driver;
		  PageFactory.initElements(driver, this);
	}
		
		public  void username(String n) {
			username.sendKeys("pankaj");}
		
		public void pass(String pass) {
			password.sendKeys("99");}
		public void log() {
			login.click();}
		
		public void openap() {
			driver.get("https://www.facebook.com/");}
		
		
		
		
		
			
			
			
		
		
			
			
			
			

	

}
