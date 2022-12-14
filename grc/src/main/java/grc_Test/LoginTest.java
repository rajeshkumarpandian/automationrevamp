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
	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH-mm-ss");
	Date date = new Date();

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
		String Methodname = new Object() {
		}.getClass().getEnclosingMethod().getName();
		recorder = new ATUTestRecorder("./src/test/resources/videos", Methodname + "-" + dateFormat.format(date),
				false);
		recorder.start();
		if (iselementPresent(By.xpath(ComVar.ERROR_404_502)) == true) {
			String Errordata = driver.findElement(By.xpath(ComVar.ERROR_404_502)).getText();
			reportlog("fail", "Pages throws " + Errordata + "");
		}
		if (iselementPresent(By.xpath(ComVar.SERVER_ERROR)) == true) {
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
		recorder.stop();
	}
	
	public void MenuClicks() {
		
	}

}
