package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maven_code1.Amazon_AddressPage;
import maven_code1.Amazon_HomePage;
import maven_code1.Amazon_LoginPage;
import maven_code1.Amazon_LogoutPage;

public class TC4_LoginTo_Amazon_AddNewAddress_LogOut extends Amazon_BaseClass
{
	@Test
	public void LoginToAmazon_AddNewAddress_AndLogOut() throws InterruptedException
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
		   
		   
		   homepage.HoverOver(driver);
		   
		   
		  Amazon_AddressPage addnewaddress= new Amazon_AddressPage(driver);
		         addnewaddress.ClickYourAccount();
		         addnewaddress.YourAddresses();
		         addnewaddress.AddNewAddress();
		         
		         
		         WebElement msgnewaddress= driver.findElement(By.xpath("(//h4[@class='a-alert-heading'])[1]"));
		         
		        s1.assertEquals(msgnewaddress.getText(), "Address saved"); 
		              //Assertion 2
		            
		             String savemsg= msgnewaddress.getText();
		                   System.out.println("After Saving Address -> " + savemsg);
		        
		    
		                   
		                   
		         addnewaddress.Remove();
		         
		            Thread.sleep(3000);
		         addnewaddress.Yes();
		         
		         
		         WebElement msgdelete= driver.findElement(By.xpath("(//h4[@class='a-alert-heading'])[1]"));
		                   
		         s1.assertEquals(msgdelete.getText(), "Address deleted"); 
	              //Assertion 3
	            
	             String deletemsg= msgdelete.getText();
	                   System.out.println("After Deleting Address -> " + deletemsg);
		   
	                   
	                   
	                   
		          Thread.sleep(5000);
	     Amazon_LogoutPage logoutpage= new Amazon_LogoutPage(driver);
	       logoutpage.HoverOverHelloAjit(driver);
	       logoutpage.SignOutPressChildW();
	       
	       
	       
	       WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
           
           
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");        //Assertion 4
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println("After LogOut -> " + signinmsg1);
			                        
			                                              
			                        System.out.println("Title is-> " + driver.getTitle());
		   
	       s1.assertAll("All Assertion Not Passed");
	       
	       
		   
	       
		
	}

}
