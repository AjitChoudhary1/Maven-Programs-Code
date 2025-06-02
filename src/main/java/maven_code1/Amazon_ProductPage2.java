package maven_code1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage2
{
    WebDriver driver;
	
	//step-1 Locate component
	
	@FindBy(name="submit.add-to-cart")
	   WebElement addtocart;
	
	@FindBy(xpath="//a[@class='a-link-normal attach-close-button']")
	   WebElement closemark;
	
	
	//step-2 Separate method for each component
	
	
	public void AddtoCart(WebDriver driver)
	{
		Set<String> pcid= driver.getWindowHandles();
		  Iterator<String> ids= pcid.iterator();
		     
		 
			String parentid= ids.next();
		    String childid= ids.next();
		    
		       driver.switchTo().window(parentid);
		       driver.switchTo().window(childid);
		       
		
		addtocart.click();
		
	}
	
	
 /*	@FindBy(xpath="//h1[@class=\"a-size-medium-plus a-color-base sw-atc-text a-text-bold\"]")
	   WebElement addtocart_msg;
	
	public String msgaddedtocart()
	{
		String addcart = addtocart_msg.getText();
		System.out.println("msg after succssful adding --->" + addcart);
		System.out.println("msg after succssful adding --->" + "[Added to cart Size: 512 GB Colour: Desert Titanium]");
		return addcart;		
	}
	*/
	
	public void CloseMark()
	{
		closemark.click();
	}
	
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_ProductPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
