package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_Point_Customer_Object extends BaseClass{

	public static WebDriver driver;



	public Add_Point_Customer_Object(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/application-tray[1]/div[1]/div[1]/div[1]")
	public static WebElement Select_Center_Click;
	
	@FindBy(how=How.XPATH, using="//select[@class='ui input fluid ng-pristine ng-untouched ng-valid ng-not-empty']")
	public static WebElement Select_Center_List;
	

	@FindBy(how=How.XPATH, using="//button[@class='ui primary button ng-isolate-scope']")
	public static WebElement Add_Customer;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Customer BPN']")
	public static WebElement Customer_BPN;
	
	
	
	@FindBy(how=How.XPATH, using="//select[@name='customerType']")
	public static WebElement Customer_Type;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Customer Name']")
	public static WebElement Customer_Name;
	
	@FindBy(how=How.XPATH, using="//select[@name='industry']")
	public static WebElement Customer_Industry;
	
	@FindBy(how=How.XPATH, using="//select[@name='acquisition']")
	public static WebElement Acquisition_Method;
	
	@FindBy(how=How.XPATH, using="//select[@name='terms']")
	public static WebElement Payment_Terms;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Street Address']")
	public static WebElement Mailing_Address;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='City']")
	public static WebElement Mailing_City;
	
	@FindBy(how=How.XPATH, using="//input[@class='search']")
	public static WebElement Mailing_State;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='ZIP Code']")
	public static WebElement Mailing_Zip_code;
	
	@FindBy(how=How.XPATH, using="//button[contains(text(),'Save')]")
	public static WebElement Save_button;
	
	
}
