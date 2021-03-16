package dataProviders;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.common.util.concurrent.Service;

public class RegistroData extends SheetsQuickstart {
    
	//REGISTRO PRESTADOR
    public static String nombresP = "";
    public static String apellidosP = "";
    public static String emailP = "";
    public static String passP = "";
    public static String runP = "";
    public static String numSerieP = "";
    public static String calleP = "";  
    public static String ubicacionP = "";
    public static String nombreDir = "";
    public static String refP = "";
    
	public static void main(String... args) throws IOException, GeneralSecurityException {
    	
    	
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
       // final String spreadsheetId = "1zXWlJbvdTUX82ahfUdTzjh1i-JlXPQua43gyg_5YX7E";
        final String range = "PrestadorData!A2:K2";
       
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(SPREEDSHEET_ID, range)
                .execute();
        
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Datos obtenidos correctamente :)");
            for (int i = 0; i < values.size(); i++) {
				List<Object> row = values.get(i);
				nombresP=(String) row.get(0);
				apellidosP=(String) row.get(1);
				emailP=(String) row.get(2);
				passP=(String) row.get(3);
				runP=(String) row.get(4);
				numSerieP=(String) row.get(5);
			    calleP=(String) row.get(6);
			    ubicacionP=(String) row.get(7);
			    nombreDir=(String) row.get(8);
			    refP=(String) row.get(9);
			    
			    System.out.println(nombresP);
			    System.out.println(apellidosP);
			    System.out.println(emailP);
			    System.out.println(passP);
			    System.out.println(runP);
			    System.out.println(numSerieP);
			    System.out.println(calleP);
			    System.out.println(ubicacionP);
			    System.out.println(nombreDir);
			    System.out.println(refP);
			    
			}
        }
    }
}
