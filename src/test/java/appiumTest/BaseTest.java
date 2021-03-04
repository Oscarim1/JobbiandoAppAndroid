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