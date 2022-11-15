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
		FileInputStream in = new FileInputStream(LComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(LComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(LComVar.PROP_QE_URL);
		switch (testBrowser) {
		case CHROME:
			System.setProperty(LComVar.CHROME_DRIVER, LComVar.PATH_CHROME_DRIVER);
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

	@Test(priority = 1)
	public void test01_checkNullEmailandPassword() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.EmailandPasswordNull(sheetname);
	}

	@Test(priority = 2)
	public void test02_checkNullEmail() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.EmailNull(sheetname);
	}

	@Test(priority = 3)
	public void test03_checkPwdNull() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.PwdNull(sheetname);
	}

	@Test(priority = 4)
	public void test04_checkValEmailInvalidPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.ValEmailInvalidPwd(sheetname);
	}

	@Test(priority = 5)
	public void test05_checkValEmailLess8CharPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.ValEmailLess8CharPwd(sheetname);
	}

	@Test(priority = 6)
	public void test06_checkInvalidEmailValPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailValPwd(sheetname);
	}

	@Test(priority = 7)
	public void test07_checkInvalidEmailLess8CharPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailLess8CharPwd(sheetname);
	}

	@Test(priority = 8)
	public void test08_checkInvalidEmailAndPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.InvalidEmailAndPwd(sheetname);
	}

	@Test(priority = 9)
	public void test09_checkLess8CharEmailPwd() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.Less8CharEmailPwd(sheetname);
	}

	@Test(priority = 10)
	public void test10_checkLogin() throws Exception {
		String sheetname = LComVar.LOGIN;
		TestModules libraPageTest = new TestModules(Login.driver, Login.baseUrl);
		libraPageTest.Login(sheetname);
	}

	@AfterTest
	public void aftertest() throws Exception {		
		driver.quit();
	}
}
