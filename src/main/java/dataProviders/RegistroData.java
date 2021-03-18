package dataProviders;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import com.google.common.util.concurrent.Service;
//
public class RegistroData extends SheetsQuickstart{
    
	//REGISTRO PRESTADOR
    public String nombresP = "";
    public String apellidosP = "";
    public String emailP = "";
    public String runP = "";
    public String numSerieP = "";
    public String calleP = "";
    public String ubicacionP = "";
    public String refP = "";
    public String nombreDir = "";
    public String passP = "";
	
  
	public static void main(String... args) throws IOException, GeneralSecurityException {
    	
    	
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        final String spreadsheetId = "1zXWlJbvdTUX82ahfUdTzjh1i-JlXPQua43gyg_5YX7E";
        final String range = "PrestadorData!A2:K";
       
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                .setApplicationName(APPLICATION_NAME)
                .build();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
            System.out.println("No data found.");
        } else {
            System.out.println("Datos obtenidos correctamente :)");
            for (List row : values) {
                
                System.out.printf("%s, %s\n", row.get(0), row.get(4));
            }
        }
    }
}
