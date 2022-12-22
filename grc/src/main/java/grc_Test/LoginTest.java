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
	DateFormat dateFormat = new SimpleDateFormat(CALENDAR_TEXT_FORMAT);
	Date date = new Date();

	public void BrokenLink() throws Exception {
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {
			String errLog = "";
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
	 * @param username
	 * @param password
	 * @throws Exception
	 * @throws IOException
	 */
	public void Login(String username, String password) throws Exception, IOException {
		String errLog = "";
		//// String Methodname = new Object()
		//// {}.getClass().getEnclosingMethod().getName();
		//// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		//// dateFormat.format(date),false);
		//// recorder.start();
		try {
			if (iselementPresent(By.xpath(ERROR_404_502)) == true) {
				String Errordata = driver.findElement(By.xpath(ERROR_404_502)).getText();
				reportlog("fail", "Pages throws " + Errordata + "");
			}
			if (iselementPresent(By.xpath(SERVER_ERROR)) == true) {
				reportlog("fail", "Pages throws server error problem \n");
			}
			findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, username);
			findAndPassbyxpath(GComVar.LOGIN_PWD_VALID, password);
			clickByXpath(GComVar.LOGIN_BTN);
			waitForElementPresent(By.xpath(GComVar.PROFILE_ICON));
			clickByXpath(GComVar.PROFILE_ICON);
			errLog += stringComparion(GComVar.XPATH, GComVar.PROFILE_EMAIL, username);
			if (errLog == "") {
				reportlog("pass", "Login done successfully in grc web using the username '" + username + "'\n");
			} else {
				reportlog("fail", "Login done successfully in grc web,but '" + errLog + "'\n");
			}
			if (iselementPresent(By.xpath(ComVar.ERROR_404_502)) == true) {
				String Errordata = driver.findElement(By.xpath(ComVar.ERROR_404_502)).getText();
				errLog += ("In Page  name it throws " + Errordata + "");
			}
			if (iselementPresent(By.xpath(ComVar.SERVER_ERROR)) == true) {
				errLog += ("In page  name it throws server error problem");
			}
			driver.navigate().refresh();
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
	public void MenuClicksLeftNav() throws Exception, IOException {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {
			errLog += MenusclickLinkCheck(GComVar.LEFT_SIDE_NAV);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'left side navigaiton' pages \n");
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
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksTopRightNav() throws Exception, IOException {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {			
			errLog += MenusclickLinkCheck(GComVar.RIGHT_TOP_SIDE_NAV);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'top right side navigaiton' pages \n");
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
 * @throws Exception
 * @throws IOException
 */
	public void MenuClicksMyServicesSubNav() throws Exception, IOException {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {	
			driver.navigate().refresh();
			clickByXpath(GComVar.MY_SERVICES_NAV);
			errLog += MenusclickLinkCheck(GComVar.MY_SERVICES_SUB_LIST);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'my services sub navigaiton' pages \n");
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
 * @throws Exception
 * @throws IOException
 */
	public void MenuClicksPaymentsSubNav() throws Exception, IOException {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {			
			clickByXpath(GComVar.MY_PAYMENTS_NAV);
			errLog += MenusclickLinkCheck(GComVar.MY_PAYMENTS_SUB_LIST);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'my payment sub navigaiton' pages \n");
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
 * @throws Exception
 * @throws IOException
 */
	public void MenuClicksSettingsNav() throws Exception, IOException {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {
			clickByXpath(GComVar.SETTINGS_NAV);
			waitForElementPresent(By.xpath(GComVar.SETTINGS_USERS_NAV));
			clickByXpath(GComVar.USERS_NAV);
			errLog += MenusclickLinkCheck(GComVar.LEFT_SETTINGS_NAV);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'settings' pages \n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
		// recorder.stop();
	}
}
