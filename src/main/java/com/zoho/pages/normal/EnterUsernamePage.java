package com.zoho.pages.normal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.zoho.base.pages.ZohoBasePage;



public class EnterUsernamePage extends ZohoBasePage {
	@FindBy (id = "login_id")
	WebElement loginLink;
	
	@FindBy (css = "button#nextbtn > span")
	WebElement nextButton;


	
	public EnterPasswordPage goToPasswordPage() {
		
		loginLink.sendKeys("amit.trehan44@gmail.com");
		nextButton.click();
		return new EnterPasswordPage();
	}

	public EnterUsernamePage() {
		
	}

}
