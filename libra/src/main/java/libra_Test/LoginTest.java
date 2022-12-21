package libra_Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import jxl.Sheet;
import jxl.Workbook;

public class LoginTest extends LibraComFun {

	public LoginTest(WebDriver webPageDriver, String baseUrl) {
		super(webPageDriver, baseUrl);
		// TODO Auto-generated constructor stub

	}

	public void BrokenLink() throws Exception {
		String errLog = "";
		errLog += HTTPErrorCheck();
		if (errLog == "") {
			reportlog("pass", "THERE ARE NO BROKEN LINKS IN THE LOGIN PAGE");
		} else {
			reportlog("fail", errLog + "\n");
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void EmailNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Email_Null"))) {
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_EMAIL_VALID, expectedEmailAlert);
				if (errLog == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING NULL EMAIL WITH RANDOM PASSWORD'" + Password + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void PwdNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Pwd_Null"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				clickByXpath(LibraComVar.LOGIN_BTN);
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_PWD_NULL_VALID,expectedPasswordAlert);
				if (errLog  == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING NULL PASSWORD WITH VALID EMAIL '" + Email + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void EmailandPasswordNull(String sheetName) throws Exception, IOException {
		String errLog = "";
		String errLogEmail = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
				clickByXpath(LibraComVar.LOGIN_BTN);				
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_EMAIL_VALID, expectedEmailAlert);
				errLogEmail += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_PWD_VALID,expectedPasswordAlert);
				String Log = errLog+""+errLogEmail;  
				if (Log== "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING NULL EMAIL AND PASSWORD \n");
				} else {
					reportlog("fail", Log + "\n");
				}				
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void ValEmailInvalidPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ValEmail_InvalidPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_INVAL_PWD, expectedEmailAlert);
				if (errLog == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING VALID EMAIL '" + Email + "' AND INVALID PASSWORD '"+ Password + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void ValEmailLess8CharPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("ValEmail_Less8CharPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_LESS_8_CHAR_PWD,expectedPasswordAlert);
				if (errLog == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING VALID EMAIL'" + Email + "' AND PASSWORD '" + Password+ "' WITH LESS THAN 8 CHARACTERS");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void InvalidEmailValPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_ValPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_INVAL_PWD, expectedPasswordAlert);
				if (errLog =="") {
					reportlog("pass", "CHECKING LOGIN PAGE USING INVALID EMAIL '" + Email + "' AND VALID PASSWORD '"+ Password + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void InvalidEmailLess8CharPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_Less8CharPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_LESS_8_CHAR_PWD,expectedPasswordAlert);
				if (errLog == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING INVALID EMAIL '" + Email + "' AND PASSWORD '"+ Password + "' WITH LESS THAN 8 CHARACTERS");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void InvalidEmailAndPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("InvalidEmail_InvalidPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_INVAL_PWD));
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_INVAL_PWD, expectedPasswordAlert);
				if (errLog == "") {
					reportlog("pass","CHECKING LOGIN PAGE USING INVALID EMAIL '" + Email + "' AND PASSWORD '" + Password + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void Less8CharEmailPwd(String sheetName) throws Exception, IOException {
		String errLog = "";
		String errLogEmail = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String expectedPasswordAlert = strHM.get("expectedPasswordAlert");
			String expectedEmailAlert = strHM.get("expectedEmailAlert");
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Less8CharEmail_Less8CharPwd"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.LOGIN_LESS_8_CHAR_PWD));
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.LOGIN_LESS_8_CHAR_PWD, expectedPasswordAlert);
				errLogEmail += stringComparion(LibraComVar.XPATH, LibraComVar.VALID_MSG_EMAIL,expectedEmailAlert);
				String Log = errLog+""+errLogEmail;  
				if (Log== "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING LESS THAN 8 CHARACTERS EMAIL '" + Email+ "' AND PASSWORD '" + Password + "'");
				} else {
					reportlog("fail", Log + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void Less8CharEmail(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			String Email = strHM.get("Email");
			String Password = strHM.get("Password");
			if (Test_Scenario.equals("Negative") && (Scenario.equals("Less8CharEmail"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.VALID_MSG_EMAIL));
				errLog += stringComparion(LibraComVar.XPATH, LibraComVar.VALID_MSG_EMAIL, expectedEmailAlert);
				if (errLog == "") {
					reportlog("pass", "CHECKING LOGIN PAGE USING LESS THAN 8 CHARACTERS EMAIL '" + Email+ "' AND PASSWORD '" + Password + "'");
				} else {
					reportlog("fail", errLog + "\n");
				}
			}
		}
	}

	/**
	 * 
	 * @param sheetName
	 * @throws Exception
	 * @throws IOException
	 */
	public void Login(String sheetName) throws Exception, IOException {
		String errLog = "";
		Workbook file1 = Workbook.getWorkbook(new File(LibraComVar.TEST_DATA));
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
			if (Test_Scenario.equals("Positive") && (Scenario.equals("Login"))) {
				findAndPassbyid(LibraComVar.LOGIN_EMAIL, Email);
				findAndPassbyid(LibraComVar.LOGIN_PWD, Password);
				clickByXpath(LibraComVar.LOGIN_BTN);
				waitForElementPresent(By.xpath(LibraComVar.HOME_ACCOUNT_CIRCLE));
				if (sheetName.equals(LibraComVar.LOGIN)) {
					clickByXpath(LibraComVar.HOME_ACCOUNT_CIRCLE);
					errLog += stringComparion(LibraComVar.XPATH, LibraComVar.HOME_AGENT_EMAIL, Email);					
					if (errLog == "") {
						reportlog("pass", "CHECKING LOGIN PAGE WITH VALID EMAIL '" + Email + "' AND VAILD PASSWORD '"+ Password + "'");
					} else {
						reportlog("fail", errLog + "\n");
					}
					clickByXpath(LibraComVar.BTN_LOGOUT);
				}
			}
		}
	}

}
