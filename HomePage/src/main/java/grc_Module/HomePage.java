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

public class HomePage {

	private enum TestBrowser {
		HTMLUNIT, FIREFOX, IE, CHROME
	};

	private static WebDriver driver;
	private static String baseUrl;
	private static TestBrowser testBrowser;
	private static String username;
	private static String password;
	ATUTestRecorder recorder;

	//@BeforeClass
	public void openbrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream in = new FileInputStream(HpComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(HpComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(HpComVar.PROP_GRC_QE_URL);
		username = prop.getProperty(HpComVar.PROP_GRC_QE_EMAIL);
		password = prop.getProperty(HpComVar.PROP_GRC_QE_PWD);
		switch (testBrowser) {
		case CHROME:
			System.setProperty(HpComVar.CHROME_DRIVER, HpComVar.PATH_CHROME_DRIVER);
			driver = new ChromeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get(baseUrl);
	}

	@Test(groups = { "sanity" })
	public void test01_checkHomePage() throws Exception {
		String sheetname = HpComVar.VAKILSEARCH;
		HomePageTest HomePageTest = new HomePageTest(HomePage.driver, HomePage.baseUrl);
		HomePageTest.HomePage(sheetname);
	}

	//@AfterTest
	public void aftertest() throws Exception {
		// recorder.stop();
		driver.quit();
	}
}
