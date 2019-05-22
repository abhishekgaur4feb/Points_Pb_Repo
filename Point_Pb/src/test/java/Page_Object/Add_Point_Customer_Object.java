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
	
	@FindBy(how=How.XPATH, using="//select[@name='customerType']")
	public static WebElement Customer_Type;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Customer Name']")
	public static WebElement Customer_Name;
	
	@FindBy(how=How.XPATH, using="//select[@name='industry']")
	public static WebElement Customer_Industry;
	
	
	
	
	
	
	

}
