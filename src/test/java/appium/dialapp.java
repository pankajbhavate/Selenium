package appium;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class dialapp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		 UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("realme RMX3231");
	        options.setPlatformName("Android");
	        options.setAutomationName("UiAutomator2");
	        options.setPlatformVersion("11");
	        options.setAppPackage("com.google.android.dialer");
	        options.setAppActivity("com.google.android.dialer.extensions.GoogleDialtactsActivity}");
	        Runtime.getRuntime().exec("adb shell am start -n com.whatsapp/com.whatsapp.HomeActivity");
      URL u =  new URL(" http://127.0.0.1:4723");
      
      
      AndroidDriver a =  new AndroidDriver(u, options);
     
       a.findElement(By.id("com.google.android.dialer:id/dialpad_fab")).click();
       a.findElement(By.id("com.google.android.dialer:id/three")).click();
       a.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.google.android.dialer:id/dialpad_key_number\" and @text=\"7\"]")).click();
       a.findElement(By.id("com.google.android.dialer:id/eight")).click();
	   a.findElement(By.id("com.google.android.dialer:id/dialpad_voice_call_button")).click();
	   
	}

}
