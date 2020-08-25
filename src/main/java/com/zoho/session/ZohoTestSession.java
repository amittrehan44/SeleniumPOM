package com.zoho.session;

import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoPage;
import com.zoho.pages.normal.LaunchPage;
import com.zoho.reports.ExtentManager;
import com.zoho.web.WebConnector;
import com.zoho.web.ZohoDriver;

public class ZohoTestSession {
	WebConnector con;
	ZohoPage currentPage;
	
	ExtentReports reports;
	ExtentTest test;

	public ZohoTestSession() {
		con = new ZohoDriver();
	}
	
	public ZohoPage init(String TestName) {
		if(Reporter.getCurrentTestResult().getTestContext().getAttribute("session") == null)
		Reporter.getCurrentTestResult().getTestContext().setAttribute("session", this);
		
		//init reports
		reports = ExtentManager.getReport(Constants.REPORTS_PATH);
		test = reports.createTest(TestName);
		
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
	
	public void log(String message) {
		test.log(Status.INFO, message);
	}
	
	public void genrateReports() {
		reports.flush();
	}
	
}
