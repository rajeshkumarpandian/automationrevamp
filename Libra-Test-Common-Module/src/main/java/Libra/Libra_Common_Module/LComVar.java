package Libra.Libra_Common_Module;

public class LComVar {
	
/*********************************************ELEMENTS TYPE*****************************************************************************/	
	
	public static String XPATH = "XPATH";
	public static String ID = "ID";
	public static String NAME = "NAME";
	public static String CLASSNAME = "CLASSNAME";

/*********************************************PROPERTY FILE*****************************************************************************/
	
	public static String PROP_FILE = "./src/test/resources/mpTestConfig.properties";	
	public static String PROP_BROWSER = "mainconf.browser";
	public static String PROP_QE_URL = "mainconf.professionalpage.baseUrl";
	public static String PROP_CRM_PROD_URL ="mainconf.loginpage.crmbaseUrl";
	public static String PROP_QE_EMAIL = "mainconf.professionalName";
	public static String PROP_QE_PWD = "mainconf.professionalPwd";

/*********************************************DRIVER DETAILS****************************************************************************/
	
	public static String CHROME_DRIVER = "webdriver.chrome.driver";
	public static String PATH_CHROME_DRIVER = "./src/test/resources/chromedriver.exe";

/*********************************************SHEET NAME********************************************************************************/
	
	public static String LOGIN = "Login";
	public static String COMPANY = "Company";
	public static String PERSON = "Person";
	public static String CRM = "CRM";
	public static String DELETE = "Delete";
	public static String TEST_DATA = "R:\\eclipse\\workSpace\\libra-Main-Module\\src\\test\\resources\\LibraTestData.xls";
	
/*********************************************EXTEND REPORT DETAILS**********************************************************************/
	
	public static String PATH_EXTEND_REPORT = "./src/test/resources/testReports/extentreport.html";	

/*********************************************LOGIN PAGE*********************************************************************************/
		
	public static String LOGIN_BTN = "//*[@value='Login']";
	public static String LOGIN_EMAIL_VALID = "(//*[@class='parsley-required'])[1]";
	public static String LOGIN_PWD_VALID = "(//*[@class='parsley-required'])[2]";
	public static String LOGIN_PWD_NULL_VALID = "//*[@class='parsley-required']";
	public static String LOGIN_PWD = "user_password";
	public static String LOGIN_EMAIL = "sign_in_otp";
	public static String LOGIN_INVAL_PWD = "//*[@class='iziToast-body']//p[@class='slideIn']"; 
	public static String LOGIN_ALERT_TYPE = "//strong[@class='slideIn']";
	public static String LOGIN_LESS_8_CHAR_PWD = "//*[@class='parsley-minlength']";
	
/*********************************************HOME PAGE*********************************************************************************/	
	
	public static String HOME_AGENT_EMAIL = "//*[@class=\"profile_edit_ctr\"]//h5";
	public static String HOME_ACCOUNT_CIRCLE = "//*[@class='fa fa-fw ml-account-circle']";
	public static String BTN_LOGOUT = "//a[@href='/users/sign_out']";
		
/*********************************************CONTACTS PAGE*********************************************************************************/	
	
	public static String CONT_ALL_CARD_VIEW = "/contacts?term=all&view=card";
	public static String CONT_COMP_CARD_VIEW = "/contacts?term=companies&view=card";
	public static String CONT_PEOPLE_CARD_VIEW = "/contacts?term=contacts&view=card";		
	public static String CONT_ALL_LIST_VIEW = "/contacts?term=all";
	public static String CONT_PEOPLE_LIST_VIEW = "/contacts?term=contacts";
	public static String CONT_COMP_LIST_VIEW = "/contacts?term=companies";	
	public static String ADD_COMP_CARD_VIEW = "(//a[@class='link-libra extra_margin'])[2]//span[.='+']"; 
	public static String ADD_PER_CARD_VIEW = "(//a[@class='link-libra extra_margin'])[1]//span[.='+']";
	public static String BTN_CREATE_COMP_CARD_VIEW = "//button[contains(@class,'btn-libra')]";
	
