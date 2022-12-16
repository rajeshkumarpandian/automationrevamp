package libra_Module;

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

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import libra_Test.*;
import io.netty.handler.logging.LogLevel;

public class Login {

	private enum TestBrowser {
		HTMLUNIT, FIREFOX, IE, CHROME
	};

	private static WebDriver driver;
	private static String baseUrl;
	private static TestBrowser testBrowser;

	@BeforeClass
	public void openbrowser() throws IOException {

		Properties prop = new Properties();
		FileInputStream in = new FileInputStream(LibraComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(LibraComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(LibraComVar.PROP_QE_URL);
		switch (testBrowser) {
		case CHROME:
			System.setProperty(LibraComVar.CHROME_DRIVER, LibraComVar.PATH_CHROME_DRIVER);
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

	@Test(groups = { "sanity" })
	public void test01_checkHTTPError() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.BrokenLink();
	}

	@Test(groups = { "sanity" })
	public void test02_checkEmailNull() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.EmailNull(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test03_checkPwdNull() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.PwdNull(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test04_checkEmailandPasswordNull() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.EmailandPasswordNull(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test05_checkValEmailInvalidPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.ValEmailInvalidPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test06_checkValEmailLess8CharPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.ValEmailLess8CharPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test07_checkInvalidEmailValPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailValPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test08_checkInvalidEmailLess8CharPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailLess8CharPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test09_checkInvalidEmailAndPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailAndPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test10_checkLess8CharEmailPwd() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.Less8CharEmailPwd(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test11_checkLess8CharEmail() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.Less8CharEmail(sheetname);
	}

	@Test(groups = { "smoke" })
	public void test12_checkLogin() throws Exception {
		String sheetname = LibraComVar.LOGIN;
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.Login(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test13_checkHTTPErrorAfterLogin() throws Exception {
		LoginTest libraPageTest = new LoginTest(Login.driver, Login.baseUrl);
		libraPageTest.BrokenLink();
	}

	@AfterTest
	public void aftertest() throws Exception {
		driver.quit();
	}
}
