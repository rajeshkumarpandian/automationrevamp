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


public class PersonTest extends Libra.Libra_Common_Module.LComFun {
	
	public PersonTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

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
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_COMP_CARD_VIEW,LComVar.ADD_COMP_CARD_VIEW,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void AddPersonWithExComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person with existing company");
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
			String CompName = strHM.get("CompName");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Personwithexcompany"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,CompName,"","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_COMP_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_COMP_CARD_VIEW,LComVar.ADD_COMP_CARD_VIEW,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void AddPersonWithNewComp(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add person with new company");
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
			String CompName = strHM.get("CompName");
            String CompMail = strHM.get("CompMail");
            String CompNum = strHM.get("CompNum");
			String FullName = FirstName +" "+ LastName;
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Personwithnewcompany"))) {				
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);
				clickByXpath(LComVar.ADD_PER_CARD_VIEW);						
				addPersonCardView(FirstName,LastName,"",CompName,CompMail,CompNum,Mobile,Email,StreetAddress,Locality,City,State,PinCode);												
				waitForElementPresent(driver, By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);													
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_COMP_CARD_VIEW,LComVar.ADD_COMP_CARD_VIEW,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}
			}
		}
	}
	
	public void EditPersonFromCard(String sheetName) throws Exception, IOException {
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
				driver.get(baseUrl+LComVar.CONT_PEOPLE_CARD_VIEW);
				ContactCardEditDelete(LComVar.ALL_PAGE_CARD_LIST, ExPerson, "edit");				
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);	
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_COMP_CARD_VIEW,LComVar.ADD_COMP_CARD_VIEW,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}											
			}
		}
	}
	
	public void EditPersonFromInnerpage(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking edit peron from inner page");
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
				driver.get(baseUrl + LComVar.CONT_PEOPLE_CARD_VIEW);											
				MulDataClick(LComVar.CONT_TILE, ExPerson);	
				clickByXpath(LComVar.CONT_INNER_EDIT);
				addPersonCardView(FirstName,LastName,"","","","",Mobile,Email,StreetAddress,Locality,City,State,PinCode);
				waitForElementPresent(driver,By.xpath(LComVar.LOGIN_INVAL_PWD));
				stringComparion(LComVar.XPATH,LComVar.LOGIN_INVAL_PWD, ValidationMessage);									
				if (Dependency.contains("Yes")) {
					// CONTACT PAGES
					ContactCardDetails(LComVar.CONT_ALL_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactCardDetails(LComVar.CONT_PEOPLE_CARD_VIEW, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode);
					ContactDropdownCheck(LComVar.CONT_COMP_CARD_VIEW,LComVar.ADD_COMP_CARD_VIEW,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.CONT_COMP_EX_PER_CLICK,LComVar.ON_REC_SEARCH_LIST,FullName);
					ContactInnerDetails(LComVar.ALL_PAGE_CARD_LIST, FullName, Email, Mobile, StreetAddress, Locality,City, PinCode, State,"","","");
					// BILLING PAGES
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_TIME_ENT, LComVar.BTN_ADD_TIME_ENT,LComVar.PAYNT_CONT, LComVar.PAYNT_CONT_SEARCH_BOX, LComVar.PAYNT_CONT_SEARCH_VAL,FullName, "Contact");
					ContactDepBilTimeEntAndExpPage(LComVar.BILLING_EXP, LComVar.BTN_ADD_EXP, LComVar.PAYNT_CONT,LComVar.INV_CONT_SEARCH_BOX, LComVar.INV_CONT_SEARCH_VAL, FullName, "Contact");
					// ADD CASE PAGE
					ContactDepAddCasePage(LComVar.ADD_CASE, CaseTitle, AccountName, FullName);
				}													
			}
		}
	}
	

}
