
package dataProviders;
 
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
 private Properties properties;
 public String propertyFilePath= "src//test//resources//configs//Configuration.properties";
 
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
		 throw new RuntimeException("No se a encontrado el archivo Configuration.properties en " + propertyFilePath);
	 } 
 }
 
 //SE OBTIENE EL NOMBRE DEL DISPOSITIVO
 public String getDeviceName(){
	 String deviceName = properties.getProperty("deviceName");
	 if(deviceName!= null) 
		 return deviceName;
	 else 
		 throw new RuntimeException("deviceName no esta especificado en Configuration.properties."); 
	 }
	 //SE OBTIENE LA URL
	 public String getApplicationUrl() {
	 String url = properties.getProperty("url");
	 if(url != null) 
		 return url;
	 else 
		 throw new RuntimeException("url no esta especificado en Configuration.properties.");
 }
	 
 //SE OBTIENE EL ID DEL DISPOSITIVO
 public String getUdid() {
	 String udid = properties.getProperty("udid");
	 if(udid != null) 
		 return udid;
	 else 
		 throw new RuntimeException("udid no esta especificado en Configuration.properties.");
 }
 
 //SE OBTIENE EL NOMBRE DE LA PLATAFORMA
 public String getPlatformName() {
	 String platformName = properties.getProperty("platformName");
	 if(platformName != null) 
		 return platformName;
	 else 
		 throw new RuntimeException("platformName no esta especificado en Configuration.properties.");
 }
 //SE OBTIENE LA VERSION DE LA PLATAFORMA
 public String getPlatformVersion() {
	 String platformVersion = properties.getProperty("platformVersion");
	 if(platformVersion != null) 
		 return platformVersion;
	 else 
		 throw new RuntimeException("platformVersion no esta especificado en Configuration.properties.");
	 }

 public String getappPackagePrestador() {
	 String appPackagePrestador = properties.getProperty("appPackagePrestador");
	 if(appPackagePrestador != null) 
		 return appPackagePrestador;
	 else 
		 throw new RuntimeException("appPackagePrestador no esta especificado en Configuration.properties.");
	 }
 
 public String getappActivityPrestador() {
	 String appActivityPrestador = properties.getProperty("appActivityPrestador");
	 if(appActivityPrestador != null) 
		 return appActivityPrestador;
	 else 
		 throw new RuntimeException("appPackagePrestador no esta especificado en Configuration.properties.");
	 }
 
 public String getappPackageSolicitante() {
	 String appPackagePrestador = properties.getProperty("appPackagePrestador");
	 if(appPackagePrestador != null) 
		 return appPackagePrestador;
	 else 
		 throw new RuntimeException("appPackagePrestador no esta especificado en Configuration.properties.");
	 }
 
 public String getappActivitySolicitante() {
	 String appActivityPrestador = properties.getProperty("appActivityPrestador");
	 if(appActivityPrestador != null) 
		 return appActivityPrestador;
	 else 
		 throw new RuntimeException("appPackagePrestador no esta especificado en Configuration.properties.");
	 }
 
 public long getImplicitlyWait() { 
	 String implicitlyWait = properties.getProperty("implicitlyWait");
	 if(implicitlyWait != null) 
		 return Long.parseLong(implicitlyWait);
	 else 
		 throw new RuntimeException("implicitlyWait no esta especificado en Configuration.properties."); 
	 }
 
}