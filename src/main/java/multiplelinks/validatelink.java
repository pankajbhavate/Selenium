package multiplelinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.net.Urls;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validatelink {

	private static final HttpURLConnection HttpURLConnection = null;

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
    WebDriverManager.chromedriver().setup();
         WebDriver driver  = new ChromeDriver();
         
         driver.manage().window().maximize();
         driver.get("https://demo.automationtesting.in/Register.html");
         
      List<WebElement> link =   driver.findElements(By.tagName("a"));
      int brokenlink = 0;
      for(WebElement el : link) {
    	  String url =     el.getAttribute("href");
    	  if(url==null) {
    		  System.out.println("url is empty");}
              URL  uu  = new URL(url);
              HttpURLConnection httpcode =    (HttpURLConnection) uu.openConnection();
              httpcode.connect();
              if(httpcode.getResponseCode()>=400) {
            	  System.out.println(httpcode.getResponseCode()+" "+url+"is broken link");
            	  brokenlink++;
              
            	 
              }
              else {
            	  System.out.println(httpcode.getResponseCode()+" "+url+"is valid link");
            	  
              }
    	  }
              System.out.println(brokenlink);
              driver.close();
	          
            	  
            	  
            	  
            	  
              }
              
         
            	  
            	   
            	  
            	  
            	  
            	  
            	  
              }
            		  
            		 
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      
    
	


