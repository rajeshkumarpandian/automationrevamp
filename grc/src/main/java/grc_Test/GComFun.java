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
		findAndPassbyxpath(pathusername, username);
		findAndPassbyxpath(pathpwd, password);
		clickByXpath(pathbtn);	
	}
	
	
	
	
}
