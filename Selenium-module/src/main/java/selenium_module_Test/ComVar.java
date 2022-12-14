package selenium_module_Test;

import java.time.Duration;

public class ComVar{
	
	public static final int WAIT_SECONDS = 2;
	public static final Duration SERVER_TIMEOUT = Duration.ofSeconds(100);
	
	
	public static final String FOR = "for";
	public static final String INPUT= "input";
	public static final String LABEL = "label";
	public static final String DIV = "div";
	public static final String VALUE = "value";
	
	public static final String ERROR_404_502 = "/html/body/center[1]/h1";
	public static final String SERVER_ERROR = "/html/body/div[@class='error_container']/div/div[1]/text()";
	public static final String INTERNAL_404 = "/html/body/div/section[1]/div/h1";
	
	
}
