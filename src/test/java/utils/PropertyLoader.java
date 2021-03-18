package utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyLoader {

    public String loadProperty(String parameter) {
        return System.getProperty(parameter);
    }
    

    public Properties loadProperties(String appium) {
        String filePath = "";

    	if(appium!=null && appium.equals("S")) {
    		filePath=new File("params.properties").getAbsolutePath();
    		//filePath=new File("src\\test\\resources\\params.properties").getAbsolutePath();

    	}else {
    		filePath=new File("src\\test\\resources\\params.properties").getAbsolutePath();
    	}
        Properties props = new Properties();
        File file = new File(filePath);
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
            props.load(fileInput);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInput != null) {
                try {
                    fileInput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return props;
    }

}