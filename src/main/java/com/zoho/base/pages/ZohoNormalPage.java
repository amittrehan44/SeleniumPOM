package com.zoho.base.pages;

import com.zoho.pages.normal.HomePage;

public interface ZohoNormalPage {

	//Zoho based normal Functions
		ZohoPage goToHomePage();
		ZohoPage goToEnterUsernamePage() throws InterruptedException;
		void submitUsername();
}
