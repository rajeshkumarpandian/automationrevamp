package grc_Module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import grc_Test.*;
import io.netty.handler.logging.LogLevel;


public class Myservices {

	private enum TestBrowser {
		HTMLUNIT, FIREFOX, IE, CHROME
	};

	private static WebDriver driver;
	private static String baseUrl;
	private static TestBrowser testBrowser;	
	private static String username;
	private static String password;

	@BeforeClass
	public void openbrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream in = new FileInputStream(GComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(GComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(GComVar.PROP_CRM_QE_URL);
		username = prop.getProperty(GComVar.PROP_GRC_QE_EMAIL);
		password = prop.getProperty(GComVar.PROP_GRC_QE_PWD);						  		
		switch (testBrowser) {
		case CHROME:
			System.setProperty(GComVar.CHROME_DRIVER, GComVar.PATH_CHROME_DRIVER);
			driver = new ChromeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {		
		driver.get(baseUrl);		
	}
	
	//@Test(priority = 1)
	public void test01_checkBrokenLinks() throws Exception {		
		MyservicesTest grPageTest = new MyservicesTest(Myservices.driver, Myservices.baseUrl);
		grPageTest.HTTPErrorCheck();
	}

	@Test(priority = 1)
	public void test01_checkLogin() throws Exception {		
		LoginTest grPageTest = new LoginTest(Myservices.driver, Myservices.baseUrl);
		grPageTest.Login(username,password);
	}

	//@Test(priority = 2)
	public void test02_checkSelectServices() throws Exception {		
		String sheetname = GComVar.GRC;
		MyservicesTest grcPageTest = new MyservicesTest(Myservices.driver, Myservices.baseUrl);
		//grcPageTest.SelectServices(sheetname);
	}
		
	//@AfterTest
	public void aftertest() throws Exception {		
		driver.quit();
	}
}
