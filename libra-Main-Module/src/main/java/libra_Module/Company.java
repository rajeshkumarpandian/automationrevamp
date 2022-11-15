package libra_Module;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

import Libra.Libra_Common_Module.LComVar;
import Libra.Selenium_Test_Common_module.CommonFunctions;
import io.netty.handler.logging.LogLevel;

public class Company {

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
	public void afterMethod(ITestResult result) {
		driver.get(baseUrl);
	}

	@Test(priority = 1)
	public void test0001_checkLogin() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.Login(sheetname);
	}

	@Test(priority = 2)
	public void test0002_checkNullCompanyName() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NullCompanyName(sheetname);
	}

	@Test(priority = 3)
	public void test0003_checkInvalidTextEMailCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidTextEMailCompany(sheetname);
	}

	@Test(priority = 4)
	public void test0004_checkInvalidNumEMailCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidNumEMailCompany(sheetname);
	}

	@Test(priority = 5)
	public void test0005_checkInvalidSpecharEMailCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidSpecCharEMailCompany(sheetname);
	}

	@Test(priority = 6)
	public void test0006_checkInvalidTextWebCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidTextWebCompany(sheetname);
	}

	@Test(priority = 7)
	public void test0007_checkInvalidNumWebCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidNumWebCompany(sheetname);
	}

	@Test(priority = 8)
	public void test0008_checkInvalidSpecCharWebCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidSpecCharWebCompany(sheetname);
	}

	@Test(priority = 9)
	public void test0009_checkInvalidTextMobileCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidTextMobileCompany(sheetname);
	}

	@Test(priority = 10)
	public void test0010_checkShortPhoneNumCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.InvalidShortPhoneNumCompany(sheetname);
	}

	@Test(priority = 11)
	public void test0011_checkCityNumbersCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.CityNumbersCompany(sheetname);
	}

	@Test(priority = 12)
	public void test0012_checkCitySpecCharCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.CitySpecCharCompany(sheetname);
	}

	@Test(priority = 13)
	public void test0013_checkCityNumSpecCharTextCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.CityNumSpecCharTextCompany(sheetname);
	}

	@Test(priority = 14)
	public void test0014_checkStateNumbersCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.StateNumbersCompany(sheetname);
	}

	@Test(priority = 15)
	public void test0015_checkStateSpecCharCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.StateSpecCharCompany(sheetname);
	}

	@Test(priority = 16)
	public void test0016_checkStateNumSpecCharTextCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.StateNumSpecCharTextCompany(sheetname);
	}

	@Test(priority = 17)
	public void test0017_checkShortPinCompany() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.ShortPinCompany(sheetname);
	}

	@Test(priority = 18)
	public void test0018_checkNewPersonNameNull() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NewPersonNameNull(sheetname);
	}

	@Test(priority = 19)
	public void test0019_checkNewPersonInvalidTextEmail() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NewPersonInvalidTextEmail(sheetname);
	}

	@Test(priority = 20)
	public void test0020_checkNewPersonInvalidNumberEmail() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NewPersonInvalidNumberEmail(sheetname);
	}

	@Test(priority = 21)
	public void test0021_checkNewPersonInvalidSpecialCharEmail() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NewPersonInvalidSpecialCharEmail(sheetname);
	}

	@Test(priority = 22)
	public void test0022_checkNewPersonInvalidTextMobile() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.NewPersonInvalidTextMobile(sheetname);
	}

	@Test(priority = 23)
	public void test0023_checkAddCompWoPerson() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.AddCompWoPerson(sheetname);
	}

	@Test(priority = 24)
	public void test0024_checkAddCompWithExPerson() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.AddCompWithExPerson(sheetname);
	}
	
	@Test(priority = 25)
	public void test0025_checkAddCompWithMulExPerson() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.AddCompWithMulExPerson(sheetname);
	}
	
	@Test(priority = 26)
	public void test0026_checkAddCompWithNewPerson() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.AddCompWithNewPerson(sheetname);
	}
	
	@Test(priority = 27)
	public void test0027_checkEditCompFromCard() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.EditCompFromCard(sheetname);
	}
	
	@Test(priority = 28)
	public void test0028_checkEditCompInnerPageEditCompInnerPage() throws Exception {
		String sheetname = LComVar.COMPANY;
		TestModules libraPageTest = new TestModules(Company.driver, Company.baseUrl);
		libraPageTest.EditCompInnerPage(sheetname);
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}

}
