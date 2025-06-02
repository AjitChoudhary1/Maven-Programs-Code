package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_LoginPage 
{
	WebDriver driver;
	// step- 1 - Locate each component using @FindBy Annotation
	
	     @FindBy(name="email")
	       WebElement username;
	     
	     @FindBy(id="continue")
	       WebElement continuebutton;
	     
	     @FindBy(id="ap_password")
	       WebElement password;
	     
	     @FindBy(id="signInSubmit")
	       WebElement signinbutton;
	     
	     
	// step- 2 - Create separate methods for each component to perform action
	     
	     public void Un()
	     {
	    	 username.sendKeys("8269201125");
	     }
	     
	     public void PressContinueButton()
	     {
	    	 continuebutton.click();
	     }
	     
	     public void Pwd()
	     {
	    	 password.sendKeys                                                                                                                                                                                                 ("Aj@803131");
	     }
	     
	     public void SigninPress()
	     {
	    	 signinbutton.click();
	     }
	     
	     
   // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Amazon_LoginPage(WebDriver driver)
	     {
	    	 //this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }

}
