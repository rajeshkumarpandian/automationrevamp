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
				
				
				clickByXpath(LibraComVar.ADD_COMP_CARD_VIEW);
				clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
				waitForElementPresent(driver, By.xpath(LibraComVar.VALID_MSG_COMP_NAME));
				stringComparion(LibraComVar.XPATH,LibraComVar.VALID_MSG_COMP_NAME, ValidationMessage);				
			}
		}
	}


}
