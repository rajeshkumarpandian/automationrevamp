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


public class DeleteAllTest extends Libra.Libra_Common_Module.LComFun {
	
	public DeleteAllTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

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
	
}
