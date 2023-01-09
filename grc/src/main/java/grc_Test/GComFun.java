package grc_Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import org.testng.*;
import jxl.common.Assert;
import selenium_module_Test.ComVar;

public class GComFun extends selenium_module_Test.ComFun{

	public GComFun(WebDriver webPageDriver, String baseURL) {
		super(webPageDriver, baseURL);
		// TODO Auto-generated constructor stub
	}

	public void Login(String username, String password,String pathusername,String pathpwd, String pathbtn) throws Exception, IOException {		
		waitForElementPresent(By.xpath(pathusername));
		findAndPassbyxpath(pathusername, username);
		findAndPassbyxpath(pathpwd, password);
		clickByXpath(pathbtn);	
	}
	
	public String MyservicesListVerify() throws Exception {
		String errLog = "";
		int noOfserviceList = 0;
		List<WebElement> serviceList = driver.findElements(By.xpath(GComVar.MY_SERVICE_LIST));
		noOfserviceList = serviceList.size();
		for (int i = 1; i <= noOfserviceList; i++) {
			String serviceName = driver.findElement(By.xpath(""+GComVar.MY_SERVICE_LIST+"["+i+"]"+GComVar.MY_SERVICE_LIST_SERVICE_NAME+"")).getText().trim(); 
			String serviceStatus = driver.findElement(By.xpath(""+GComVar.MY_SERVICE_LIST+"["+i+"]"+GComVar.MY_SERVICE_LIST_SERVICE_STATUS+"")).getText().trim();
			driver.findElement(By.xpath(""+GComVar.MY_SERVICE_LIST+"["+i+"]"+GComVar.MY_SERVICE_LIST_SERVICE_CLICK+"")).click();
			waitForElementPresent(By.xpath(GComVar.SERVICE_NAME));
			String StatusServiceName = driver.findElement(By.xpath(GComVar.SERVICE_NAME)).getText().trim();
			String[] service = StatusServiceName.split(" ");
			String ServiceName = service[0] +" "+ service[1];			
			String StatusServiceStatus = driver.findElement(By.xpath(GComVar.SERVICE_STATUS)).getText().trim();			
			errLog += stringComparionDirValues(serviceName, ServiceName);
			if (!(errLog == "")) {
				reportlog("fail", errLog + "\n");
			}					
			errLog += stringComparionDirValues(serviceStatus, StatusServiceStatus);
			if (!(errLog == "")) {
				reportlog("fail", errLog + "\n");
			}
			clickByXpath(GComVar.MY_SERVICE_BACK);			
		}										
		return errLog;
	}
	
	
}
