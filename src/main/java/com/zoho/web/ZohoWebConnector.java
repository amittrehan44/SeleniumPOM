package com.zoho.web;

import com.zoho.base.pages.ZohoPage;

public interface ZohoWebConnector  {

		void logout();
		ZohoPage validateTitle(String expectedTitle);
		ZohoPage validateText(String locator, String expectedTitle);
		void validateLogin();
}
