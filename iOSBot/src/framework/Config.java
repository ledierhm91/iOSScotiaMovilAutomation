/*
 * Classname: Settings 
 * 
 * Version information: 1.0
 *
 * Date: April 22nd 2015
 * 
 * Copyright notice
 */

package framework;

import java.io.File;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.Frmwrk;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Config {
	public static AppiumDriver driver;
	public static String globalPin;
	public static String globalCP;
	public static String globalDescrip=" ";
	public static String globalBrowser;
	public static String globalJD = "xx";

	public static void iniciar(String portNumber, String udid) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// ---------------------------------------------------------------------------------------------

		capabilities.setCapability("deviceName", "iPhone 12 Pro Max");
		//capabilities.setCapability("deviceName", "iPhone Xs Max");
		 //capabilities.setCapability("deviceName", "iPhone 5s");
		
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "15.5"); 

		capabilities.setCapability("automationName", "XCUITest");
		
			capabilities.setCapability("locationServicesEnabled", "true");
		capabilities.setCapability("locationServicesAuthorized", "true");
		//capabilities.setCapability("autoAcceptAlerts", "true"); // no se puede habilitar porque afecta los mensajes de confirmacion de la app
		  capabilities.setCapability("autoGrantPermissions", "true");
		
		
	//	capabilities.setCapability("permissions", "{\"uy.com.scotiabank.scotiabankUPP\": {\"location\": \"inuse\"}}");
		//capabilities.setCapability("permissions", "{\"uy.com.scotiabank.scotiabankUPP\": {\"faceid\": \"NO\"}}");

		capabilities.setCapability("app", "uy.com.scotiabank.scotiabankUPP");
		
		
		 String appUrl = System.getProperty("user.dir") + File.separator + "app"  + File.separator + "Scotiabank.app";
	     capabilities.setCapability("app",appUrl);
		
	   // capabilities.setCapability("udid", udid);

		// capabilities.setCapability("useNewWDA", "true");

		// capabilities.setCapability("autoGrantPermissions", true);

		// ---------------------------------------------------------------------------------------------

		driver = new AppiumDriver(new URL("http://127.0.0.1:" + portNumber + "/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Frmwrk.celu = udid;

	}

	public static void terminarSesion() throws Exception {
		if (driver != null) {
			driver.quit();
		}
	}

	public static MobileElement mobileElement;

	public static boolean esperarPor(String targetResource) {
		boolean isElementPresent;
		try {
			if (targetResource.length() < 30) {
				mobileElement = (MobileElement) driver.findElement(By.id(targetResource));
			} else {
				mobileElement = (MobileElement) driver.findElement(By.xpath(targetResource));
			}
			WebDriverWait wait = new WebDriverWait(driver, 2000);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
			isElementPresent = mobileElement.isDisplayed();

			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			// System.out.println(e.getMessage());
			return isElementPresent;
		}
	}

	public static boolean esperar(String targetResourceId) {
		boolean isElementPresent;
		boolean esta = false;
		int veces = 55;
		try {
			while (esta == false) {
				if (veces > 1) {
					esta = esperarPor(targetResourceId);
					veces = veces - 1;
				} else {
					return isElementPresent = false;
				}
			}
			isElementPresent = true;
			return isElementPresent;
		} catch (Exception e) {
			isElementPresent = false;
			// System.out.println(e.getMessage());
			return isElementPresent;
		}
	}

	public static String getRandomNumber(int min, int max) {

		Random r = new Random();
		return Long.toString(r.longs(min, (max + 1)).findFirst().getAsLong());

	}

}
