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
	static final Logger logger = Logger.getLogger(Add_Point_Customer_Step.class);
	public WebDriver driver;
	
	@Given("^Open browser for Add Customer in Points application$")
	public void open_browser_for_Add_Customer_in_Points_application() throws Throwable {
		driver = Hooks.driver;
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		
	}

	@When("^NewUser select \"([^\"]*)\" for Add Customer in Points application$")
	public void newuser_select_for_Add_Customer_in_Points_application(String center) throws Throwable {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Add_Point_Customer_Object.class);
		
		
		
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element1 = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel-tab flex column center-both']")));
		Thread.sleep(2000);
		element1.click();
		//Center Selection
		//Add_Count_Object.Select_Center_Click.click();
		Select Centers = new Select(Add_Point_Customer_Object.Select_Center_List);
		
			
		List<WebElement> Centers_list = Centers.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Centers_list.size(); j++) {	        
	        if(Centers_list.get(j).getText().equals(center)) {
	        	Centers_list.get(j).click();
	            break;
	        }
	    }
		
	
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
		
	
	@When("^Customer click on Add Customer and Enter Customer with details \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" and \"(.*?)\"$")
	public void Add_Customer_and_Enter(String Customer_Name, String Customer_Type,String Industry, String arg4, String arg5, String arg6) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Add_Point_Customer_Object.Customer_Name.sendKeys(Customer_Name);
	   
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Add_Point_Customer_Object.Customer_Type);
		
		Thread.sleep(2000);
		Select Counttype = new Select(Add_Point_Customer_Object.Customer_Type);
		
		List<WebElement> Counttype_list = Counttype.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Counttype_list.size(); j++) {	        
	        if(Counttype_list.get(j).getText().equals(Customer_Type)) {
	        	Counttype_list.get(j).click();
	            break;
	        }
	    }
		
		Select Industry_Type = new Select(Add_Point_Customer_Object.Customer_Industry);
		
		List<WebElement> allOptions = Industry_Type.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < allOptions.size(); j++) {	        
	        if(allOptions.get(j).getText().equals(Industry)) {
	        	allOptions.get(j).click();
	            break;
	        }
	    }
		
		
		
		
	}
	
	@When("^Customer enters PrimaryMailingAddress with details \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void customer_enters_PrimaryMailingAddress_with_details_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Message displayed Login Successful for Add Customer in Points application$")
	public void message_displayed_Login_Successful_for_Add_Customer_in_Points_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	

}
