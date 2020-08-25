package com.zoho.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Reporter;

import com.zoho.listener.ZohoEventListner;
import com.zoho.session.ZohoTestSession;

public  class ZohoDriver extends ZohoValidationDriver {
	
	

	public void logout() {
		// TODO Auto-generated method stub
		
	}



	public void openBrowser(String browser) {
		// TODO Auto-generated method stub
		log("Opening Brwsercinside class ZohoDriver > openBrowser: "+browser);
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "/Users/amit/Documents/Selenium/chromedriver");
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new ZohoEventListner());
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public void navigate(String url) {
		// TODO Auto-generated method stub
		driver.get(url);
		
	}
	
	public EventFiringWebDriver getCurrentDriver() {
		return driver;
		
	}



	public void quit() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