	public static String VALID_MSG_COMP_NAME = "//div[@class='form-section']//li[@class='parsley-required']";
	public static String VALID_MSG_EMAIL = "//*[@class='parsley-type']";	
	public static String VALID_MSG_CITY = "//*[@class='parsley-pattern']"; 
	public static String COMP_EMAIL = "company[email]";
	public static String COMP_WEBSITE = "company[website]";
	public static String COMP_NAME = "company[name]";
	public static String COMP_MOB = "company[mobile_number]";
	public static String COMP_PHONE = "company[phone_number]";
	public static String COMP_CITY = "company[city]";
	public static String COMP_STATE = "company[state]";
	public static String COMP_PIN = "company[postal_code]";
	public static String COMP_STREET_ADD = "company[street_address]";
	public static String COMP_LOCALITY =	"company[locality]";
	public static String ALL_PAGE_CARD_LIST = "(//*[@class='col-md-3']/div/div[@class='card-body']/p/b/a)";
	public static String COMP_NEW_PER = "(//*[@id='add_users'])[1]";
	public static String COMP_NEW_PER_FORM = "//*[@class='final-form']";
	public static String COMP_NEW_PER_FN = "contact[first_name]";
	public static String COMP_NEW_PER_LN = "contact[last_name]";
	public static String COMP_NEW_PER_EMAIL = "contact[email]";
	public static String PER_CITY = "contact[city]";
	public static String PER_STATE = "contact[state]";
	public static String PER_ADDRESS = "contact[street_address]";
	public static String PER_LOCALITY = "contact[locality]";
	public static String PER_PIN ="contact[postal_code]";
	public static String COMP_NEW_PER_MOB = "contact[mobile_number]";
	public static String CONT_CARD_TO_LIST = "//*[@class='fa fa-fw lib_icon-grid_view']";
	public static String CONT_LIST_PAGI_CNT = "//a[contains(@class,'paginate_button')]"; 
	public static String CONT_CARD_PAGI_CNT = "//*[contains(@class,'pagination')]/span[contains(@class,'page')]";
	public static String CONT_LIST_NEXT_BTN = "//i[@class='fa fa-fw ml-arrow-right']";
	public static String CONT_PEOPLE_LIST_TABLE = "//*[@id='all_persons_wrapper']/table/tbody/tr/td[2]";
	public static String CONT_ALL_LIST_TABLE = "//*[@id='all_contacts']/tbody/tr";
	public static String CONT_COMP_LIST_TABLE = "//*[@id='all_companies']/tbody/tr/td[2]";
	public static String CONT_COMP_EX_PER_CLICK = "s2id_autogen1";
	public static String CONT_PER_CLICK = "s2id_contact_company_id";
	public static String CONT_DEL = "//*[@class='btn-libra delete-btn']";
	public static String CONT_INNER_EDIT = "//a[@class='edit']";
	public static String CONT_TILE = "//*[@class='col-md-3']";
	public static String TILE_EMAIL = "/div/div[@class='card-body']/h6[1]";
	public static String TILE_MOB = "/div/div[@class='card-body']/h6[2]";
	public static String TILE_STREET_ADDRESS = "/div/div[@class='card-body']/h6[3]";
	public static String TILE_ADDRESS = "/div/div[@class='card-body']/h6[4]";
	public static String CONT_INNER_DET = "//*[@class='case_properties']/li";
	public static String CONT_INNER_ALL_DET = "/span[2]/h4";
	public static String CONT_TILE_OPT = "(//*[@class='col-md-3']/div/div[@class='card-body']/div)";
	public static String CONT_TILE_EDIT = "//div/ul/li/a[@class='fa fa-fw ml-edit']";
	public static String CONT_TILE_DEL = "//div/ul/li/a[@class='fa fa-fw ml-delete']";
	public static String PER_ADD_COMP = "add_users";
	
	

/*********************************************BILLING PAGE*********************************************************************************/
	
	public static String BILLING_INV = "/billing?term=invoices";
	public static String BILLING_PAYNT = "/billing?term=payments";
	public static String BILLING_TIME_ENT = "/billing?term=time_sheet";
	public static String BILLING_EXP = "/billing?term=expenses";
	public static String BTN_ADD_INV = "new_invoice";
	public static String BTN_ADD_PAYNT = "add_payment_for_invoice";
	public static String BTN_ADD_TIME_ENT = "add_time_sheet";
	public static String BTN_ADD_EXP = "add_expense_for_cases";
	public static String RADIO_BTN_TIME_ENT = "//*[@for='contact-cbox']";
	public static String INV_CONT = "s2id_applicant";
	public static String PAYNT_CONT = "s2id_applicant_id";	
	public static String INV_CONT_SEARCH_BOX = "s2id_autogen1_search";
	public static String PAYNT_CONT_SEARCH_BOX = "s2id_autogen2_search";	
	public static String INV_CONT_SEARCH_VAL = "//ul[@id='select2-results-1']//li//ul/li/div/span";
	public static String PAYNT_CONT_SEARCH_VAL = "//ul[@id='select2-results-2']//li//ul/li/div/span";	
	
/*********************************************ADD CASE PAGE*********************************************************************************/	
	
	public static String ADD_CASE = "/cases/new"; 	
	public static String CASE_TITLE = "court_case[title]";
	public static String CASE_NEXT = "step_1_validation";
	public static String LAWYER_NEXT = "step_2_validation";
	public static String ON_REC_CLICK = "s2id_court_case_firm_user_ids";
	public static String ON_REC_SEARCH = "s2id_autogen5";
	public static String ON_REC_SEARCH_LIST = "//ul[@class='select2-results']//li/div/span";	
	public static String CLIENT_CLICK = "s2id_autogen4";	
	public static String CLIENT_SEARCH_LIST = "//ul[@class='select2-results']//li//ul/li/div/span";
	
	
	
}
