package appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Scroll {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		 UiAutomator2Options options = new UiAutomator2Options();
	        options.setDeviceName("realme RMX3231");
	        options.setPlatformName("Android");
	        options.setAutomationName("UiAutomator2");
	        options.setPlatformVersion("11");
	        options.setAppPackage("com.google.android.apps.classroom");
	        options.setAppActivity("com.google.android.apps.classroom.classroomflutter.MainActivity");
	       // Runtime.getRuntime().exec("adb shell am start -n com.whatsapp/com.whatsapp.HomeActivity");
   URL u =  new URL(" http://127.0.0.1:4723");
   
   
   AndroidDriver driver =  new AndroidDriver(u, options);
          driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"DS (21-22)\r\n"
          		+ "Second year A+B\"]")).click();          
	}

}
