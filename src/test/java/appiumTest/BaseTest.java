package appiumTest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	
	public static void openApp() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();
		
		//esto debe ir en un file de configuración
		cap.setCapability("deviceName", configFileReader.getDeviceName());
		cap.setCapability("udid", configFileReader.getUdid());
		cap.setCapability("platformName", configFileReader.getPlatformName());
		cap.setCapability("platformVersion", configFileReader.getPlatformVersion());
		
		cap.setCapability("appPackage","com.easyjobprestador");
		cap.setCapability("appActivity","com.easyjobprestador.MainActivity");
		
		
		URL url=new URL(configFileReader.getApplicationUrl());	
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Aplicacion iniciada...");
		
	}
}