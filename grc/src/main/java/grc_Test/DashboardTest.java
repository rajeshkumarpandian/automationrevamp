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

public class DashboardTest extends GComFun {

	public DashboardTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}
	
	ATUTestRecorder recorder;
	DateFormat dateFormat = new SimpleDateFormat(CALENDAR_TEXT_FORMAT);
	Date date = new Date();	 
	
	


}
