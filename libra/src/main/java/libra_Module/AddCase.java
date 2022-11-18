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

public class AddCase {

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
	public void test0001_checkLogin() throws Exception {
		String sheetname = LibraComVar.COMPANY;
		LoginTest libraPageTest = new LoginTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.Login(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test02_checkCaseTitleNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.CaseTitleNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test03_checkAddCaseSupCaseTypeNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseSupCaseTypeNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test04_checkAddCaseSupCaseNumNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseSupCaseNumNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test05_checkAddCaseSupCaseYearNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseSupCaseYearNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test06_checkAddCaseHighCourtNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseHighCourtNull(sheetname);
	}

	// @Test(groups = { "sanity" })
	public void test07_checkAddCaseDisCourtNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseDisCourtNull(sheetname);
	}

	//@Test(groups = { "sanity" })
	public void test08_checkAddCaseConsumerCourtNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseConsumerCourtNull(sheetname);
	}
	
	@Test(groups = { "sanity" })
	public void test09_checkAddCaseTribunalCourtNameNull() throws Exception {
		String sheetname = LibraComVar.ADDCASE;
		AddCaseTest libraPageTest = new AddCaseTest(AddCase.driver, AddCase.baseUrl);
		libraPageTest.AddCaseTribunalCourtNameNull(sheetname);
	}

	// @AfterTest
	public void aftertest() throws Exception {
		driver.quit();
	}
}
