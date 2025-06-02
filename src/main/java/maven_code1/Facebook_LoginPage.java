package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage 
{
	WebDriver driver;
	// step- 1 - Locate each component using @FindBy Annotation
	
	     @FindBy(id="email")
	       WebElement username;
	     
	     @FindBy(id="pass")
	       WebElement password;
	     
	     @FindBy(name="login")
	       WebElement loginbutton;
	     
	     
	     
	// step- 2 - Create separate methods for each component to perform action
	     
	     public void un()
	     {
	    	 username.sendKeys("95998508");
	     }
	     
	     public void pwd()
	     {
	    	 password.sendKeys("@Aj806");
	     }
	     
	     public void login()
	     {
	    	 loginbutton.click();
	     }
	     
	     
	     
   // step- 3 - Initializing the elements using PageFactory class inside the constructor
	     
	     public Facebook_LoginPage(WebDriver driver)
	     {
	    	 //this.driver=driver;
	    	 PageFactory.initElements(driver, this);
	    	 
	     }

}
