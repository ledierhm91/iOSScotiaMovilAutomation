/*
 * Classname: Suite  
 * Version information: 1.0
 * Date: September 17 2018 
 * Copyright notice
 */

package suites;

import static org.junit.Assert.*;
import org.junit.Test;

import framework.Config;
import framework.Frmwrk;


public class IOSSuitePrincipalHUMO{	
		
	@Test
	public void execute() throws Exception
	{try
		{
			IOSSuiteModular suite = new IOSSuiteModular();
			
			Config.iniciar("4723","7272f0ad39f74cebb13826be404dbeac20a5bf7d");
			
			Frmwrk.conectarBD();			
		    Frmwrk.iniReportes();
			
		 	 	suite.modInicio(); //Incluye Splash screen y Tutorial		
		 	 	
		 	 	//------------------
		 	 	// DEMO
		  	    suite.modLogIn("D", 1);	
		  	    suite.modOpcionesMenu(); // falta cotizacion
		   		//suite.modSolChequera(); //quedo bien
		  	    suite.modTransferInterna("UYU"); 
		    	suite.modLogOut(); 
		    	
		    	//-----------------------
		 	 	
		 	 	//suite.modLogIn("D", 1);	
		 		//suite.modPagoTarjetaTercero();
		   		//suite.modSolChequera();
		   		/*suite.modTransferPlaza();
		  	 	suite.modTransferInterna("UYU"); 
		    	suite.modTransferInterna("USD"); 
		    	suite.modTransferInternaExtras();	
		    */
		    	//suite.modLogOut();  
		 	 	
//		 	 	suite.modLogIn("D", 3);
//		   	    suite.modPlazoFijo();			
//				suite.modLogOut(); 
				
		/*		suite.modLogIn("D", 8);
				suite.modPagoTarjeta();				
				suite.modLogOut(); 
				
				
				
				//ejecutar solamente una vez por mes ya que no permite adelantar cuotas
		/*		suite.modLogIn("D", 5);
		    	suite.modPrestamos();
		    	suite.modLogOut();		*/
		    				  	
			  	//---Transferencias con firmantes
		/*		suite.modLogIn("D", 6);
		  	    suite.modTransferFirmas(0);
		    	suite.modLogOut(); 
		    	suite.modLogIn("D", 7);
		  	    suite.modTransferFirmas(1);
		    	suite.modLogOut();   
		    	//-------------------------------
		    	*/
		  		
		    	
		    	//------------FASE 2-------------
		    	
       	  //		suite.modFase2();
		    	
		    	/////////////////////////////////////////////////////////
		   
			//----------------------------------------------------------	
			Frmwrk.generarReportesResultado();
			Config.terminarSesion();
			Frmwrk.cerrarConexionBD();
			}		
	catch(Exception ex) 	
	{	Config.terminarSesion();
	  //  Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
	}
	