package maven_code2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import maven_code1.Amazon_HomePage;
import maven_code1.Amazon_LoginPage;
import maven_code1.Amazon_LogoutPage;
import maven_code1.Amazon_ProductPage1;
import maven_code1.Amazon_SearchResultPage;

public class TC2_LoginTo_Amazon_Search_AddToWishList_LogOut extends Amazon_BaseClass
{
	@Test
	public void LoginToAmazon_search_AddToWishList_AndLogOut() throws InterruptedException
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
		   
		   
		   
		   WebElement helloajit= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
		   

           s1.assertEquals(helloajit.getText(), "Hello, Ajit");         //Assertion  1      

                         String name= helloajit.getText();
                                  System.out.println(name);
		   
		   
		   homepage.SearchProduct();
		   
		   
		   //Assertion 2
		   
		   List<WebElement> allproduct= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		   
		   s1.assertEquals(allproduct.size()>15, true);
		   
		   
		Amazon_SearchResultPage selectfirstproduct= new Amazon_SearchResultPage(driver);
		     selectfirstproduct.ClickFirstProduct();
		     
		     
	       s1.assertEquals(driver.getTitle(), "Amazon.in : iphone 16 pro max");
		     
		     //Assertion 3
		     
		     Thread.sleep(4000);
		Amazon_ProductPage1 addtowishlist= new Amazon_ProductPage1(driver);
		      addtowishlist.AddtoWishList(driver);
		      
		      
		      
		      WebElement itemadded= driver.findElement(By.xpath("//span[.='One item added to']"));      
              
              
              //Assertion 4
      s1.assertEquals(itemadded.getText(), "One item added to");
      
                  String itemaddmsg= itemadded.getText();
                      System.out.println(itemaddmsg);
		      
		      Thread.sleep(4000);
		      //addtowishlist.ViewYourList();
		      addtowishlist.ContinueShopping();
		      
		    
		      Thread.sleep(4000);
	    Amazon_LogoutPage logoutpage= new Amazon_LogoutPage(driver);
	       logoutpage.HoverOverHelloAjit(driver);
	       logoutpage.SignOutPressChildW();
	       
	       
	       
	       WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
           
           
           
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");        //Assertion 5
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);
			                        
			                                              
			                        System.out.println("Title is-> " + driver.getTitle());
		   
	       s1.assertAll("All Assertion Not Passed");
	       
		   
	       
		
	}

}
