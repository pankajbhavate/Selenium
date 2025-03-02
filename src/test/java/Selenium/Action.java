package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(); // https://www.amazon.in/
		driver.manage().window().maximize();
         driver.get("http://uitestingplayground.com/progressbar");
         WebElement w =    driver.findElement(By.cssSelector("[onclick=\"Start()\"]"));
  
         w.click();
         Thread.sleep(2000);
          WebElement d =        driver.findElement(By.cssSelector("[onclick=\"Stop()\"]"));
          d.click();
             Actions a = new Actions(driver);
            a.clickAndHold(w).moveByOffset(0, 200).release().perform();

	}}
         
         