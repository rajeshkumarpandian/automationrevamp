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

import io.netty.handler.logging.LogLevel;
import libra_Test.*;
public class DeleteAll {

	private enum TestBrowser {
		HTMLUNIT, FIREFOX, IE, CHROME
	};

	private static WebDriver driver;
	private static String baseUrl;
	private static TestBrowser testBrowser;	
	private static final String FULL_DATE_FORMAT = "dd_MM_yyyy_'at'_hh_mm_ss";

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

	@Test(priority = 1)
	public void test0001_checkLogin() throws Exception {
		String sheetname = LibraComVar.DELETE;
		LoginTest libraPageTest = new LoginTest(DeleteAll.driver, DeleteAll.baseUrl);
		libraPageTest.Login(sheetname);
	}
	
	@Test(priority = 2)
	public void test02_checkDeleteCompany() throws Exception {
		String sheetname = LibraComVar.DELETE;
		DeleteAllTest libraPageTest = new DeleteAllTest(DeleteAll.driver, DeleteAll.baseUrl);
		libraPageTest.checkDeleteCompany(sheetname);
	}
	
	@Test(priority = 3)
	public void test03_checkDeletePerson() throws Exception {
		String sheetname = LibraComVar.DELETE;
		DeleteAllTest libraPageTest = new DeleteAllTest(DeleteAll.driver, DeleteAll.baseUrl);
		libraPageTest.checkDeletePerson(sheetname);
	}

	@AfterTest
	public void aftertest() throws Exception {		
		driver.quit();
	}
}
