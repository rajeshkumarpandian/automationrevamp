package selenium_module_Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ComFun extends ComVar{

	protected static WebDriver driver;
	protected static String baseUrl;
	public File parameters;	
	private static int	statusCode;
	
	public ComFun(WebDriver webPageDriver, String baseURL) {
		// TODO Auto-generated constructor stub
		driver = webPageDriver;
		baseUrl = baseURL;
	}

	
	public void reportlog(String testStatus, String Description) throws Exception {
		
		if (testStatus.toLowerCase().equals("fail")) {
			Reporter.log("\n" + Description.toUpperCase() + "<b> <font color='red' font size = 4>" + " ==> FAIL" + "</font></b>");
		}
		if (testStatus.toLowerCase().equals("pass")) {
			Reporter.log("\n" + Description.toUpperCase() + "<b> <font color='blue' font size = 4>" + " ==> PASS" + "</font></b>");
		}
		if (testStatus.toLowerCase().equals("warning")) {
			Reporter.log("\n" + Description.toUpperCase() + "<b> <font color='yellow' font size = 4>" + " ==> WARNING" + "</font></b>");
		}
	}
   /**
    * 
    * @param elementType
    * @param elementValue
    * @param expectedValue
    * @return
    */
	public boolean stringComparion(String elementType, String elementValue, String expectedValue) {
		boolean flag = false;
		String getValue = "";
		if (elementType.equals("XPATH")) {
			getValue = driver.findElement(By.xpath(elementValue)).getText().trim();
		} else if (elementType.equals("ID")) {
			getValue = driver.findElement(By.id(elementValue)).getText().trim();
		} else if (elementType.equals("NAME")) {
			getValue = driver.findElement(By.name(elementValue)).getText().trim();
		} else if (elementType.equals("CLASSNAME")) {
			getValue = driver.findElement(By.className(elementValue)).getText().trim();
		}
		if(getValue.equals(expectedValue)) {
			flag = true;
		}
		//org.testng.Assert.assertEquals(getValue, expectedValue);
		return flag;
	}
	/**
	 * 
	 * @param XPath
	 */
	public void clickByXpath(String XPath) {		
		if (iselementPresent(By.xpath(XPath))) {
			driver.findElement(By.xpath(XPath)).click();
		}
	}
    /**
     * 
     * @param Id
     */
	public void clickById(String Id) {
		if (iselementPresent(By.id(Id))) {
			driver.findElement(By.id(Id)).click();
		}
	}
    /**
     * 
     * @param Name
     */
	public void clickByName(String Name) {
		if (iselementPresent(By.name(Name))) {
			driver.findElement(By.name(Name)).click();
		}
	}
    /**
     * 
     * @param ClassName
     */
	public void clickByClassName(String ClassName) {
		if (iselementPresent(By.className(ClassName))) {
			driver.findElement(By.className(ClassName)).click();
		}
	}
	public void clickByxpath(String tag,String attribute, String attributeValue) {
		if (iselementPresent(By.xpath("//"+tag+"[@"+attribute+"='"+attributeValue+"']"))) {
			driver.findElement(By.xpath("//"+tag+"[@"+attribute+"='"+attributeValue+"']")).click();
		}
	}
    /**
     * 
     * @param by
     * @return
     */
	public static boolean iselementPresent(By by) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
    /**
     * 
     * @param xpath
     * @param passData
     */
	public void findAndPassbyxpath(String xpath, String passData) {
		if (iselementPresent(By.xpath(xpath))) {
			driver.findElement(By.xpath(xpath)).clear();
			driver.findElement(By.xpath(xpath)).sendKeys(passData);
		}
	}
    /**
     * 
     * @param id
     * @param passData
     */
	public void findAndPassbyid(String id, String passData) {
		if (iselementPresent(By.id(id))) {
			driver.findElement(By.id(id)).clear();
			driver.findElement(By.id(id)).sendKeys(passData);
		}
	}
    /**
     * 
     * @param name
     * @param passData
     */
	public void findAndPassbyname(String name, String passData) {
		if (iselementPresent(By.name(name))) {
			driver.findElement(By.name(name)).clear();
			driver.findElement(By.name(name)).sendKeys(passData);
		}
	}
    /**
     * 
     * @param Classname
     * @param passData
     */
	public void findAndPassbyClassname(String Classname, String passData) {
		if (iselementPresent(By.className(Classname))) {
			driver.findElement(By.className(Classname)).clear();
			driver.findElement(By.className(Classname)).sendKeys(passData);
		}
	}
    /**
     * 
     * @param driver
     * @param by
     */
	public static void waitForElementPresent(final By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_SECONDS));
		try {
			ExpectedCondition<Boolean> elementIsDisplayed = new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver arg0) {
					try {
						WebElement webElement = driver.findElement(by);
						if (webElement.isDisplayed()) {
							return true;
						} else {
							return false;
						}
					} catch (NoSuchElementException e) {
						return false;
					} catch (StaleElementReferenceException f) {
						return false;
					}
				}
			};
			wait.until(elementIsDisplayed);
		} catch (Exception e) {
			// Ignore the timeout exception
		} finally {
			// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	}
	/**
	 * 
	 * @param xpath
	 * @param text
	 */
	public void forloopClick(String xpath) {
		int noOfData = 0;
		List<WebElement> dataCount = driver.findElements(By.xpath(xpath));
		noOfData = dataCount.size();
		for (int i = 1; i <= noOfData; i++) {			
			clickByXpath(" " + xpath + "[" + i + "]");			
		}
	}
	
	public void forloopClickWithWait(String xpath,String waitpath) {
		int noOfData = 0;
		List<WebElement> dataCount = driver.findElements(By.xpath(xpath));
		noOfData = dataCount.size();
		for (int i = 1; i <= noOfData; i++) {				
			if(!waitpath.isEmpty()) {
				waitForElementPresent(By.xpath(waitpath));				
			}
			clickByXpath(" " + xpath + "[" + i + "]");					
		}
	}
	
	/**
	 * 
	 * @param by
	 * @return
	 */
	protected static boolean isElementPresent(By by) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			driver.findElement(by);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
    /**
     * 
     * @param driver
     * @param by
     */
	public static void waitForElementToDisappear(final By by){
		WebDriverWait wait = new WebDriverWait(driver, ComVar.SERVER_TIMEOUT);
		try {
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					return (!isElementPresent(by));
				}
			});

		}
		catch (Exception e) {
			// Ignore the timeout exception
		}
	}
	
	protected static boolean isElementPresentWaitForDisappear(By by) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		try {
			driver.findElement(by);
			waitForElementToDisappear(by);
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	
	public static int getResponseCode(String urlString) throws MalformedURLException, IOException {
		URL url = new URL(urlString);
		//System.out.println(url);
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		huc.setRequestMethod("GET");
		huc.connect();
		return huc.getResponseCode();
	}
	
	public void HTTPErrorCheck() throws Exception {		
		try{
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for (int i = 0; i < links.size(); i++) {
				if (!(links.get(i).getAttribute("href") == null) && !(links.get(i).getAttribute("href").equals(""))) {
					if (links.get(i).getAttribute("href").contains("http")) {
						statusCode = getResponseCode(links.get(i).getAttribute("href").trim());
						if (statusCode == 403) {
							reportlog("fail","HTTP 403 Forbidden @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 500) {
							reportlog("fail","HTTP 500 Internal Server Error @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 301) {
							reportlog("fail","HTTP 301 Moved Permanently @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 502) {
							reportlog("fail","HTTP 502 Bad Gateway @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 404) {
							reportlog("fail","HTTP 404 Not Found @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 503) {
							reportlog("fail","HTTP 503 Service Unavailable @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 302) {
							reportlog("fail","HTTP 302 Moved temporarily @ " + links.get(i).getAttribute("href") + "\n");
						}
					}
				}
			}			
		} catch (Exception e){
			//System.out.println(e);
		}	
	}
	

	
	

}
