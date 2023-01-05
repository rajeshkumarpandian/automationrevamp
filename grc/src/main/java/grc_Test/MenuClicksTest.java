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

public class MenuClicksTest extends GComFun {

	public MenuClicksTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	String ProfilePage = "grc/user-profile";

	public void Login(String username, String password) throws Exception, IOException {
		String errLog = "";
		try {
			Login(username, password, GComVar.LOGIN_EMAIL_VALID, GComVar.LOGIN_PWD_VALID, GComVar.LOGIN_BTN);
			waitForElementPresent(By.xpath(GComVar.PROFILE_ICON));
			driver.get(baseUrl + ProfilePage);
			waitForElementPresent(By.xpath(GComVar.PROFILE_EMAIL));
			errLog += stringComparion(GComVar.XPATH, GComVar.PROFILE_EMAIL, username);
			if (errLog == "") {
				reportlog("pass", "LOGIN DONE SUCCESSFULLY IN GRC WEB USING THE USERNAME '" + username
						+ "' AND PASSWORD '" + password + "'\n");
			} else {
				reportlog("fail", "LOGIN DONE SUCCESSFULLY IN GRC WEB,BUT '" + errLog + "'\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	public void MenuClicksLeftNav() throws Exception, IOException {
		String errLog = "";
		try {
			driver.get(baseUrl);
			errLog += MenusclickLinkCheck(GComVar.LEFT_SIDE_NAV);
			if (errLog == "") {
				reportlog("pass", "THERE IS NO 404,502, SERVER ISSUE, IN 'LEFT SIDE NAVIGAITON' PAGES \n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksTopRightQuickNav() throws Exception, IOException {
		String errLog = "";
		try {
			errLog += MenusclickLinkCheck(GComVar.RIGHT_TOP_SIDE_NAV);
			if (errLog == "") {
				reportlog("pass", "THERE IS NO 404,502, SERVER ISSUE, IN 'TOP RIGHT SIDE QUICK NAVIGAITON' PAGES \n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksTopRightDemoVideo() throws Exception, IOException {
		clickByXpath(GComVar.PLAY_BTN);
		if (iselementPresent(By.xpath(GComVar.BTN_SKIP_DEMO)) == true) {
			waitForElementPresent(By.xpath(GComVar.BTN_SKIP_DEMO));
			clickByXpath(GComVar.BTN_SKIP_DEMO);
			reportlog("pass", "THERE IS NO 404,502, SERVER ISSUE, IN 'VIDEO MODAL WINDOW' PAGES \n");
		} else {
			reportlog("fail", "THERE IS AN ERROR, IN 'VIDEO MODAL WINDOW' PAGES \n");
		}

	}

	/**
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksTopRightNav() throws Exception, IOException {
		String errLog = "";
		try {
			clickByXpath(GComVar.GEAR_BTN);
			waitForElementPresent(By.xpath(GComVar.GEAR_BTN_DROPDOWN));
			errLog += MenusclickLinkCheck(GComVar.GEAR_BTN_DROPDOWN);
			if (errLog == "") {
				reportlog("pass", "THERE IS NO 404,502, SERVER ISSUE, IN 'TOP RIGHT NAVIGATIONS' PAGES\n");
			} else {
				reportlog("fail", errLog + "\n");
			}
			driver.get(baseUrl);
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksProfile() throws Exception, IOException {
		String errLog = "";
		try {
			clickByXpath(GComVar.PROFILE_BTN);
			waitForElementPresent(By.xpath(GComVar.VIEW_PROFILE_BTN));
			clickByXpath(GComVar.VIEW_PROFILE_BTN);
			waitForElementPresent(By.xpath(GComVar.PROFILE_LEFT_NAV));
			errLog += MenusclickLinkCheck(GComVar.PROFILE_LEFT_NAV);
			if (errLog == "") {
				reportlog("pass", "THERE IS NO 404,502, SERVER ISSUE, IN 'PROFILE LEFT NAVIGATIONS' PAGES\n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @throws Exception
	 * @throws IOException
	 */
	public void MenuClicksMyServices() throws Exception, IOException {
		String errLog = "";
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.MY_SERVICES));
			clickByXpath(GComVar.MY_SERVICES);			
			errLog += MenusclickLinkCheck(GComVar.MY_SERVICES_NAV);
			if (errLog == "") {
				reportlog("pass", "There is no 404,502, server issue, in 'my payment sub navigaiton' pages \n");
			} else {
				reportlog("fail", errLog + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	public void MenuClicksPaymentsSubNav() throws Exception, IOException {
		String errLog = "";
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.MY_PAYMENTS_NAV));
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
	}

}
