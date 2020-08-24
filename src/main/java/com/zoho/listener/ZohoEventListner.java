package com.zoho.listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.testng.Reporter;

import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public class ZohoEventListner extends AbstractWebDriverEventListener {
	
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before finding element "+by);
		System.out.println("Before finding element "+element);
		System.out.println("Before finding element "+driver);
		
		boolean err=false;
		if(err) {
			getDriver().getSoftAssert().fail("Element not found:- "+by);
			getDriver().assertAll();
		}
		
		//validate presence and visibility
		
	}
	
	public ZohoTestSession getSession() {
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	public WebConnector getDriver() {
		return getSession().getCon();
	}

}
