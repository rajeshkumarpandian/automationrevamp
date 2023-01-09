package grc_Test;

public class GComVar {
	
/*********************************************ELEMENTS TYPE*****************************************************************************/	
	
	public final static String XPATH = "XPATH";
	public final static String ID = "ID";
	public final static String NAME = "NAME";
	public final static String CLASSNAME = "CLASSNAME";

/*********************************************PROPERTY FILE*****************************************************************************/
	
	public final static String PROP_FILE = "./src/test/resources/mpTestConfig.properties";	
	public final static String PROP_BROWSER = "mainconf.browser";
	public final static String PROP_QE_URL = "mainconf.professionalpage.baseUrl";
	public final static String PROP_GRC_QE_URL = "mainconf.loginpage.grcUrl";
	public final static String PROP_CRM_QE_URL ="mainconf.loginpage.crmbaseUrl";
	public final static String PROP_GRC_QE_EMAIL = "mainconf.grcusername";
	public final static String PROP_GRC_QE_PWD = "mainconf.grcpassword";

/*********************************************DRIVER DETAILS****************************************************************************/
	
	public final static String CHROME_DRIVER = "webdriver.chrome.driver";
	public final static String PATH_CHROME_DRIVER = "./src/test/resources/chromedriver.exe";

/*********************************************SHEET NAME********************************************************************************/
	
	public final static String LOGIN = "Login";	
	public final static String GRC = "Grc";
	public final static String DELETE = "Delete";
	public final static String VAKILSEARCH = "Vakilsearch";
	public final static String TEST_DATA = "R:\\eclipse\\workSpace\\automationrevamp\\grc\\src\\test\\resources\\GrcTestData.xls";
	
/*********************************************EXTEND REPORT DETAILS**********************************************************************/
	
	public final static String PATH_EXTEND_REPORT = "./src/test/resources/testReports/extentreport.html";	

/*********************************************LOGIN PAGE*********************************************************************************/
	
	public final static String BTN_SKIP_DEMO = "//*[@class='styles_btn__6i+YG']";
	public final static String LOGIN_EMAIL_VALID = "//*[@type='email']";
	public final static String LOGIN_PWD_VALID = "//*[@type='password']";
	public final static String LOGIN_BTN = "//*[@type='submit']";		
	public final static String EMAIL_NULL_VALD = "(//*[@class='error-feedback'])[1]";
	public final static String PASSWORD_NULL_VALD = "(//*[@class='error-feedback'])[2]";	
	public final static String CREATE_EMAIL_NULL = "(//*[@class='error-feedback'])[3]";
	public final static String PROFILE_ICON = "(//*[@alt='User Icon'])[1]";	
	public final static String PROFILE_EMAIL = "//*[@class='styles_userEmail__lclcY']";
	public final static String BTN_FORGOT_PWD = "(//*[@class='mb-3 forgot-password-link'])[2]";
	public final static String BTN_SEND_RESET_LINK = "//*[@type='button']";
	public final static String BTN_CREATE_LINK = "(//*[@class='mb-3 forgot-password-link'])[1]";
	public final static String CREATE_PWD = "//*[@id='password']";
	public final static String CREATE_CONFIRM_PWD = "//*[@id='confirmPassword']";
	public final static String BTN_SIGNIN = "//*[@href='/grc-m/login']";
	public final static String BTN_SIGNOUT = "//*[@class='styles_signOut__PNnz-']/p";	
	public final static String LEFT_SIDE_NAV = "//*[@class='styles_menu__O9eHZ']/li";
	public final static String PLAY_BTN = "//*[@class='styles_playBtn__ZGwPO']";
	public final static String CHAT_CLOSE_BTN = "km-chat-widget-close-button";
	public final static String GEAR_BTN = "//*[@class='styles_gearBtn__CsWQ4']";
	public final static String GEAR_BTN_DROPDOWN = "//*[@class='styles_body__fqvI5']/span";
	public final static String PROFILE_BTN = "//*[@class='styles_myProfile__n+99a']";
	public final static String VIEW_PROFILE_BTN = "//*[@class='styles_profileCta__RF0us']/a";
	public final static String PROFILE_LEFT_NAV = "//*[@class='styles_menu__O9eHZ']/li";	
	public final static String MY_SERVICES = "//*[@alt='My Services']";					
	public final static String RIGHT_TOP_SIDE_NAV = "//*[@class='styles_header__NyX8e']/div/span";		
	public final static String MY_SERVICES_NAV = "//*[@class='styles_leftBox__JrE7N']/button";	
	public final static String MY_PAYMENTS_NAV = "//*[@class='styles_menu__O9eHZ']/li[4]/a";
	public final static String MY_PAYMENTS_SUB_LIST = "//*[@class='styles_tabSection__Mtsoy']/button";
	public final static String MY_SERVICE_LIST = "(//*[@class='styles_shadowBlock__ujGbi'])";
	public final static String MY_SERVICE_LIST_SERVICE_NAME = "/div[1]/div/div[1]/span[1]";
	public final static String MY_SERVICE_LIST_SERVICE_STATUS = "/div[1]/div/div[2]/span[2]";
	public final static String MY_SERVICE_LIST_SERVICE_CLICK = "/div/a";
	public final static String SERVICE_NAME = "//*[@class='styles_serviceName__BFzVW']/h3";
	public final static String SERVICE_STATUS = "//*[@class='styles_msgBoxBlue__qohU9']";
	public final static String MY_SERVICE_BACK = "//*[@class='styles_title__uOhbw']/img";
	public final static String MY_SERVICE_VIEW_ALL = "//*[@class='styles_link__ve8QS']";
	public final static String REC_SERVICE_VIEW_ALL = "//*[@class='styles_link__-JY3l']";
	public final static String COMP_TILE = "//*[@class='styles_list__JyRnY']";
	public final static String COMP_CAL_VIEW_ALL = "//*[@class='styles_link__tjXlR']";
	public final static String UPCOMING_COMP_CAL = "//*[@class='styles_container__dauVr']";
	public final static String POPULAR_SER_VIEW_ALL = "//*[@class='styles_link__gJWB5']";
	public final static String POPULAR_SER = "//*[@class='styles_section__DqNZH']";
	
	
	
	
/*********************************************HOME PAGE*********************************************************************************/	

	
	
}
