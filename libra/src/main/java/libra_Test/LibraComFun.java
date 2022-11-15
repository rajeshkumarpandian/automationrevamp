package libra_Test;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import org.testng.*;
import jxl.common.Assert;

public class LibraComFun extends selenium_module_Test.CommonFunctions {

	public LibraComFun(WebDriver webPageDriver, String baseURL) {
		super(webPageDriver, baseURL);
		// TODO Auto-generated constructor stub
	}

	public void addCompanyCardView(String COMPName, String Email, String Website, String Mobile, String Phone,String StreetAddress, String Locality, String City, String State, String PinCode, String ExistingPerson,String NewPerson,String NewPersonLN, String NewPerEmail, String NewPerMobile) {		
		waitForElementPresent(driver,By.name(LibraComVar.COMP_NAME));
		findAndPassbyname(LibraComVar.COMP_NAME, COMPName);
		if (!ExistingPerson.isEmpty()) {
			if (ExistingPerson.contains("&")) {
				SingleSearchdropdownSelection(LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST, ExistingPerson);	
			}else {
			SingleSearchdropdownSelection(LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.CONT_COMP_EX_PER_CLICK,LibraComVar.ON_REC_SEARCH_LIST, ExistingPerson);	
			}
		}
		if (!NewPerson.isEmpty()) {
			clickByXpath(LibraComVar.COMP_NEW_PER);
			waitForElementPresent(driver, By.xpath(LibraComVar.COMP_NEW_PER_FORM));			
				findAndPassbyname(LibraComVar.COMP_NEW_PER_FN, NewPerson);
				findAndPassbyname(LibraComVar.COMP_NEW_PER_LN, NewPersonLN);
			findAndPassbyname(LibraComVar.COMP_NEW_PER_EMAIL, NewPerEmail);
			findAndPassbyname(LibraComVar.COMP_NEW_PER_MOB, NewPerMobile); 
		}
		findAndPassbyname(LibraComVar.COMP_EMAIL, Email);
		findAndPassbyname(LibraComVar.COMP_MOB, Mobile);
		findAndPassbyname(LibraComVar.COMP_WEBSITE, Website);
		findAndPassbyname(LibraComVar.COMP_PHONE, Phone);
		findAndPassbyname(LibraComVar.COMP_CITY, City);
		findAndPassbyname(LibraComVar.COMP_STREET_ADD, StreetAddress);
		findAndPassbyname(LibraComVar.COMP_LOCALITY, Locality);
		findAndPassbyname(LibraComVar.COMP_STATE, State);
		findAndPassbyname(LibraComVar.COMP_PIN, PinCode);
		clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
	}
	
