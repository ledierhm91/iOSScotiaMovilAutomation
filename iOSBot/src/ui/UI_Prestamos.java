package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Prestamos {
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	
	 public void pagar() throws Exception
		{	
		 Thread.sleep(5000);
		 //Config.esperar("//XCUIElementTypeButton[@name=\"Pagar Préstamo\"]");
		 
		// MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Pagar préstamo\"]"));
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("Pagar préstamo"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Cuotas\"]");
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de prestamo");	
		 
		 MobileElement cbocta = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
		 cbocta.click();  
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();  
		 
		 MobileElement cbocuotas = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]"));
		 cbocuotas.click(); 
		 
		 MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done2.click();  
		 
		 Thread.sleep(5000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario de pago de prestamo a pagar");	
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Pagar préstamo\"]"));
		 btn_pagar.click(); 
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Confirmar Pago\"]");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done3.click();  
		 		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar Pago?");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 /*	 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btnConfirmLoanPay"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("vTitle");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); */
		 
		 
		 }	 	 
	 
	 public void enviarPlantilla() throws Exception
		{	
		  Thread.sleep(4000);
		 
		 Config.esperar("btn_pay_loan");
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("edt_installments");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 MobileElement menu = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 menu.click(); 
		 
		 MobileElement loadPlant = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 loadPlant.click(); 
		 
		 Config.esperar("btn_exit");
		 
		 MobileElement selPlant = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]"));
		 selPlant.click(); 
		 
		 pin.click(); 
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement btn_pagar = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pagar.click(); 
				 
		 Config.esperar("btn_accept");
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar pago?");		 
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		// Config.esperar("txt_creation_date"); ///espero por ticket
			// Frmwrk.logEvidencia(Config.globalCP, "Ticket");		 
			 
			 
			 //******* comentar cuando encontremos uno que funcione
			 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("home"));
			 btn_back.click(); 
			 
			 btn_confirmar.click(); 
			 
			 btn_back.click(); 
			 ///*******		 
		 
		 }	 	 
	 
	 
	 public void guardarPlantilla() throws Exception
		{	
		 Thread.sleep(4000);		 
		 
		 Config.esperar("btn_pay_loan");
		 
		 MobileElement btn_pay_loan = (MobileElement) Config.driver.findElement(By.id("btn_pay_loan"));
		 btn_pay_loan.click();  		 
		 
		 Config.esperar("edt_installments");
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 MobileElement menu = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 menu.click(); 
		 
		 MobileElement loadPlant = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 loadPlant.click(); 
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]");
		 MobileElement selPlant = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.TextView[1]"));
		 selPlant.click(); 		 		 
		 
		 pin.click();    
		 pin.clear();
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement savePlant = (MobileElement) Config.driver.findElement(By.id("btn_save_template"));
		 savePlant.click(); 
		 
		 MobileElement nomP = (MobileElement) Config.driver.findElement(By.id("edt_template_name"));
		 nomP.click();    
		 nomP.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 Frmwrk.logEvidencia(Config.globalCP, "Plantilla a guardar");	
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 btn_confirmar.click(); 
		 
		 loadPlant.click(); 
		 
		 Config.esperar("btn_exit");
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa plantilla recien guardada");
		 
		 MobileElement btn_exit = (MobileElement) Config.driver.findElement(By.id("btn_exit"));
		 btn_exit.click(); 
		 
		 MobileElement guardBorra = (MobileElement) Config.driver.findElement(By.id("btn_save_draft"));
		 guardBorra.click(); 
		 
		 Config.esperar("txt_title");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el borrador guardado");	 
		 
		 }	 	 
	 
	 public void verDetalle() throws Exception
		{	
		 Thread.sleep(10000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos Prestamo");
		c.swipeV();
		c.swipeV();
		
		Frmwrk.logEvidencia(Config.globalCP, "Datos Prestamo - Ultimos movimientos");
		c.swipeVDown();
		c.swipeVDown();
		 }	 	 
}
