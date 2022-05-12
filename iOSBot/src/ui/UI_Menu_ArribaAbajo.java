package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Menu_ArribaAbajo {	
	
	 UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
	 
	 public void inicio() throws Exception
		{
	    c.swipeHLR();
	    
	    c.swipeVDown();
	 	 Config.esperar("//XCUIElementTypeButton[@name=\"Inicio\"]");
	    MobileElement btn_inicio = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Inicio\"]"));
	    btn_inicio.click(); 
	    
	    }	 	
	 
	 public void cuentas () throws Exception
		{
		 ini();
		 Config.esperar("//XCUIElementTypeButton[@name=\"quickAction Accounts off\"]");
	    MobileElement btn_cuentas = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"quickAction Accounts off\"]"));
	    btn_cuentas.click(); 
	    }
	 
	 public void tarjetas () throws Exception
		{ini();
		 
		  Config.esperar("//XCUIElementTypeButton[@name=\"quickAction CreditCards off\"]");
	    MobileElement btn_tarj = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"quickAction CreditCards off\"]"));
	    btn_tarj.click(); 
	    
	/*    Config.esperar("com.android.packageinstaller:id/permission_deny_button");
	    MobileElement btn_deny = (MobileElement) Config.driver.findElement(By.xpath("com.android.packageinstaller:id/permission_deny_button"));
	    btn_deny.click(); */
	    
	   // 
	   //Config.driver.switchTo().alert().accept();
	    }	
	 
	 public void ubicacion () throws Exception
		{
		 ini();
	 	 Config.esperar("//XCUIElementTypeButton[@name=\"quickAction Locations off\"]");
	    MobileElement btn_ubicacion = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"quickAction Locations off\"]"));
	    btn_ubicacion.click();  
	    }
	 
	 
	 
	 public void prestamos () throws Exception
		{ini();
	 	 Config.esperar("//XCUIElementTypeButton[@name=\"quickAction Loans off\"]");
	    MobileElement btn_loan = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"quickAction Loans off\"]"));
	    btn_loan.click();  
	    }	
	 
	 public void prestamosBack () throws Exception
		{ MobileElement btn_loan = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Préstamos\"]"));
	    btn_loan.click();  
	    }	
	 
	 
	 public void cotizaciones () throws Exception
		{ini();
	 	 Config.esperar("//XCUIElementTypeButton[@name=\"quickAction Transfer off\"]");
	    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"quickAction Transfer off\"]"));
	    btn_cotiza.click();  
	    }	
	 
	 public void cotizacionesCompra () throws Exception
		{
	 	 
		 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton");
		 
		 
		 
		 //Thread.sleep(2000);
		 
	    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton"));
	    
	  Thread.sleep(3000);
	    
	    //MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeOther[1]"));
	    
	    
	    
	    ////XCUIElementTypeApplication[@name="Scotia Móvil"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton
	    btn_cotiza.click(); 	    	    
	    
	    MobileElement cbo_cta_deb;
	    cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
	    
	    cbo_cta_deb.click();
	    
	    MobileElement sel;
	    //sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
	    
	    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
	    
	    sel.click();
	    
	    MobileElement cbo_cta_cred;
		
		/* if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]");
			 cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.View/android.view.View/android.widget.FrameLayout[1]/android.widget.ViewAnimator/android.widget.ExpandableListView/android.view.View[1]"));
		 }
		 else
		 {
	    Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]");
	    cbo_cta_cred= (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[3]"));
		 }*/
	    cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
	    
	    cbo_cta_cred.click();
	    
	    Thread.sleep(2000);
	    
	    c.swipeVsuc2();
	    
	    MobileElement sel2;
	    sel2 = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));

	    sel2.click();	    
	    
	    MobileElement cbo_mnd;
	    
	  
		 {
	   cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 }
	    
	    cbo_mnd.click(); 
	    
	    c.swipeVsuc2();

	    sel.click();
	    
	    MobileElement sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
	    sel_importe.click();
	    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
	    
	    MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done.click();  
	    
	    c.swipeV();
	    
	    MobileElement sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
	    sel_ref.click();
	    sel_ref.sendKeys("Prb Compra");
	    
	    MobileElement done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done2.click();  
	    
	    c.swipeV();
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Datos de compra");	
	    
	    Config.esperar("btnTransfer");
	    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Transferir\"])[1]"));
	    btn_transf.click();
	    
	    
	    Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField");
	    
	    c.swipeV();
	    
	    MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
	    pin.click();
	    pin.sendKeys(Config.globalPin);
	    
	    MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
	    done3.click();   
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Datos de compra - Confirmar");	
	    
	    MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
	    btn_confirmar.click();
	    
	    Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
	    Frmwrk.logEvidencia(Config.globalCP, "Compra realizada");	
	    
	    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
	    btn_ok.click();
	    
	    ini();
	    
	    }	
	 
	 public void cotizacionesVenta () throws Exception
		{
		 cotizaciones();
		 c.swipeV();
		 c.swipeV();
		 
		// USD UYU USD
		 
		 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton");
		    MobileElement btn_cotiza = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[6]/XCUIElementTypeButton"));
		    btn_cotiza.click(); 	    	    
		    
		    
		    MobileElement cbo_cta_deb = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		    cbo_cta_deb.click();
		    
		    Thread.sleep(2000);
		    c.swipeVsuc3();
		    c.swipeVsuc3();
		    
		    MobileElement  sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement  cbo_cta_cred = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton"));
		    cbo_cta_cred.click();
		     c.swipeVsuc3();
		    
		    Thread.sleep(1000);
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();	    
		    
		    MobileElement  cbo_mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
			cbo_mnd.click(); 
		    
		    Thread.sleep(1000);
		    
		  //  c.swipeVsuc2();
		    c.swipeVsuc3();
		    sel = (MobileElement) Config.driver.findElement(By.xpath("///XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		    sel.click();
		    
		    MobileElement  sel_importe = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]"));
		     sel_importe.click();
		    sel_importe.sendKeys(Config.getRandomNumber(30, 60));
		    
		    MobileElement  done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done.click();  
		    
		    c.swipeV();
		    
		    MobileElement  sel_ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]"));
			   sel_ref.click();
		    sel_ref.sendKeys("USD UYU USD");
		    
		    MobileElement  done2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		    done2.click();  
		    
		    c.swipeV();
		    
		    Frmwrk.logEvidencia(Config.globalCP, "");	
		    
		    
		    MobileElement  btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
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
		    
		    MobileElement  btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		    btn_ok.click();
		    
		    ini();
		    
		    
	    }	
	 	 
	 
	 
	 public void ini () throws Exception
		{
	     MobileElement btn_ini = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Inicio\"]"));
	    btn_ini.click(); 
	    }
	 
	
	 
	 public void contactos () throws Exception
		{ini();
		Config.esperar("//XCUIElementTypeButton[@name=\"Contactos\"]");
	    MobileElement btn_contacts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Contactos\"]"));
	    btn_contacts.click(); 
	    
	    Thread.sleep(2000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos pantalla de Contact center");
	    
	    c.swipeV();
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos pantalla de Contact center");
	    
	    c.swipeVDown();
	    
	    MobileElement btn_contacts2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Sucursales\"]"));
	    btn_contacts2.click();
	    
	    Thread.sleep(2000);
	    
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos sucursales de Montevideo");
	    
	    MobileElement btn_contacts3 ;
		btn_contacts3 = (MobileElement) Config.driver.findElement(By.xpath("(//XCUIElementTypeOther[@name=\"Montevideo\"])[2]"));
		
	    btn_contacts3.click();
	    
	    Thread.sleep(1000);
	   
	    Frmwrk.logEvidencia(Config.globalCP, "Vemos sucursales del interior");
	    } 
	 
		 
