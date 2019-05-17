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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page_Object.Centers_object;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Centers_step {
	static final Logger logger = Logger.getLogger(Centers_step.class);
	public WebDriver driver;

	@Given("^Open browser for Points application$")
	public void Open_firefox_and_start_application() throws Throwable {
		driver = Hooks.driver;//body[@data-gr-c-s-loaded='true']
		BasicConfigurator.configure();
		logger.info("Fetching URL and Opening the Url");
		//driver.get("http://www.rarecarat.com");
		}
	
	@When("^NewUser enters \"(.*?)\" and \"(.*?)\" for Points application$")
	public void user_enters_and(String uname, String password) throws InterruptedException {
		BasicConfigurator.configure();
		
		//Initialization
		PageFactory.initElements(driver, Centers_object.class);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Centers')]")));
		Thread.sleep(2000);
		Centers_object.Centre_Button.click();
		
		Thread.sleep(4000);
		logger.info("Clicked on Centers Available in Points Application");	
		
		Thread.sleep(2000);
		
		//Assert.assertEquals("RC Trusted Jeweler", Diamond_added);
		
		Centers_object.Sort_On_Name.click();
		Thread.sleep(1000);
		Centers_object.Sort_On_Name.click();
		Thread.sleep(1000);
		Centers_object.Sort_On_Id.click();
		
		
		
		String values=Centers_object.Scroll_Values.getText();
		
		//System.out.println("Values of 1st Page are-->"+values);
		
		
		
		Centers_object.Next_Page_2.click();
		
		
		String values_2=Centers_object.Scroll_Values.getText();
		
		//System.out.println("Values of 2nd Page are-->-->"+values_2);
		
		
		Centers_object.Next_Page_3.click();
		
		
		String values_3=Centers_object.Scroll_Values.getText();
		
		//System.out.println("Values of 3rd Page are-->"+values_3);
		
		
		
		ArrayList<String> al= new ArrayList<String>();
		al.add(values_3);
		al.add(values_2);
		al.add(values);
		
		Collections.sort(al);
		
		System.out.println(al);
		
			
		
		
	    
	}

	@Then("^Message displayed Login Successful for Points application$")
	public void message_displayed_Login_Successful(DataTable dt) throws Throwable {
		logger.info("Centers visible Successfully");
		List<List<String>> list = dt.asLists(String.class);
		for(int i=1; i<list.size(); i++) { //i starts from 1 because i=0 represents the header
			System.out.println(list.get(i).get(0)); 
			System.out.println(list.get(i).get(1));
		}
		//driver.close();
	}
	


}
