package selenium_module_Test;

import java.time.Duration;

public class ComVar{
	
/*********************************************ELEMENTS TYPE*****************************************************************************/	
	
	public static String XPATH = "XPATH";
	public static String ID = "ID";
	public static String NAME = "NAME";
	public static String CLASSNAME = "CLASSNAME";
	
	public static final int WAIT_SECONDS = 2;
	public static final Duration SERVER_TIMEOUT = Duration.ofSeconds(100);
	
	
	public static final String CALENDAR_TEXT_FORMAT = "dd-MMM-yyyy HH-mm-ss"; 
	public static final String VIDEO_LOCATION = "./src/test/resources/videos";
	
	public static final String FOR = "for";
	public static final String INPUT= "input";
	public static final String LABEL = "label";
	public static final String DIV = "div";
	public static final String VALUE = "value";
	
	public static final String ERROR_404_502 = "/html/body/center[1]/h1";
	public static final String SERVER_ERROR = "(/html/body/div[@class='error_container']/div/div[1]/text())[2]";
	public static final String INTERNAL_404 = "/html/body/div/section[1]/div/h1";
	
	public static final String MAIL_TRAP_URL = "https://mailtrap.io/";
	public static final String MAIL_TRAP_USR_NAME = "tools.libra@vakilsearch.com";
	public static final String MAIL_TRAP_PWD = "JD5e2N#kuck!L3U";	
	public static final String MAIL_TRAP_LOGIN_BTN = "//*[@id=\"screen-reader-shortcut-header\"]/nav/div/div/div[2]/div[3]/a[1]";		
	public static final String MAIL_TRAP_USER_NAME = "user_email";
	public static final String MAIL_TRAP_NEXT_BTN =  "//*[@id='new_user']/div[3]/a";
	public static final String MAIL_TRAP_PASSWORD="user_password";
	public static final String MAIL_TRAP_LOGIN = "//*[@id='new_user']/div[2]/div[3]/input";	
	public static final String QE_VAKILSEARCH = "(//*[@class='inbox_name'])[1]";
	
	
}