	public boolean ContactCardDetails(String url, String COMPName, String Email, String Mobile,String StreetAddress, String Locality, String City, String PinCode) {
		
		String address = Locality + "," + " " + City + " - " + PinCode;
		boolean flag = false;
		int noOfContact = 0;		
		int noOfPagination = 0;
		driver.get(baseUrl + url);			
			List<WebElement> CardPagination = driver.findElements(By.xpath(LibraComVar.CONT_CARD_PAGI_CNT));
			noOfPagination = CardPagination.size();
			for (int i = 1; i <= noOfPagination; i++) {
				if(i==1) {
					List<WebElement> ContactList = driver.findElements(By.xpath(LibraComVar.ALL_PAGE_CARD_LIST));
					noOfContact = ContactList.size();
					for (int j = 1; j <= noOfContact; j++) {
						String Contact = driver.findElement(By.xpath("(" + LibraComVar.ALL_PAGE_CARD_LIST + ")[" + j + "]")).getText();
						if (COMPName.contains(Contact)) {
							String EmailID = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_EMAIL+"")).getText();
							String mobileNo = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_MOB+"")).getText();
							String streetaddress = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_STREET_ADDRESS+"")).getText();
							String Address = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_ADDRESS+"")).getText();
							org.testng.Assert.assertEquals(EmailID, Email);
							org.testng.Assert.assertEquals(mobileNo, Mobile);
							org.testng.Assert.assertEquals(streetaddress, StreetAddress);
							org.testng.Assert.assertEquals(Address, address);
							flag = true;
							break;
						}					
					}
				} else {
					clickByXpath(LibraComVar.CONT_LIST_NEXT_BTN);
					List<WebElement> ContactList = driver.findElements(By.xpath(LibraComVar.ALL_PAGE_CARD_LIST));
					noOfContact = ContactList.size();
					for (int j = 1; j <= noOfContact; j++) {
						String Contact = driver.findElement(By.xpath("(" + LibraComVar.ALL_PAGE_CARD_LIST + ")[" + j + "]")).getText();
						if (COMPName.contains(Contact)) {
							String EmailID = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_EMAIL+"")).getText();
							String mobileNo = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_MOB+"")).getText();
							String streetaddress = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]")).getText();
							String Address = driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + j + "]"+LibraComVar.TILE_STREET_ADDRESS+"")).getText();
							org.testng.Assert.assertEquals(EmailID, Email);
							org.testng.Assert.assertEquals(mobileNo, Mobile);
							org.testng.Assert.assertEquals(streetaddress, StreetAddress);
							org.testng.Assert.assertEquals(Address, address);
							flag = true;
							break;
						}					
					}
				}
				if(flag == true) {
					break;
				}
			}											
		return flag;
	}

	public boolean ContactInnerDetails(String Cardxpath, String COMPName, String Email, String Mobile,String StreetAddress, String Locality, String City, String PinCode, String State,String ExPer, String NewPerFN,String NewPerLN ) {
		
		boolean flag = false;
		int noOfCompanies = 0;
		int noOfdata = 0;
		List<WebElement> CompaniesList = driver.findElements(By.xpath(Cardxpath));
		noOfCompanies = CompaniesList.size();
		for (int i = 1; i <= noOfCompanies; i++) {
			String COMP = driver.findElement(By.xpath(" " + Cardxpath + " [" + i + "]")).getText();
			if (COMP.contains(COMPName)) {
				driver.findElement(By.xpath(""+LibraComVar.CONT_TILE+"[" + i + "]")).click();
				List<WebElement> DataList = driver.findElements(By.xpath(""+LibraComVar.CONT_INNER_DET+""));
				noOfdata = DataList.size();
				for (int j = 1; j <= noOfdata; j++) {
					String DataType = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]")).getText();
					if (DataType.contains("Email")) {
						String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
						org.testng.Assert.assertEquals(Data, Email);
					}
					if (DataType.contains("Mobile")) {
						String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
						org.testng.Assert.assertEquals(Data, Mobile);
					}
					if (DataType.contains("Address")) {
						String fullAddress = StreetAddress + ", " + Locality + ", " + City + ", " + State + " - "+ PinCode;
						String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
						org.testng.Assert.assertEquals(Data, fullAddress);	
						flag =true;
					}
					if(!ExPer.isEmpty()) {
						if (DataType.contains("Linked persons")) {
							if(ExPer.contains("&")) {
                               String[] Expp = ExPer.split("&");
                                   String exper = Expp[0] + " and " +Expp[1]; 
                                   String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
   								org.testng.Assert.assertEquals(Data, exper);
   								flag =true;
   								
							}else {
								String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
								org.testng.Assert.assertEquals(Data, ExPer);						
								flag =true;
							}
						}	
					}
					if((!NewPerFN.isEmpty()) && (!NewPerLN.isEmpty())) {
						if (DataType.contains("Linked persons")) {
							String FullName = NewPerFN + " " + NewPerLN ;
							String Data = driver.findElement(By.xpath(""+LibraComVar.CONT_INNER_DET+"[" + j + "]"+LibraComVar.CONT_INNER_ALL_DET+"")).getText();
							org.testng.Assert.assertEquals(Data, FullName);
							flag =true;
						}						
					}
				}
			}
			if(flag == true) {
				break;
			}
		}
		return flag;
	}

	public boolean ContactListDetails(String link, String Listxpath, String COMPName, String Email, String Mobile,String ContactType) {
		boolean flag = false;
		int noOfContact = 0;
		int noOfPagination = 0;
		driver.get(baseUrl + link);
		List<WebElement> PaginationList = driver.findElements(By.xpath(LibraComVar.CONT_LIST_PAGI_CNT));
		noOfPagination = PaginationList.size();
		for (int i = 1; i <= noOfPagination; i++) {
			if (i == 1) {
				List<WebElement> ContactList = driver.findElements(By.xpath(Listxpath));
				noOfContact = ContactList.size();
				for (int j = 1; j <= noOfContact; j++) {
					String contact = driver.findElement(By.xpath("" + Listxpath + "[" + j + "]")).getText();
					if (contact.contains(COMPName)) {
						String EmailID = driver.findElement(By.xpath("" + Listxpath + "[" + j + "]/td[4]")).getText();
						String MobileNo = driver.findElement(By.xpath("" + Listxpath + "[" + j + "]/td[5]")).getText();
						String Contact = driver.findElement(By.xpath("" + Listxpath + "[" + j + "]/td[3]")).getText();
						org.testng.Assert.assertEquals(EmailID, Email);
						org.testng.Assert.assertEquals(MobileNo, Mobile);
						org.testng.Assert.assertEquals(Contact, ContactType);
						flag = true;
						break;
					}
				}
			}else{
				clickByXpath(LibraComVar.CONT_LIST_NEXT_BTN);				
				List<WebElement> ContactList = driver.findElements(By.xpath(Listxpath));				
				noOfContact = ContactList.size();
				for (int k = 1; k <= noOfContact; k++) {
					String contact = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]")).getText();
					if (contact.contains(COMPName)) {
						String EmailID = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]/td[4]")).getText();
						String MobileNo = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]/td[5]")).getText();
						String Contact = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]/td[3]")).getText();
						org.testng.Assert.assertEquals(EmailID, Email);
						org.testng.Assert.assertEquals(MobileNo, Mobile);
						org.testng.Assert.assertEquals(Contact, ContactType);
						flag = true;
						break;
					}
				}
			}
			if(flag == true) {
			break;	
			}
		}
		return flag;
	}
	
	
	public void ContactDepBilInvAndPaymentPage(String link,String invrpaybtn,String dropclick,String Searchbox,String SearchValue,String Contact) {		
		driver.get(baseUrl + link);
		clickById(invrpaybtn);
		SingleSearchdropdownSelection(dropclick,Searchbox, SearchValue, Contact);					
	}
		
	public void ContactDepBilTimeEntAndExpPage(String link,String TimerExpbtn,String dropclick,String Searchbox,String SearchValue,String Contact,String ContactType) {		
		driver.get(baseUrl + link);
		clickById(TimerExpbtn);	
		if(ContactType.contains("Contact")) {
			clickByXpath(LibraComVar.RADIO_BTN_TIME_ENT);
			SingleSearchdropdownSelection(dropclick,Searchbox,SearchValue, Contact);	
		}						
	}
	
	public void ContactDepAddCasePage(String link, String CaseTitle, String AccountName, String Company) {
		driver.get(baseUrl + link);
		findAndPassbyname(LibraComVar.CASE_TITLE, CaseTitle);
		clickById(LibraComVar.CASE_NEXT);
		SingleSearchdropdownSelection(LibraComVar.ON_REC_CLICK, LibraComVar.ON_REC_SEARCH, LibraComVar.ON_REC_SEARCH_LIST,AccountName);
		clickById(LibraComVar.LAWYER_NEXT);
		SingleSearchdropdownSelection(LibraComVar.CLIENT_CLICK, LibraComVar.CLIENT_CLICK, LibraComVar.CLIENT_SEARCH_LIST, Company);
	}
		
	public void SingleSearchdropdownSelection(String ID,String Searchbox, String Listxpath, String Contact) {
		int noOfContact = 0;
		waitForElementPresent(driver,By.id(ID));
		clickById(ID);						
		if (Contact.contains("&")) {
			String[] contact = Contact.split("&");
			int noOfContacts = contact.length;
			for (int i = 0; i <= noOfContacts; i++) {
				driver.findElement(By.id(Searchbox)).sendKeys(contact[i]);
				waitForElementPresent(driver, By.xpath(Listxpath));
				List<WebElement> ContactList = driver.findElements(By.xpath(Listxpath));
				noOfContact = ContactList.size();
				for (int k = 1; k <= noOfContact; k++) {
					String SelectContact = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]")).getAttribute("innerHTML");
					if (SelectContact.contains(contact[i])) {
						driver.findElement(By.xpath("" + Listxpath + "[" + k + "]")).click();						
					}
				}
				if(i==1) {
				break;	
				}
			}
		}else {
			driver.findElement(By.id(Searchbox)).sendKeys(Contact);
			waitForElementPresent(driver,By.xpath(Listxpath));
			List<WebElement> ContactList = driver.findElements(By.xpath(Listxpath));
			noOfContact = ContactList.size();
			for (int k = 1; k <= noOfContact; k++) {
				String SelectContact = driver.findElement(By.xpath("" + Listxpath + "[" + k + "]")).getAttribute("innerHTML");		
				if (SelectContact.contains(Contact)) {					
					driver.findElement(By.xpath("" + Listxpath + "[" + k + "]")).click();
					break;
				}
			}
		}				 
	}
	
	
	public void ContactDropdownCheck (String link,String addbtn,String ID,String Searchbox, String Listxpath, String Contact) {
		driver.get(baseUrl + link);
		clickByXpath(addbtn);
		SingleSearchdropdownSelection(ID,Searchbox,Listxpath,Contact);		
	}
	
	public boolean ContactCardEditDelete(String cardpath, String Contact, String action) {
		boolean flag = false;
		int noOfPagination = 0;
		int tilecount = 0;		
		List<WebElement> CardPagination = driver.findElements(By.xpath(LibraComVar.CONT_CARD_PAGI_CNT));
		noOfPagination = CardPagination.size();
		for (int i = 1; i <= noOfPagination; i++) {
			if(i==1) {
				List<WebElement> TileCount = driver.findElements(By.xpath(cardpath));
				tilecount = TileCount.size();
				for (int k = 1; k <= tilecount; k++) {
					String SelectContact = driver.findElement(By.xpath(""+cardpath+"[" + k + "]")).getText();
					if(SelectContact.contains(Contact)) {
						clickByXpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]");				
						if(action.contains("edit")) {
							driver.findElement(By.xpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]"+LibraComVar.CONT_TILE_EDIT+"")).click();
							flag = true;
							break;
						}else if(action.contains("delete")) {
							driver.findElement(By.xpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]"+LibraComVar.CONT_TILE_DEL+"")).click();
							flag = true;
							break;
						}								
					}
					if(flag == true) {
						break;
					}
				}
			}else {
				clickByXpath(LibraComVar.CONT_LIST_NEXT_BTN);
				List<WebElement> TileCount = driver.findElements(By.xpath(cardpath));
				tilecount = TileCount.size();
				for (int k = 1; k <= tilecount; k++) {
					String SelectContact = driver.findElement(By.xpath(""+cardpath+"[" + k + "]")).getText();
					if(SelectContact.contains(Contact)) {
						clickByXpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]");				
						if(action.contains("edit")) {
							driver.findElement(By.xpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]"+LibraComVar.CONT_TILE_EDIT+"")).click();
							flag = true;
							break;
						}else if(action.contains("delete")) {
							driver.findElement(By.xpath(""+LibraComVar.CONT_TILE_OPT+"[" + k + "]"+LibraComVar.CONT_TILE_DEL+"")).click();
							flag = true;
							break;
						}								
					}					
				}
			}
			if(flag == true) {
				break;
			}
		}												
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean MulDataClick (String xpath, String Data) {
		boolean flag = false;
		int Count = 0;
		List<WebElement> count = driver.findElements(By.xpath(xpath));
		Count = count.size();
		for (int k = 1; k <= Count; k++) {
			String SelectContact = driver.findElement(By.xpath("" + xpath + "[" + k + "]")).getText();		
			if (SelectContact.contains(Data)) {					
				clickByXpath("" + xpath + "[" + k + "]");
				flag = true;
				break;
			}
		}				
		return flag;
	}
	
	
	public void addPersonCardView(String FirstName, String LastName, String CompName, String NewCompName,String NewCompEmail,
			String NewCompMob,String Mob,String mail, String Address,String locality,String City,String State,String pin) {
		
		waitForElementPresent(driver,By.name( LibraComVar.COMP_NEW_PER_FN));
		findAndPassbyname(LibraComVar.COMP_NEW_PER_FN, FirstName);  
		findAndPassbyname(LibraComVar.COMP_NEW_PER_LN, LastName);	
		if(!CompName.isEmpty()) {
			SingleSearchdropdownSelection("s2id_contact_company_id","s2id_autogen2_search","//ul[@class='select2-results']//li/div/span",CompName);	
		}
		if(!NewCompName.isEmpty()) {
			clickById(LibraComVar.PER_ADD_COMP);
			waitForElementPresent(driver,By.name(LibraComVar.COMP_NAME));
			findAndPassbyname(LibraComVar.COMP_NAME, NewCompName);
			findAndPassbyname(LibraComVar.COMP_EMAIL, NewCompEmail);
			findAndPassbyname(LibraComVar.COMP_MOB, NewCompMob);				
		}
		findAndPassbyname(LibraComVar.COMP_NEW_PER_MOB, Mob);  
		findAndPassbyname(LibraComVar.COMP_NEW_PER_EMAIL, mail);
		findAndPassbyname(LibraComVar.PER_CITY, City);		
		findAndPassbyname(LibraComVar.PER_ADDRESS, Address);
		findAndPassbyname(LibraComVar.PER_LOCALITY, locality);
		findAndPassbyname(LibraComVar.PER_STATE, State);
		findAndPassbyname(LibraComVar.PER_PIN, pin);
		clickByXpath(LibraComVar.BTN_CREATE_COMP_CARD_VIEW);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}