//----------------------------------------------------------------------------	
	 
	 public void promociones() throws Exception
		{ini();
		Config.esperar("//XCUIElementTypeButton[@name=\"Promociones\"]");
	    MobileElement btn_promo = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Promociones\"]"));
	    btn_promo.click();  
	    }
	 
	 public void promoFiltro() throws Exception
		{
		 Config.esperar("//XCUIElementTypeButton[@name=\"promotions filter icon slice\"]");
	   MobileElement btn_promo_filtro = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"promotions filter icon slice\"]"));
	   btn_promo_filtro.click();  
	    }
	 
	 public void promoOPTodos() throws Exception
		{ Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		
		c.swipeVDownPromo();
		c.swipeVDownPromo();
		c.swipeVDownPromo();
		c.swipeVDownPromo();
		
	   MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
	   btn_ok.click();  
	    }
	 public void promoOPMusica() throws Exception
		{Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		
		c.swipeVPromo();
		
	   MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
	   btn_ok.click();   
	    }
	 public void promoOPVestimenta() throws Exception
		{Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		
		c.swipeVPromo();
		
	   MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
	   btn_ok.click();   
	    }
	 public void promoOPHogar() throws Exception
		{Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		
		c.swipeVPromo();
		
	   MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
	   btn_ok.click();  
	    }
	 
	 public void promo1() throws Exception
		{
		 MobileElement btn_promo_1;
		btn_promo_1 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
		btn_promo_1.click();  
	    }
	 
	 public void promoBack() throws Exception
		{
		 
		 MobileElement btn_promo_back;
		 btn_promo_back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
	     btn_promo_back.click();  
	    }
	 
	 public void promoLlamarSuc() throws Exception
		{
	   MobileElement btn_promo_ = (MobileElement) Config.driver.findElement(By.id("button3"));
	   btn_promo_.click();  
	    }

	 
	 //----------------------------------------------------------------------------	 
	 
	 public void transferir() throws Exception
		{ini();
		Config.esperar("//XCUIElementTypeButton[@name=\"Transferir\"]");
	    MobileElement btn_transf = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
	    btn_transf.click();  
	    }
	 
	 public void scotiapagos () throws Exception
		{/*ini();
	    MobileElement scotiapagos = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name="ScotiaPagos"]"));
	    scotiapagos.click();  
	    
	    Config.esperar("btnPositive");
	    MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		 btn_ok.click(); */		 
}
	 
	
	 
	 
	 
	 
	 
	 
	 
}
