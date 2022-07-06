package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Menu_Izq {	
	
	 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	 
	 public void home () throws Exception
		{
		//Thread.sleep(3000);
	 //   c.swipeHLR();
	   // c.swipeHRL();
	    //c.swipeHLR();
		MobileElement home = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"Bienvenido a Scotiabank\"]/XCUIElementTypeButton"));
	    home.click();  
	    Thread.sleep(5000);
	    Frmwrk.logEvidencia(Config.globalCP, "Swipe de izquierda a derecha (menu)");
	    }	
	 
	 
	 public void back() throws Exception
		{
		Thread.sleep(3000);
	 //   c.swipeHLR();
	   // c.swipeHRL();
	    //c.swipeHLR();
		MobileElement home = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
	    home.click();  
	    Thread.sleep(5000);
	    Frmwrk.logEvidencia(Config.globalCP, "Volvimos");
	    }	
	 
	 public void plazoFijo () throws Exception
		{
		Thread.sleep(2000);
	    c.swipeHRLcorto();//c.swipeHRLcorto();
	    Thread.sleep(4000);
	   // c.swipeHRL();	
	   // c.swipeHRL();
	   // c.swipeHRL();
	    //Frmwrk.logEvidencia(Config.globalCP, "Swipe de izquierda a derecha (men�)");
	    }	
	 
	 //------------------------
	 public void seleccionPerfil () throws Exception
		{
	    //c.swipeHLR();
	  //  Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton");
	   
		 Thread.sleep(2000);
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
	    btn_.click(); 	    
	    }
	 
	 
	 public void seleccionAmbiente () throws Exception
		{
	    MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
	    btn_.click(); 	    
	    }
	 
	 
	//------------------------
	 public void salir () throws Exception
		{
		// Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton");
		// Thread.sleep(2000);
		 
		MobileElement btn_salir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeButton"));
	    btn_salir.click(); 
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Acepta salir del sistema?");
	    
	    //Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");
	   // Thread.sleep(2000);
	    MobileElement btn_aceptar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
	    //btn_aceptar.click(); 
	    c.click(btn_aceptar);
	    }	
	
	 
	 public void cuentas () throws Exception
		{c.swipeVDown();
		
		MobileElement btn_cuentas ;
		
		
		//Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]" );
	     btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    
	    btn_cuentas.click(); 
	    }
	 
	    
	    
	 public void transferir () throws Exception
		{
		 c.swipeVDown();
		 
		 Thread.sleep(2000);
		 
		 MobileElement btn_transf;
		 
		 
		// Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
	    btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    
	    btn_transf.click(); 
	    }
	 
	 public void pagos () throws Exception
		{c.swipeVDown();
		// Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout");
	    MobileElement btn_pagos = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    btn_pagos.click();  
	    }
	 
	 public void solicChequera () throws Exception
		{//c.swipeVDown();
		 MobileElement btn_scheq;
		 
	//	 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]");
		 btn_scheq = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    
	    btn_scheq.click(); 
	    } 
	 
	 public void tarjetas () throws Exception
		{c.swipeVDown();
		
		MobileElement btn_tarj;
		 
	//	 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]");
		 btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
			 
	     btn_tarj.click();  
	    }	
	 
	 public void prestamos () throws Exception
		{c.swipeVDown();
		
		
		 MobileElement btn_loan;
		 
	//	 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]");
		 btn_loan = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[5]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	     
	     btn_loan.click();  
	  //  Config.esperar("btn_pay_loan");
	    }	
	 
	 public void transaccionesPendientes () throws Exception
		{
		 Config.esperar("btn_pending");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 
		 Config.esperar("txt_title");
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el listado de transacciones pendientes");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Bajamos en el listado");
		 
		 c.swipeV();
		 c.swipeV();
		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Bajamos en el listado");
		 
		}
	 
	//------------------------------------------------------------------------------------
	 
	 public void sucursalesYcajeros() throws Exception
		{	//c.swipeV();
		 
		 MobileElement btn_suc, btn_all;
		 
		// Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]");
		 btn_suc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    btn_suc.click();  
	    
	    Thread.sleep(2000);
	    
	    btn_all = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow While Using App\"]"));
		 
	    btn_all.click();  
	    
	    
	    }
	 
	 public void sycBtnSuc() throws Exception
		{	
		MobileElement btn_suc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]"));
	    btn_suc.click();  
	    }
	 public void sycBtnCaj() throws Exception
		{	
		MobileElement btn_suc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
	    btn_suc.click();  
	    }
	 
	 
	 public void sycBtnOpenMap() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"list map icon slice\"]"));
	    btn_.click();  
	    }
	 
	 public void sycBtnFiltro() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"filters movements icon slice (\"]"));
	    btn_.click();  
	    }
	 
	 public void sycBtnback() throws Exception
		{	 MobileElement btn_;
		
		Thread.sleep(2000);
	 {//Config.esperar("//XCUIElementTypeButton[@name=\"Sucursales y Cajeros\"]");
	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Sucursales y Cajeros\"]"));
	 }  
	 
	 btn_.click();  
	    
	    }
	 
	 public void sycBtnFiltroMdeo() throws Exception
		{	
		// MobileElement btn_;
			
		 
		// {
		// btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel/XCUIElementTypeOther[3]"));
		 //}
		// btn_.click();  
		 c.swipeVsuc2();
		 MobileElement btn_ok;
		 {
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 }
		 btn_ok.click(); 
		 
	    }
	 public void sycBtnFiltroInt() throws Exception
		{	
	//	MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel/XCUIElementTypeOther[1]"));
	  //  btn_.click();  
	   MobileElement btn_ok;
		 {
		 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 }
		 btn_ok.click(); 
	    }
	 public void sycBtnFiltroTodos() throws Exception
		{	
		// MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel/XCUIElementTypeOther[2]"));
		 //   btn_.click(); 
		 
		 c.swipeVsuc3();
		    MobileElement btn_ok;
			 {
			 btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 }
			 btn_ok.click(); 
	    }
	 
	 public void sycBtnlistaItem3() throws Exception
		{	
		 MobileElement btn_;
			
		 {
		 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]");
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]"));
		 }
		
		btn_.click();  
	    }
	 public void sycBtnlistaItem4() throws Exception
		{	MobileElement btn_;
		
	 {
	 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]");
	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]"));
	 }
	 btn_.click();  
	    }
	 
	//------------------------------------------------------------------------------------
	 
	 public void backMenu() throws Exception
		{	
	    	 MobileElement btn_;
			
		     btn_ = (MobileElement) Config.driver.findElement(By.name("Bienvenido a Scotiabank"));//xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
			 
			 btn_.click();
	    }
	 
	 public void mensajes() throws Exception
		{//	c.swipeV();
		 MobileElement btn_msgs;
		 
	//	 Config.esperar("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[7]");
		 btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    btn_msgs.click();  
	    }
	 
	 public void mensajesSelec1() throws Exception
		{
		 
	/*	 MobileElement btn_;
			
		 {
	//	Config.esperar("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
	    btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
		 }
		 btn_.click();
*/
		// Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		 Thread.sleep(5000);  
		 c.tapMsg();
		 c.tapMsg();
	    }
	 
	 public void mensajesSelec1Reply() throws Exception
		{
		//Config.esperar("//XCUIElementTypeButton[@name=\"Responder\"]");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Responder\"]"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajesSelec1ReplyandSend() throws Exception
		{
		//Config.esperar("//XCUIElementTypeStaticText[@name=\"Mensaje Nuevo\"]");
		
		MobileElement btn_a = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));	   
	    btn_a.click();  
	    btn_a.sendKeys("Este es un asunto");
	    
	    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done.click();  
	    
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView"));	   
	    btn_msgs.click();  
	    btn_msgs.sendKeys("Este es un texto de prueba para responder");
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje a enviar (respuesta)");
	    
	    MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done2.click(); 
	    
	    MobileElement btn_send = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"newMessage send icon slice\"]"));	   
	    btn_send.click();  
	    
	    Thread.sleep(8000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Confirmacion");
	    
	    MobileElement btn_ok= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));	   
	    btn_ok.click(); 
	    
	    }
	 
	 public void mensajesSelec1Replyback() throws Exception
		{Thread.sleep(20000);
		
		 MobileElement btn_msgs;
			
		 {
		//Config.esperar("//XCUIElementTypeButton[@name=\"Mensajes\"]");
	     btn_msgs = (MobileElement) Config.driver.findElement(By.name("Mensajes"));//xpath("//XCUIElementTypeButton[@name=\"Mensajes\"]"));
		 }
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTipos() throws Exception
		{
	//	Config.esperar("//XCUIElementTypeButton[@name=\"promotions filter icon slice\"]");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.name("promotions filter icon slice"));//.xpath("//XCUIElementTypeButton[@name=\"promotions filter icon slice\"]"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTiposEnv() throws Exception
		{
		 MobileElement btn_msgs;
		 {
		 
	//	Config.esperar("//XCUIElementTypeButton[@name=\"Enviados\"]");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.name("Enviados"));//By.xpath("//XCUIElementTypeButton[@name=\"Enviados\"]"));
		 }
	    btn_msgs.click();  
	    }
	 
	 public void mensajesTiposRec() throws Exception
		{
	//	Config.esperar("//XCUIElementTypeButton[@name=\"Recibidos\"]");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.name("Recibidos"));//By.xpath("//XCUIElementTypeButton[@name=\"Recibidos\"]"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void mensajeNuevo() throws Exception
		{
		MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.name("new messages icon slice"));//By.xpath("//XCUIElementTypeButton[@name=\"new messages icon slice\"]"));
	    btn_msgs.click();  
	    
	  //  Config.esperar("//XCUIElementTypeStaticText[@name=\"Mensaje Nuevo\"]");
	    Thread.sleep(5000);
	    MobileElement btn_subj = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
	    btn_subj.click(); 
	    btn_subj.sendKeys("Asunto prueba");
	    
	    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done.click();  
	    
	    MobileElement btn_dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccioná destino\"]"));
	    btn_dest.click(); 

	    MobileElement btn_dest_sel = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"1 Consultas : Atención al cliente\"]"));
	    btn_dest_sel.click(); 
	    
	    MobileElement btn_msg = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView"));	   
	    btn_msg.click();  
	    btn_msg.sendKeys("Este es un texto de prueba nuevo");
	    
	    MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done2.click();   
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Mensaje a enviar");
	    
	 //   MobileElement btn_attach = (MobileElement) Config.driver.findElement(By.id("btnAttach"));	   
	 //   btn_attach.click();  
	    
	//    Frmwrk.logEvidencia(Config.globalCP, "attach");
	    
	//    MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("contentPanel"));	   
	//    btn_back.click(); 	    
	    
	    MobileElement btn_send = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"newMessage send icon slice\"]"));	   
	    btn_send.click();  
	    
	    Thread.sleep(8000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Confirmacion");
	    
	    MobileElement btn_ok= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));	   
	    btn_ok.click(); 
	    
	    }
	 
	 
	 public void transacciones() throws Exception
		{		c.swipeV();
		
		MobileElement btn_pend;
		 
	//	Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[8]");
		btn_pend = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    btn_pend.click();  
		}
	 
	 
	 public void transaccionesCombo() throws Exception
		{
		Config.esperar("text1");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.id("text1"));
	   
	    btn_msgs.click();  
	    }
	 
	 public void transaccionesFiltrar() throws Exception
		{
		Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Todas");	
		
		if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
		    MobileElement btn_msgs;
		    
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan Todas");
		    
		    MobileElement btn_cbo = (MobileElement) Config.driver.findElement(By.id("text1"));		   
		    btn_cbo.click(); 	    
		    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Pendientes");
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Pendientes");
		    
		    btn_cbo.click(); 	    
		    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Finalizadas");
		    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
		    btn_msgs.click();  
		    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Finalizadas");
		    }
		 else
		 {
		
		Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
	    MobileElement btn_msgs;
	    
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan Todas");
	    
	    MobileElement btn_cbo = (MobileElement) Config.driver.findElement(By.id("text1"));		   
	    btn_cbo.click(); 	    
	    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Pendientes");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Pendientes");
	    
	    btn_cbo.click(); 	    
	    Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos Finalizadas");
	    btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]"));
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se listan las Finalizadas");
	    
		 }
	    }
	 
	 
	 public void configuracion () throws Exception
		{c.swipeV();
		
		MobileElement btn_config;
		 
		 
		//Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[9]");
		btn_config = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[10]/XCUIElementTypeOther[1]/XCUIElementTypeOther"));
		 
	    btn_config.click();  
}
	 
	 
	 public void configuracionVerificar() throws Exception
		{
		Config.esperar("//XCUIElementTypeSwitch[@name=\"Iniciar sesion con Fingerprint\"]");
		Frmwrk.logEvidencia(Config.globalCP, "Se muestra el estado actual del switch");
	    MobileElement btn_msgs = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeSwitch[@name=\"Iniciar sesion con Fingerprint\"]"));
	    
	  //XCUIElementTypeSwitch[@name="Iniciar sesion con Fingerprint"]
	    
	   
	    Thread.sleep(5000);
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se clickeo, tiene que haberse modificado");
	    Thread.sleep(3000);
	    btn_msgs.click();  
	    Frmwrk.logEvidencia(Config.globalCP, "Se clickeo, vuelve al estado inicial");
	    }
	 
	 
	 
	 
}
