package dataProviders;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.AppendValuesResponse;
import com.google.api.services.sheets.v4.model.ClearValuesRequest;
import com.google.api.services.sheets.v4.model.ClearValuesResponse;
import com.google.api.services.sheets.v4.model.UpdateValuesResponse;
import com.google.api.services.sheets.v4.model.ValueRange;


public class RegistroData extends SheetsQuickstart {
    
	//REGISTRO PRESTADOR
    public static String nombresPrestador = "";
    public static String apellidosPrestador = "";
    public static String emailPrestador = "";
    public static String passPrestador = "";
    public static String runPrestador = "";
    public static String runPrestadorNuevo = "";
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
		Integer n=2;
		Integer m=2;
		Integer a=null;
		
	while(a==null){	
		
		final String range = "PrestadorData!A"+n+":K"+m+"";
    	final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
    	Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();
      
        
        List<List<Object>> values = response.getValues();
       
        if(values == null || values.isEmpty()) {
        	n++;
        	m++;
        	 System.out.println("No hay datos en la fila "+n+" =(");
        }else {
        	a=1;
        	System.out.println(n);
        	System.out.println(m);
        	 System.out.println("Datos obtenidos correctamente =)");
             for (int i = 0; i < values.size(); i++) {
 				List<Object> row = values.get(i);
 				nombresPrestador=(String) row.get(0);
 				apellidosPrestador=(String) row.get(1);
 				emailPrestador=(String) row.get(3);
 				passPrestador=(String) row.get(4);
 				runPrestador=(String) row.get(5);
 				runPrestadorNuevo=runPrestador.replace("-","");
 				numSeriePrestador=(String) row.get(6);
 			    callePrestador=(String) row.get(7);
 			    ubicacionPrestador=(String) row.get(8);
 			    nombreDirPrestador=(String) row.get(9);
 			    refPrestador=(String) row.get(10);
 			    
 			   ClearValuesRequest requestBody = new ClearValuesRequest();
 			   Sheets sheetsService = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
 			   Sheets.Spreadsheets.Values.Clear request =
 					  sheetsService.spreadsheets().values().clear(SPREEDSHEET_ID, range, requestBody);
 			   ClearValuesResponse response1 = request.execute();
 			   System.out.println(response1);
 			    
 				}
        	}
		}           
	}
    	
	 
	   
		public static void dataRegistroSolicitante(String... args) throws IOException, GeneralSecurityException {
	    	
	    	
			Integer n=2;
			Integer m=2;
			Integer a=null;
			String valueInputOption="RAW";
		while(a==null){	
			
			final String range = "SolicitanteData!A"+n+":K"+m+"";
	    	final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
	    	Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
	        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();

	        
	        List<List<Object>> values = response.getValues();
	        
	        if(values == null || values.isEmpty()) {
	        	n++;
	        	m++;
	        	 System.out.println("No hay datos en la fila "+n+" =(");
	        }else {
	        	a=1;
	        	System.out.println(n);
	        	System.out.println(m);
	        	System.out.println("Datos obtenidos correctamente =)");
	             for (int i = 0; i < values.size(); i++) {
	            	 List<Object> row = values.get(i);
	            	 nombresSolicitante=(String) row.get(0);       	 
	            	 apellidosSolicitante=(String) row.get(1);
	            	 emailSolicitante=(String) row.get(3);
	            	 passSolicitante=(String) row.get(4);
	            	 runSolicitante=(String) row.get(5);
	            	 numSerieSolicitante=(String) row.get(6);
	            	 calleSolicitante=(String) row.get(7);
	            	 ubicacionSolicitante=(String) row.get(8);
	            	 nombreDirSolicitante=(String) row.get(9);
	            	 refPrestador=(String) row.get(10);
	            	 
	            	 
	            	 List<List<Object>> valuesCrear = Arrays.asList(
	            		        Arrays.asList(
	            		        		
	            		        )
);
	            		ValueRange body = new ValueRange()
	            		        .setValues(valuesCrear);
	            		UpdateValuesResponse result =
	            		        service.spreadsheets().values().update(SPREEDSHEET_ID, range, body)
	            		                .setValueInputOption(valueInputOption)
	            		                .execute();
	            		System.out.printf("%d cells updated.", result.getUpdatedCells());
	            	 
	            		
	            		
	            	 ClearValuesRequest requestBody = new ClearValuesRequest();
	            	 Sheets sheetsService = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
	            	 Sheets.Spreadsheets.Values.Clear request =
	            	 sheetsService.spreadsheets().values().clear(SPREEDSHEET_ID, range, requestBody);
	            	 ClearValuesResponse response1 = request.execute();
	            	 System.out.println(response1);
	            	
	 			}
	           
	            	 
	        }
		}         
	
		
		}
		
}
		
		

	           

