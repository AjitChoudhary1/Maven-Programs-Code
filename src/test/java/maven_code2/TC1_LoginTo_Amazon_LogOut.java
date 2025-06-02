package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maven_code1.Amazon_HomePage;
import maven_code1.Amazon_LoginPage;
import maven_code1.Amazon_LogoutPage;

public class TC1_LoginTo_Amazon_LogOut extends Amazon_BaseClass
{
	
    @Test
	public void LoginToAmazon_AndLogOut()
	{
    	SoftAssert s1= new SoftAssert();
    	
    	System.out.println("Title is-> " + driver.getTitle());
    	
		Amazon_HomePage homepage= new Amazon_HomePage(driver);
		  homepage.HoverOver(driver);
		  homepage.Signin();
		  
		
		
		Amazon_LoginPage loginpage= new Amazon_LoginPage(driver);
		   loginpage.Un();
		   loginpage.PressContinueButton();
		   loginpage.Pwd();
		   loginpage.SigninPress();
		   
		   
		   s1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		                //Assertion 1
		   
	    Amazon_LogoutPage logoutpage= new Amazon_LogoutPage(driver);
	       logoutpage.HoverOverHelloAjit(driver);
	       logoutpage.SignOutPressChildW();
	       
	       
	       
	       
	       WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
           
           
           
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");               //Assertion 2
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);
		   
			                        
			       System.out.println("Title is-> " + driver.getTitle());
		   
	       s1.assertAll("All Assertion Not Passed");
	       
	       
		
	}

}
