package appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobilePlatform;

public class apkfile {
  // WebDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		 UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("realme RMX3231");
	        options.setPlatformName("Android");
	        options.setAutomationName("UiAutomator2");
	        options.setPlatformVersion("11");
	        options.setAppPackage("com.google.android.calculator");
	        options.setAppActivity("com.android.calculator2.Calculator");
         URL u =  new URL(" http://127.0.0.1:4723");
         
         
         AndroidDriver a =  new AndroidDriver(u, options);
          a.findElement(By.id("com.google.android.calculator:id/digit_4")).click();
          a.findElement(By.id("com.google.android.calculator:id/op_add")).click();
          a.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
          a.findElement(By.id("com.google.android.calculator:id/eq")).click();
         // a.findElement(AppiumBy.accessibilityId(null)
	   String m=   a.findElement(By.id("com.google.android.calculator:id/result_preview")).getText();
	   System.out.println(m);
	}
}
