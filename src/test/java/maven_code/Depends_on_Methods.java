package maven_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Depends_on_Methods 
{
	   WebDriver driver;
	
	  @Test (timeOut=50)                               //It will skip logout if Login not happen in browser
	  public void LoginToAmazon() 
	  {
		     driver= new EdgeDriver();
		  
		  System.out.println("Do Login For Amazon");
	  }
	  
	  
	  @Test (dependsOnMethods="LoginToAmazon")
	  public void LogOutFromAmazon()
	  {
		  System.out.println("Do Logout From Amazon");
	  }

}
