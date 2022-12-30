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

public class Login {

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

	// @Test(groups = { "smoke" })
	public void test01_checkHTTPError() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.BrokenLink();
	}

	// @Test(groups = { "sanity" })
	public void test02_checkNullEMailPassword() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.NullEMailPassword(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test03_checkNullEmail() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.NullEmail(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test04_checkNullPassword() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.NullPassword(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test05_checkInvalidEmail() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmail(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test06_checkInvalidPassword() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.InvalidPassword(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test07_checkCreateAccountEmailNull() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccountEmailNull(sheetname);
	}

	//@Test(groups = { "sanity" })
	public void test08_checkCreateAccountEmailInvalid() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccountEmailInvalid(sheetname);
	}
	
	//@Test(groups = { "sanity" })
	public void test09_checkCreateAccountPasswordNull() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccountPasswordNull(sheetname);
	}
	
	//@Test(groups = { "sanity" })
	public void test10_checkCreateAccountPasswordLessChar() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccountPasswordLessChar(sheetname);
	}
	
	//@Test(groups = { "sanity" })
	public void test11_checkCreateAccountDifPassword() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccountDifPassword(sheetname);
	}
	 
	@Test(groups = { "sanity" })
	public void test09_checkCreateAccount() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.CreateAccount(sheetname);
	} 
	
	
	
	
	
	
	
	
	

	// @Test(groups = { "sanity" })
	public void test07_checkForgotEmailNull() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.ForgotEmailNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test08_checkForgotInvalidEmail() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.ForgotInvalidEmail(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test09_checkForgotPassword() throws Exception {
		String sheetname = GComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.ForgotPassword(sheetname);
	}

	// @Test(groups = { "smoke" })
	public void test07_checkLogin() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.Login(username, password);
	}

	// @Test(groups = { "smoke" })
	public void test03_checkHTTPErrorAfterLogin() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.BrokenLink();
	}

	// @Test(groups = { "smoke" })
	public void test04_checkMenuClicksLeftNav() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.MenuClicksLeftNav();
	}

	// @Test(groups = { "smoke" })
	public void test05_checkMenuClicksTopRightNav() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.MenuClicksTopRightNav();
	}

	// @Test(groups = { "smoke" })
	public void test06_checkMenuClicksMyServicesSubNav() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.MenuClicksMyServicesSubNav();
	}

	// @Test(groups = { "smoke" })
	public void test07_checkMenuClicksPaymentsSubNav() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.MenuClicksPaymentsSubNav();
	}

	// @Test(groups = { "smoke" })
	public void test08_checkMenuClicksSettingsNav() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.MenuClicksSettingsNav();
	}

	// @AfterTest
	public void aftertest() throws Exception {
		// recorder.stop();
		driver.quit();
	}
}
