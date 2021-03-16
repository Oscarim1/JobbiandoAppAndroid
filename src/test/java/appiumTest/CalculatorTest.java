package appiumTest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {

	static AppiumDriver <MobileElement> driver;

	
	
	public static void main(String[] args) {
		
		try{
			openCalculator();
			
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	public static void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 
		
		
		System.out.println("Aplicacion inciada....");
		
	}

}

