package datosDePruebas;
import java.sql.ResultSet;

import framework.Frmwrk;


public class DP_Tarjetas{	


		// Datos Gastos
		public String montoPesos; 
		public String montoDolares; 
		public String referencia; 
		public String nombre; 
		public String todos;

	 public void obtenerDatos(String Origen, Integer juegoDatos) throws Exception
		{	
		 // Origen: T = Base de datos. D = Default
		 // Caso: numero de caso de prueba 
		 
		 if (Origen == "D")	 
			 {		 	  
			 switch (juegoDatos) {
	            case 1:    	
	            	montoPesos = "101.50";
	            	montoDolares = "15.50";
	        		nombre = "tarjeta 1";
				  			break;
	            case 2:  	
	            	montoPesos = "201.50";
	            	montoDolares = "11.10";
	        		nombre = "tarjeta 2";
	  						break;
			 }

			 } else if  (Origen == "T")	{
				 

				 String query = "select CAMPO,VALOR from automatic.datos_pruebas where caso_de_prueba='TARJETA' and nro_set=" + juegoDatos;
				 ResultSet datosDB = Frmwrk.consultarBD(query);
								 
				 while (datosDB.next()) {					 
					 if (datosDB.getString("CAMPO").equals("MONTOPESOS"))	 
					 {montoPesos = datosDB.getString("VALOR");} 
					 else if  (datosDB.getString("CAMPO").equals("MONTODOLARES"))	
					 {montoDolares = datosDB.getString("VALOR");}
					 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
					 {nombre = datosDB.getString("VALOR");} 	
				 else if  (datosDB.getString("CAMPO").equals("NOMBRE"))	
				 {nombre = datosDB.getString("VALOR");} }	
				 datosDB.close(); }	 
		 
		 	todos = montoPesos + "_" + montoDolares  + "_" + nombre;
			 }
		 
		 }	
