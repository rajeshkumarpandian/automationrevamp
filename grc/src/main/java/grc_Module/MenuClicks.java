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

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import grc_Test.*;
import io.netty.handler.logging.LogLevel;
import selenium_module_Test.ComVar;

public class MenuClicks {

	private enum TestBrowser {
		HTMLUNIT, FIREFOX, IE, CHROME
	};

	private static WebDriver driver;
	private static String baseUrl;
	private static TestBrowser testBrowser;
	private static String username;
	private static String password;
	ATUTestRecorder recorder;

	@BeforeClass
	public void openbrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream in = new FileInputStream(GComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(GComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(GComVar.PROP_GRC_QE_URL);
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
		driver.get(baseUrl);
	}

	@BeforeMethod
	public void beforeMethod(Method m) throws Exception {

	}

	// @BeforeTest
	public void Record() throws ATUTestRecorderException {
		DateFormat dateFormat = new SimpleDateFormat(ComVar.CALENDAR_TEXT_FORMAT);
		Date date = new Date();
		String Methodname = new Object() {
		}.getClass().getEnclosingMethod().getName();
		recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" + dateFormat.format(date), false);
		recorder.start();
	}

	 @Test(groups = { "smoke" })
	public void test01_checkLogin() throws Exception {
		 MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.Login(username, password);
	}

	// @Test(groups = { "smoke" })
	public void test02_checkMenuClicksLeftNav() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksLeftNav();
	} 
	 
	// @Test(groups = { "smoke" })
	public void test03_checkMenuClicksTopRightQuickNav() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksTopRightQuickNav();
	}
	
	// @Test(groups = { "smoke" })
	public void test04_checkMenuClicksTopRightDemoVideo() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksTopRightDemoVideo();
	}

	// @Test(groups = { "smoke" })
	public void test05_checkMenuClicksTopRightNav() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksTopRightNav();
	}

	// @Test(groups = { "smoke" })
	public void test06_checkMenuClicksProfile() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksProfile();
	}
	
	 @Test(groups = { "smoke" })
	public void test07_checkMenuClicksMyServices() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksMyServices();
	}

	// @Test(groups = { "smoke" })
	public void test07_checkMenuClicksPaymentsSubNav() throws Exception {
		MenuClicksTest grcPageTest = new MenuClicksTest(MenuClicks.driver, MenuClicks.baseUrl);
		grcPageTest.MenuClicksPaymentsSubNav();
	}



	// @AfterTest
	public void aftertest() throws Exception {
		// recorder.stop();
		driver.quit();
	}
}
