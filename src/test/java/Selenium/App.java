package Selenium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup();

	        // Mobile emulation setup karein
	        Map<String, String> mobileEmulation = new HashMap<>();
	        mobileEmulation.put("deviceName", "Pixel 2");  // ✅ Ye sahi hai

	        // ChromeOptions ke andar mobile emulation set karein
	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("mobileEmulation", mobileEmulation);

	        // Chrome browser ko start karein
	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("//input[@dir=\"auto\"]")).sendKeys("pankaj");
}}