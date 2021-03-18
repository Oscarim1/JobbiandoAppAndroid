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
    public static String runSolicitanteNuevo = "";
    public static String numSerieSolicitante = "";
    public static String calleSolicitante = "";  
    public static String ubicacionSolicitante = "";
    public static String nombreDirSolicitante = "";
    public static String refSolicitante = "";
    public static String estado="";
 
    
    
	public static void datosPrestadores(String... args) throws IOException, GeneralSecurityException {
		Integer n=2;
		Integer m=2;
		Integer a=null;
		
	while(a==null){	
		
		final String range = "PrestadorData!A"+n+":L"+m+"";
    	final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
    	Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();
       
        
        List<List<Object>> values = response.getValues();
        if(values == null || values.isEmpty()) {
        	System.out.println("No hay datos existentes!");
    	 }
        else {
      	        List<Object> validarUso = values.get(0); 
              	estado=(String) validarUso.get(0);
            
              	 if(estado.matches("USADO")) {
              		 
     	        	n++;
     	        	m++;
     	        	 System.out.println("No hay datos disponibles.Buscando el la fila "+n+"...");
     	        	
     	        }else {
     	        	a=1;
     	        	
     	        	System.out.println("*Datos en la fila "+n+" sin uso previo.");
     	        	System.out.println("*Datos obtenidos.");
    				System.out.printf("*Estado modificado.");
     	        		 for (int i = 1; i < values.size(); i++) {
     		            	 List<Object> row = values.get(i);
     		            	 nombresPrestador=(String) row.get(1);       	 
     		            	 apellidosPrestador=(String) row.get(2);
     		            	 emailPrestador=(String) row.get(4);
     		            	 passPrestador=(String) row.get(5);
     		            	 runPrestador=(String) row.get(6);
     		            	 runPrestadorNuevo=runPrestador.replace("-","");
     		            	 numSeriePrestador=(String) row.get(7);
     		            	 callePrestador=(String) row.get(8);
     		            	 ubicacionPrestador=(String) row.get(9);
     		            	 nombreDirPrestador=(String) row.get(10);
     		            	 refPrestador=(String) row.get(11);
     		            	
     		            	
     	        }
     	    }
          updateValues(service,range);
        }
	}           
}
    	
	 
	   
public static void datosSolicitantes(String... args) throws IOException, GeneralSecurityException {
	    	
	    	
			Integer n=2;
			Integer m=2;
			Integer a=null;
			
		while(a==null){	
			
			final String range = "SolicitanteData!A"+n+":L"+m+"";
	    	final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
	    	Sheets service = new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT)).setApplicationName(APPLICATION_NAME).build();
	        ValueRange response = service.spreadsheets().values().get(SPREEDSHEET_ID, range).execute();
	       
	        
	        List<List<Object>> values = response.getValues();
	        if(values == null || values.isEmpty()) {
	      
        	 }
	        else {
	      	        List<Object> validarUso = values.get(0); 
	              	estado=(String) validarUso.get(0);
	            
	              	 if(estado.matches("USADO")) {
	              		 
	     	        	n++;
	     	        	m++;
	     	        	 System.out.println("No hay datos disponibles.Buscando en la fila "+n+"...");
	     	        	
	     	        }else {
	     	        	a=1;
	     	        	
	     	        	System.out.println("Datos en la fila "+n+" sin uso previo, obteniendo... ");
	     	        	System.out.println("Datos obtenidos correctamente.");
	    				System.out.printf("Estado modificado correctamente.");
	     	        		 for (int i = 1; i < values.size(); i++) {
	     		            	 List<Object> row = values.get(i);
	     		            	 nombresSolicitante=(String) row.get(1);       	 
	     		            	 apellidosSolicitante=(String) row.get(2);
	     		            	 emailSolicitante=(String) row.get(4);
	     		            	 passSolicitante=(String) row.get(5);
	     		            	 runSolicitante=(String) row.get(6);
	     		            	 runSolicitanteNuevo=runSolicitante.replace("-","");
	     		            	 numSerieSolicitante=(String) row.get(7);
	     		            	 calleSolicitante=(String) row.get(8);
	     		            	 ubicacionSolicitante=(String) row.get(9);
	     		            	 nombreDirSolicitante=(String) row.get(10);
	     		            	 refSolicitante=(String) row.get(11);   		            	
	     	         }  		
	     	    }
	        }
	      updateValues(service,range);
	    }
	}    	
}
		         
	
		
		
		
		

		
		

	           

