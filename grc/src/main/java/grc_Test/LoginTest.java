package grc_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;


public class LoginTest extends GComFun {
	
	public LoginTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void Login(String username, String password) throws Exception, IOException {
		reportlog("pass", "Checking null Email and password");
		findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID,username);
		findAndPassbyxpath(GComVar.LOGIN_PWD_VALID,password);
		clickByXpath(GComVar.LOGIN_BTN);
		stringComparion(GComVar.XPATH,GComVar.WELCOME_TEXT,GComVar.LAUNCH_TEXT);
	}

	
}
