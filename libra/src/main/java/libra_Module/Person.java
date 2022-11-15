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

import libra_Test.*;
import io.netty.handler.logging.LogLevel;

public class Person {

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
	public void afterMethod(ITestResult result) {
		driver.get(baseUrl);
	}

	@Test(groups = { "sanity" })
	public void test0001_checkLogin() throws Exception {
		String sheetname = LibraComVar.PERSON;
		LoginTest libraPageTest = new LoginTest(Person.driver, Person.baseUrl);
		libraPageTest.Login(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0002_checkPersonFNameNull() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonFNameNull(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0003_checkPersonMobNumText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonMobNumText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0004_checkPersonMobNumSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonMobNumSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0005_checkPersonMobNumTextNumSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.MobNumTextNumSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0006_checkPersonEmailText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0007_checkPersonEmailNum() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailNum(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0008_checkPersonEmailSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0009_checkPersonCityNum() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCityNum(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0010_checkPersonCitySpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCitySpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0011_checkPersonCityNumSpecCharText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCityNumSpecCharText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0012_checkPersonStateNum() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateNum(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0013_checkPersonStateSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0014_checkPersonStateNumSpecCharText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateNumSpecCharText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0015_checkPersonPinShort() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonPinShort(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0016_checkPersonPinSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonPinSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0017_checkPersonCompNameNull() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompNameNull(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0018_checkPersonCompMailText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0019_checkPersonCompMailNum() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailNum(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0020_checkPersonCompMailSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0021_checkPersonCompMailTextNumSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailTextNumSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0022_checkPersonCompMobText() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobText(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0023_checkPersonCompMobSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobSpecChar(sheetname);
	}

	@Test(groups = { "sanity" })
	public void test0024_checkPersonCompMobTextNumSpecChar() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobTextNumSpecChar(sheetname);
	}

	@Test(groups = { "smoke" })
	public void test0025_checkAddPersonWOComp() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.AddPersonWOComp(sheetname);
	}

	@Test(groups = { "smoke" })
	public void test0026_checkAddPersonWithExComp() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.AddPersonWithExComp(sheetname);
	}

	@Test(groups = { "smoke" })
	public void test0027_checkAddPersonWithNewComp() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.AddPersonWithNewComp(sheetname);
	}

	@Test(groups = { "smoke" })
	public void test0028_checkEditPersonFromCard() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.EditPersonFromCard(sheetname);
	}
	
	@Test(groups = { "smoke" })
	public void test0029_checkEditPersonFromInnerpage() throws Exception {
		String sheetname = LibraComVar.PERSON;
		libra_Test.PersonTest libraPageTest = new libra_Test.PersonTest(Person.driver, Person.baseUrl);
		libraPageTest.EditPersonFromInnerpage(sheetname);
	}

	// @AfterTest
	public void aftertest() {
		driver.quit();
	}

}
