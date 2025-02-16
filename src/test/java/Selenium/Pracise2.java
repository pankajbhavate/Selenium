package Selenium;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pracise2 {
	static Logger log ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              WebDriverManager.chromedriver().setup();
              WebDriver driver  = new ChromeDriver();
         driver.get("https://vinothqaacademy.com/webtable/");
         log=Logger.getLogger("start case");
         PropertyConfigurator.configure("C:\\Users\\DELL\\eclipse-workspace\\Selenium1\\src\\test\\resources\\Config\\log4j.properties");
         log.info("start the fetching test data from the web page and read the data");
         
       int row =  driver.findElements(By.xpath("//table[@id=\"myTable\"]//tr")).size();
    int col =   driver.findElements(By.xpath("//table[@id=\"myTable\"]//tr//th")).size();
    for(int r=1;r<row;r++) {
    	log.info("initalize the row");
    	
    	for(int c=1;c<=col;c++) {
    		log.info("initalize the col");
    		WebElement m =  driver.findElement(By.xpath("//table[@id=\"myTable\"]//tbody//tr["+r+"]//td["+c+"]"));
    		System.out.print(m.getText()+"||");
    	}
    	System.out.println();
    		
    	}
	}}
    
    	
    