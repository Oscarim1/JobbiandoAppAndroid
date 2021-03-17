package dataProviders;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;

public class SheetsReadNWrite extends RegistroData {
	static String SPREEDSHEET_ID = "1zXWlJbvdTUX82ahfUdTzjh1i-JlXPQua43gyg_5YX7E";
	public static void CrearData(String... args) throws IOException, GeneralSecurityException {
	
	}
	@SuppressWarnings("unused")
	public static void TraspasarDatos(String[] args) throws IOException, GeneralSecurityException {
		  @SuppressWarnings("unchecked")
		  final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
			Sheets sheetsService = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
			
		  
		
}
}	  

