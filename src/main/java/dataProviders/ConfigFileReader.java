
package dataProviders;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
 private Properties properties;
 private final String propertyFilePath= "configs//Configuration.properties";
 
 
 public ConfigFileReader(){
 BufferedReader reader;
 try {
 reader = new BufferedReader(new FileReader(propertyFilePath));
 properties = new Properties();
 try {
 properties.load(reader);
 reader.close();
 } catch (IOException e) {
 e.printStackTrace();
 }
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
 } 
 }
 //SE OBTIENE EL NOMBRE DEL DISPOSITIVO
 public String getDeviceName(){
 String deviceName = properties.getProperty("deviceName");
 if(deviceName!= null) return deviceName;
 else throw new RuntimeException("deviceName not specified in the Configuration.properties file."); 
 }
 //SE OBTIENE LA URL
 public String getApplicationUrl() {
 String url = properties.getProperty("url");
 if(url != null) return url;
 else throw new RuntimeException("url not specified in the Configuration.properties file.");
 }
 //SE OBTIENE EL ID DEL DISPOSITIVO
 public String getUdid() {
 String udid = properties.getProperty("udid");
 if(udid != null) return udid;
 else throw new RuntimeException("udid not specified in the Configuration.properties file.");
 }
 //SE OBTIENE EL NOMBRE DE LA PLATAFORMA
 public String getPlatformName() {
 String platformName = properties.getProperty("platformName");
 if(platformName != null) return platformName;
 else throw new RuntimeException("platformName not specified in the Configuration.properties file.");
 }
 //SE OBTIENE LA VERSION DE LA PLATAFORMA
 public String getPlatformVersion() {
	 String platformVersion = properties.getProperty("platformVersion");
	 if(platformVersion != null) return platformVersion;
	 else throw new RuntimeException("platformVersion not specified in the Configuration.properties file.");
	 }
 
 public long getImplicitlyWait() { 
	 String implicitlyWait = properties.getProperty("implicitlyWait");
	 if(implicitlyWait != null) return Long.parseLong(implicitlyWait);
	 else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file."); 
	 }
 
}