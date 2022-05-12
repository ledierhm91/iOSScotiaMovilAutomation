package ui;

import java.sql.ResultSet;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import casosDePrueba.TransferenciaScotia;
import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;


public class UI_Transferir {
	
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 
	
	public void irTransfPropias() throws Exception
	{	
	 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
	 btn_ts.click();   
	 Thread.sleep(1000);
	 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
	 btn_.click(); 
	 }	
	
	 public void irTransfScotia() throws Exception
		{	
		 Thread.sleep(1000);
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 Thread.sleep(1000);
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 }	
	 
	 public void irTransfPlaza() throws Exception
		{	
		 Thread.sleep(1000);
		 MobileElement btn_ts = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[2]"));
		 btn_ts.click();   
		 Thread.sleep(2000);
		 c.swipeVsuc2();
		 Thread.sleep(1000);
		 MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 btn_.click(); 
		 }	
	 
	 public void irTransfScotiaTerc() throws Exception
		{
		 MobileElement btn_tp;

		 if (Frmwrk.versionOSNum.substring(0,1).equals("4") || Frmwrk.versionOSNum.substring(0,1).equals("5"))
		 {Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		 btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 else
		 {		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
		  btn_tp = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]"));
		 }
		 btn_tp.click(); 
		 }	
	 
	 public void completarTransfScotia(String moneda) throws Exception
		{
		 MobileElement cboctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 cboctao.click();
		 Thread.sleep(1000);
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 if (moneda.equals("USD"))
		 {
		 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
		 cbomnd.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 }
		 else
		 {
			 MobileElement cbomnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeButton[1]"));
			 cbomnd.click();
			 Thread.sleep(1000);
			 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
			 mndSel.click(); 
			 }
		 
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
		 
		 if (moneda.equals("USD"))
		 {
		 MobileElement cbomnd2 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 cbomnd2.click();
		 Thread.sleep(1000);
		 c.swipeVsuc3();
		 MobileElement mndSel2= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel2.click(); 
		 }
		 
		 
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
		 refe.setValue("Prueba1");
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 MobileElement swSave = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSwitch"));
		 swSave.click();    
		 
		 Thread.sleep(1000);
		 
		 MobileElement nomTemp = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeTextField"));
		 nomTemp.click();    
		 nomTemp.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 
		 done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 2");

		 }	
	 
