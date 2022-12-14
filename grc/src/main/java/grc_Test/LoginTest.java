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

public class LoginTest extends GComFun {

	public LoginTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}
	String ProfilePage ="grc/user-profile";
	
	ATUTestRecorder recorder;
	DateFormat dateFormat = new SimpleDateFormat(CALENDAR_TEXT_FORMAT);
	Date date = new Date();

	public void BrokenLink() throws Exception {
		String errLog = "";
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
		// recorder = new ATUTestRecorder(ComVar.VIDEO_LOCATION, Methodname + "-" +
		// dateFormat.format(date),false);
		// recorder.start();
		try {
			errLog += HTTPErrorCheck();
			if (errLog == "") {
				reportlog("pass", "THERE IS NO BROKEN LINKS\n");
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
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void NullEMailPassword(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("EmailAndPwd_Null"))) {
					clickByXpath(GComVar.LOGIN_BTN);
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING NULL EMAIL");
					} else {
						reportlog("fail", errLog + "\n");
					}
					errLog += stringComparion(ComVar.XPATH, GComVar.PASSWORD_NULL_VALD, expectedPasswordAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING NULL PASSWORD");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void NullEmail(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String Password = strHM.get("Password");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("Email_Null"))) {
					driver.get(baseUrl);
					findAndPassbyxpath(GComVar.LOGIN_PWD_VALID, Password);
					clickByXpath(GComVar.LOGIN_BTN);
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING NULL EMAIL");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void NullPassword(String sheetName) throws Exception, IOException {
		try {
			String errLog = "";
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
				String Email = strHM.get("Email");
				String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("Pwd_Null"))) {
					driver.get(baseUrl);
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, Email);
					clickByXpath(GComVar.LOGIN_BTN);
					errLog += stringComparion(ComVar.XPATH, GComVar.PASSWORD_NULL_VALD, expectedPasswordAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING NULL PASSWORD");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void InvalidEmail(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String Email = strHM.get("Email");
				String Password = strHM.get("Password");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail"))) {
					driver.get(baseUrl);
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, Email);
					findAndPassbyxpath(GComVar.LOGIN_PWD_VALID, Password);
					clickByXpath(GComVar.LOGIN_BTN);
					waitForElementPresent(By.xpath(GComVar.EMAIL_NULL_VALD));
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING INVALID EMAIL '" + Email + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void InvalidPassword(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String Email = strHM.get("Email");
				String Password = strHM.get("Password");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidPassword"))) {
					driver.get(baseUrl);
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, Email);
					findAndPassbyxpath(GComVar.LOGIN_PWD_VALID, Password);
					clickByXpath(GComVar.LOGIN_BTN);
					// waitForElementPresent(By.xpath(GComVar.EMAIL_NULL_VALD));
					errLog += stringComparion(ComVar.XPATH, GComVar.PASSWORD_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE USING INVALID PASSWORD '" + Password + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccountEmailNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("CreateEmailNull"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					// waitForElementPresent(By.xpath(GComVar.EMAIL_NULL_VALD));
					errLog += stringComparion(ComVar.XPATH, GComVar.CREATE_EMAIL_NULL, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING CREATE ACCOUNT PAGE USING NULL EMAIL");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccountEmailInvalid(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String EmailID = strHM.get("Email");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("CreateEmailinvalid"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, EmailID);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					errLog += stringComparion(ComVar.XPATH, GComVar.CREATE_EMAIL_NULL, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING CREATE ACCOUNT PAGE USING INVALID EMAIL '" + EmailID + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccountPasswordNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String EmailID = strHM.get("Email");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("CreateAccountPwdNull"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, EmailID);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					waitForElementPresent(By.xpath(GComVar.CREATE_PWD));
					// waitForElementPresent(By.xpath(GComVar.BTN_SEND_RESET_LINK));
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING CREATE ACCOUNT PAGE USING NULL PASSWORD");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccountPasswordLessChar(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String EmailID = strHM.get("Email");
				String Password = strHM.get("Password");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("CreateAccountPwdLesChar"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, EmailID);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					waitForElementPresent(By.xpath(GComVar.CREATE_PWD));
					findAndPassbyxpath(GComVar.CREATE_PWD, Password);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING CREATE ACCOUNT PAGE USING LESS THAN 6 CHARACTERS PASSWORD '"
								+ Password + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccountDifPassword(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String EmailID = strHM.get("Email");
				String Password = strHM.get("Password");
				String NewPassword = strHM.get("NewPassword");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("DifferentPasswords"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, EmailID);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					waitForElementPresent(By.xpath(GComVar.CREATE_PWD));
					findAndPassbyxpath(GComVar.CREATE_PWD, Password);
					findAndPassbyxpath(GComVar.CREATE_CONFIRM_PWD, NewPassword);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					errLog += stringComparion(ComVar.XPATH, GComVar.PASSWORD_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING CREATE ACCOUNT PAGE USING MISMATCH PASSWORD '" + Password
								+ "' CONFIRM PASSWORD '" + NewPassword + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void CreateAccount(String sheetName) throws Exception, IOException {
		String errLog = "";
		String text = randomTextGenerator();
		String EmailID = text + "@gmail.com";

		try {
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
				String Password = strHM.get("Password");
				String NewPassword = strHM.get("NewPassword");
				if (Test_Scenario.equals("Positive") && (Scenario.equals("CreateAccount"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_CREATE_LINK);
					waitForElementPresent(By.xpath(GComVar.LOGIN_EMAIL_VALID));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, EmailID);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					waitForElementPresent(By.xpath(GComVar.CREATE_PWD));
					findAndPassbyxpath(GComVar.CREATE_PWD, Password);
					findAndPassbyxpath(GComVar.CREATE_CONFIRM_PWD, NewPassword);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					Thread.sleep(1000);
					clickByXpath(GComVar.BTN_SIGNIN);
					Login(EmailID, Password, GComVar.LOGIN_EMAIL_VALID, GComVar.LOGIN_PWD_VALID, GComVar.LOGIN_BTN);	
					waitForElementPresent(By.xpath(GComVar.PROFILE_ICON));			
					driver.get(baseUrl+ProfilePage);			
					waitForElementPresent(By.xpath(GComVar.PROFILE_EMAIL));			
					if (iselementPresent(By.xpath(ERROR_404_502)) == true) {
						String Errordata = driver.findElement(By.xpath(ERROR_404_502)).getText();
						reportlog("fail", "Pages throws " + Errordata + "");
					}
					if (iselementPresent(By.xpath(SERVER_ERROR)) == true) {
						reportlog("fail", "Pages throws server error problem \n");
					}						
					errLog += stringComparion(GComVar.XPATH, GComVar.PROFILE_EMAIL, EmailID);
					if (errLog == "") {
						reportlog("pass", "LOGIN DONE SUCCESSFULLY IN GRC WEB USING THE USERNAME '" + EmailID + "' AND PASSWORD '"+Password+"'\n");
					} else {
						reportlog("fail", "LOGIN DONE SUCCESSFULLY IN GRC WEB,BUT '" + errLog + "'\n");
					}						
					clickByXpath(GComVar.PROFILE_ICON);
					clickByXpath(GComVar.BTN_SIGNOUT);
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void ForgotEmailNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("ForgotPwdEmail_Null"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_FORGOT_PWD);
					waitForElementPresent(By.xpath(GComVar.BTN_SEND_RESET_LINK));
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING PASSWORD RESET PAGE USING NULL VALUE");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void ForgotInvalidEmail(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String Email = strHM.get("Email");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Negative") && (Scenario.equals("ForgotPwdInvalidEmail"))) {
					driver.get(baseUrl);
					clickByXpath(GComVar.BTN_FORGOT_PWD);
					waitForElementPresent(By.xpath(GComVar.BTN_SEND_RESET_LINK));
					findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, Email);
					clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					waitForElementPresent(By.xpath(GComVar.EMAIL_NULL_VALD));
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING PASSWORD RESET PAGE USING INVALID EMAIL '" + Email + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */

	public void ForgotPassword(String sheetName) throws Exception, IOException {
		String errLog = "";
		try {
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
				String Email = strHM.get("Email");
				String expectedEmailAlert = strHM.get("expectedEmailAlert");
				if (Test_Scenario.equals("Positive") && (Scenario.equals("ForgotPassword"))) {
					driver.get(baseUrl);
					// clickByXpath(GComVar.BTN_FORGOT_PWD);
					// waitForElementPresent(By.xpath(GComVar.BTN_SEND_RESET_LINK));
					// findAndPassbyxpath(GComVar.LOGIN_EMAIL_VALID, Email);
					// clickByXpath(GComVar.BTN_SEND_RESET_LINK);
					// waitUntilManualActions(driver, expectedEmailAlert, strHM);
					// //*[@class='neterror']
					MailtrapUserloginPassword(Email);

					waitForElementPresent(By.xpath(GComVar.EMAIL_NULL_VALD));
					errLog += stringComparion(ComVar.XPATH, GComVar.EMAIL_NULL_VALD, expectedEmailAlert);
					if (errLog == "") {
						reportlog("pass", "CHECKING PASSWORD RESET PAGE USING INVALID EMAIL '" + Email + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
				}
			}
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
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
		String errLog = "";		
		// String Methodname = new Object()
		// {}.getClass().getEnclosingMethod().getName();
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
			Login(username, password, GComVar.LOGIN_EMAIL_VALID, GComVar.LOGIN_PWD_VALID, GComVar.LOGIN_BTN);	
			if (iselementPresent(By.xpath(ERROR_404_502)) == true) {
				String Errordata = driver.findElement(By.xpath(ERROR_404_502)).getText();
				reportlog("fail", "Pages throws " + Errordata + "");
			}
			if (iselementPresent(By.xpath(SERVER_ERROR)) == true) {
				reportlog("fail", "Pages throws server error problem \n");
			}
			waitForElementPresent(By.xpath(GComVar.PROFILE_ICON));
			driver.get(baseUrl+ProfilePage);			
			waitForElementPresent(By.xpath(GComVar.PROFILE_EMAIL));												
			errLog += stringComparion(GComVar.XPATH, GComVar.PROFILE_EMAIL, username);
			if (errLog == "") {
				reportlog("pass", "LOGIN DONE SUCCESSFULLY IN GRC WEB USING THE USERNAME '" + username + "' AND PASSWORD '"+password+"'\n");
			} else {
				reportlog("fail", "LOGIN DONE SUCCESSFULLY IN GRC WEB,BUT '" + errLog + "'\n");
			}	
			clickByXpath(GComVar.PROFILE_ICON);
			clickByXpath(GComVar.BTN_SIGNOUT);
		} catch (Exception e) {
			reportlog("fail", "The entire case is failed becasue of '" + e + "'" + "\n");
		}
		// recorder.stop();		
	}
}
