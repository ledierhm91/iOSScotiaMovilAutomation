package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UI_Login {
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	
	public void obtenerVersion () throws Exception
	{ 
	// MobileElement version = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]"));
	MobileElement version = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]"));
 	 Frmwrk.versionApp= version.getText(); 
 	 
 	
	}
	
	
	
	public void tutorial() throws Exception
	{
		Config.esperar("//XCUIElementTypeButton[@name=\"Saltar Presentación\"]");
		
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 1");
		
		c.swipeHRL();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 2");
		
		c.swipeHRL();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 3");	
    		
		MobileElement btn_tour = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Ingresar\"]"));
		btn_tour.click();
		
		Frmwrk.ini=true;
	}	
	
	 	
	public void InLoginP1 (String user, String pinn) throws Exception
	{		
	Frmwrk.logEvidencia(Config.globalCP, "Version");
	
	obtenerVersion ();
	
	Config.esperar("//XCUIElementTypeButton[@name=\"Continuar\"]");
	
	MobileElement usuario = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
		
    usuario.click();
    usuario.clear();
    usuario.setValue(user);    
        
    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
    Config.globalPin=pinn;
    pin.clear();
    pin.setValue(Config.globalPin);
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    
    MobileElement continuar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Continuar\"]"));
    continuar.click();    	
	}	
	
	public void InLoginP2 (String password) throws Exception
	{
		
	MobileElement pass = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
    pass.click();
    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Password ingresado");      
    
    /*
    Config.driver.context("NATIVE_APP"); // switch to non-instrumented context
    Config.driver.findElement(signUp.done).click();
    Config.driver.context("NATIVE_APP_INSTRUMENTED"); // back to instrumented context*/
    
    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
    done.click();  
	
    
    
    MobileElement ingresar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Ingresar\"]"));
    ingresar.click();    
    
    
    //clickeamos en el boton cancelar del mensaje que nos informa sobre la huella
    
  //  if( Config.driver.getCapabilities().getCapability("udid") == null)
 	//String celular=(String) Config.driver.getCapabilities().getCapability("udid");
    
   // 	System.out.println (Frmwrk.first);  
  //  	System.out.println ("escribeeeee");
    //	if (Frmwrk.first==false)
    	
   /*
    
    { Frmwrk.logEvidencia(Config.globalCP, "Mensaje huella");  
    	Config.esperar("//XCUIElementTypeButton[@name=\"Cancelar\"]");    
    	MobileElement cancelar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
    	cancelar.click();}
    	 Frmwrk.first=true;
    	 
    	 */
    	 
 //   else
 //   { System.out.println ("no escribe"); }
   
   // System.out.println (Frmwrk.first);  
	}	

	public void InLoginP3 (String user, String pinn, String password) throws Exception
	{		
	Config.globalPin=pinn;
		
	Frmwrk.logEvidencia(Config.globalCP, "Version");
	
	obtenerVersion ();
	
//	Config.esperar("//XCUIElementTypeButton[@name=\"Continuar\"]");
	
	
	
	
	//MobileElement usuario = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
	
	MobileElement usuario = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
	
	
	
    usuario.click();
  //  usuario.clear();
    usuario.setValue(user);    
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario ingresado");
        
    
    //MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField"));
    
    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField"));
    
    
    
    
 //   pin.clear();
    pin.setValue(Config.globalPin);
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    
   

	//Config.esperar("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
		
		//MobileElement pass = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField"));
		//MobileElement pass = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeSecureTextField"));
	MobileElement pass= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeSecureTextField[@name=\"passwordTextField\"]"));	
    pass.click();
//    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Password ingresado");      
    
    /*
    Config.driver.context("NATIVE_APP"); // switch to non-instrumented context
    Config.driver.findElement(signUp.done).click();
    Config.driver.context("NATIVE_APP_INSTRUMENTED"); // back to instrumented context*/
    
    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
    done.click();  
	
    
    
    //MobileElement continuar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Continuar\"]"));
    //MobileElement continuar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"arrow left\"]"));
    
    
  //Se obtuvo el elemento  "Continuar" con el AccessibilityId
    
    MobileElement continuar= (MobileElement) Config.driver.findElementByAccessibilityId("arrow left");
    
    continuar.click();     		
	 
    
    
    //clickeamos en el boton cancelar del mensaje que nos informa sobre la huella
    
  //  if( Config.driver.getCapabilities().getCapability("udid") == null)
 	//String celular=(String) Config.driver.getCapabilities().getCapability("udid");
    
   // 	System.out.println (Frmwrk.first);  
  //  	System.out.println ("escribeeeee");
    //	if (Frmwrk.first==false)
    	
   
    
   Frmwrk.logEvidencia(Config.globalCP, "Mensaje huella");  
    	
    	//MobileElement cancelar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
   
 MobileElement cancelar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
   
   //Se obtuvo el elemento cancelar que proviene del mensaje de la huella, a travès de AccesibilityId
 //  MobileElement cancelar = (MobileElement) Config.driver.findElementByAccessibilityId("Cancelar");
   
 //XCUIElementTypeButton[@name="Cancelar"]
   
    	//cancelar.click();
       c.click(cancelar);
 
    	 Frmwrk.first=true;
    	 
    	 
    	 
    	 
 //   else
 //   { System.out.println ("no escribe"); }
   
   // System.out.println (Frmwrk.first);  
	}	
	
}


