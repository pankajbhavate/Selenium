package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	 List<WebElement> link =   driver.findElements(By.tagName("a"));
	       int brokelink=0;
	       
	       for(WebElement ll :link) {
	    	  String atr =   ll.getAttribute("a");
	       
	       if(atr==null) {
	    	   System.out.println("is empty link");}
	     URL  uu  = new URL(atr);
	      HttpURLConnection  hh =  (HttpURLConnection)  uu.openConnection();
	       if(hh.getResponseCode()>=400) {
	    	   System.out.println(hh.getResponseCode()+" "+atr+"is broke link");
	    	   brokelink++;
	       }
	    	   else {
	    		   System.out.println(hh.getResponseCode()+" "+atr+"is valid link");
	    	   }}
	       System.out.println(brokelink);
	    	   
	    	   
	       
	       
	       
	       
	       
	    
		    
	       }
		    
		
		
	       }
	       
	


