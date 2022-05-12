package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import casosDePrueba.Tarjetas;
import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Fase2 {
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	UI_Login l = PageFactory.initElements(Config.driver, UI_Login.class);
	 	
	public void InLoginP1 (String user, String pinn) throws Exception
	{
		
		Frmwrk.logEvidencia(Config.globalCP, "Usuario y PIN vacios");
		
		l.obtenerVersion ();
		
		Config.esperar("//XCUIElementTypeButton[@name=\"Continuar\"]");
		
		MobileElement continuar = (MobileElement)  Config.driver.findElement(By.name("Continuar"));
		continuar.click();  
		
		Thread.sleep(4000);
		 
		Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de datos incompletos");
		
		MobileElement ok = (MobileElement) Config.driver.findElement(By.name("OK"));
	    ok.click(); 
		
		MobileElement usuario = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
		
	    usuario.click();
	    usuario.clear();
	    usuario.setValue("12345678901234567890");    
	        
	    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
	    Config.globalPin=pinn;
	    pin.clear();
	    pin.setValue(Config.globalPin);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario inexistente y PIN correcto");
	    
	    continuar = (MobileElement)  Config.driver.findElement(By.name("Continuar"));
	    continuar.click();    
		
	    Thread.sleep(4000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de Usuario inexistente");
	    
	    ok = (MobileElement) Config.driver.findElement(By.name("OK"));
	    ok.click();   
		
	    usuario.click();
	    usuario.clear();
	    usuario.setValue(user);    
        
	    pin.clear();
	    pin.setValue("1234567890");
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario correcto y PIN incorrecto");
	    
	    continuar.click();   
	    
	    Thread.sleep(4000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de PIN incorrecto");
	    
	    ok = (MobileElement) Config.driver.findElement(By.name("OK"));
	    ok.click();   
	    
	    pin.clear();
	    pin.setValue(Config.globalPin);
    
	    Frmwrk.logEvidencia(Config.globalCP, "Usuario correcto y PIN correcto");
    
	    continuar.click();    
	    Thread.sleep(5000);    		
	}	
	
	public void InLoginP2 (String password) throws Exception
	{
	Thread.sleep(8000);
	
	Frmwrk.logEvidencia(Config.globalCP, "Contraseña vacia");
	
	MobileElement continuar = (MobileElement)  Config.driver.findElement(By.name("Ingresar"));
	continuar.click();  
	
	Thread.sleep(2000);
	 
	Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de datos incompletos");
	
	MobileElement ok = (MobileElement) Config.driver.findElement(By.name("OK"));
    ok.click(); 
	
	MobileElement pass = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
    pass.click();
    pass.clear();
    pass.setValue("bvchdjmski98543687384756");
        
    Frmwrk.logEvidencia(Config.globalCP, "Password incorrecto ingresado");      
       
    MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
    done.click();  
    
    MobileElement ingresar = (MobileElement) Config.driver.findElement(By.name("Ingresar"));
    ingresar.click();    
    
    Thread.sleep(3000);  
    
    Frmwrk.logEvidencia(Config.globalCP, "Mensaje de error de Password incorrecto");
    
    ok = (MobileElement) Config.driver.findElement(By.name("OK"));
    ok.click(); 
    
    pass.click();
    pass.clear();
    pass.setValue(password);
        
    Frmwrk.logEvidencia(Config.globalCP, "Password correcto ingresado");      
       
    done = (MobileElement) Config.driver.findElement(By.name("Done"));
    done.click();  
    
    ingresar = (MobileElement)  Config.driver.findElement(By.name("Ingresar"));
    ingresar.click();    
    
    Thread.sleep(10000);
    
	}	


	 public void validacionesPagoTarjetaTerceroVaciosErroneosCtaBloq() throws Exception
		{
		 Thread.sleep(2000); 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		
		 Thread.sleep(2000); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Mensaje datos vacios");
		 
		 MobileElement btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement btntj = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
		 btntj.click(); 
		 btntj.sendKeys("1234567890123456789012345678901234567890");
		 
		 MobileElement btnmes = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
		 btnmes.click(); 
		 btnmes.sendKeys("8");
		 
		 MobileElement btnanio = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //-----------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de tipos de pago incompleto");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 
		 //-------------
		 
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch"));
		 btnpesos.click();	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de seleccion de cuenta");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement ctapesos = (MobileElement) Config.driver.findElement(By.name("Ingresá tu número de cuenta"));
		 ctapesos.click();
		 
		 Thread.sleep(1000);
		 MobileElement ctapesosSel = (MobileElement) Config.driver.findElement(By.name("Seleccionar"));
		 ctapesosSel.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de falta de monto");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 btnpesos.click();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de falta de forma de pago");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		 MobileElement btnusd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeSwitch"));
		 btnusd.click();	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de seleccionar moneda USD");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement ctausd = (MobileElement) Config.driver.findElement(By.name("Ingresá tu número de cuenta"));
		 ctausd.click();
		 
		 
		 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		/* c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 Thread.sleep(1000);*/
		 MobileElement ctausdSel = (MobileElement) Config.driver.findElement(By.name("Seleccionar"));
		 ctausdSel.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		// c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de ingresar importe USD");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement importeUSD = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField"));
		 importeUSD.click();   
		 importeUSD.setValue(Config.getRandomNumber(35, 45));	
		 Tarjetas.montoPagoDolares=importeUSD.getText();
		 
		 MobileElement done3 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done3.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 
			 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click();  
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error tarjeta incorrecta");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 
		 btntj.clear();
		 btntj.click(); 
		 btntj.sendKeys("43079973");
		 
		 btnmes.clear();
		 btnmes.click(); 
		 btnmes.sendKeys("135");
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de mes invalido");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 btnmes.clear();
		 btnmes.click(); 
		 btnmes.sendKeys("1");
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("202");
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de año invalido");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("1990");
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de año invalido");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click(); 
		 
		 c.swipeVDown();
		 //----------------
		 
		 
		 btnanio.clear();
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 //----------------
		 
		 //-----------
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Pago\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		// btn_pagar = (MobileElement) Config.driver.findElement(By.name("Confirmar Pago"));
		 btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Pago\"]"));
		 btn_pagar.click();  
		 
		 Thread.sleep(7000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
		 MobileElement btnok2 = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok2.click(); 
		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue("33277877856874899");
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN incorrecto");
		 
		 btnok2 = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok2.click();
		 
		 pin.clear();
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(6000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de cuenta bloqueada");
		 
		 c.clickOK();
		 
		 Thread.sleep(2000); 
		 
		 MobileElement cerrar = (MobileElement) Config.driver.findElement(By.name("Cerrar"));
		 cerrar.click(); 
		 
	
		}	
	 
	
	 public void validacionesPagoTarjetaTerceroCtaSSaldo() throws Exception
		{
		 
		 
		 MobileElement btntj = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
		 btntj.click(); 
		 btntj.sendKeys("43079973");
		 
		 MobileElement btnmes = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeTextField"));
		 btnmes.click(); 
		 btnmes.sendKeys("1");
		 
		 MobileElement btnanio = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
		 btnanio.click(); 
		 btnanio.sendKeys("2020");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		 MobileElement btnpesos = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeSwitch"));
		 btnpesos.click();	
		 
		 MobileElement ctapesos = (MobileElement) Config.driver.findElement(By.name("Ingresá tu número de cuenta"));
		 ctapesos.click();
		 
		 Thread.sleep(2000);
		 
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 Thread.sleep(1000);
		 MobileElement ctapesosSel = (MobileElement) Config.driver.findElement(By.name("Seleccionar"));
		 ctapesosSel.click();
		 
		 MobileElement importeUYU = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField"));
		 importeUYU.click();   
		 importeUYU.setValue(Config.getRandomNumber(20, 30));
		 Tarjetas.montoPagoPesos=importeUYU.getText();
		 
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar Tarjeta"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(4000);
		 
		 //-----------
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Pago\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Pago\"]"));
		
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 
		 pin.clear();
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar.click(); 
		 
		 Thread.sleep(6000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error de cuenta sin saldo");
		 
		 c.clickOK();
		 
		 Thread.sleep(2000); 
		 
		 MobileElement cerrar = (MobileElement) Config.driver.findElement(By.name("Cerrar"));
		 cerrar.click(); 
		 
	
		}	
	 
	 public void validacionesSolCheqVaciosErroneosCtaBloq() throws Exception
		{	
		 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //------------
		 MobileElement btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click();
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click();
		 //-------------
		 
		 
		 MobileElement ctadeb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
		 ctadeb.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeVsuc2(); 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
	/*	 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3(); 
		 Frmwrk.logEvidencia(Config.globalCP, "");*/
		 
		 
		 MobileElement ctadebsel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctadebsel.click();  
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //------------
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click();
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click();
		 //-------------
		 
		 
		 MobileElement tipoCh = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 tipoCh.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement tiposel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tiposel.click();  
		 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //------------
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click();
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click();
		 //-------------
		 
		 MobileElement ctdadCheq = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[3]"));
		 ctdadCheq.click();   
		 ctdadCheq.setValue("1");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//------------
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click();
		 
		 Thread.sleep(4000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btnok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btnok.click();
		 //-------------
		 
		 MobileElement suc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 suc.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement sucsel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucsel.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario a enviar");
		 
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click(); 
		 
		 Thread.sleep(2000);
		 //----------------------
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar solicitud\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error sin PIN");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue("8374569345792843523574");	
		 
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar solicitud\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error PIN incorrecto");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();
		 
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar solicitud\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta bloqueada");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_volver= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 ctadeb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
		 ctadeb.click(); 
		 
		 Thread.sleep(1000);
		 c.swipeVDownsuc3();
		/* Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeVDownsuc3();
		 c.swipeVDownsuc3();
		 c.swipeVDownsuc3();*/
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 ctadebsel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctadebsel.click();  
		 
		 ctdadCheq = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[3]"));
		 ctdadCheq.click(); 
		 ctdadCheq.clear(); 
		 ctdadCheq.setValue("12345678901234567890");
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click(); 
		 
		 Thread.sleep(6000);
		 
		 pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar solicitud\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Error mucha cantidad de chequeras");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_volver= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 ctdadCheq = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[3]"));
		 ctdadCheq.click(); 
		 ctdadCheq.clear(); 
		 ctdadCheq.setValue("1");
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_solic = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Solicitar chequera\"]"));
		 btn_solic.click(); 
		 
		 Thread.sleep(2000);
		 
		 pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar solicitud?");	
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar solicitud\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 	
		 Frmwrk.logEvidencia(Config.globalCP, "Transaccion exitosa");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_volver= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 Thread.sleep(2000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 }	 	 
	
	 public void validacionesPrestamosVaciosErroneos() throws Exception
		{	
		 Thread.sleep(5000);
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("Pagar préstamo"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Cuotas\"]");
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de prestamo");
		 
		 //---------------
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar préstamo"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		 //----------------
		 
		 MobileElement cbocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
		 cbocta.click();  
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done.click();  
		 
		 //---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar préstamo"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		 //----------------
		 
		 MobileElement cbocuotas = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]"));
		 cbocuotas.click(); 
		 
		 Thread.sleep(3000);
		 
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 c.swipeV2();
		 
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click();  
		 
		 Thread.sleep(10000);
		 
		 
		//---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.name("Pagar préstamo"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		//---------------

		 cbocuotas = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]"));
		 cbocuotas.click(); 
		 
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 c.swipeVDown2();
		 
		 done2 = (MobileElement) Config.driver.findElement(By.name("Done"));
		 done2.click();  
		 
		 Thread.sleep(10000);
		 
		 //---------------------------------------------
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de prestamo a pagar");	
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Pagar préstamo\"]"));
		 btn_pagar.click(); 
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Pago\"]");
		 
		 
		//---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Pago\"]"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		//--------------
		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue("8237456823457g87234658237645");
		 
		 MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done3.click(); 
		 
		//---------------

		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Pago\"]"));
		 btn_pagar.click(); 
		 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click(); 
		 
		//--------------
		 
		 
		 pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done3.click();  
		 		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar Pago?");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 
		 /*	 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnConfirmLoanPay"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("vTitle");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); */
		 
		 Thread.sleep(5000);
		 
		 }	 	
	 
	 public void combinacionesTransferenciasPropiasUYUUYUUYU() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeVDown();
		 // UYU UYU UYU
		    MobileElement cbo_cta_deb;
		    //cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		  //  Thread.sleep(2000);
		  //  c.swipeVsuc2();
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		   // c.swipeVsuc3();
		 //   c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    MobileElement cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		   // c.swipeVsuc2();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		    sel_ref.click();
		    sel_ref.sendKeys("UYU UYU UYU");
		    
		    MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    
		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		    
		    c.swipeV();
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
		    
		    
		 }	
		    //-----------------------
		    

		    
		    // USD USD USD
			 
