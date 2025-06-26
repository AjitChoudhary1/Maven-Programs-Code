package maven_code1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_HomePage
{
	WebDriver driver;

	//step-1 Locate component

	@FindBy(xpath="//div[@class='nav-div'][2]")
	   WebElement accountlist;

	@FindBy(xpath="//span[@class='nav-action-inner']")
	   WebElement signinclick;

	@FindBy(id="twotabsearchtextbox")
	   WebElement search;


	//step-2 Separate method for each component

	public void HoverOver(WebDriver driver)
	{
		Actions a1= new Actions(driver);
        a1.moveToElement(accountlist).perform();
	}

	public void Signin()
	{
		signinclick.click();
	}

	public void SearchProduct()
	{
		search.sendKeys("iphone 16 pro max" + Keys.ENTER);
	}


	//step-3 Initialize element by PageFactory class inside constructor

	public Amazon_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}


}
