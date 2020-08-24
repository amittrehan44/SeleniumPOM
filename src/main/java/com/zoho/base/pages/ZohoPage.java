package com.zoho.base.pages;

import com.zoho.pages.normal.EnterPasswordPage;
import com.zoho.pages.normal.HomePage;
import com.zoho.session.ZohoTestSession;
import com.zoho.web.WebConnector;

public interface ZohoPage extends ZohoNormalPage, ZohoSessionPage {
	//normal browser functions
	ZohoPage openBrowser(String browser);
	 void quit();
	 void getTotalWindows();
	 ZohoTestSession getSession();
	
	//Zoho based normal Functions
	 ZohoPage goToHomePage();
	 void goToUserNamePage();
	 void submitUsername();
	 ZohoPage goToEnterUsernamePage() throws InterruptedException;
	 EnterPasswordPage goToPasswordPage();
	WebConnector validator(boolean stopExecution);
	
	// session based functions
	 void createDeal();
	 void logout();
}
