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
import selenium_module_Test.ComVar;

public class LoginTest extends GComFun {

	public LoginTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}
	
	ATUTestRecorder recorder;
	
	/*
	 *  DateFormat dateFormat = new
	 * SimpleDateFormat(CALENDAR_TEXT_FORMAT); Date date = new Date();
	 */

	public void BrokenLink() throws Exception {
		String errLog = "";
		errLog += HTTPErrorCheck();
		if (errLog == "") {
			reportlog("pass", "There is no broken links in the login page");
		} else {
			reportlog("fail", errLog + "\n");
		}
	}
	/**
	 * 
	 * @param username
	 * @param password
	 * @throws Exception
	 * @throws IOException
	 */
	public void Login(String username, String password) throws Exception, IOException {	
		if (iselementPresent(By.xpath(ERROR_404_502)) == true) {
			String Errordata = driver.findElement(By.xpath(ERROR_404_502)).getText();
			reportlog("fail", "Pages throws " + Errordata + "");
		}
		if (iselementPresent(By.xpath(SERVER_ERROR)) == true) {
			reportlog("fail", "Pages throws server error problem");
		}
		findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, username);
		findAndPassbyxpath(GComVar.LOGIN_PWD_VALID, password);
		clickByXpath(GComVar.LOGIN_BTN);
		waitForElementPresent(By.xpath(GComVar.PROFILE_ICON));
		clickByXpath(GComVar.PROFILE_ICON);
		if (stringComparion(GComVar.XPATH, GComVar.PROFILE_EMAIL, username) == true) {
			reportlog("pass", "Login done successfully in grc web using the username '" + username + "'");
		}		
	}
	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicks(String sheetName) throws Exception, IOException {
		driver.navigate().refresh();
		String errLog = "";
		errLog += MenusclickLinkCheck("//*[@id='dashboard_left_section_home']/li");
		if (errLog == "") {
			reportlog("pass", "There is no broken links in the login page");
		} else {
			reportlog("fail", errLog + "\n");
		}

		errLog += MenusclickLinkCheck("//*[@id='header_function']/li[contains(@id,'Pill')]");
		if (errLog == "") {
			reportlog("pass", "There is no broken links in the login page");
		} else {
			reportlog("fail", errLog + "\n");
		}

		driver.navigate().refresh();
		clickByXpath("//*[@id='myServicesNavPill']/a");
		errLog += MenusclickLinkCheck("//*[@class='col-lg-8 grc_btns_group service-nav-buttons']/ul/li");
		if (errLog == "") {
			reportlog("pass", "There is no broken links in the login page");
		} else {
			reportlog("fail", errLog + "\n");
		}	
		
		clickByXpath("//*[@id='paymentNavPill']/a");
		errLog += MenusclickLinkCheck("//*[@class='col-lg-6 grc_btns_group service-nav-buttons']/ul/li");
		if (errLog == "") {
			reportlog("pass", "There is no broken links in the login page");
		} else {
			reportlog("fail", errLog + "\n");
		}	
		
		
	}
}
