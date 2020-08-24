package com.zoho.base.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.zoho.pages.normal.EnterPasswordPage;
import com.zoho.pages.normal.HomePage;
import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

import org.openqa.selenium.support.events.EventFiringWebDriver;

public  class ZohoBasePage implements ZohoPage {
	
	public ZohoBasePage() {
		PageFactory.initElements(getCurrentDriver(), this);
		//set the page in the session
		getSession().setCurrentPage(this);
		
	}

	public ZohoPage openBrowser(String browser) {
		// TODO Auto-generated method stub
		return null;
	}

	public void quit() {
		// TODO Auto-generated method stub
		
	}



	public ZohoPage goToHomePage() {
		// TODO Auto-generated method stub
		return null;
		
	}

	public  ZohoPage goToEnterUsernamePage() throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
		
	}

	public void submitUsername() {
		// TODO Auto-generated method stub
		
	}

	public void createDeal() {
		// TODO Auto-generated method stub
		
	}

	public void logout() {
		// TODO Auto-generated method stub
		
	}
	


	public void getTotalWindows() {
		// TODO Auto-generated method stub
		
	}

	public void goToUserNamePage() {
		// TODO Auto-generated method stub
		
	}
	
	public ZohoTestSession getSession() {
		return (ZohoTestSession)Reporter.getCurrentTestResult().getTestContext().getAttribute("session");
	}
	
	public WebConnector getCon() {
		return getSession().getCon();
	}

	public EventFiringWebDriver getCurrentDriver() {
		
		return getSession().getCon().getCurrentDriver();
	}

	public EnterPasswordPage goToPasswordPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebConnector validator(boolean stopExecution) {
		//update the flag in web layer
		getSession().getCon().setStopExecution(stopExecution);
		
		return getSession().getCon();
		
	}

}
