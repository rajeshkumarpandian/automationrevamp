package grc_Test;

public class GComVar {
	
/*********************************************ELEMENTS TYPE*****************************************************************************/	
	
	public static String XPATH = "XPATH";
	public static String ID = "ID";
	public static String NAME = "NAME";
	public static String CLASSNAME = "CLASSNAME";

/*********************************************PROPERTY FILE*****************************************************************************/
	
	public static String PROP_FILE = "./src/test/resources/mpTestConfig.properties";	
	public static String PROP_BROWSER = "mainconf.browser";
	public static String PROP_QE_URL = "mainconf.professionalpage.baseUrl";
	public static String PROP_GRC_QE_URL = "mainconf.loginpage.grcUrl";
	public static String PROP_CRM_PROD_URL ="mainconf.loginpage.crmbaseUrl";
	public static String PROP_GRC_QE_EMAIL = "mainconf.grcusername";
	public static String PROP_GRC_QE_PWD = "mainconf.grcpassword";

/*********************************************DRIVER DETAILS****************************************************************************/
	
	public static String CHROME_DRIVER = "webdriver.chrome.driver";
	public static String PATH_CHROME_DRIVER = "./src/test/resources/chromedriver.exe";

/*********************************************SHEET NAME********************************************************************************/
	
	public static String LOGIN = "Login";
	public static String COMPANY = "Company";
	public static String PERSON = "Person";
	public static String CRM = "CRM";
	public static String DELETE = "Delete";
	public static String TEST_DATA = "R:\\eclipse\\workSpace\\automationrevamp\\libra\\src\\test\\resources\\LibraTestData.xls";
	
/*********************************************EXTEND REPORT DETAILS**********************************************************************/
	
	public static String PATH_EXTEND_REPORT = "./src/test/resources/testReports/extentreport.html";	

/*********************************************LOGIN PAGE*********************************************************************************/
			
	public static String LOGIN_EMAIL_VALID = "//*[@type='email']";
	public static String LOGIN_PWD_VALID = "//*[@type='password']";
	public static String LOGIN_BTN = "//*[@type='submit']";
	public static String WELCOME_TEXT = "//*[@class='styles_text__A2MAW']";
	public static String LAUNCH_TEXT = "Welcome Automation Test !";
	
	
/*********************************************HOME PAGE*********************************************************************************/	

	
	
}
