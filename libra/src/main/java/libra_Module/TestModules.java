package libra_Module;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.mongodb.gridfs.CLI;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import libra_Test.LComVar;

public class TestModules extends libra_Test.LComFun{

	public TestModules(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void EmailandPasswordNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null Email and password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedEmailAlert = strHM.get("expectedEmailAlert");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("EmailAndPwd_Null"))) {
				clickByXpath(LComVar.LOGIN_BTN);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_EMAIL_VALID, expectedEmailAlert);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_PWD_VALID, expectedPasswordAlert);				
			}
		}
	}

	public void EmailNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null Email");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedEmailAlert = strHM.get("expectedEmailAlert");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Email_Null"))) {
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_EMAIL_VALID, expectedEmailAlert);				
			}
		}
	}

	public void PwdNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Pwd_Null"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				clickByXpath(LComVar.LOGIN_BTN);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_PWD_NULL_VALID, expectedPasswordAlert);				
			}
		}
	}

	public void ValEmailInvalidPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking valid Email and invalid password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedEmailAlert = strHM.get("expectedEmailAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ValEmail_InvalidPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, expectedEmailAlert);								
			}
		}
	}

	public void ValEmailLess8CharPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking valid Email and password with less than 8 characters");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ValEmail_Less8CharPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, expectedPasswordAlert);				
			}
		}
	}

	public void InvalidEmailValPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid Email and valid password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_ValPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, expectedPasswordAlert);								
			}
		}
	}

	public void InvalidEmailLess8CharPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid Email and password with less than 8 characters");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_Less8CharPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, expectedPasswordAlert);				
			}
		}
	}

	public void InvalidEmailAndPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid Email and password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_InvalidPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, expectedPasswordAlert);								
			}
		}
	}

	public void Less8CharEmailPwd(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking less than 8 characters Email and password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String expectedEmailAlert = strHM.get("expectedEmailAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Less8CharEmail_Less8CharPwd"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, expectedPasswordAlert);
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, expectedEmailAlert);			
			}
		}
	}

	public void Login(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking login with valid Email and Vaild password");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Login"))) {
				findAndPassbyid(LComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LComVar.LOGIN_PWD, Password);
				clickByXpath(LComVar.LOGIN_BTN);
				waitForElementPresent(driver, By.xpath(LComVar.HOME_ACCOUNT_CIRCLE));
				if (sheetName.equals(LComVar.LOGIN)) {
					clickByXpath(LComVar.HOME_ACCOUNT_CIRCLE);
					stringComparion(LComVar.XPATH,LComVar.HOME_AGENT_EMAIL, Email);
					clickByXpath(LComVar.BTN_LOGOUT);
				}				
			}
		}
	}

	public void NullCompanyName(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null company name");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NullCompanyName"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_COMP_NAME));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_COMP_NAME, ValidationMessage);				
			}
		}
	}

	public void InvalidTextEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid text Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextEmail"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LComVar.COMP_EMAIL, Email);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidNumEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid number Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidNumberEmail"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LComVar.COMP_EMAIL, Email);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidSpecCharEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid special character Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecialCharEmail"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LComVar.COMP_EMAIL, Email);
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidTextWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid text in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextWeb"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidNumWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking number in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidNumberWeb"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidSpecCharWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecialCharWeb"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidTextMobileCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextMobile"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, "", "", "", "", "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidShortPhoneNumCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking short phone numbers for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ShortPhoneNum"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", "", "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}

	public void CityNumbersCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking numbers in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumbers"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void CitySpecCharCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CitySpecChar"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void CityNumSpecCharTextCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking combination of numbers and special characters in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumSpecCharText"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void StateNumbersCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking numbers in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumbers"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void StateSpecCharCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateSpecChar"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void StateNumSpecCharTextCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking combination of numbers and special characters in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumSpecCharText"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void ShortPinCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking short in pin code for company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ShortPinCode"))) {
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, PinCode,"","","","","");
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person name null in company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");			
			String CompanyName = strHM.get("CompanyName");						
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NewPersonNameNull"))) {				
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				findAndPassbyname(LComVar.COMP_NAME, CompanyName);
				clickByXpath(LComVar.COMP_NEW_PER);   
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	
	public void NewPersonInvalidTextEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is invalid text in company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");			
			String CompanyName = strHM.get("CompanyName");	
			String NewPerson = strHM.get("NewPerson");	
			String NewPersonLN = strHM.get("NewPersonLN");	
			String NewPerEmail = strHM.get("NewPerEmail");				
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NewPersonInvalidTextEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	
	public void NewPersonInvalidNumberEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is invalid number in company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");			
			String CompanyName = strHM.get("CompanyName");	
			String NewPerson = strHM.get("NewPerson");	
			String NewPersonLN = strHM.get("NewPersonLN");	
			String NewPerEmail = strHM.get("NewPerEmail");				
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NewPersonInvalidNumberEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonInvalidSpecialCharEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is special character in company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");			
			String CompanyName = strHM.get("CompanyName");	
			String NewPerson = strHM.get("NewPerson");	
			String NewPersonLN = strHM.get("NewPersonLN");
			String NewPerEmail = strHM.get("NewPerEmail");				
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NewPersonInvalidSpecialCharEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonInvalidTextMobile(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person mobile number is text in company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");			
			String CompanyName = strHM.get("CompanyName");	
			String NewPerson = strHM.get("NewPerson");	
			String NewPersonLN = strHM.get("NewPersonLN");
			String NewPerEmail = strHM.get("NewPerEmail");	
			String NewPerMobile = strHM.get("NewPerMobile");	
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NewPersonInvalidTextMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,NewPerMobile);
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void AddCompWoPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company without person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("AddCompWoPerson"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode, "", "", "", "","");
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH, LComVar.LOGIN_INVAL_PWD, ValidationMessage);				
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}									
			}
		}
	}
	
	public void AddCompWithExPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with existing person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");	
			String ExPerson = strHM.get("ExPerson");	
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("AddCompWithExPerson"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,ExPerson,"","","","");
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);						
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,ExPerson,"","");
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void AddCompWithMulExPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with multiple existing person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");	
			String ExPerson = strHM.get("ExPerson");	
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("AddCompWithMulExPerson"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,ExPerson,"","","","");
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);						
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,ExPerson,"","");
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);					
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void AddCompWithNewPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with new person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");	
			String NewPerson = strHM.get("NewPerson");
			String NewPersonLN = strHM.get("NewPersonLN");	
			String NewPerEmail = strHM.get("NewPerEmail");
			String NewPerMobile = strHM.get("NewPerMobile");
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");			
			if (Test_Scenario.equals("Positive") && (Scenario.equals("AddCompWithNewPerson"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.name(LComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"",NewPerson,NewPersonLN,NewPerEmail,NewPerMobile);
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"",NewPerson,NewPersonLN);
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void EditCompFromCard(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit company from card option");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");				
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");	
			String ExCompName = strHM.get("ExCompName");			
			if (Test_Scenario.equals("Positive") && (Scenario.equals("EditCompFromCard"))) {
				driver.get(baseUrl+LComVar.CONT_COMP_CARD_VIEW);
				ContactCardEditDelete(LComVar.ALL_PAGE_CARD_LIST, ExCompName, "edit");
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"","","","","");
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void checkDeleteCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking delete company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String CompanyName = strHM.get("CompanyName");	
			String ValidationMessage = strHM.get("ValidationMessage");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Company"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);				
				ContactCardEditDelete(LComVar.ALL_PAGE_CARD_LIST, CompanyName, "delete");				
				waitForElementPresent(driver,By.xpath(LComVar.CONT_DEL));
				clickByXpath(LComVar.CONT_DEL);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);																								
			}
		}
	}
	
	public void checkDeletePerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking delete person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String CompanyName = strHM.get("CompanyName");	
			String ValidationMessage = strHM.get("ValidationMessage");
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Person"))) {
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);				
				ContactCardEditDelete(LComVar.ALL_PAGE_CARD_LIST, CompanyName, "delete");				
				waitForElementPresent(driver,By.xpath(LComVar.CONT_DEL));
				clickByXpath(LComVar.CONT_DEL);
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);																								
			}
		}
	}
	
	
	
	public void EditCompInnerPage(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit company from inner page");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");
			String Email = strHM.get("Email");
			String CompanyName = strHM.get("CompanyName");
			String Website = strHM.get("Website");
			String Mobile = strHM.get("Mobile");
			String Phone = strHM.get("Phone");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");						
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");	
			String ExCompName = strHM.get("ExCompName");			
			if (Test_Scenario.equals("Positive") && (Scenario.equals("EditCompFromInnerPage"))) {
				driver.get(baseUrl + LComVar.CONT_COMP_CARD_VIEW);
				MulDataClick(LComVar.CONT_TILE, ExCompName);	
				clickByXpath(LComVar.CONT_INNER_EDIT);
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"","","","","");
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void PersonFNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person first name null in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");												
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PersonFirstNameNull"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);				  
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	public void PersonMobNumText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in text format in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
		
	
	public void PersonMobNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in special characters format in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void MobNumTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in text, number and special characters format in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecNumTextMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email text in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email num in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidNumberEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecialCharEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCityNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city text in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumbers"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonCitySpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CitySpecChar"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonCityNumSpecCharText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city num, special characters and text in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumSpecCharText"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state numbers in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumbers"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateSpecChar"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateNumSpecCharText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state numbers, text and spcial characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumSpecCharText"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_CITY));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonPinShort(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person pin short numbers in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ShortPinCode"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}
	
	public void PersonPinSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person pin special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PinSpecChar"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company name null in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");				
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompNameNull"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);	
				waitForElementPresent(driver,By.name( LComVar.COMP_NEW_PER_FN));
				findAndPassbyname(LComVar.COMP_NEW_PER_FN, FirstName); 
				clickById(LComVar.PER_ADD_COMP);
				waitForElementPresent(driver,By.name(LComVar.COMP_NAME));
				clickByXpath(LComVar.BTN_CREATE_COMP_CARD_VIEW);															
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in text in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompTextEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in number in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompNumberEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompSpecialCharEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in tex, num and special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompSpecialCharNumTextEmail"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in text in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
            String CompNum = strHM.get("CompNum");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidCompTextMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
            String CompNum = strHM.get("CompNum");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidCompSpecMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in text, numbers and special characters in person");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");				
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
            String CompNum = strHM.get("CompNum");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidCompSpecNumTextMobile"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.VALID_MSG_EMAIL));
				stringComparion(LComVar.XPATH,LComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	
	public void AddPersonWOComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person wihout company");
		Workbook file1 = Workbook.getWorkbook(new File(LComVar.TEST_DATA));
		Sheet sheet1 = file1.getSheet(sheetName);
		int rowCount = sheet1.getRows();
		int colCount = sheet1.getColumns();
		for (int i = 1; i < rowCount; i++) {
			LinkedHashMap<String, String> strHM = new LinkedHashMap<String, String>();
			for (int j = 0; j < colCount; j++) {
				strHM.put(sheet1.getCell(j, 0).getContents(), sheet1.getCell(j, i).getContents());
			}
			String Test_Scenario = strHM.get("Test_Scenario");
			String Scenario = strHM.get("Scenario");
			String ValidationMessage = strHM.get("ValidationMessage");		
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");	
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");			
			String Dependency = strHM.get("Dependency");
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("PersonWOcompany"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);	
				ContactCardDetails(LComVar.CONT_PEOPLE_CARD_VIEW, FirstName, Email, Mobile, StreetAddress, Locality,City, PinCode);
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FirstName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, FirstName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_PEOPLE_CARD_VIEW,LComVar.ADD_PER_CARD_VIEW,LComVar.CONT_PER_CLICK,LComVar.INV_CONT_SEARCH_BOX,LComVar.ON_REC_SEARCH_LIST,FirstName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FirstName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_INV, LComVar.BTN_ADD_INV, LComVar.INV_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FirstName);
					ContactDepBilInvAndPaymentPage(LComVar.BILLING_PAYNT, LComVar.BTN_ADD_PAYNT, LComVar.PAYNT_CONT,LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL, FirstName);
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FirstName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FirstName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FirstName);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
}
