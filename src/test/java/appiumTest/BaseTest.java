package appiumTest;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import dataProviders.ConfigFileReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import utils.PropertyLoader;

public class BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	
	public static AppiumDriverLocalService service;
    //public static AndroidDriver<WebElement> driver;
	
	public String emailPrestador="randomail259@gmailnator.com";
	public String passPrestador="Hola1234";
	public static String appiumON = System.getProperty("appium");
	public String device = System.getProperty("device");
	public PropertyLoader loadproperty = new PropertyLoader();
	
	
	//HARDCODE VALUES
	public String emailAdmin="camilatoro200@gmail.com";
	public String passAdmin="190858111";
	public String precio = "10000";
	public String emailPrestador52="randomail52@gmailnator.com";
	public String emailSolicitante="randomail13@gmailnator.com";
	public String passSolicitante="Hola1234";
	
	public void openApp(String rol1,String rol2) throws Exception {
		 
	        // Recuperaci?n del fichero de propiedades de la ruta y nombre de la aplicaci?n m?vil
	        String ipApp=loadproperty.loadProperties(appiumON).getProperty("AppiumServerIP");

	        // Generaci?n de las capabilites a nivel del servicio de Appium
	        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

	        // Generaci?n de las capabilites a nivel de driver
	        DesiredCapabilities clientCapabilities = new DesiredCapabilities();
	        clientCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        clientCapabilities.setCapability(MobileCapabilityType.UDID, device);
	        clientCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	        clientCapabilities.setCapability("appPackage",rol1);
	        clientCapabilities.setCapability("appActivity",rol2);

	        try {
	            if (appiumON!=null && appiumON.equals("S")) {
	                URL url_appium = new URL("http://" + loadproperty.loadProperties(appiumON).getProperty("AppiumServerIP") + ":" +
	                        loadproperty.loadProperties(appiumON).getProperty("AppiumServerPort") + "/wd/hub");
	                driver = new AndroidDriver(url_appium, clientCapabilities);
	            } else {
	            	ConfigFileReader configFileReader= new ConfigFileReader(appiumON);

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
	        } catch (Exception e) {
	            throw new Exception ("Error connecting to Appium service : " + e.getMessage());
	        }
		
	}

	public void openNavegator() throws Exception {
		
		try {
			
			String ipApp=loadproperty.loadProperties(appiumON).getProperty("AppiumServerIP");

	        // Generaci?n de las capabilites a nivel del servicio de Appium
	        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

	        // Generaci?n de las capabilites a nivel de driver
	        DesiredCapabilities clientCapabilities = new DesiredCapabilities();
	        clientCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        clientCapabilities.setCapability(MobileCapabilityType.UDID, device);
	        clientCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	        clientCapabilities.setCapability("appPackage","com.android.chrome");
	        clientCapabilities.setCapability("appActivity","com.google.android.apps.chrome.Main");
	        
	        
			if (appiumON!=null && appiumON.equals("S")) {
                URL url_appium = new URL("http://" + loadproperty.loadProperties(appiumON).getProperty("AppiumServerIP") + ":" +
                        loadproperty.loadProperties(appiumON).getProperty("AppiumServerPort") + "/wd/hub");
                driver = new AndroidDriver(url_appium, clientCapabilities);
            } else {
            	ConfigFileReader configFileReader= new ConfigFileReader(appiumON);

        		DesiredCapabilities cap= new DesiredCapabilities();

        		cap.setCapability("deviceName", configFileReader.getDeviceName());
        		cap.setCapability("udid", configFileReader.getUdid());
        		cap.setCapability("platformName", configFileReader.getPlatformName());
        		cap.setCapability("platformVersion", configFileReader.getPlatformVersion());
        		
        		cap.setCapability("appPackage","com.android.chrome");
        		cap.setCapability("appActivity","com.google.android.apps.chrome.Main");
        		
        		
        		URL url=new URL(configFileReader.getApplicationUrl());	
        		driver = new AppiumDriver<MobileElement>(url,cap);
        		System.out.println("Aplicacion iniciada...");
            	
            }
		}catch(Exception e) {
			
		}
		
	}
	
	 public void tearDown() {
	        if(driver != null) {
	            driver.quit();
	        }
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
		
		public void funcionScrollDown(Double height_start,Double height_end ) throws InterruptedException {
			driver.manage().window().getSize();
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int) (dimension.width * 0.5);
			int start_y = (int) (dimension.height * height_start);
			
			int end_x = (int) (dimension.width * 0.5);
			int end_y = (int) (dimension.height * height_end);
			
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);
		}
		
		public void funcionScrollHorizontal(Double height_start,Double height_end ) throws InterruptedException {
			driver.manage().window().getSize();
			Dimension dimension = driver.manage().window().getSize();
			int start_x = (int) (dimension.width * height_start);
			int start_y = (int) (dimension.height * 0.5);
			
			int end_x = (int) (dimension.width * height_end);
			int end_y = (int) (dimension.height * 0.5);
			
			TouchAction touch = new TouchAction(driver);
			touch.press(PointOption.point(start_x, start_y))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
			.moveTo(PointOption.point(end_x, end_y)).release().perform();
			Thread.sleep(3000);
		}
		
		 public MobileElement elementExist(String xpath)
	     {
	         try
	         {
	             return driver.findElementByXPath(xpath);
	         }
	         catch (Exception e)
	         {
	             return null;
	         }

	     }
		 
		 public MobileElement exist(By element)
	     {
	         try
	         {
	             return driver.findElement(element);
	         }
	         catch (Exception e)
	         {
	             return null;
	         }

	     }
		 
		 public String elementExistSolicitud(Integer n)
	     {
	         try
	         {	By elemento=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup["+n+"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]");
	         String catServicio= driver.findElement(elemento).getAttribute("text");
	             return catServicio;
	             
	         }
	         catch (Exception e)
	         {
	             return null;
	         }

	     }	
	
	
	
	
	
	
}