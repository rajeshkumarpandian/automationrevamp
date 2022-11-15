package Libra.libra_Main_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Libra.Libra_Common_Module.LComVar;

public class vakilsearchhomepage {

	static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty(LComVar.CHROME_DRIVER, LComVar.PATH_CHROME_DRIVER);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://qe2.vakilsearch.com/");
		int url = 200;
		for(int i=1;i<=url;i++){
			String urlList = driver.findElement(By.xpath("(//a[@href])["+i+"]")).getAttribute("href");
			
			
			
			System.out.println(urlList);
			
		}
		
		
		

	}

}
