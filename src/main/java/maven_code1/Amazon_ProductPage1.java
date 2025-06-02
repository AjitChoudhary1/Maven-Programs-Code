package maven_code1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_ProductPage1
{
    WebDriver driver;
    
   // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	
	//step-1 Locate component
	
	@FindBy(name="submit.add-to-registry.wishlist")
	   WebElement addtowishlist;
	
	//@FindBy(linkText="View Your List")
	   //WebElement viewyourlist;
	
	@FindBy(id="continue-shopping")
	   WebElement continueshopping;
	
	
	//step-2 Separate method for each component
	
	
	public void AddtoWishList(WebDriver driver)
	{
		Set<String> pcid= driver.getWindowHandles();
		  Iterator<String> ids= pcid.iterator();
		     
		 
			String parentid= ids.next();
		    String childid= ids.next();
		    
		       driver.switchTo().window(parentid);
		       driver.switchTo().window(childid);
		       
		//wait.until(ExpectedConditions.elementToBeClickable(By.name("submit.add-to-registry.wishlist")));
		       
		addtowishlist.click();
		
		
	}
	
	public void ViewYourList()
	{
		//viewyourlist.click();
		
	}
	
	public void ContinueShopping()
	{
		continueshopping.click();
	}
	
	
	
	//step-3 Initialize element by PageFactory class inside constructor
	
	public Amazon_ProductPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
