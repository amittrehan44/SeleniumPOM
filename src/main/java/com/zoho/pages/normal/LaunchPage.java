package com.zoho.pages.normal;

import org.openqa.selenium.WebDriver;

import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;
import com.zoho.session.ZohoTestSession;

public class LaunchPage extends ZohoBasePage {
	
	public LaunchPage() {
	}

	public ZohoPage openBrowser(String Browser) {;
		log("OpenBrowser in LaunchPage class");
		ZohoTestSession session = getSession();
		session.getCon().openBrowser(Browser);
		return this;
	}

	public ZohoPage goToHomePage() {
		log("Go To Home page from Launch Page");
		ZohoTestSession session = getSession();
		session.getCon().navigate("https://Zoho.com");
		return new HomePage();
	}
}
