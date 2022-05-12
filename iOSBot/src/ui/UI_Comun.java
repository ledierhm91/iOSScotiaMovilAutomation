package ui;


import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.nativekey.KeyEvent;

import java.time.Duration;

public class UI_Comun {
	 
	 public void swipeV () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.1);
	     int startPoint = (int) (size.height * 0.5);
	     int endPoint = (int) (size.height * 0.3);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeV2 () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.1);
	     int startPoint = (int) (size.height * 0.95);
	     int endPoint = (int) (size.height * 0.65);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVDown2 () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.70);
	     int endPoint = (int) (size.height * 0.95);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVDown () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.1);
	     int startPoint = (int) (size.height * 0.3);
	     int endPoint = (int) (size.height * 0.5);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVDownPromo () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.79);
	     int endPoint = (int) (size.height * 0.85);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVPromo () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.85);
	     int endPoint = (int) (size.height * 0.79);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVPerfilUP () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);	     
	     int startPoint = 0;int endPoint = 0;
	     
	     if (Config.driver.getCapabilities().getCapability("udid") != null)
	     { if (Config.driver.getCapabilities().getCapability("udid").equals("42007aa7d3b1a57b"))
	     { startPoint = (int) (size.height * 0.72);
	      endPoint = (int) (size.height * 0.62);
	     // System.out.println("1");
	      }
	      }
	     else if (Config.driver.getCapabilities().getCapability("udid") == null)
	     { startPoint = (int) (size.height * 0.65); 
	      endPoint = (int) (size.height * 0.53);
	      //System.out.println("2");
	      } 	    
	     else
	     { startPoint = (int) (size.height * 0.75); 
	      endPoint = (int) (size.height * 0.65);
	     // System.out.println("3");
	      } 	     
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVPerfilDOWN () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.65);
	     int endPoint = (int) (size.height * 0.75);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVsuc () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.8);
	     int endPoint = (int) (size.height * 0.7);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(500)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVsuc2 () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.65);
	     int endPoint = (int) (size.height * 0.45);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVsuc3 () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint=0;
	     int endPoint =0;
	     
	     String pp= (String) Config.driver.getCapabilities().getCapability("deviceName");
	     
	     if ( pp.contentEquals( "iPhone Xs Max"))
	     {  
	     startPoint = (int) (size.height * 0.57);
	     endPoint = (int) (size.height * 0.53);
	    
	 
	     }
	     
	     else
	    	 
	     {  
		    startPoint = (int) (size.height * 0.64);
		   endPoint = (int) (size.height * 0.58);
		  
		     }	 
	     
	  //   System.out.println (pp);
	     
	     
	     
	     
	     
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1500)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVDownsuc3 () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.58);
	     int endPoint = (int) (size.height * 0.64);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void swipeVDownsuc () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int startPoint = (int) (size.height * 0.7);
	     int endPoint = (int) (size.height * 0.75);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, startPoint))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(anchor, endPoint))
	                .release().perform();
		 }
	 
	 public void tapPF () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.5);
	     int alto = (int) (size.height * 0.4);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, alto))
	                .waitAction(waitOptions(ofMillis(1000)))	                
	                .release().perform();
		 }
	 
	 public void tapMsg () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	     int anchor = (int) (size.width * 0.6);
	     int alto = (int) (size.height * 0.24);
	 
	     new TouchAction(Config.driver)
	                .press(point(anchor, alto))
	                .waitAction(waitOptions(ofMillis(1000)))	                
	                .release().perform();
		 }
	 
	 
	 public void swipeHLR () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	        int anchor = (int) (size.height *  0.5);
	        int startPoint = (int) (1);
	        int endPoint = (int) (size.width * 0.9);
	 
	      //  System.out.println(size.height+ "_"+ size.width + "_"+ anchor + "_"+ startPoint +"_" + endPoint);
	   //     
	        
	        new TouchAction(Config.driver)
	                .press(point(startPoint, anchor))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(endPoint, anchor))
	                .release().perform();
	        
	      //  System.out.println("Listo");
		 }
	 
	 public void home () throws Exception
		{
		Thread.sleep(1000);
	 //   c.swipeHLR();
	   // c.swipeHRL();
	    //c.swipeHLR();
		MobileElement home = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther"));
	    home.click();  
	    Thread.sleep(1000);
	    Frmwrk.logEvidencia(Config.globalCP, "Boton menu");
	    }	
	 
	 public void swipeHLRcorto () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	        int anchor = (int) (size.height *  0.5);
	        int startPoint = (int) (size.width * 0.2);
	        int endPoint = (int) (size.width * 0.95);
	 
	      //  System.out.println(size.height+ "_"+ size.width + "_"+ anchor + "_"+ startPoint +"_" + endPoint);
	   //     
	        
	        new TouchAction(Config.driver)
	                .press(point(startPoint, anchor))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(endPoint, anchor))
	                .release().perform();
	        
	      //  System.out.println("Listo");
		 }
	 
	 public void swipeHRL () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	        int anchor = (int) (size.height *  0.3);
	        int startPoint = (int) (size.width * 0.9);
	        int endPoint = (int) (1);
	 
	    //    System.out.println(size.height+ "_"+ size.width + "_"+ anchor + "_"+ startPoint +"_" + endPoint);
	        
	        
	        new TouchAction(Config.driver)
	                .press(point(startPoint, anchor))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(endPoint, anchor))
	                .release().perform();
	        
	    //    System.out.println("Listo");
		 }
	 
	 public void swipeHRLcorto () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	        int anchor = (int) (size.height *  0.3);
	        int startPoint = (int) (size.width * 0.95);
	        int endPoint = (int) (size.width * 0.2);
	 
	    //    System.out.println(size.height+ "_"+ size.width + "_"+ anchor + "_"+ startPoint +"_" + endPoint);
	        
	        
	        new TouchAction(Config.driver)
	                .press(point(startPoint, anchor))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(endPoint, anchor))
	                .release().perform();
	        
	    //    System.out.println("Listo");
		 }
	 
	  public void tapByCoordinates (int x,  int y) {
	        new TouchAction(Config.driver)
	                .tap(point(x,y))
	                .waitAction(waitOptions(Duration.ofMillis(250))).perform();
	    }
	  
	  
	  public void pinch () throws Exception
		{	
		 Dimension size = Config.driver.manage().window().getSize();
	        int alto = (int) (size.height *  0.5);
	        int ancho = (int) (size.width * 0.5);
	        
	   /*     new TouchAction(Config.driver)
	                .press(point(alto, ancho))
	                .waitAction(waitOptions(ofMillis(1000)))
	                .moveTo(point(alto, ancho))
	                .release().perform();*/
	      //Zoom
            TouchAction finger1= new TouchAction(Config.driver);
            finger1.press(point(ancho, alto+10)).moveTo(point(ancho, alto+300)).release();

            TouchAction finger2= new TouchAction(Config.driver);
            finger2.press(point(ancho, alto-10)).moveTo(point(ancho, alto-300)).release();

            MultiTouchAction action= new MultiTouchAction(Config.driver);
            action.add(finger1).add(finger2).perform();

            Thread.sleep(8000);
/*
            //Pinch
            TouchAction finger3= new TouchAction(Config.driver);
            finger3.press(point(alto, ancho-200)).moveTo(point(alto, ancho-50));

            TouchAction finger4= new TouchAction(Config.driver);
            finger4.press(point(alto, ancho+200)).moveTo(point(alto, ancho+50));

            MultiTouchAction action2= new MultiTouchAction(Config.driver);
            action2.add(finger3).add(finger4).perform();*/
	        
	        
		 }
	  

	  public void zoomIN() throws Exception
		{	
		  MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Acercar\"]"));
		  btn.click();
	        
		 }
	  public void zoomOUT() throws Exception
			{	
			  MobileElement btn = (MobileElement) Config.driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Alejar\"]"));
			  btn.click();
		        
			 }
	  
	 
	  public void backButton() throws AWTException {
			MobileElement ini = (MobileElement) Config.driver.findElement(By.id("btn_home"));
			ini.click();
		    MobileElement cancel = (MobileElement) Config.driver.findElement(By.id("btn_cancel"));
		    cancel.click();  
	  }
	  
	  public void salirTransaccion() throws AWTException {
			MobileElement ini = (MobileElement) Config.driver.findElement(By.id("btn_home"));
			ini.click();
		    MobileElement aceptar = (MobileElement) Config.driver.findElement(By.id("btn_accept"));
		    aceptar.click();  
	  }
	  
	  public void clickOK() throws Exception {
		  	 Config.esperar("//XCUIElementTypeButton[@name=\"OK\"]");
			 Frmwrk.logEvidencia(Config.globalCP, "Mensaje");
			 
			 MobileElement btnok = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
			 btnok.click(); 
	  }

	  

}
