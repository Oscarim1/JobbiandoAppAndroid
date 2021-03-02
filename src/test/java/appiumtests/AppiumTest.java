package appiumtests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumTest {
	
	protected static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		/*try {
		openAppPrestador();
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			}*/
			
	}
	
	public static void openApp() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		cap.setCapability("deviceName", "AOSP on IA Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		
		cap.setCapability("appPackage","com.easyjobprestador");
		cap.setCapability("appActivity","com.easyjobprestador.MainActivity");
		
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");	
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Aplicacion iniciada...");
		
	}
}
