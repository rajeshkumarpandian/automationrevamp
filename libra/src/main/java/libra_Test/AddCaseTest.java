package libra_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;

public class AddCaseTest extends LibraComFun {
	
	public AddCaseTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void CaseTitleNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking null case title");
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
			String Casetype = strHM.get("Casetype");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("NullCaseTitle"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);				
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_PWD_NULL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_PWD_NULL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseSupCaseTypeNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case supreme court case type null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CaseTypeNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);	
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);				
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseSupCaseNumNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case supreme court case number null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");
			String SupCaseType = strHM.get("SupCaseType");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CasenumNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				SingleSearchdropdownSelection(LibraComVar.SUP_CASE_TYPE,LibraComVar.SUP_CASE_TYPE_SEARCH,LibraComVar.ON_REC_SEARCH_LIST, SupCaseType);
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseSupCaseYearNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case supreme court case year null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");
			String SupCaseType = strHM.get("SupCaseType");
			String CaseNum = strHM.get("CaseNum");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("CaseyearNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				SingleSearchdropdownSelection(LibraComVar.SUP_CASE_TYPE,LibraComVar.SUP_CASE_TYPE_SEARCH,LibraComVar.ON_REC_SEARCH_LIST, SupCaseType);
				findAndPassbyname(LibraComVar.CASE_NUM, CaseNum);
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseHighCourtNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case high court null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("HighCourtNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				waitForElementPresent(driver,By.name(LibraComVar.CASE_NUM));
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseDisCourtNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case district court state null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("DisCourtNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				waitForElementPresent(driver,By.name(LibraComVar.CASE_NUM));
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseConsumerCourtNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case consumer court state/commission null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ConsumerCourtNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				waitForElementPresent(driver,By.name(LibraComVar.CASE_NUM));
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
	public void AddCaseTribunalCourtNameNull(String sheetName) throws Exception, IOException {
		reportlog("pass", "Checking add case tribunal court tribunal name null");
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
			String Casetype = strHM.get("Casetype");
			String CourtType = strHM.get("CourtType");			
			String CaseTitle = strHM.get("CaseTitle");			
			if (Test_Scenario.equals("Negative") && (Scenario.equals("TribunalNameNull"))) {
				driver.get(baseUrl + LibraComVar.ADD_CASE);		
				findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
				forloopClick(LibraComVar.SEL_CASE_TYPE, Casetype);
				forloopClick(LibraComVar.SEL_COURT_TYPE, CourtType);	
				waitForElementPresent(driver,By.name(LibraComVar.CASE_NUM));
				clickById(LibraComVar.CASE_NEXT);
				waitForElementPresent(driver, By.xpath(LibraComVar.LOGIN_EMAIL_VALID));
				stringComparion(LibraComVar.XPATH,LibraComVar.LOGIN_EMAIL_VALID, ValidationMessage);								
			}
		}
	}
	
}
