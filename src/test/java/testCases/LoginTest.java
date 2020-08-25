package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.zoho.base.pages.Constants;
import com.zoho.base.pages.ZohoPage;
import com.zoho.listener.ZohoEventListner;
import com.zoho.reports.ExtentManager;
import com.zoho.session.ZohoTestSession;
import com.zoho.web.ZohoDriver;
import com.zoho.web.ZohoWebConnector;


public class LoginTest {
	
	ZohoTestSession session;
	
	@BeforeMethod
	public void init() {
		
		
	}
	
	@AfterMethod
	public void quit() {
		session.genrateReports();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		
		session = new ZohoTestSession(); //webConnecter initialized
		
		session
		.init("Login Test")		//store session in testcontext and return LaunhPage Object 
		.openBrowser("chrome") //declared in launch page, create session and get connection for driver and call open browser in webconnecter that extends zohodriver
		.goToHomePage()
		.goToEnterUsernamePage()
		.validator(false).validateTitle("Zoho Accounts")
		.validator(false).validateText("test","ABC")
		.goToPasswordPage()
		.validator(true).validateText("","ABC");
		
		session.end();
		
		

	
	}

}