/*		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    
		     sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		  //  c.swipeVsuc2();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		     done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		      sel_ref.click();
		    sel_ref.sendKeys("USD USD USD");
		    
		     done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	


		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
			   btn_transf.click();
		    
		    
			   Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
			     
		    c.swipeV();
		    
		    pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			     pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		     done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		     btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
	*/	    
		    //-----------------------
	
		    public void combinacionesTransferenciasPropiasUSDUYUUYU() throws Exception
			{
		    // USD UYU UYU
			 
		    	MobileElement  cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    MobileElement  sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement  cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		  //  c.swipeVsuc3();
		    
		    Thread.sleep(1000);
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    MobileElement  cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		  //  c.swipeVsuc2();
		  //  c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement    sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    MobileElement   done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    MobileElement  sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		     sel_ref.click();
		    sel_ref.sendKeys("USD UYU UYU");
		    
		    MobileElement     done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	


		    MobileElement    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
			   btn_transf.click();
		    
		    
			   Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
			     
		    c.swipeV();
		    
		    MobileElement    pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement    done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement    btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement   btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
			 }	
		    //-----------------------
		 
		    public void combinacionesTransferenciasPropiasUSDUYUUSD() throws Exception
			{
		    // USD UYU USD
			 
		    	MobileElement   cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    MobileElement     sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		     cbo_cta_cred.click();
		     
		     Thread.sleep(1000);
		     
		     c.swipeVsuc3();
		     c.swipeVsuc3();
		     c.swipeVsuc3();
		    
		        sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    MobileElement  cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		  //  c.swipeVsuc2();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement   sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    MobileElement    done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    MobileElement   sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		     sel_ref.click();
		    sel_ref.sendKeys("USD UYU USD");
		    
		    MobileElement   done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    
		    MobileElement   btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
			    btn_transf.click();
		    
		    
			    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
			     
		    c.swipeV();
		    
		    MobileElement   pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement    done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement  btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement     btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
		    
		    //-----------------------
		    
		 }	
	 
	 public void combinacionesTransferenciasPropiasUSDUSDUSD() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeVDown();

		    
		    // USD USD USD
			 
		    MobileElement cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		     cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		     sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		  //  c.swipeVsuc2();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		      sel_ref.click();
		    sel_ref.sendKeys("USD USD USD");
		    
		    MobileElement  done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	


		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
			   btn_transf.click();
		    
		    
			   Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
			     
		    c.swipeV();
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
			     pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement  done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
	   
		    //-----------------------
		    
		}
	 
	 public void validacionesTransferenciasPropiasVaciosErroneos() throws Exception
		{	    	    
		    Thread.sleep(4000);
		    c.swipeV();
		    c.swipeV();
		    
		    //----------------
		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    c.swipeVDown();
		    
		    //----------------
		  
		    MobileElement cbo_cta_deb;
		    //cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc2();
		    c.swipeVsuc2();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    
		    //----------------
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();
		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    c.swipeVDown();
		    
		    //----------------
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		   
		   // c.swipeVsuc3();
		 //   c.swipeVsuc3();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    c.swipeV();

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    c.swipeVDown();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    
		    MobileElement cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		   // c.swipeVsuc2();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(2000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    c.swipeVDown();
		    
		    //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.sendKeys("0");
		    
		    
		    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		   // c.swipeVDown();
		    
		    //----------------
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.clear();
		    sel_importe.sendKeys("934569348593847598374958374598");
		    
		    done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(6000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click(); 
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "Error por monto muy grande");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    
		  //---------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.clear();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();

		    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("Volver"));
		    btn_ok.click();
		    
		    Thread.sleep(3000);
		    
		    c.swipeV();
		    
		    //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		    sel_ref.click();
		    sel_ref.sendKeys("UYU UYU UYU prueba larrrrgaaaa");
		    
		    MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Thread.sleep(5000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		    sel_ref.click();
		    sel_ref.clear();
		    sel_ref.sendKeys("UYU UYU UYU");
		    
		    done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    //------------------------------------------------------------------------------
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		    
		    c.swipeV();
		    
		  //----------------
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    

		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    //----------------
		    
		     pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		    pin.click();
		    pin.sendKeys("8347658374658937465937846958639458639458");
		    
		     done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click(); 
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    

		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    //----------------
		    
		    Thread.sleep(3000);
		    
		    c.swipeV();
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		    pin.click();
		    pin.clear();
		    pin.sendKeys(Config.globalPin);
		    
		    done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Datos Confirmar");	
		    
		     btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //-----------------------
			}
	 
	 
	 public void validacionesTransferenciasPropiasCtasBloq() throws Exception
		{	    	    
		    Thread.sleep(4000);
		  
		    MobileElement cbo_cta_deb;
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		   
		   // c.swipeVsuc3();
		 //   c.swipeVsuc3();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 
		    
		    MobileElement cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		   // c.swipeVsuc2();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    c.swipeV();

		   
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    
		    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		 
		    
		    
		    c.swipeV();

		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"OK\"]");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta debito bloqueada");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    
		    //-----------------------
		    
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    
		    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		   
		    c.swipeVsuc3();
		   
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"OK\"]");
		    
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta credito bloqueada");
		    
		    btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		    
		    
			}
	 
	 public void validacionesTransferenciasPropiasCtaDebSSaldo() throws Exception
		{	    	    
		    Thread.sleep(4000);
		  
		    MobileElement cbo_cta_deb;
		    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    
		    MobileElement cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		    
		    Thread.sleep(1000);
		   
		   // c.swipeVsuc3();
		 //   c.swipeVsuc3();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	

		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    MobileElement cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		   // c.swipeVsuc2();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    //----------------
		    c.swipeV();

		   
		    Frmwrk.logEvidencia(Config.globalCP, "");

		    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		    sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    
		    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		    c.swipeV();

		    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		    btn_transf.click();
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		    
		    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		    pin.click();
		    pin.sendKeys(Config.globalPin);
		    
		    MobileElement  done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done3.click(); 
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");
		    
		  //----------------
		    MobileElement  btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		    btn_confirmar.click();
		    
		    Config.esperar("//XCUIElementTypeStaticText[@name=\"OK\"]");
		    Frmwrk.logEvidencia(Config.globalCP, "Error por cuenta debito sin saldo");
		    
		    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		    btn_ok.click();
		   
		    
		    
			}
	 
	 
	 public void validacionesTransferenciasInternasVaciosyPIN() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		
		 //-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();
		 

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();
		 

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 MobileElement cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();
		 

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 //--------------------------------------
		 
		 MobileElement cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 Frmwrk.logEvidencia(Config.globalCP, "");
		    
		 btn_ok = (MobileElement) Config.driver.findElement(By.name("OK"));
		 btn_ok.click();

		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		
		 //--------------------------------------
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
		//-----------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Cancelar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_cancelar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
		 btn_cancelar.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //--------------------------------------
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		//-----------------------
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Cancelar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_cancelar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
		 btn_cancelar.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 Frmwrk.logEvidencia(Config.globalCP, "");

		 //--------------------------------------
		 
		 MobileElement swSave = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSwitch"));
		 swSave.click();    
		 
		 Thread.sleep(1000);
		 
		 MobileElement nomTemp = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeTextField"));
		 nomTemp.click();    
		 nomTemp.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 

		 
		 
		 //-----------------------------------------------------------------------
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue("98457603547603875460837456083456");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		
		 
		 }	
	 
	 
	 public void validacionesTransferenciasInternasBloqRef() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		
		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
	
		 
		 MobileElement cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		
		 
		 MobileElement cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		
		
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
	
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta debito bloqueada");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		//-----------------------------------------------------------------------
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 
		 ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 
		 CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		 CtaDest.clear();
		 CtaDest.sendKeys("364455300");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta credito bloqueada");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 
		 //-----------------------------------------------------------------------
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		 CtaDest.clear();
		 CtaDest.sendKeys("375888500");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
