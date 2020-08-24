package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.zoho.base.pages.ZohoPage;
import com.zoho.listener.ZohoEventListner;
import com.zoho.session.ZohoTestSession;
import com.zoho.web.ZohoDriver;
import com.zoho.web.ZohoWebConnector;


public class LoginTest {
	
	@Test
	public void loginTest() throws InterruptedException {
		
		
		
		
		ZohoTestSession session = new ZohoTestSession(); //webConnecter initialized
		session
		.init()		//store session in testcontext and return LaunhPage Object 
		.openBrowser("chrome") //declared in launch page, create session and get connection for driver and call open browser in webconnecter that extends zohodriver
		.goToHomePage()
		.goToEnterUsernamePage()
		.validator(false).validateTitle("XZoho Accounts")
		.validator(false).validateText("test","Zoho Accounts")
		.goToPasswordPage()
		.validator(true).validateText("","ABC");
		
		session.end();
		
		


	
	}

}
