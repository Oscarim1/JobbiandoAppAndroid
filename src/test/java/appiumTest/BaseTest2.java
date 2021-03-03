package appiumTest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class BaseTest2 {
	static AppiumDriver <MobileElement> driver;

	public static void openApp() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		
		cap.setCapability("appPackage","com.easyjobprestador");
        cap.setCapability("appActivity","com.easyjobprestador.MainActivity");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		 
		driver = new AppiumDriver<MobileElement>(url, cap);
		
		
		System.out.println("Aplicacion inciada....");
		
	}

}

