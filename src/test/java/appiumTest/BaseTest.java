package appiumTest;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	static ConfigFileReader configFileReader= new ConfigFileReader();
	
	public String emailPrestador="randomail259@gmailnator.com";
	public String passPrestador="Hola1234";
	public String emailAdmin="camilatoro200@gmail.com";
	public String passAdmin="190858111";
	
	
	
	
	public static void openApp(String rol1,String rol2) throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();

		cap.setCapability("deviceName", configFileReader.getDeviceName());
		cap.setCapability("udid", configFileReader.getUdid());
		cap.setCapability("platformName", configFileReader.getPlatformName());
		cap.setCapability("platformVersion", configFileReader.getPlatformVersion());
		
		cap.setCapability("appPackage",rol1);
		cap.setCapability("appActivity",rol2);
		
		
		URL url=new URL(configFileReader.getApplicationUrl());	
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Aplicacion iniciada...");
		
	}
	
	public static void openNavegator() throws Exception {
		
		DesiredCapabilities cap= new DesiredCapabilities();

		cap.setCapability("deviceName", configFileReader.getDeviceName());
		cap.setCapability("udid", configFileReader.getUdid());
		cap.setCapability("platformName", configFileReader.getPlatformName());
		cap.setCapability("platformVersion", configFileReader.getPlatformVersion());
		
		//cap.setCapability("appPackage","com.android.chrome");
		//cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
		
		
		URL url=new URL(configFileReader.getApplicationUrl());	
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Aplicacion iniciada...");
		
	}
	
	public void funcionScrollUp() throws InterruptedException {
		driver.manage().window().getSize();
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.1);
		int start_y = (int) (dimension.height * 0.4);
		
		int end_x = (int) (dimension.width * 0.1);
		int end_y = (int) (dimension.height * 0.8);
		
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);
	}
	
	public void funcionScrollDown() throws InterruptedException {
		driver.manage().window().getSize();
		Dimension dimension = driver.manage().window().getSize();
		int start_x = (int) (dimension.width * 0.5);
		int start_y = (int) (dimension.height * 0.8);
		
		int end_x = (int) (dimension.width * 0.5);
		int end_y = (int) (dimension.height * 0.6);
		
		TouchAction touch = new TouchAction(driver);
		touch.press(PointOption.point(start_x, start_y))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(end_x, end_y)).release().perform();
		Thread.sleep(3000);
	}
	
	
	
}