	 public void enviarTransfScotia() throws Exception
		{
		 MobileElement btn_transferir = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Transferir\"]"));
		 btn_transferir.click();  

		// if (Frmwrk.plantilla==false)
		 {	 Config.esperar("//XCUIElementTypeButton[@name=\"Aceptar\"]");		 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Terminos y condiciones");
		 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Aceptar\"]"));
		 btn_confirmar.click(); }

		// Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]");	
		 
		 Thread.sleep(1000);
		 
		 //MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField"));
		 pin.click(); 
		 pin.setValue(Config.globalPin);
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");
		 
		 MobileElement btn_tr = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar Transferencia\"]"));
		 btn_tr.click(); 		 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Ticket Transaccion");
		 
		 MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
		 btn_ok.click(); 
		 
		 Thread.sleep(3000);
		 Frmwrk.logEvidencia(Config.globalCP, "Compartir comprobante");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 
		 }	
	 
	 public static boolean validarPago() throws Exception
		{
		 Boolean OK1=false;
		 String monedaDeb="0";
		 String monedaCred="0";
		 float montoDeb=0;
		 float montoCred=0;
		 String moneda="0";
		 String compra="0";
		 String venta="0";
		if (TransferenciaScotia.ctaDeb.substring(3, 6).equals("UYU"))
		{monedaDeb="0";}else{monedaDeb="2225";}		
		if (TransferenciaScotia.ctaCred.substring(3, 6).equals("UYU"))
		{monedaCred="0";}else{monedaCred="2225";}		
		if (TransferenciaScotia.moneda.equals("UYU"))
		{moneda="0";}else{moneda="2225";}
		
		if(monedaCred.equals(monedaDeb) && monedaCred.equals(moneda)) 
		{montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia);
		montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia);}
		else if((monedaCred.equals(monedaDeb) && monedaCred.equals("0") && moneda.equals("2225")) ||
				(monedaCred.equals(monedaDeb) && monedaCred.equals("2225") && moneda.equals("0")))
		{
			String query = "select TCVENTAPERSONAL, TCCOMPRAPERSONAL from banking.monedas where c6399 = 2225";
			 
			 ResultSet datosDB = Frmwrk.consultarBD(query);
			
			 while (datosDB.next()) {{
				 compra = datosDB.getString("TCCOMPRAPERSONAL");
				 venta = datosDB.getString("TCVENTAPERSONAL");
			 }}				 
			 datosDB.close();	
			 
		//	 System.out.println(compra + " - " + venta);
				
			 if (monedaDeb.equals("0"))
			 {montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia)* Float.valueOf(venta);
				montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 else
			 {montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(compra));
				montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(compra);	} 
		}
		else
		{
			String query3 = "select TCVENTAPERSONAL, TCCOMPRAPERSONAL from banking.monedas where c6399 = 2225";
			 
			 ResultSet datosDB3 = Frmwrk.consultarBD(query3);			
			 //System.out.println(query3);
			 while (datosDB3.next()) {{
				 compra = datosDB3.getString("TCCOMPRAPERSONAL");
				 venta = datosDB3.getString("TCVENTAPERSONAL");
			 }}				 
			 datosDB3.close();	
	
			// System.out.println(compra + " - " + venta);
			 
			 if (monedaDeb.equals(moneda))
			 {montoDeb=Float.valueOf(TransferenciaScotia.montoTransferencia);
			 	if (monedaDeb.equals("0"))
			 	{montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(venta));} 
			 	else
			 	{montoCred=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 }
			 else
			 {	if (monedaDeb.equals("0"))
			 	{montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) * Float.valueOf(venta));} 
			 	else
			 	{montoDeb=(Float.valueOf(TransferenciaScotia.montoTransferencia) / Float.valueOf(venta));}
			 
				montoCred=Float.valueOf(TransferenciaScotia.montoTransferencia);	} 
		}	
		
		//-------------------------------------------------------------------------------------------------------
		String query1 = "SELECT * \r\n" + 
		 		"FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9973\r\n" + 
		 		"AND mc.producto   IN (2101, 2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.debitocredito = 'D'\r\n" + 
		 		"AND mc.moneda = '"+ monedaDeb +"' \r\n" + 
		 		"AND mc.cuenta      ='"+TransferenciaScotia.ctaDeb.substring(7, TransferenciaScotia.ctaDeb.length())+"'\r\n" + 
		 		"AND capitalrealizado = TO_NUMBER(" + montoDeb + ")\r\n" +   //String.format("%.02f",montoDeb)
		 		"AND mc.asiento    in\r\n" + 
		 		"(  SELECT asi.asiento\r\n" + 
		 		"  FROM banking.asientos asi\r\n" + 
		 		"  WHERE asi.operacion  IN (9973)\r\n" + 
		 		"  AND asi.estado        = 77\r\n" + 
		 		"  AND asi.iniusr        = 'S82'\r\n" + 
		 		"  AND asi.fechaproceso >= sysdate -1) order by mc.fechaproceso asc" ;
		 
		// System.out.println(query1);
		 ResultSet datosDB1 = Frmwrk.consultarBD(query1);
		 String Asiento1="";
			 while (datosDB1.next() == true)
			 {{{Asiento1 = datosDB1.getString("ASIENTO");
			// System.out.println("01 -"+ Asiento1); 
			 }}	}		 
		 datosDB1.close();
		// System.out.println("1 -"+ Asiento1);		 		 
		
		 String query2 = "SELECT * \r\n" + 
		 		"FROM banking.movimientos_contables mc\r\n" + 
		 		"WHERE mc.sucursal    = 82\r\n" + 
		 		"AND mc.operacion     = 9973\r\n" + 
		 		"AND mc.producto   IN (2101, 2201)\r\n" + 
		 		"AND mc.fechaproceso >= sysdate -1\r\n" + 
		 		"AND mc.debitocredito = 'C'\r\n" + 
		 		"AND mc.moneda = '"+monedaCred+"' \r\n" + 
		 		"AND mc.cuenta      ='" + TransferenciaScotia.ctaCred.substring(7, TransferenciaScotia.ctaCred.length())+"'\r\n" + 
		 		"AND capitalrealizado between TO_NUMBER(" + (montoCred-1)  + ") and TO_NUMBER(" + (montoCred+1)  +  ")\r\n" +  //(df.format(montoCred+1))  + "' and '" + df.format((montoCred-1) -------String.format("%.02f",(montoCred-1))  + "' and '" + String.format("%.02f",(montoCred+1)) 
		 		" AND mc.asiento = '"+ Asiento1 + "' order by mc.fechaproceso asc";
		 
		 ResultSet datosDB2 = Frmwrk.consultarBD(query2);		 	
		// System.out.println(query2);
		 String Asiento2="";
		 while(datosDB2.next() == true)
		 { {{Asiento2 = datosDB2.getString("ASIENTO");
		// System.out.println("02 -"+ Asiento2);}
		 }	}	}		 
		 datosDB2.close();
		// System.out.println("2 -"+ Asiento2);
		 //Asiento2="1";			 
			 
		 if (Asiento1.equals(Asiento2) && !Asiento1.equals(""))
		 {Frmwrk.validacion="BIEN";
			 Frmwrk.logEvidencia(Config.globalCP, "Se valid� la transferencia en la base de datos. Asiento: " 
		 + Asiento1 + " Cuenta D�bito: " + TransferenciaScotia.ctaDeb + " Monto D�bito: " + String.format("%.02f",montoDeb) + " Cuenta Cr�dito: " + TransferenciaScotia.ctaCred + " Monto Cr�dito: " + String.format("%.02f",montoCred));
		 OK1=true;
		 }
		 else
		 {Frmwrk.validacion="MAL";
			 Frmwrk.logEvidencia(Config.globalCP, "Por alguna raz�n no se pudo validar la transferencia con el importe d�bito:" + String.format("%.02f",montoDeb) + " y el monto cr�dito: "+ String.format("%.02f",montoCred) 
		 + ". Por favor validar manualmente. Asientos: D�bito: "+ Asiento1 + " - Cr�dito: " + Asiento2 );	
		 OK1=false;}		
		 
		//-------------------------------------------------------------------------------------------------------
		 
		 if ((OK1 == true))
		 {return true; }
		 else
		 {return false;}
		 }
	 
	 
	 public void completarTransfPlaza() throws Exception
		{	
		 MobileElement ctao = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[3]"));
		 ctao.click();    
		 
		 MobileElement ctaoSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 ctaoSel.click(); 
		 
		 MobileElement bco = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[4]"));
		 bco.click();  
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
		 
		/* MobileElement suc = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[7]"));
		 suc.click();  
		 suc.sendKeys("Aguada");
		 MobileElement done3 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done3.click();*/
		 
		 
		 
		 
		/*
		 MobileElement gtos = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Scotiabank\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 gtos.click();  
		 MobileElement gtosSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 gtosSel.click(); */
		 
		 MobileElement mnd = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[5]"));
		 mnd.click();  
		 MobileElement mndSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 mndSel.click(); 
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia 1");	
		 
		 c.swipeV();
		 c.swipeV();
		 
		 MobileElement monto = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[8]"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(27, 46)); 
		 
		 MobileElement done5 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done5.click();
		 
		 MobileElement dest = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeButton[6]"));
		 dest.click(); 
		 MobileElement destSel= (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Seleccionar\"]"));
		 destSel.click(); 
		 
 		 
		 MobileElement ref = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[10]"));
		 ref.click();    
		 ref.setValue("Prueba Plaza");	
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
		  
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
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
		 
		 Thread.sleep(3000);
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Compartir comprobante");
		 
		 MobileElement btn_volver = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_volver.click(); 
		 
		 Thread.sleep(3000);
		 MobileElement back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
		 back.click(); 
		 
		 }	
	 
	 public void guardarPlantillaTransfScotia() throws Exception
		{	
		 Config.esperar("edt_amount");
		 
		 MobileElement cboCtaDest = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Spinner[2]/android.widget.TextView"));
		 cboCtaDest.click(); 

		 MobileElement selCtaDest = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]"));
		 selCtaDest.click();
		 
		 c.swipeV();

		 MobileElement monto = (MobileElement) Config.driver.findElement(By.id("edt_amount"));
		 monto.click();    
		 monto.setValue(Config.getRandomNumber(180, 360));			 
		 
		 c.swipeV();
		 
		 MobileElement refe = (MobileElement) Config.driver.findElement(By.id("edt_transfer_ref"));
		 refe.click();    
		 refe.setValue("Prueba123");
		 
		 c.swipeV();
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.id("edt_pin"));
		 pin.click();    
		 pin.setValue(Config.globalPin);
		 
		 c.swipeV();
		 
		 MobileElement btn_ops = (MobileElement) Config.driver.findElement(By.id("layout_btns"));
		 btn_ops.click(); 		 
			 
		 MobileElement guardarP= (MobileElement) Config.driver.findElement(By.id("btn_save_template"));
		 guardarP.click();
		 
		 MobileElement nomP = (MobileElement) Config.driver.findElement(By.id("edt_template_name"));
		 nomP.click();    
		 nomP.setValue("A_Nom_" + Frmwrk.obtenerFecha());
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Guardar plantilla");	
		 
		 MobileElement aceptarP= (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		 aceptarP.click();
		 
		 MobileElement cargarPlantilla = (MobileElement) Config.driver.findElement(By.id("btn_load_template"));
		 cargarPlantilla.click();
		 
		 Config.esperar("btn_exit");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa la Plantilla nueva listada");	
		 
		 MobileElement close = (MobileElement) Config.driver.findElement(By.id("btn_exit"));
		 close.click();
		 		 
		 monto.clear();    
		 monto.setValue(Config.getRandomNumber(100, 400));	
		 		 
		 refe.clear();     
		 refe.setValue("PruebaBorra");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Borrador a guardar");
		 
		 c.backButton();
		 
		 MobileElement guardarB = (MobileElement) Config.driver.findElement(By.id("btn_save_draft"));
		 guardarB.click();
		 
		 Config.esperar("txt_title");
		 
		 MobileElement pendientes = (MobileElement) Config.driver.findElement(By.id("btn_pending"));
		 pendientes.click();
		 
		 Config.esperar("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[3]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Se observa el borrador guardado");	
		 
		 }		 
	
	 public void completarTransfFirmante() throws Exception
		{	
		 //////////clickear en el primer link de los pendientes
		 
		 Config.esperar("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Transacciones");
		 
		 MobileElement primeroLista = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
		 primeroLista.click(); 
		 		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"Confirmar\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Pantalla de confirmacion");
		 
		 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Volver\"]"));
		 btn_back.click(); 
		 
		 primeroLista = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
		 primeroLista.click();  		 
		 
		 MobileElement pin = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		 pin.click();    
		 pin.setValue(Config.globalPin);	
		 
		 MobileElement done = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));
		 done.click(); 
			 
		 Frmwrk.logEvidencia(Config.globalCP, "Confirmar transferencia?");	
			 
		 MobileElement btn_confirmar = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Confirmar\"]"));
		 btn_confirmar.click(); 
		 
		 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Transferencia confirmada");
		 
		 //MobileElement btn_ok = (MobileElement) Config.driver.findElement(By.id("btnPositive"));
		// btn_ok.click(); 
		 
		 c.clickOK();
		 
		// btn_back.click(); 
		 Thread.sleep(5000);
		 Frmwrk.logEvidencia(Config.globalCP, "Transaccion desaparecio de la lista");
		 
		 UI_Menu_ArribaAbajo ma = PageFactory.initElements(Config.driver, UI_Menu_ArribaAbajo.class);	
		 ma.promoBack();
		 
		 }	
	 
	 public void enviarPlantillaTransfScotia() throws Exception
		{	
		 Config.esperar("//XCUIElementTypeButton[@name=\"save transfer icon\"]");
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Formulario Transferencias");	
		 
		 MobileElement btnTempl = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"save transfer icon\"]"));
		 btnTempl.click(); 
		 
		 Config.esperar("//XCUIElementTypeStaticText[@name=\"Transferencias guardadas\"]");		 

		 Frmwrk.logEvidencia(Config.globalCP, "Lista plantillas de transferencias");
		 
		 
		 MobileElement seltr1;
		
		  seltr1 = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]"));
		 
		  seltr1.click();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Seleccionamos segundo elemento de la lista");
		 
		 
		 c.swipeV();

		 c.swipeV();
		 
		 Frmwrk.logEvidencia(Config.globalCP, "Datos transferencia");
		 
		 }		 
	 
}
