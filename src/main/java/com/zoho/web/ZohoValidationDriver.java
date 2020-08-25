package com.zoho.web;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public abstract class  ZohoValidationDriver implements WebConnector {
	
	EventFiringWebDriver driver;
	boolean stopExecution;
	SoftAssert softAssert = new SoftAssert();
	
	public SoftAssert getSoftAssert() {
		return softAssert;
	}
	public void setSoftAssert(SoftAssert softAssert) {
		this.softAssert = softAssert;
	}
	public void assertAll() {
		//take screenshot
		softAssert.assertAll();
	}
	public boolean isStopExecution() {
		return stopExecution;
	}

	public void setStopExecution(boolean stopExecution) {
		this.stopExecution = stopExecution;
	}

	
	
	public ZohoPage validateTitle(String expectedTitle) {
		//Assert.assertEquals(driver.getTitle(), expectedTitle);
		//System.out.println("validateTitle Status is:- "+ isStopExecution());
		if(!expectedTitle.equals(driver.getTitle())) {
			softAssert.fail("Titles Do Not Match. EXPECTED: "+expectedTitle+" ACTUAL: "+driver.getTitle());
			if(stopExecution) {
				assertAll();
			}
		}
		
		return getSession().getCurrentPage();
		
	}
	
	public ZohoPage validateText(String locator, String expectedText) {
		//Assert.assertEquals(driver.getTitle(), expectedTitle);
		//System.out.println("validateText Status is:- "+ isStopExecution());
		String atualText = "ABC";
		if(!expectedText.equals(atualText)) {
			softAssert.fail("Text Do Not Match");
			if(stopExecution) {
				assertAll();
			}
		}
		return getSession().getCurrentPage();
		
	}

	public void validateLogin() {
		// TODO Auto-generated method stub
		System.out.println("inside class ZohoValidationDriver > Validate login");
		
	}
	
	public ZohoTestSession getSession() {
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public void log(String message) {
		getSession().log(message);
	}

}
