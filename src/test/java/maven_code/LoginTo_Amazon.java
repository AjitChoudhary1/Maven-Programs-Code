package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTo_Amazon 
{
	@Test
	public static void LoginToAmazon()
	{
		 ChromeDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	       WebElement usrname= driver.findElement(By.name("email"));
	           usrname.sendKeys("8269201125");
	           
	       WebElement prscontnu=    driver.findElement(By.id("continue"));
	           prscontnu.click();
	           
	       WebElement password=    driver.findElement(By.id("ap_password"));
	            password.sendKeys("Aj@803");
	            
	       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
	            prsSignin.click();
		
		
		
		
		
	}

}
