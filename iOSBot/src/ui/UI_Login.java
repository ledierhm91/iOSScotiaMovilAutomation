package ui;

import org.openqa.selenium.By;
import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UI_Login extends UI_Comun {
	 
		///Tutorial
	String  btnSaltarPresentacion = "//XCUIElementTypeButton[@name=\"Saltar Presentación\"]";
	String btn_tour = "//XCUIElementTypeButton[@name=\"Ingresar\"]";
	
	
	//Registro
	String usuarioXpath = "//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField";
	String pinXpath = "//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeSecureTextField";
    String passXpath = "//XCUIElementTypeSecureTextField[@name=\"passwordTextField\"]";
    String btnDoneXpath = "//XCUIElementTypeButton[@name=\"Done\"]";
    
    //Mensaje de confirmacion de huella
    String btnCancelHuellaXpath = "//XCUIElementTypeButton[@name=\"Cancelar\"]";
    
    //Boton de login- Continuar
    String labelContinuarID = "Continuar";
    String btnContinuarID = "arrow left";
	
    
	public void obtenerVersion () throws Exception
	{ 
		
	String version = "//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + 
			"\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeStaticText[1]";
	Frmwrk.versionApp= findElementByXpath(version).getText();
 	 
 	
	}
	
	
	public void tutorial() throws Exception
	{	
		
		isEnabled(findElementByXpath(btnSaltarPresentacion));
		
		
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 1");
		
		swipeHLR();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 2");
		
		swipeHLR();
		Frmwrk.logEvidencia(Config.globalCP, "Tutorial - Pantalla 3");	
    		
		
		
		click(findElementByXpath(btn_tour));
		
		Frmwrk.ini=true;
	}	
	
	 	
	
	public void InLoginP1 (String user, String pinn) throws Exception
	{		
	Frmwrk.logEvidencia(Config.globalCP, "Version");
	
	obtenerVersion ();
	
	
	MobileElement continuarLabel = findElementByID(labelContinuarID);
	isDisplayed(continuarLabel);
	
	MobileElement usuario = findElementByXpath(usuarioXpath);
	click(usuario);
	clear(usuario);
	sendKeys(usuario, user);

	
	 MobileElement pin = findElementByXpath(pinXpath);
		click(pin);
		clear(pin);
		sendKeys(pin, Config.globalPin);    
  
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    
   MobileElement continuar= findElementByID(btnContinuarID);
   click(continuar); 	
	}	
	
	
	
	
	public void InLoginP2 (String password) throws Exception
	{
		
		 MobileElement pass= findElementByXpath(passXpath);	
		    click(pass);
			clear(pass);
			sendKeys(pass, password);
		    
        
    Frmwrk.logEvidencia(Config.globalCP, "Password ingresado");      
    
    /*
    Config.driver.context("NATIVE_APP"); // switch to non-instrumented context
    Config.driver.findElement(signUp.done).click();
    Config.driver.context("NATIVE_APP_INSTRUMENTED"); // back to instrumented context*/
    
    MobileElement done = findElementByXpath(btnDoneXpath);
    click(done);
	 
	
    
    click(findElementByXpath(btn_tour));
    
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
	
	MobileElement usuario = findElementByXpath(usuarioXpath) ;
	click(usuario);
	clear(usuario);
	sendKeys(usuario, user);
  
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario ingresado");
        
    

    MobileElement pin = findElementByXpath(pinXpath);
	click(pin);
	clear(pin);
	sendKeys(pin, Config.globalPin);
    
   
    
    Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN ingresados");
    
   
    MobileElement pass= findElementByXpath(passXpath);	
    click(pass);
	clear(pass);
	sendKeys(pass, password);
    
        
    Frmwrk.logEvidencia(Config.globalCP, "Password ingresado");      
    
    /*
    Config.driver.context("NATIVE_APP"); // switch to non-instrumented context
    Config.driver.findElement(signUp.done).click();
    Config.driver.context("NATIVE_APP_INSTRUMENTED"); // back to instrumented context*/
    
    MobileElement done = findElementByXpath(btnDoneXpath);
    click(done);
	
    
    
  //Se obtuvo el elemento  "Continuar" con el AccessibilityId    
    MobileElement continuar= findElementByID(btnContinuarID);

    click(continuar);    		
	 
    
   
    
    //clickeamos en el boton cancelar del mensaje que nos informa sobre la huella
    
  //  if( Config.driver.getCapabilities().getCapability("udid") == null)
 	//String celular=(String) Config.driver.getCapabilities().getCapability("udid");
    
   // 	System.out.println (Frmwrk.first);  
  //  	System.out.println ("escribeeeee");
    //	if (Frmwrk.first==false)
    	
   
    
   Frmwrk.logEvidencia(Config.globalCP, "Mensaje huella");    	
   
 MobileElement cancelar = findElementByXpath(btnCancelHuellaXpath);
   
   //Se obtuvo el elemento cancelar que proviene del mensaje de la huella, a travès de AccesibilityId
 //  MobileElement cancelar = (MobileElement) Config.driver.findElementByAccessibilityId("Cancelar");

 
 click(cancelar);
 
    	 Frmwrk.first=true;
    	 
    	
	}	
	
}


