package com.zoho.pages.normal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.ZohoBasePage;
import com.zoho.base.pages.ZohoPage;

public class HomePage extends ZohoBasePage {
	
	public HomePage() {
		
	}


	@FindBy (css = "a.zh-login")
	WebElement loginLink;
	
	@FindBy (xpath = "//a[@class='zh-login']")
	WebElement loginLink1;

	public ZohoPage goToEnterUsernamePage() throws InterruptedException {
		log("going to Enter Username Page");
		Thread.sleep(2000);
		loginLink1.click();
		return new EnterUsernamePage();
	}
}
