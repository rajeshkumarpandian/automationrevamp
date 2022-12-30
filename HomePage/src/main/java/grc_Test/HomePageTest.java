package grc_Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import jxl.Sheet;
import jxl.Workbook;
import libra_Test.LibraComVar;
import selenium_module_Test.ComVar;

public class HomePageTest extends HpComFun {

	public HomePageTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void BrokenLink() throws Exception {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {			
			errLog += HTTPErrorCheck();
			if (errLog == "") {
				reportlog("pass", "There is no broken links \n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
		// recorder.stop();
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void HomePage(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
			Workbook file1 = Workbook.getWorkbook(new File(HpComVar.TEST_DATA));
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
				String Domain = strHM.get("Domain");
				String Services = strHM.get("Services");					
				if (Test_Scenario.equals("Positive") && (Scenario.equals("Pagecheck"))) {
					driver.navigate().to(Domain+Services);
					
					String pageSource = driver.getPageSource();
															
										
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}
}
