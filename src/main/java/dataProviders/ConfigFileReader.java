
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
			 }catch (IOException e) {
			 e.printStackTrace();
			 }
		 }catch (FileNotFoundException e) {
			 e.printStackTrace();
			 throw new RuntimeException("No se a encontrado el archivo de configuracion en " + propertyFilePath);
		 } 
 }
 
 //SE OBTIENE EL NOMBRE DEL DISPOSITIVO
 public String getDeviceName(){
	 String deviceName = properties.getProperty("deviceName");
	 if(deviceName!= null) 
		 return deviceName;
	 else 
		 throw new RuntimeException("El nombre del dispositivo no corresponde al especificado en Configuration.properties."); 
 }
 
 //SE OBTIENE LA URL
 public String getApplicationUrl() {
	 String url = properties.getProperty("url");
	 if(url != null) 
		 return url;
	 else 
		 throw new RuntimeException("La url no corresponde a la especificada en Configuration.properties.");
}
 
 //SE OBTIENE EL ID DEL DISPOSITIVO
 public String getUdid() {
	 String udid = properties.getProperty("udid");
	 if(udid != null) 
		 return udid;
	 else 
		 throw new RuntimeException("El udid no corresponde al especificado en Configuration.properties.");
 }
 
 //SE OBTIENE EL NOMBRE DE LA PLATAFORMA
 public String getPlatformName() {
	 String platformName = properties.getProperty("platformName");
	 if(platformName != null) 
		 return platformName;
	 else 
		 throw new RuntimeException("El platformName no corresponde a lo especificado en Configuration.properties.");
 }
 
 //SE OBTIENE LA VERSION DE LA PLATAFORMA
 public String getPlatformVersion() {
	 String platformVersion = properties.getProperty("platformVersion");
	 if(platformVersion != null) 
		 return platformVersion;
	 else 
		 throw new RuntimeException("El platformVersion no corresponde a lo especificado en Configuration.properties.");
	 }
 
 public long getImplicitlyWait() { 
	 String implicitlyWait = properties.getProperty("implicitlyWait");
	 if(implicitlyWait != null) 
		 return Long.parseLong(implicitlyWait);
	 else 
		 throw new RuntimeException("El implicitlyWait no corresponde a lo especificado en Configuration.properties."); 
	 }
 
}