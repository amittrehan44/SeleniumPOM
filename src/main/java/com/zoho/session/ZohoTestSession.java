package com.zoho.session;

import org.testng.Reporter;

import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.web.WebConnector;
import com.zoho.web.ZohoDriver;

public class ZohoTestSession {
	WebConnector con;
	ZohoPage currentPage;
	
	

	public ZohoTestSession() {
		con = new ZohoDriver();
	}
	
	public ZohoPage init() {
		if(Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
		Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
		
		ZohoPage page = new LaunchPage();
		return page;
	}

	public WebConnector getCon() {
		return con;
	}
	
	public ZohoPage getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(ZohoPage currentPage) {
		this.currentPage = currentPage;
	}
	
	public void end() {
		 getCon().assertAll();
	}
	
}
