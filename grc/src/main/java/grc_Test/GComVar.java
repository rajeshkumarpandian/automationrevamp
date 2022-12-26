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
	public static String PROP_CRM_QE_URL ="mainconf.loginpage.crmbaseUrl";
	public static String PROP_GRC_QE_EMAIL = "mainconf.grcusername";
	public static String PROP_GRC_QE_PWD = "mainconf.grcpassword";

/*********************************************DRIVER DETAILS****************************************************************************/
	
	public static String CHROME_DRIVER = "webdriver.chrome.driver";
	public static String PATH_CHROME_DRIVER = "./src/test/resources/chromedriver.exe";

/*********************************************SHEET NAME********************************************************************************/
	
	public static String LOGIN = "Login";	
	public static String GRC = "Grc";
	public static String DELETE = "Delete";
	public static String TEST_DATA = "R:\\eclipse\\workSpace\\automationrevamp\\grc\\src\\test\\resources\\LibraTestData.xls";
	
/*********************************************EXTEND REPORT DETAILS**********************************************************************/
	
	public static String PATH_EXTEND_REPORT = "./src/test/resources/testReports/extentreport.html";	

/*********************************************LOGIN PAGE*********************************************************************************/
			
	public static String LOGIN_EMAIL_VALID = "//*[@type='email']";
	public static String LOGIN_PWD_VALID = "//*[@type='password']";
	public static String LOGIN_BTN = "//*[@type='submit']";		
	public static String EMAIL_NULL_VALD = "(//*[@class='error-feedback'])[1]";
	public static String PASSWORD_NULL_VALD = "(//*[@class='error-feedback'])[2]";	
	public static String PROFILE_ICON = "//*[@class='styles_myProfile__n+99a']";	
	public static String PROFILE_EMAIL = "//*[@class='styles_profileInfo__2o15J']/div[1]/p";
	public static String BTN_FORGOT_PWD = "(//*[@class='mb-3 forgot-password-link'])[2]";
	public static String BTN_SEND_RESET_LINK = "//*[@type='button']";
	
	
	
	
	
	public static String MY_SERVICES = "//*[@alt='My Services']";
	
	
	public static String LEFT_SIDE_NAV = "//*[@id='dashboard_left_section_home']/li";
	public static String RIGHT_TOP_SIDE_NAV = "//*[@id='header_function']/li[contains(@id,'Pill')]";
	public static String MY_SERVICES_NAV = "//*[@id='myServicesNavPill']/a";
	public static String MY_SERVICES_SUB_LIST = "//*[@class='col-lg-8 grc_btns_group service-nav-buttons']/ul/li";
	public static String MY_PAYMENTS_NAV = "//*[@id='paymentNavPill']/a";
	public static String MY_PAYMENTS_SUB_LIST = "//*[@class='col-lg-6 grc_btns_group service-nav-buttons']/ul/li";
	public static String SETTINGS_NAV = "//*[@class='settingsicon']";
	public static String SETTINGS_USERS_NAV = "(//*[@class='grc_navpills nav nav-pills'])[1]";
	public static String USERS_NAV = "(//*[@class='grc_navpills nav nav-pills'])[1]/li[1]";
	public static String LEFT_SETTINGS_NAV = "(//*[@class='grc_navpills nav nav-pills'])[2]/li";
	
	
/*********************************************HOME PAGE*********************************************************************************/	

	
	
}
