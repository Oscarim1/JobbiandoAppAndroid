package dataProviders;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;


public class RegistroData extends SheetsQuickstart {
    
	//REGISTRO PRESTADOR
    public static String nombresPrestador = "";
    public static String apellidosPrestador = "";
    public static String emailPrestador = "";
    public static String passPrestador = "";
    public static String runPrestador = "";
    public static String numSeriePrestador = "";
    public static String callePrestador = "";  
    public static String ubicacionPrestador = "";
    public static String nombreDirPrestador = "";
    public static String refPrestador = "";
    
    //REGISTRO SOLICITANTE
    public static String nombresSolicitante = "";
    public static String apellidosSolicitante = "";
    public static String emailSolicitante = "";
    public static String passSolicitante = "";
    public static String runSolicitante = "";
    public static String numSerieSolicitante = "";
    public static String calleSolicitante = "";  
    public static String ubicacionSolicitante = "";
    public static String nombreDirSolicitante = "";
    public static String refSolicitante = "";
    
	public static void dataRegistroPrestador(String... args) throws IOException, GeneralSecurityException {
    	
    	
        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
        
        final String range = "PrestadorData!A2:K2";
       
        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();
        
        List<List<Object>> values = response.getValues();
        if (values == null || values.isEmpty()) {
        	
            System.out.println("No se han encontrado datos...");
        } else {
        	
            System.out.println("Datos obtenidos correctamente =)");
            for (int i = 0; i < values.size(); i++) {
				List<Object> row = values.get(i);
				nombresPrestador=(String) row.get(0);
				apellidosPrestador=(String) row.get(1);
				emailPrestador=(String) row.get(2);
				passPrestador=(String) row.get(3);
				runPrestador=(String) row.get(4);
				numSeriePrestador=(String) row.get(5);
			    callePrestador=(String) row.get(6);
			    ubicacionPrestador=(String) row.get(7);
			    nombreDirPrestador=(String) row.get(8);
			    refPrestador=(String) row.get(9);
   
			}
        }
    }
	 
	   
		public static void dataRegistroSolicitante(String... args) throws IOException, GeneralSecurityException {
	    	
	    	
	        final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
	        
	        final String range = "PrestadorData!A2:K2";
	       
	        Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
	        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();
	        
	        List<List<Object>> values = response.getValues();
	        if (values == null || values.isEmpty()) {
	        	
	            System.out.println("No se han encontrado datos...");
	        } else {
	        	
	            System.out.println("Datos obtenidos correctamente =)");
	            for (int i = 0; i < values.size(); i++) {
					List<Object> row = values.get(i);
					nombresSolicitante=(String) row.get(0);
					apellidosSolicitante=(String) row.get(1);
					emailSolicitante=(String) row.get(2);
					passSolicitante=(String) row.get(3);
					runSolicitante=(String) row.get(4);
					numSerieSolicitante=(String) row.get(5);
				    calleSolicitante=(String) row.get(6);
				    ubicacionSolicitante=(String) row.get(7);
				    nombreDirSolicitante=(String) row.get(8);
				    refPrestador=(String) row.get(9);
	   
				}
	        }
	    }
}
