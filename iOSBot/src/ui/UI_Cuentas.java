package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import framework.Config;
import framework.Frmwrk;
import io.appium.java_client.MobileElement;

public class UI_Cuentas {
	
	UI_Comun c = PageFactory.initElements(Config.driver, UI_Comun.class);
		 
	 public void irCuenta() throws Exception
		{	
		 MobileElement lst_cta = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]"));
		 lst_cta.click();   
		 }	 
	 
	 public void volver() throws Exception
		{		 
		 MobileElement btn_back = (MobileElement) Config.driver.findElement(By.id("home"));
		 btn_back.click(); 
		 }	
	 
	 
	 public void cuentasFA1() throws Exception
		{
		 MobileElement btn_;
		 
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]"));
		
		 btn_.click(); 
	    }
	 public void cuentasFA2() throws Exception
		{
		 MobileElement btn_;
			
		
		 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]"));
		 
		 btn_.click(); 
	    }
	 
	 public void cuentasFAUltMovWait() throws Exception
		{Config.esperar("(//XCUIElementTypeButton[@name=\"Ver todos los movimientos\"])[1]");		
	    }
	 
	 public void cuentasFAUltMovWait2() throws Exception
		{Config.esperar("(//XCUIElementTypeButton[@name=\"Ver todos los movimientos\"])[2]");		
	    }
	 
	 public void cuentasFAUltMov() throws Exception
		{
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Ver todos los movimientos\"])[1]"));
	    btn_.click(); 
	    }
	 
	 public void cuentasFAUltMov2() throws Exception
		{
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"Ver todos los movimientos\"])[2]"));
	    btn_.click(); 
	    }
	     
	    public void cuentasUltMovWait() throws Exception
		{//Config.esperar("//XCUIElementTypeImage[@name=\"no_movements\"]");		
	    }	    
	    
	    public void cuentasFiltro() throws Exception
		{	
		MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
	    btn_.click();
	    }
	    
	    public void cuentasFiltroSelec3() throws Exception
		{	
	    	MobileElement btn_;
			 
	    	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Este mes\"]"));
	    	 btn_.click();
		     Thread.sleep(7000);
		   //  Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");	    
	    }
	    
	    public void cuentasFiltroSelec7() throws Exception
		{	
	    	MobileElement btn_;
			
	    	 btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[7]"));
	    	 btn_.click();
		     Thread.sleep(5000);
		     Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ViewAnimator/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]");	    
	    }
	    
	    public void cuentasBack() throws Exception
		{	
	    	 MobileElement btn_;
			
		     btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cuentas\"]"));
			 
			 btn_.click();
	    }
	    
	    public void cuentasBack2() throws Exception
		{	
	    	 MobileElement btn_;
			
		     btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Bienvenido a Scotiabank\"]"));
			 
			 btn_.click();
	    }
	    
	    
	    public void cuentasCuadro() throws Exception
		{	
	    	 MobileElement btn_;
				
			 
			 {
	    	
				 //btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther"));
				 
				 btn_ = (MobileElement) Config.driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"" + Frmwrk.NombreApp + "\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeOther/XCUIElementTypeOther"));
				
			 }
		
		btn_.click();
	    }
	    
	    
	    public void cuentaPF() throws Exception
		{	Thread.sleep(5000);
	   // Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]");
		//MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView[1]"));
	   
		//Config.esperar("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout");
		//MobileElement btn_ = (MobileElement) Config.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.ViewAnimator/android.view.ViewGroup/android.support.v4.view.ViewPager/android.widget.FrameLayout[2]/android.widget.LinearLayout"));
	   
		//btn_.click();
		
		c.tapPF();
	    }
	    
	    
	    
}
