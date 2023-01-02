package selenium_module_Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class ComFun extends ComVar {

	protected static WebDriver driver;
	protected static String baseUrl;
	public File parameters;
	private static int statusCode;
	public static StringBuffer verificationErrors = new StringBuffer();

	public ComFun(WebDriver webPageDriver, String baseURL) {
		// TODO Auto-generated constructor stub
		driver = webPageDriver;
		baseUrl = baseURL;
	}

	public void reportlog(String testStatus, String Description) throws Exception {

		if (testStatus.toLowerCase().equals("fail")) {
			Reporter.log("" + Description + "<b> <font color='red' font size = 4>" + " ==> FAIL"+ "</font></b> \n");
		}
		if (testStatus.toLowerCase().equals("pass")) {
			Reporter.log("" + Description + "<b> <font color='#40E314' font size = 4>" + " ==> PASS"+ "</font></b> \n");
		}
		if (testStatus.toLowerCase().equals("warning")) {
			Reporter.log("" + Description + "<b> <font color='#8B008B' font size = 4>" + " ==> WARNING"+ "</font></b> \n");
		}
	}

	/**
	 * 
	 * @param elementType
	 * @param elementValue
	 * @param expectedValue
	 * @return
	 */
	public String stringComparion(String elementType, String elementValue, String expectedValue) {
		String getValue = "";	
		String errLog = "";
		if (elementType.equals("XPATH")) {
			getValue = driver.findElement(By.xpath(elementValue)).getText().trim();
		} else if (elementType.equals("ID")) {
			getValue = driver.findElement(By.id(elementValue)).getText().trim();
		} else if (elementType.equals("NAME")) {
			getValue = driver.findElement(By.name(elementValue)).getText().trim();
		} else if (elementType.equals("CLASSNAME")) {
			getValue = driver.findElement(By.className(elementValue)).getText().trim();
		}
		if ((getValue.equals(expectedValue))==false) {
			errLog += ("There is an error while comparing the string. Expected value is '"+expectedValue+"' but got value is '"+getValue+"'");
		}	
		// org.testng.Assert.assertEquals(getValue, expectedValue);
		return errLog;
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

	/**
	 * 
	 * @param tag
	 * @param attribute
	 * @param attributeValue
	 */
	public void clickByxpath(String tag, String attribute, String attributeValue) {
		if (iselementPresent(By.xpath("//" + tag + "[@" + attribute + "='" + attributeValue + "']"))) {
			driver.findElement(By.xpath("//" + tag + "[@" + attribute + "='" + attributeValue + "']")).click();
		}
	}

	/**
	 * 
	 * @param by
	 * @return
	 */
	protected static boolean iselementPresent(By by) {
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
	public void forloopClick(String xpath, String text) {
		int noOfData = 0;
		List<WebElement> dataCount = driver.findElements(By.xpath(xpath));
		noOfData = dataCount.size();
		for (int i = 1; i <= noOfData; i++) {
			String Datas = driver.findElement(By.xpath(" " + xpath + "[" + i + "]")).getText();
			if (Datas.contains(text)) {
				clickByXpath(" " + xpath + "[" + i + "]");
				break;
			}
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
	public static void waitForElementToDisappear(final By by) {
		WebDriverWait wait = new WebDriverWait(driver, ComVar.SERVER_TIMEOUT);
		try {
			wait.until(new ExpectedCondition<Boolean>() {
				public Boolean apply(WebDriver webDriver) {
					return (!isElementPresent(by));
				}
			});

		} catch (Exception e) {
			// Ignore the timeout exception
		}
	}

	/**
	 * 
	 * @param by
	 * @return
	 */
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

	/**
	 * 
	 * @param urlString
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	public static int getResponseCode(String urlString) throws MalformedURLException, IOException {
		URL url = new URL(urlString);
		// System.out.println(url);
		HttpURLConnection huc = (HttpURLConnection) url.openConnection();
		huc.setRequestMethod("GET");
		huc.connect();
		return huc.getResponseCode();
	}

	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	public String HTTPErrorCheck() throws Exception {
		String errLog = "";
		try {
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for (int i = 0; i < links.size(); i++) {
				if (!(links.get(i).getAttribute("href") == null) && !(links.get(i).getAttribute("href").equals(""))) {
					if (links.get(i).getAttribute("href").contains("http")) {
						statusCode = getResponseCode(links.get(i).getAttribute("href").trim());
						if (statusCode == 403) {
							errLog += ("HTTP 403 Forbidden @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 500) {
							errLog += ("HTTP 500 Internal Server Error @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 301) {
							errLog += ("HTTP 301 Moved Permanently @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 502) {
							errLog += ("HTTP 502 Bad Gateway @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 404) {
							errLog += ("HTTP 404 Not Found @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 503) {
							errLog += ("HTTP 503 Service Unavailable @ " + links.get(i).getAttribute("href") + "\n");
						} else if (statusCode == 302) {
							errLog += ("HTTP 302 Moved temporarily @ " + links.get(i).getAttribute("href") + "\n");
						}
					}
				}
			}
			verificationErrors.append(errLog);
		} catch (Exception e) {
		}
		return (errLog);
	}
	
	/**
	 * 
	 * @param xpath
	 * @param text
	 */
	public String MenusclickLinkCheck(String xpath) {
		String errLog = "";
		int noOfData = 0;
		List<WebElement> dataCount = driver.findElements(By.xpath(xpath));
		noOfData = dataCount.size();
		for (int i = 1; i <= noOfData; i++) {
			clickByXpath("" + xpath + "[" + i + "]");
			String PageName = driver.findElement(By.xpath("" + xpath + "[" + i + "]")).getText();		
			if (iselementPresent(By.xpath(ERROR_404_502)) == true) {
				String Errordata = driver.findElement(By.xpath(ERROR_404_502)).getText();
				errLog += ("In Page " + PageName + " name it throws " + Errordata + "");
			}
			if (iselementPresent(By.xpath(SERVER_ERROR)) == true) {
				errLog += ("In page " + PageName + " name it throws server error problem");
			}
		}
		return errLog;
	}
	
	public boolean MailtrapUserloginPassword(String Email) throws Exception {
		boolean flag = false;	
		driver.get(ComVar.MAIL_TRAP_URL);			
		clickByXpath(ComVar.MAIL_TRAP_LOGIN_BTN);
        WebElement element = driver.findElement(By.xpath(ComVar.MAIL_TRAP_NEXT_BTN));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);		
		findAndPassbyid(ComVar.MAIL_TRAP_USER_NAME, ComVar.MAIL_TRAP_USR_NAME);
		clickByXpath(ComVar.MAIL_TRAP_NEXT_BTN);
		waitForElementPresent(By.id(ComVar.MAIL_TRAP_PASSWORD));
		findAndPassbyid(ComVar.MAIL_TRAP_PASSWORD, ComVar.MAIL_TRAP_PWD);
		clickByXpath(ComVar.MAIL_TRAP_LOGIN);
		waitForElementPresent(By.xpath(ComVar.QE_VAKILSEARCH));
		clickByXpath(ComVar.QE_VAKILSEARCH);
		
		
		if(getMailList(Email)==true){
			driver.switchTo().frame(driver.findElement(By.tagName("iframe")));	
		}
		
		return flag;
	}
	
	public boolean getMailList(String receiver) throws Exception{
		boolean flag=true;
		driver.navigate().refresh();
		List<WebElement> actsList = driver.findElements(By.xpath("//*[@role='main']/div/div[1]/div[2]/ul/li/a[@class='i18m0o91 i18m0o91--unread i16w2k3p']"));
		int noOfActs = actsList.size();
		for(int i=1;i < noOfActs;i++){
			String acts =  driver.findElement(By.xpath("//*[@role='main']/div/div[1]/div[2]/ul/li["+i+"]/a[@class='i18m0o91 i18m0o91--unread i16w2k3p']")).getText();					
			if(acts.contains(receiver)){
				flag=true;
				clickByXpath("//*[@role='main']/div/div[1]/div[2]/ul/li["+i+"]/a");
				driver.switchTo().frame(driver.findElement(By.tagName("iframe")));	
				clickByXpath("/html/body/table/tbody/tr/td[2]/div/table/tbody/tr/td/table/tbody/tr/td/p/a");
				
				break;
			} else {
				flag=false;
			}
		}
		return flag;
	}
	
	public void mailtraplogut(String testName) throws Exception{
		clickByXpath("//*[@class='show_hide_menu_link account-name']");
		clickByXpath("");	
	}
	
	public void waitUntilManualActions(final WebDriver driver, String message, Map<String, String> dataMap) {
        int tabSize;
        String ticketId = dataMap.get("ticketId");
        try {
            String Msg = ("For ticket #  " + ticketId + " - MANUAL_ACTIONS - " + message);
            ((JavascriptExecutor) driver).executeScript("window.open('about:blank','_blank');");
            driver.switchTo().defaultContent();
            JavascriptExecutor javascript = (JavascriptExecutor) driver;
            javascript.executeScript("alert('" + message + "');");

            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));
            tabSize = tabs.size();
            // System.out.println(tabs.size());
            while (tabSize >= 2) {
                Thread.sleep(1000);
                tabs = new ArrayList<String>(driver.getWindowHandles());
                tabSize = tabs.size();
                // System.out.println(tabs.size());
            }
            ;
        } catch (Exception e) {
            // logger.error(e);
        }
    }
	
	protected String randomTextGenerator() {
        String SALTCHARS = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 15) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    } 
}
