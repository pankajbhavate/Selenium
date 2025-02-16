package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://practice.expandtesting.com/tables#google_vignette");
  int row =  driver.findElements(By.xpath("//table[@id=\"table1\"]//tr")).size();
  int col  = driver.findElements(By.xpath("//table[@id=\"table1\"]//th")).size();
  System.out.println(row);
  for(int r=1;r<=row;r++) {
	  for(int c=1;c<=col;c++) {
		  
		String s =  driver.findElement(By.xpath("//table[@id=\"table1\"]//tbody//tr["+r+"]//td["+c+"]")).getText();
		  System.out.print(s);
		  System.out.print("||");}
	  System.out.println();
	  System.out.println();
	  
		  
	  
  }
	}

}