/*		 monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();  
		 monto.clear();  
		 monto.sendKeys("93457869384576038475600");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 c.swipeV();
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error por monto muy grande");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(4000);
		 
		 monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click(); 
		 monto.clear();   
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 */
		 
		 c.swipeV();
		 c.swipeV();
		 
		 refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();  
		 refe.clear();
		 refe.setValue("Prueba1zxcvsadahoeiughkewhjgleskglksjflgkjsdlfgkjsdlfkgjlskdfjglksdjfglksdfg");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error referencia muy larga");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(3000);
		 
		 refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();  
		 refe.clear();
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		
		 
		 }	
	 
	 
	 public void validacionesTransferenciasInternasDebSSaldoMontoGde() throws Exception
		{
		 Thread.sleep(5000);
		 
		 //-----------------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		
		 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys("934856793845769945689456");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
	
		 
		 MobileElement cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		
		 
		 MobileElement cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		
		
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
	
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto muy grande");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 
		 
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 Thread.sleep(1000);
		// c.swipeVsuc3();
		 Thread.sleep(1000);
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 
		  cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		  ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		
		 
		 
		  monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		  cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		  mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		
		 
		  cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		  sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
	
		 
		  cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		  tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		
		 
		  CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		 CtaDest.sendKeys("375888500");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		
		 
		  cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		  mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		
		
		 
		  mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		  motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
	
		 
		  refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 
		  btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		  btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		  pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		  btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta debito sin saldo");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 
		 }	
	 
	 
	 public void combinacionesTransfScotiaUYUUSDUYU() throws Exception
		{
		 UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 
		 
		 //-----------------UYU USD UYU-----------------
		 
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		
			 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
			 cbomnd.click();
			 Thread.sleep(1000);
			 c.swipeVsuc3();
			 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 mndSel.click(); 
		
		 
		 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
		 
		 MobileElement cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 
		
		 MobileElement cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		// c.swipeVsuc3();
		 MobileElement mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("UYU USD UYU");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 
		 
		 t.enviarTransfScotia();;
		 
		 
		 }	
		 
		 public void combinacionesTransfScotiaUSDUSDUSD() throws Exception
			{
			 UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
//-----------------USD USD USD-----------------
		 
			 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement   ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		
		 MobileElement   cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
			 cbomnd.click();
			 Thread.sleep(1000);
			 c.swipeVsuc3();
			 MobileElement   mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 mndSel.click(); 
		
		 
			 MobileElement  cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 

		 MobileElement  sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
		 
		 MobileElement   cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement   tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 
		 MobileElement  CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		  CtaDest.sendKeys("375888500");
		 
		  MobileElement   done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 
		
		 MobileElement   cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement   mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		 
		 MobileElement   monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 MobileElement   mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement   motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
		 MobileElement   refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("USD USD USD");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 
		 
		 t.enviarTransfScotia();;
		 
		 
			 }	
		 
		 public void combinacionesTransfScotiaUSDUYUUYU() throws Exception
			{UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 //-----------------USD UYU UYU-----------------
		 
			MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement  ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		
		 MobileElement	  cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
			 cbomnd.click();
			 Thread.sleep(1000);
			// c.swipeVsuc3();
			 MobileElement	  mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 mndSel.click(); 
		
		 
			 MobileElement  cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 

		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
		 
		 MobileElement  cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement	  tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 
		 MobileElement CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		 MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 
		
		 MobileElement  cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		// c.swipeVsuc3();
		 MobileElement  mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		 
		 MobileElement  monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 MobileElement mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement  motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("USD UYU UYU");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 
		 
		 t.enviarTransfScotia();;
		 
		 //--------------------------------------------------------
		
			 }	
		 
		 public void combinacionesTransfScotiaUSDUYUUSD() throws Exception
			{UI_Transferir t = PageFactory.initElements(Config.driver, UI_Transferir.class);
		 //-----------------USD UYU USD-----------------
		 
			MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement  ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		
		 MobileElement  cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
			 cbomnd.click();
			 Thread.sleep(1000);
			// c.swipeVsuc3();
			 MobileElement  mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 mndSel.click(); 
		
		 
			 MobileElement cbosuc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[2]"));
		 cbosuc.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 

		 MobileElement sucSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 sucSel.click(); 
		 
		 MobileElement  cbotc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[3]"));
		 cbotc.click();
		 Thread.sleep(1000);
		 MobileElement  tcSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 tcSel.click(); 
		 
		 
		 MobileElement  CtaDest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextField[4]"));
		 CtaDest.click();
		// CtaDest.sendKeys("364455300");
		 CtaDest.sendKeys("375888500");
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");
		 
		 c.swipeV();
		 c.swipeV();
		 
		
		 MobileElement  cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement  mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		 
		 MobileElement  monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 monto.click();    
		 monto.sendKeys(Config.getRandomNumber(180, 360));
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 
		 MobileElement  mot = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]/XCUIElementTypeButton"));
		 mot.click();
		 Thread.sleep(1000);
		 MobileElement  motSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 motSel2.click(); 
		 
		 MobileElement  refe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 refe.click();    
		 refe.setValue("USD UYU USD");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");
		 
		 
		 
		 t.enviarTransfScotia();;
		 
		 //--------------------------------------------------------
		 
		 }	
	 
	 
	 public void combinacionesTransfPlazaUYUEUR() throws Exception
		{	
		 
		 //-------------------UYU EUR-----------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("UYU EUR");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 
		}
	 
	 public void combinacionesTransfPlazaUYUUSD() throws Exception
		{
		//-------------------UYU USD-----------------------------
		 
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(2000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement  ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("UYU USD");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
}
	 
	 public void combinacionesTransfPlazaUSDUSD() throws Exception
		{
//-------------------USD USD-----------------------------
		 
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(1000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();  
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("USD USD");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement  btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 }	 
	 
	 public void combinacionesTransfPlazaUSDUYU() throws Exception
		{
		//-------------------USD UYU-----------------------------
		 
		 MobileElement  btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(1000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 
		 MobileElement  ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();  
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement  ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement  bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement  bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement  ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("USD UYU");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 }
	 
	 
	 public void combinacionesTransfPlazaUSDEUR() throws Exception
		{
		//-------------------USD EUR-----------------------------
		 
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(1000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();  
		 Thread.sleep(1000);
		// c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
	//	 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("USD EUR");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement  btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 
		 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 
		 }	
	 
	 public void combinacionesTransfPlazaEUREUR() throws Exception
		{	
		 
		 //-------------------EUR EUR-----------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("EUR EUR");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		}	
		 
		 
		 public void combinacionesTransfPlazaEURUSD() throws Exception
			{	
			 
		//-------------------EUR USD-----------------------------
		 
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(2000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement  bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement  bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement  bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement  nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement  done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement  mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement  mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement  monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement  done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement	  dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement	  destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement  ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("EUR USD");	
		 MobileElement  done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement  tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement  done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement  btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement  pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement  done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement  btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement  btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
			}	
		 
		 public void combinacionesTransfPlazaEURUYU() throws Exception
			{	
			 
//-------------------EUR UYU-----------------------------
		 
			 MobileElement  btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 MobileElement  btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 
		 Thread.sleep(1000);
		 c.swipeVDown();
		 c.swipeVDown();
		 c.swipeVDown();
		 
		 MobileElement  ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();  
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement	  ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement  bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 MobileElement  bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement  bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement  nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement  done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement  mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		
		 MobileElement  mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement  monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement  done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement  dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement  destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement  ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("EUR UYU");	
		 MobileElement  done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 MobileElement  tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement  done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement  btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement  pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement  done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement  btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement  btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		
		 //--------------------------------------------------------------------
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 
		 }	
	 
	 public void validacionesTransferenciasPlazaCamposVacios() throws Exception
		{	
		 
		 //--------------------------------------------------
		 Thread.sleep(2000);
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 //--------------------
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		 MobileElement ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 
		 //-------------------EUR EUR-----------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 //--------------------
		 c.swipeV();
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();

		 c.swipeVDown();
		 
		//--------------------
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();

		 c.swipeVDown();
		 
		//--------------------
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("EUR EUR");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 
		  btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		  ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();

		 c.swipeVDown();
		 
		//--------------------
		 
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancelar\"]"));
		 btnc.click(); 
		 
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 //--------------------------------------------------------------------------------
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue("827345682346587236458723645");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		  btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 

		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		}
	 
	 public void validacionesTransfPlazaValoresErroneos() throws Exception
		{	
		 
		 //------------------------------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("123456987");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("qwertyuiop asdfghjkl zxcfbnmjergsdfg dfgksdfhgksjdfhgksdjfg isdfjghksdjfghk kfdjghkdsjhfgk ksdfjghksjdfhgk kdjfhgkdsjhfg ksjdfhgksjdfhg ksfdjhgkdjshfg ksjfhdg ");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		 MobileElement ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		//--------------------
		 
		 ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.clear();
		 ref.setValue("asdfg");	
		  done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeVDown();
		 
		 bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569879345867903485679038457609384576038475608374956873495769347569834576");
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();  
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		 ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click(); 
		 bcocta.clear();  
		 bcocta.sendKeys("12345698");
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez ksejhgfksdjfhg ksjhfdgkjshdfgkshfdkgjh dskfjsdgfkshdfkjshdfjkgh skdfhjg");
		 done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		//--------------------
		 c.swipeV();
		 c.swipeV();
		 
		 btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		 ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 ok.click();
		 
		 c.swipeVDown();
		 c.swipeVDown();
		 
		//--------------------
		 
		 nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.clear();
		 nom.sendKeys("Juan Cito");
		 done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 c.swipeV();
		 
		 monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue("3784569283450289437"); 
		 
		 done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 c.swipeV();
		 
		 tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("09812345693485769385476983745968734958673948567934857693847569837456983749568734958679348567");
		 
		 
		 done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");
		 
		 
		 btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error monto muy grande");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		}
	 
	 public void validacionesTransferenciasPlazaCtaDebSinSaldo() throws Exception
		{	
		 
		 //------------------------------------------------
		 
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 c.swipeVsuc3();
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
		 Thread.sleep(2000);
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 
		 MobileElement bcoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 bcoSel.click(); 
		 
		 MobileElement bcocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		 bcocta.click();  
		 bcocta.sendKeys("1234569870");
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement nom = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
		 nom.click();  
		 nom.sendKeys("Juan Perez");
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 Thread.sleep(2000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("EUR EUR");	
		 MobileElement done8 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done8.click();
		 Frmwrk.logEvidencia(Config.globalCP, "");	
		 MobileElement tel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[11]"));
		 tel.click();  
		 tel.sendKeys("098123456");
		 
		 MobileElement done6 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done6.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");	
		 
		 MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn.click();   
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y Condiciones");
		 
		 MobileElement btnOK = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btnOK.click();   
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Transferencia\"]");
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done7 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done7.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Error cuenta sin saldo");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(1000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		}

}

