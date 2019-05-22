package Step_Defination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Add_Count_Object;
import Page_Object.Add_Point_Customer_Object;
import Page_Object.Centers_object;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Point_Customer_Step {
	Logger logger=Logger.getLogger("Add_Point_Customer_Step");
	public WebDriver driver;
	
	@Given("^Open browser for Add Customer in Points application$")
	public void open_browser_for_Add_Customer_in_Points_application() throws Throwable {
		driver = Hooks.driver;
		
		logger.info("Fetching URL and Opening the Url");
		
	}

	@When("^NewUser select \"([^\"]*)\" for Add Customer in Points application$")
	public void newuser_select_for_Add_Customer_in_Points_application(String center) throws Throwable {
		//BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Add_Point_Customer_Object.class);
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element1 = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel-tab flex column center-both']")));
		Thread.sleep(2000);
		element1.click();
		//Center Selection
		
		Select Centers = new Select(Add_Point_Customer_Object.Select_Center_List);
		
			
		List<WebElement> Centers_list = Centers.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Centers_list.size(); j++) {	        
	        if(Centers_list.get(j).getText().equals(center)) {
	        	Centers_list.get(j).click();
	            break;
	        }
	    }
	   
	    logger.info(center+" "+"is the Center Selected by the User");
	    
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		WebElement element2 = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='text flex center-both'][contains(text(),'Customers')]")));
		Thread.sleep(2000);
		element2.click();
		
		
		WebDriverWait wait3 = new WebDriverWait(driver, 50);
		WebElement element3 = wait3
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Customers')]")));
		Thread.sleep(2000);
		element3.click();
		Thread.sleep(2000);
		
		WebDriverWait wait4 = new WebDriverWait(driver, 50);
		WebElement element4 = wait4
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='ui primary button ng-isolate-scope']")));
		Thread.sleep(2000);
		element4.click();
		Thread.sleep(4000);
		}
		
	
	@When("^Customer click on Add Customer and Enter Customer with details \"(.*?)\" ,\"(.*?)\", \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" and \"(.*?)\"$")
	public void Add_Customer_and_Enter(String Customer_Name, String Customer_BPN, String Customer_Type,String Industry, String Acquisition_Method, String Payment_Terms, String Start_Date) throws Throwable {
	   		
		Add_Point_Customer_Object.Customer_Name.sendKeys(Customer_Name);
		
		Add_Point_Customer_Object.Customer_BPN.sendKeys(Customer_BPN);
	   
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Add_Point_Customer_Object.Customer_Type);
		
		Thread.sleep(2000);
		
		//Customer_Type
		
		Select Counttype = new Select(Add_Point_Customer_Object.Customer_Type);
		
		List<WebElement> Counttype_list = Counttype.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Counttype_list.size(); j++) {	        
	        if(Counttype_list.get(j).getText().equals(Customer_Type)) {
	        	Counttype_list.get(j).click();
	            break;
	        }
	    }
	    logger.info(Customer_Type+" "+"is the Customer Type selected by the User");
	    
	    //Industry type
		
		Select Industry_Type = new Select(Add_Point_Customer_Object.Customer_Industry);
		
		 
		
		List<WebElement> allOptions = Industry_Type.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < allOptions.size(); j++) {	        
	        if(allOptions.get(j).getText().equals(Industry)) {
	        	allOptions.get(j).click();
	            break;
	        }
	    }
		
	    logger.info(Industry+" "+"is the Industry Selected by the User");
	    
		//Acquisition Method
	    
	    Select Acquisition = new Select(Add_Point_Customer_Object.Acquisition_Method);
		
		List<WebElement> acquisition_list = Acquisition.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < acquisition_list.size(); j++) {	        
	        if(acquisition_list.get(j).getText().equals(Acquisition_Method)) {
	        	acquisition_list.get(j).click();
	            break;
	        }
	    }
	    
	    logger.info(Acquisition_Method+" "+"is the Acquisition Method Selected by the User");
	    
	    //Payment Terms
	    
	    Select Payment = new Select(Add_Point_Customer_Object.Payment_Terms);
		
		List<WebElement> Payment_list = Payment.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Payment_list.size(); j++) {	        
	        if(Payment_list.get(j).getText().equals(Payment_Terms)) {
	        	Payment_list.get(j).click();
	            break;
	        }
	    }
	    
	    logger.info(Payment_Terms+" "+"is the Payment Terms Selected by the User");
		
	}
	
	@When("^Customer enters PrimaryMailingAddress with details \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void customer_enters_PrimaryMailingAddress_with_details_and_and_and(String Address, String City, String State, String Zipcode) throws Throwable {
	    
		//Address
		Add_Point_Customer_Object.Mailing_Address.sendKeys(Address);
		
		logger.info(Address+" "+"is the Address provided by the User");
		
		//City
		Add_Point_Customer_Object.Mailing_City.sendKeys(City);
		
		logger.info(City+" "+"is the City provided by the User");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Add_Point_Customer_Object.Mailing_State);
	    //State
	   
		Add_Point_Customer_Object.Mailing_State.sendKeys(State);
		
		logger.info(State+" "+"is the State provided by the User");
		
		//ZipCode
		Add_Point_Customer_Object.Mailing_Zip_code.sendKeys(Zipcode);
		
		logger.info(Zipcode+" "+"is the Zipcode provided by the User");
		
		Thread.sleep(2000);
		
	    Add_Point_Customer_Object.Save_button.click();
	    
	    

		
	}
	
	
	@Then("^Message displayed Login Successful for Add \"(.*?)\" in Points application$")
	public void message_displayed_Login_Successful_for_Add_Customer_in_Points_application(String Customer_Name) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));
		Thread.sleep(2000);
		
		String Text_value= element.getText();
		System.out.println("Text Value is-->"+Text_value);
		
		try {
		Assert.assertEquals(Customer_Name+ " " +"was created", Text_value);
		logger.info("Assertion Passed");
		}
		catch (AssertionError e) {
		logger.info("Assertion Failed");
		       throw e;
		     
	}



	}	

}
