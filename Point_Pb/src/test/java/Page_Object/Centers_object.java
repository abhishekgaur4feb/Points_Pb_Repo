package Page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Centers_object extends BaseClass{

	public static WebDriver driver;



	public Centers_object(WebDriver driver){
		super(driver);
	}
	

	@FindBy(how=How.XPATH, using="//div[contains(text(),'Centers')]")
	public static WebElement Centre_Button;
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'CenterID')]")
	public static WebElement Sort_On_Id;
	
	
	
	@FindBy(how=How.XPATH, using="//div[contains(text(),'Name')]")
	public static WebElement Sort_On_Name;
	
	@FindBy(how=How.XPATH, using="//div[@class='content ng-scope']//a[2]")
	public static WebElement Next_Page_2;
	
	@FindBy(how=How.XPATH, using="//div[@class='content ng-scope']//a[3]")
	public static WebElement Next_Page_3;
		
	
	@FindBy(how=How.XPATH, using="//div[@class='scrollable-table-container']")
	public static WebElement Scroll_Values;
	
	
	
}
