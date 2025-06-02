package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddressPage 
{
	WebDriver driver;
	
	//step-1 Locate component
	
	@FindBy(xpath="(//a[@class='nav-link nav-item'])[8]")
	   WebElement youraccount;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[4]")
	   WebElement youraddresses;
	
	@FindBy(xpath="//div[@class='a-section a-color-tertiary add-address-text']")
	   WebElement addnewaddress;
	
	
	//step-2 Separate method for each component
	
	public void ClickYourAccount()
	{
		youraccount.click();
	}
	
	public void YourAddresses()
	{
		youraddresses.click();
	}
	
	public void AddNewAddress()
	{
		addnewaddress.click();
		
		fullname.sendKeys("Ajit Choudhary");
		mobilenumber.sendKeys("8269201125");
		pincode.sendKeys("341301");
		housenumber.sendKeys("Tatarwi");
		village.sendKeys("Tatarwi, Jayal");
		landmark.sendKeys("Badi Khatu");
		
		clickaddaddress.click();
		
		originaladdresscheckbox.click();
		
		clicksaveaddress.click();
	}
	
	
	
	@FindBy(name="address-ui-widgets-enterAddressFullName")
	   WebElement fullname;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	   WebElement mobilenumber;
	
	@FindBy(name="address-ui-widgets-enterAddressPostalCode")
	   WebElement pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	   WebElement housenumber;
	
	@FindBy(name="address-ui-widgets-enterAddressLine2")
	   WebElement village;
	
	@FindBy(id="address-ui-widgets-landmark")
	   WebElement landmark;
	
	/*@FindBy(name="")
	   WebElement city;
	
	@FindBy(id="")
	   WebElement state;
	*/
	
	@FindBy(id="address-ui-widgets-form-submit-button")
	   WebElement clickaddaddress;
	
	@FindBy(id="address-ui-widgets-original-address-block_id-input")
	   WebElement originaladdresscheckbox;
	
	@FindBy(name="address-ui-widgets-saveOriginalOrSuggestedAddress")
	   WebElement clicksaveaddress;
	
	
	
	@FindBy(id="ya-myab-address-delete-btn-1")
	  WebElement remove;
	
	@FindBy(xpath="//span[@class='a-button a-button-span12 a-button-primary']")
	 WebElement yes;
	
	public void Remove()
	{
		remove.click();
	}
	
	public void Yes()
	{
		yes.click();
	}
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_AddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	

}
