package libra_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;

public class CompanyTest extends LibraComFun {
	
	public CompanyTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void NullCompanyName(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null company name");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_COMP_NAME));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_COMP_NAME, ValidationMessage);				
			}
		}
	}

	public void InvalidTextEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid text Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LibraComVar.COMP_EMAIL, Email);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidNumEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid number Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LibraComVar.COMP_EMAIL, Email);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidSpecCharEMailCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid special character Email for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				findAndPassbyname(LibraComVar.COMP_EMAIL, Email);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidTextWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking invalid text in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidNumWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking number in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);			
			}
		}
	}

	public void InvalidSpecCharWebCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, "", "", "", "", "", "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidTextMobileCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in website for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, "", "", "", "", "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}

	public void InvalidShortPhoneNumCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking short phone numbers for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", "", "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}

	public void CityNumbersCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking numbers in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void CitySpecCharCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void CityNumSpecCharTextCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking combination of numbers and special characters in city for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, "", "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void StateNumbersCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking numbers in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void StateSpecCharCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking special characters in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);			
			}
		}
	}

	public void StateNumSpecCharTextCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking combination of numbers and special characters in state for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, "","","","","","");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}

	public void ShortPinCompany(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking short in pin code for company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, "", "", City, State, PinCode,"","","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person name null in company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				findAndPassbyname(LibraComVar.COMP_NAME, CompanyName);
				clickByXpath(LibraComVar.COMP_NEW_PER);   
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	
	public void NewPersonInvalidTextEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is invalid text in company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	
	public void NewPersonInvalidNumberEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is invalid number in company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonInvalidSpecialCharEmail(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person email is special character in company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,"");
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void NewPersonInvalidTextMobile(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking new person mobile number is text in company");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_ALL_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName,"","","","","","","","","","",NewPerson,NewPersonLN,NewPerEmail,NewPerMobile);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void AddCompWoPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company without person");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode, "", "", "", "","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);				
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}									
			}
		}
	}
	
	public void AddCompWithExPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with existing person");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,ExPerson,"","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);						
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,ExPerson,"","");
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void AddCompWithMulExPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with multiple existing person");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,ExPerson,"","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);						
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,ExPerson,"","");
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);					
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void AddCompWithNewPerson(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add company with new person");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"",NewPerson,NewPersonLN,NewPerEmail,NewPerMobile);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"",NewPerson,NewPersonLN);
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void EditCompFromCard(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit company from card option");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl+LibraComVar.CONT_COMP_CARD_VIEW);
				ContactCardEditDelete(LibraComVar.ALL_PAGE_CARD_LIST, ExCompName, "edit");
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"","","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}
	
	public void EditCompInnerPage(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit company from inner page");
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				driver.get(baseUrl + LibraComVar.CONT_COMP_CARD_VIEW);
				forloopClick(LibraComVar.CONT_TILE, ExCompName);	
				clickByXpath(LibraComVar.CONT_INNER_EDIT);
				addCompanyCardView(CompanyName, Email, Website, Mobile, Phone, StreetAddress, Locality, City, State,PinCode,"","","","","");
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, CompanyName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					ContactDropdownCheck(LibraComVar.CONT_PEOPLE_CARD_VIEW,LibraComVar.ADD_PER_CARD_VIEW,LibraComVar.CONT_PER_CLICK,LibraComVar.INV_CONT_SEARCH_BOX,LibraComVar.ON_REC_SEARCH_LIST,CompanyName);
					// BILLING PAGES
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_INV, LibraComVar.BTN_ADD_INV, LibraComVar.INV_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilInvAndPaymentPage(LibraComVar.BILLING_PAYNT, LibraComVar.BTN_ADD_PAYNT, LibraComVar.PAYNT_CONT,LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL, CompanyName);
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,CompanyName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, CompanyName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, CompanyName);
				}												
			}
		}
	}

}
