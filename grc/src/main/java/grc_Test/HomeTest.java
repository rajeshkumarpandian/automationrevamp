package grc_Test;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import jxl.Sheet;
import jxl.Workbook;
import libra_Test.LibraComVar;
import selenium_module_Test.ComVar;

public class HomeTest extends GComFun {

	public HomeTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void MyservicesList() throws Exception {
		String errLog = "";
		try {
			driver.get(baseUrl);
			errLog += MyservicesListVerify();
			if (errLog == "") {
				reportlog("pass", "CHECKING SERVICE NAMES AND STATUS FROM MY SERVICE LIST AND AFTER CLICKING SERVICE");
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
	 */
	public void MyservicesViewAll() throws Exception {
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.MY_SERVICE_VIEW_ALL));
			clickByXpath(GComVar.MY_SERVICE_VIEW_ALL);
			waitForElementPresent(By.xpath(GComVar.MY_SERVICES_NAV));
			if(iselementPresent(By.xpath(GComVar.MY_SERVICES_NAV))==true) {
				reportlog("pass", "CHECKING MY SERVICES VIEW ALL NAVIGATION");	
			}else {
				reportlog("fail", "CHECKING MY SERVICES VIEW ALL NAVIGATION FAILED"+"\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}		
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public void RecservicesViewAll() throws Exception {
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.REC_SERVICE_VIEW_ALL));
			WebElement element = driver.findElement(By.xpath(GComVar.REC_SERVICE_VIEW_ALL));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			clickByXpath(GComVar.REC_SERVICE_VIEW_ALL);
			waitForElementPresent(By.xpath(GComVar.COMP_TILE));
			if (iselementPresent(By.xpath(GComVar.COMP_TILE)) == true) {
				reportlog("pass", "CHECKING RECOMMENDED SERVICES VIEW ALL NAVIGATION");
			} else {
				reportlog("fail", "CHECKING RECOMMENDED SERVICES VIEW ALL NAVIGATION FAILED" + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public void ComCalendarViewAll() throws Exception {
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.COMP_CAL_VIEW_ALL));
			WebElement element = driver.findElement(By.xpath(GComVar.COMP_CAL_VIEW_ALL));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			clickByXpath(GComVar.COMP_CAL_VIEW_ALL);
			waitForElementPresent(By.xpath(GComVar.UPCOMING_COMP_CAL));
			if (iselementPresent(By.xpath(GComVar.UPCOMING_COMP_CAL)) == true) {
				reportlog("pass", "CHECKING COMPLIANCE CALENDAR VIEW ALL NAVIGATION");
			} else {
				reportlog("fail", "CHECKING COMPLIANCE CALENDAR VIEW ALL NAVIGATION FAILED" + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}
	
	/**
	 * 
	 * @throws Exception
	 */
	public void PopularServicesViewAll() throws Exception {
		try {
			driver.get(baseUrl);
			waitForElementPresent(By.xpath(GComVar.POPULAR_SER_VIEW_ALL));
			WebElement element = driver.findElement(By.xpath(GComVar.POPULAR_SER_VIEW_ALL));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			Thread.sleep(500);
			clickByXpath(GComVar.POPULAR_SER_VIEW_ALL);
			waitForElementPresent(By.xpath(GComVar.POPULAR_SER));
			if (iselementPresent(By.xpath(GComVar.POPULAR_SER)) == true) {
				reportlog("pass", "CHECKING POPULAR SERVICES VIEW ALL NAVIGATION");
			} else {
				reportlog("fail", "CHECKING POPULAR SERVICES VIEW ALL NAVIGATION FAILED" + "\n");
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}
	
}
