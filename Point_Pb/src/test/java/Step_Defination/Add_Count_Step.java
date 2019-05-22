package Step_Defination;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Add_Count_Object;
import Page_Object.Centers_object;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_Count_Step {
	static final Logger logger = Logger.getLogger(Centers_step.class);
	public WebDriver driver;
	
	@Given("^Open browser for Add Counts in Points application$")
	public void open_browser_for_Add_Counts_in_Points_application() throws Throwable {
		driver = Hooks.driver;//body[@data-gr-c-s-loaded='true']
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
	}

	@When("^NewUser select \"(.*?)\" for Add Counts in Points application$")
	public void newuser_enters_and_for_Add_Counts_in_Points_application(String center) throws Throwable {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Add_Count_Object.class);
		
		WebDriverWait wait4 = new WebDriverWait(driver, 50);
		WebElement element4 = wait4
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='panel-tab flex column center-both']")));
		Thread.sleep(2000);
		element4.click();
		//Center Selection
		//Add_Count_Object.Select_Center_Click.click();
		Select Counttype = new Select(Add_Count_Object.Select_Center_List);
		
		List<WebElement> Centers_list = Counttype.getOptions();
		
		// Loop one by one
	    for (int j = 0; j < Centers_list.size(); j++) {	        
	        if(Centers_list.get(j).getText().equals(center)) {
	        	Centers_list.get(j).click();
	            break;
	        }
	    }
		
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Operations')]")));
		Thread.sleep(2000);
		
		element.click();
		}

	@When("^I click on Add Counts and Enter \"(.*?)\" and \"(.*?)\" and \"(.*?)\" and \"(.*?)\"$")
	public void i_click_on_Add_Counts(String count_type,String mall_type, String count,String sort_code) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		WebElement element1 = wait1
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Counts')]")));
		Thread.sleep(2000);
		element1.click();
		
		
		
		WebDriverWait wait2 = new WebDriverWait(driver, 50);
		WebElement element2 = wait2
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Add Count')]")));
		Thread.sleep(2000);
		element2.click();
		
		Thread.sleep(4000);
		
		
		Select Counttype = new Select(Add_Count_Object.Count_Type);
		switch (count_type)
        {
            case "Customer":
            	Counttype.selectByVisibleText("Customer");
    			break;
            case "Sorter Machine":
            	Counttype.selectByVisibleText("Sorter Machine"); 
            break;
		
        }
		
		
		//to see what can be done
		Add_Count_Object.Job_Number.sendKeys("1");
		
		logger.info("Looking for Price in Resource");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", Add_Count_Object.Mall_Type);
		
		
		
		Select malltype = new Select(Add_Count_Object.Mall_Type);
		
		switch (mall_type)
        {
            case "Letter":
            	malltype.selectByIndex(1);
    			break;
            case "Non-Letter":
            	malltype.selectByIndex(2);
            break;
            
            case "None":
            	malltype.selectByIndex(3);
            break;
            
            case "Parcel":
            	malltype.selectByIndex(3);
            break;
         }
		
		Thread.sleep(2000);
		Add_Count_Object.count.sendKeys(count);
		
		Thread.sleep(2000);
		Select sortcode = new Select(Add_Count_Object.sort_code);
		
		switch (sort_code)
        {
            case "AUSHandsortLog":
            	sortcode.selectByIndex(1);
    			break;
            case "IC DFW":
            	sortcode.selectByIndex(2);
            break;
            
            case "IC HOU":
            	sortcode.selectByIndex(3);
            break;
            
            case "IC w/DF2":
            	sortcode.selectByIndex(4);
            break;
            case "ME DFW":
            	sortcode.selectByIndex(5);
            break;
            case "ME HOU":
            	sortcode.selectByIndex(6);
            break;           
         }
		
		Thread.sleep(2000);
		
		Add_Count_Object.save_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='toast-message']")));
		Thread.sleep(2000);
		
		String Text_value= element.getText();
		System.out.println("Text Value is-->"+Text_value);
		
		try {
		Assert.assertEquals("Count successfully added.", Text_value);
		logger.info("Assertion Passed");
		}
		catch (AssertionError e) {
		logger.info("Assertion Failed");
		       throw e;
		     }
    	}

	@Then("^Message displayed Login Successful for Add Counts in Points application$")
	public void message_displayed_Login_Successful_for_Add_Counts_in_Points_application() throws Throwable {
		driver.close();
	  
	}
}