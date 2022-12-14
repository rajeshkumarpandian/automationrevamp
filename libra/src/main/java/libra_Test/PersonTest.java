package libra_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;

public class PersonTest extends LibraComFun {
	
	public PersonTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}
	
	public void PersonFNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person first name null in person");
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
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PersonFirstNameNull"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);				  
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	public void PersonMobNumText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in text format in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextMobile"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonMobNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in special characters format in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecMobile"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void MobNumTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person mobile number in text, number and special characters format in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecNumTextMobile"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				addPersonCardView(FirstName,LastName,"","","","",Mobile,"","","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email text in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidTextEmail"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email num in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidNumberEmail"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonEmailSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person email special characters in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidSpecialCharEmail"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);		
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","","","","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCityNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city text in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumbers"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonCitySpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city special characters in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CitySpecChar"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonCityNumSpecCharText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person city num, special characters and text in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CityNumSpecCharText"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,"","");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state numbers in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumbers"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state special characters in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateSpecChar"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonStateNumSpecCharText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person state numbers, text and spcial characters in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("StateNumSpecCharText"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,"");												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_CITY));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_CITY, ValidationMessage);				
			}
		}
	}
	
	public void PersonPinShort(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person pin short numbers in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ShortPinCode"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_LESS_8_CHAR_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_LESS_8_CHAR_PWD, ValidationMessage);				
			}
		}
	}
	
	public void PersonPinSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person pin special characters in person");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");		
			String Mobile = strHM.get("Mobile");
			String Email = strHM.get("Email");
			String City = strHM.get("City");			
			String State = strHM.get("State");
			String PinCode = strHM.get("PinCode");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PinSpecChar"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company name null in person");
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
			String FirstName = strHM.get("FirstName");				
			if (Test_Scenario.equals("Negative") && (Scenario.equals("PerCompNameNull"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);	
				waitForElementPresent(By.name( LibraComVar.COMP_NEW_PER_FN));
				findAndPassbyname(LibraComVar.COMP_NEW_PER_FN, FirstName); 
				clickById(LibraComVar.PER_ADD_COMP);
				waitForElementPresent(By.name(LibraComVar.COMP_NAME));
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);															
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in text in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailNum(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in number in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in special characters in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMailTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mail in tex, num and special characters in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,"",Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobText(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in text in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in special characters in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void PersonCompMobTextNumSpecChar(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking person add company mobile number in text, numbers and special characters in person");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,"","",City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_EMAIL, ValidationMessage);				
			}
		}
	}
	
	public void AddPersonWOComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person wihout company");
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
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_COMP_CARD_VIEW,LibraComVar.ADD_COMP_CARD_VIEW,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void AddPersonWithExComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person with existing company");
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
			String CompName = strHM.get("CompName");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Personwithexcompany"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,CompName,"","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_COMP_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_COMP_CARD_VIEW,LibraComVar.ADD_COMP_CARD_VIEW,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void AddPersonWithNewComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person with new company");
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
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
            String CompNum = strHM.get("CompNum");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Personwithnewcompany"))) {				
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LibraComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);													
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_COMP_CARD_VIEW,LibraComVar.ADD_COMP_CARD_VIEW,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void EditPersonFromCard(String sheetName) throws Exception, IOException {
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");
			String Email = strHM.get("Email");				
			String Mobile = strHM.get("Mobile");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");				
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");	
			String ExPerson = strHM.get("ExPerson");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("EditperFromCard"))) {
				driver.get(baseUrl+LibraComVar.CONT_PEOPLE_CARD_VIEW);
				ContactCardEditDelete(LibraComVar.ALL_PAGE_CARD_LIST, ExPerson, "edit");				
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);	
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_COMP_CARD_VIEW,LibraComVar.ADD_COMP_CARD_VIEW,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}											
			}
		}
	}
	
	public void EditPersonFromInnerpage(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit peron from inner page");
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
			String FirstName = strHM.get("FirstName");	
			String LastName = strHM.get("LastName");			
			String Mobile = strHM.get("Mobile");
			String City = strHM.get("City");
			String State = strHM.get("State");
			String StreetAddress = strHM.get("StreetAddress");
			String Locality = strHM.get("Locality");
			String PinCode = strHM.get("PinCode");						
			String CaseTitle = strHM.get("CaseTitle");
			String AccountName = strHM.get("AccountName");
			String Dependency = strHM.get("Dependency");	
			String ExPerson = strHM.get("ExPerson");	
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("EditperFromInnerPage"))) {
				driver.get(baseUrl + LibraComVar.CONT_PEOPLE_CARD_VIEW);											
				forloopClick(LibraComVar.CONT_TILE, ExPerson);	
				clickByXpath(LibraComVar.CONT_INNER_EDIT);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LibraComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LibraComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LibraComVar.CONT_COMP_CARD_VIEW,LibraComVar.ADD_COMP_CARD_VIEW,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LibraComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_TIME_ENT, LibraComVar.BTN_ADD_TIME_ENT,LibraComVar.PAYNT_CONT, LibraComVar.PAYNT_CONT_SEARCH_BOX, LibraComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LibraComVar.BILLING_EXP, LibraComVar.BTN_ADD_EXP, LibraComVar.PAYNT_CONT,LibraComVar.INV_CONT_SEARCH_BOX, LibraComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LibraComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}													
			}
		}
	}
	

}
