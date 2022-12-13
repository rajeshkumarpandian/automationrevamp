package grc_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import jxl.Sheet;
import jxl.Workbook;


public class MyservicesTest extends GComFun {
	
	private static int	statusCode;

	public MyservicesTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}
		
	public void SelectServices(String sheetName) throws Exception, IOException {
		reportlog("pass", "'Test Started' to check clicking all the navigations.");
		Workbook file1 = Workbook.getWorkbook(new File(GComVar.TEST_DATA));
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
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Clicks"))) {
				
								
				forloopClick("//*[@id='dashboard_left_section_home']/li");
				clickById("myServicesNavPill");			
				if (iselementPresent(By.xpath("//*[@id='ongoing']/div/table[@class='service-ongoing']")) == false) {
					reportlog("fail", "No tickets is listing.");
				}	
				forloopClickWithWait("//*[@class='row service-list-nav']/span/ul/li","//*[@id='overlayDiv' and @style = 'display: none;']");
				waitForElementPresent(By.xpath("//*[@id='overlayDiv' and @style = 'display: none;']"));
				clickById("paymentNavPill");
				forloopClickWithWait("//*[@class='col-lg-6 grc_btns_group service-nav-buttons']/ul/li","//*[@id='overlayDiv' and @style = 'display: none;']");
				
				//SERVER ERROR PROBLEM
				///html/body/div[@class='error_container']/div/div[1]/text()
				
				
				//404 NOT FOUND               TEXT ==> 404 Not Found
				///html/body/center[1]/h1
				
				//502 bad gateway
				///html/body/center[1]/h1    TEXT == > 502 Bad Gateway
				
				/*
				 * waitForElementPresent(By.
				 * xpath("//*[@id='overlayDiv' and @style = 'display: none;']"));
				 * clickByXpath("//*[@class='row service-list-nav']/span/ul/li[2]");
				 * waitForElementPresent(By.
				 * xpath("//*[@id='overlayDiv' and @style = 'display: none;']"));
				 * clickByXpath("//*[@class='row service-list-nav']/span/ul/li[3]");
				 * waitForElementPresent(By.
				 * xpath("//*[@id='overlayDiv' and @style = 'display: none;']"));
				 * clickByXpath("//*[@class='row service-list-nav']/span/ul/li[4]");
				 * ;
				 */
				//
				//waitForElementPresent(By.xpath("//*[@id='overlayDiv' and @style = 'display: none;']"));
				//clickByXpath("//*[@class='col-lg-6 grc_btns_group service-nav-buttons']/ul/li[2]");				 		
				
				
				
				
				//*[@style='text-align: center;']
				
			}
		}
	}

}
