package casosDePrueba;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import ui.UI_Login;

public class Login {	
		
	public static void iniciar(String usr, String pin, String pwd) throws Exception
	{long startTime=0;
	String paso="";	
	
	try{startTime = System.nanoTime();
	Config.globalCP = "Login - " + Frmwrk.obtenerFecha();
	Config.globalDescrip = "Se realiza el login a la aplicacion, ingresando los siguientes datos: usuario, PIN y contraseña";
	
	//----------------------------------------------------------		
	 
	Frmwrk.versionOS= Config.driver.getCapabilities().getCapability("platformName") + " - " + Config.driver.getCapabilities().getCapability("platformVersion");
	
	Frmwrk.versionOSNum= (String) Config.driver.getCapabilities().getCapability("platformVersion");
	
	
	//No es necesario inicializar el PageFactory aqui, resolvemos con crear un objeto de la clase
	//UI_Login fp = PageFactory.initElements(Config.driver, UI_Login.class);
	UI_Login fp= new UI_Login();
	
	
//	fp.InLoginP1(usr,pin);	
//	fp.InLoginP2(pwd);
	
	fp.InLoginP3(usr,pin,pwd);	
	
	paso = "Se muestra pantalla principal";
	Frmwrk.logEvidencia(Config.globalCP, paso);	
			
	//----------------------------------------------------------
	
	Frmwrk.logResultadoPassed((System.nanoTime() - startTime), Config.globalCP);
	
	}
	catch(Exception ex) 	
	{	
		Frmwrk.logResultadoFailed((System.nanoTime() - startTime), Frmwrk.logError(ex), Config.globalCP);
	}
	}	
	
	
}
