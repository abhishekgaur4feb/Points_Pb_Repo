package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Add_Count_Object extends BaseClass{

	public static WebDriver driver;



	public Add_Count_Object(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(how=How.XPATH, using="/html[1]/body[1]/div[2]/application-tray[1]/div[1]/div[1]/div[1]")
	public static WebElement Select_Center_Click;
	
	@FindBy(how=How.XPATH, using="//select[@class='ui input fluid ng-pristine ng-untouched ng-valid ng-not-empty']")
	public static WebElement Select_Center_List;
	
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Operations')]")
	public static WebElement Operations;

	@FindBy(how=How.XPATH, using="//a[contains(text(),'Counts')]")
	public static WebElement Counts;

	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Add Count')]")
	public static WebElement Add_Counts;
	
	
	@FindBy(how=How.XPATH, using="//select[@name='countType']")
	public static WebElement Count_Type;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Select Job...']")
	public static WebElement Job_Number;
		
	@FindBy(how=How.XPATH, using="//div[@class='field ng-scope']//select[@name='center']")
	public static WebElement Mall_Type;
	
	@FindBy(how=How.XPATH, using="//input[@name='count']")
	public static WebElement count;
	
	
	@FindBy(how=How.XPATH, using="//select[@name='sortCode']")
	public static WebElement sort_code;
	
	@FindBy(how=How.XPATH, using="//button[@class='ui primary button ng-binding ng-scope']")
	public static WebElement save_button;
	
	@FindBy(how=How.XPATH, using="//div[@class='toast-message']")
	public static WebElement Success;
	
	

}
