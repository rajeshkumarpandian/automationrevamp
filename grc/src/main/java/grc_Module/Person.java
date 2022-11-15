package grc_Module;

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

import grc_Test.*;
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
		FileInputStream in = new FileInputStream(GComVar.PROP_FILE);
		prop.load(in);
		in.close();
		testBrowser = TestBrowser.valueOf(prop.getProperty(GComVar.PROP_BROWSER).toUpperCase());
		baseUrl = prop.getProperty(GComVar.PROP_QE_URL);
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
	public void afterMethod(ITestResult result) {
		driver.get(baseUrl);
	}

	@Test(priority = 1)
	public void test0001_checkLogin() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.Login(sheetname);
	}

	// @Test(priority = 2)
	public void test0002_checkPersonFNameNull() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonFNameNull(sheetname);
	}

	// @Test(priority = 3)
	public void test0003_checkPersonMobNumText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonMobNumText(sheetname);
	}

	// @Test(priority = 4)
	public void test0004_checkPersonMobNumSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonMobNumSpecChar(sheetname);
	}

	// @Test(priority = 5)
	public void test0005_checkPersonMobNumTextNumSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.MobNumTextNumSpecChar(sheetname);
	}

	// @Test(priority = 6)
	public void test0006_checkPersonEmailText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailText(sheetname);
	}

	// @Test(priority = 7)
	public void test0007_checkPersonEmailNum() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailNum(sheetname);
	}

	// @Test(priority = 8)
	public void test0008_checkPersonEmailSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonEmailSpecChar(sheetname);
	}

	// @Test(priority = 9)
	public void test0009_checkPersonCityNum() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCityNum(sheetname);
	}

	// @Test(priority = 10)
	public void test0010_checkPersonCitySpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCitySpecChar(sheetname);
	}

	// @Test(priority = 11)
	public void test0011_checkPersonCityNumSpecCharText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCityNumSpecCharText(sheetname);
	}

	// @Test(priority = 12)
	public void test0012_checkPersonStateNum() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateNum(sheetname);
	}

	// @Test(priority = 13)
	public void test0013_checkPersonStateSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateSpecChar(sheetname);
	}

	// @Test(priority = 14)
	public void test0014_checkPersonStateNumSpecCharText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonStateNumSpecCharText(sheetname);
	}

	// @Test(priority = 15)
	public void test0015_checkPersonPinShort() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonPinShort(sheetname);
	}

	// @Test(priority = 16)
	public void test0016_checkPersonPinSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonPinSpecChar(sheetname);
	}

	// @Test(priority = 17)
	public void test0017_checkPersonCompNameNull() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompNameNull(sheetname);
	}

	// @Test(priority = 18)
	public void test0018_checkPersonCompMailText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailText(sheetname);
	}

	// @Test(priority = 19)
	public void test0019_checkPersonCompMailNum() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailNum(sheetname);
	}

	// @Test(priority = 20)
	public void test0020_checkPersonCompMailSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailSpecChar(sheetname);
	}

	// @Test(priority = 21)
	public void test0021_checkPersonCompMailTextNumSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMailTextNumSpecChar(sheetname);
	}

	// @Test(priority = 22)
	public void test0022_checkPersonCompMobText() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobText(sheetname);
	}

	// @Test(priority = 23)
	public void test0023_checkPersonCompMobSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobSpecChar(sheetname);
	}

	// @Test(priority = 24)
	public void test0024_checkPersonCompMobTextNumSpecChar() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.PersonCompMobTextNumSpecChar(sheetname);
	}

	 @Test(priority = 25)
	public void test0025_checkAddPersonWOComp() throws Exception {
		String sheetname = GComVar.PERSON;
		TestModules libraPageTest = new TestModules(Person.driver, Person.baseUrl);
		libraPageTest.AddPersonWOComp(sheetname);
	}

	// @AfterTest
	public void aftertest() {
		driver.quit();
	}

}
