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
	public static String VAKILSEARCH = "Vakilsearch";
	public static String TEST_DATA = "R:\\eclipse\\workSpace\\automationrevamp\\grc\\src\\test\\resources\\GrcTestData.xls";
	
/*********************************************EXTEND REPORT DETAILS**********************************************************************/
	
	public static String PATH_EXTEND_REPORT = "./src/test/resources/testReports/extentreport.html";	

/*********************************************LOGIN PAGE*********************************************************************************/
	
	public static String BTN_SKIP_DEMO = "//*[@class='styles_btn__6i+YG']";
	public static String LOGIN_EMAIL_VALID = "//*[@type='email']";
	public static String LOGIN_PWD_VALID = "//*[@type='password']";
	public static String LOGIN_BTN = "//*[@type='submit']";		
	public static String EMAIL_NULL_VALD = "(//*[@class='error-feedback'])[1]";
	public static String PASSWORD_NULL_VALD = "(//*[@class='error-feedback'])[2]";	
	public static String CREATE_EMAIL_NULL = "(//*[@class='error-feedback'])[3]";
	public static String PROFILE_ICON = "(//*[@alt='User Icon'])[1]";	
	public static String PROFILE_EMAIL = "//*[@class='styles_userEmail__lclcY']";
	public static String BTN_FORGOT_PWD = "(//*[@class='mb-3 forgot-password-link'])[2]";
	public static String BTN_SEND_RESET_LINK = "//*[@type='button']";
	public static String BTN_CREATE_LINK = "(//*[@class='mb-3 forgot-password-link'])[1]";
	public static String CREATE_PWD = "//*[@id='password']";
	public static String CREATE_CONFIRM_PWD = "//*[@id='confirmPassword']";
	public static String BTN_SIGNIN = "//*[@href='/grc-m/login']";
	public static String BTN_SIGNOUT = "//*[@class='styles_signOut__PNnz-']/p";	
	public static String LEFT_SIDE_NAV = "//*[@class='styles_menu__O9eHZ']/li";
	public static String PLAY_BTN = "//*[@class='styles_playBtn__ZGwPO']";
	public static String CHAT_CLOSE_BTN = "km-chat-widget-close-button";
	public static String GEAR_BTN = "//*[@class='styles_gearBtn__CsWQ4']";
	public static String GEAR_BTN_DROPDOWN = "//*[@class='styles_body__fqvI5']/span";
	public static String PROFILE_BTN = "//*[@class='styles_myProfile__n+99a']";
	public static String VIEW_PROFILE_BTN = "//*[@class='styles_profileCta__RF0us']/a";
	public static String PROFILE_LEFT_NAV = "//*[@class='styles_menu__O9eHZ']/li";	
	public static String MY_SERVICES = "//*[@alt='My Services']";					
	public static String RIGHT_TOP_SIDE_NAV = "//*[@class='styles_header__NyX8e']/div/span";		
	public static String MY_SERVICES_NAV = "//*[@class='styles_leftBox__JrE7N']/button";
	
	public static String MY_PAYMENTS_NAV = "//*[@class='styles_menu__O9eHZ']/li[4]/a";
	public static String MY_PAYMENTS_SUB_LIST = "//*[@class='styles_tabSection__Mtsoy']/button";
	
	
/*********************************************HOME PAGE*********************************************************************************/	

	
	
}
