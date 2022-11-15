package libra_Module_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Libra.Libra_Common_Module.LComVar;
import jxl.Sheet;
import jxl.Workbook;
import Libra.Libra_Common_Module.*;
import Libra.Selenium_Test_Common_module.*;


public class LoginTest extends Libra.Libra_Common_Module.LComFun {
	
	public LoginTest(WebDriver webPageDriver, String baseUrl) {
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

}
