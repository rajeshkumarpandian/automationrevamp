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


public class CompanyTest extends Libra.Libra_Common_Module.LComFun {
	
	public CompanyTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

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

}
