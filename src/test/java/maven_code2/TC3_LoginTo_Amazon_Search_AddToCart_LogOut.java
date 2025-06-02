package maven_code2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maven_code1.Amazon_HomePage;
import maven_code1.Amazon_LoginPage;
import maven_code1.Amazon_LogoutPage;
import maven_code1.Amazon_ProductPage2;
import maven_code1.Amazon_SearchResultPage;


public class TC3_LoginTo_Amazon_Search_AddToCart_LogOut extends Amazon_BaseClass
{
	@Test
	public void LoginToAmazon_search_AddToCart_AndLogOut() throws InterruptedException
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
		   
		   
		   homepage.SearchProduct();
		   
		   
                  //Assertion 2
		   
		   List<WebElement> allproduct= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		   
		   s1.assertEquals(allproduct.size()>15, true);
		   
		   
		   
		Amazon_SearchResultPage selectfirstproduct= new Amazon_SearchResultPage(driver);
		     selectfirstproduct.ClickFirstProduct();
		     
		     
		     
            s1.assertEquals(driver.getTitle(), "Amazon.in : iphone 16 pro max");
            
		     //s1.assertEquals(driver.getTitle(), "iPhone 16 Pro Max 256 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium : Amazon.in: Electronics");
		     
		     //Assertion 3
            
            
		     
		Amazon_ProductPage2 addtocart= new Amazon_ProductPage2(driver);
		        addtocart.AddtoCart(driver);
		             
                
             // s1.assertEquals(addtocart.msgaddedtocart(), "Added to cart");  
		             //Assertion 4
		        
		        
              
		        addtocart.CloseMark();
		      
	                        Thread.sleep(5000);
			      Amazon_LogoutPage logoutpage= new Amazon_LogoutPage(driver);
	                     logoutpage.HoverOverHelloAjit(driver);
	                     
	                             Thread.sleep(5000);
	                       logoutpage.SignOutPressChildW();
		   
	       
	       
	       
	       WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
           
           
           
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");        //Assertion 5
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);
			                        
			                                              
			                        System.out.println("Title is-> " + driver.getTitle());
		   
	       s1.assertAll("All Assertion Not Passed");
		   
		
	       
	}

}
