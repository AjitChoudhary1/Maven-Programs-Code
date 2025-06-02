package maven_code1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Amazon_LoginAddCart_LogOut_Assertion_HardAssert 
{
	  @Test
	  public void AmazonAddCartLogOut() throws InterruptedException
	  {
		  EdgeDriver driver= new EdgeDriver();
		     driver.manage().window().maximize();
		        
		     Assertion a1= new Assertion();
		     
		        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		    	
			       WebElement usrname= driver.findElement(By.name("email"));
			           usrname.sendKeys("8269201125");
			           
			       WebElement prscontnu=    driver.findElement(By.id("continue"));
			           prscontnu.click();
			           
			       WebElement password=    driver.findElement(By.id("ap_password"));
			            password.sendKeys("Aj@803131");
			            
			       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
			            prsSignin.click();
			            
			            
			  a1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");                   //Assertion
			            //Assertion 1
			            
			            
			WebElement helloajit= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
						          
					       
						Assert.assertEquals(helloajit.getText(), "Hello, Ajit");         //Assertion 1
		        
						String name= helloajit.getText();
		                   System.out.println(name);
		                   
	                 
			       WebElement srch=  driver.findElement(By.id("twotabsearchtextbox"));
			             srch.sendKeys("Samsung Ultra 25" + Keys.ENTER);
			                  
			       List<WebElement> slctonephon= driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		                
			       
			                a1.assertEquals(slctonephon.size()>15, true);                 //Assertion 2
                   
                                 System.out.println(slctonephon.size());
			       
			                slctonephon.get(2).click();
		                
		                Set<String> s1= driver.getWindowHandles();
		                  Iterator<String> s2= s1.iterator();
		                    String prntid= s2.next();
		                    String childid= s2.next();
		                    
		                      driver.switchTo().window(prntid);
		                      driver.switchTo().window(childid);
		                      
		               WebElement addtocart= driver.findElement(By.id("add-to-cart-button")); 
				           addtocart.click();
				           
				           
				       WebElement msg= driver.findElement(By.xpath("(//span[@class='a-size-medium a-text-bold'])[3]"));
		                  
				           a1.assertEquals(msg.getText(), "Samsung");      //Assertion 3
			                    System.out.println(msg);
			                    
			                    Thread.sleep(3000);
			           WebElement closemark=  driver.findElement(By.xpath("//a[@class='a-link-normal attach-close-button']"));         
			                   closemark.click();
			                   
			                    
			                    Thread.sleep(3000);
			          WebElement hvrovr=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
			                  Actions a2= new Actions(driver);
			                       a2.moveToElement(hvrovr).perform();     //hvrovr Hello,Ajit Account&List
			                       
			                           
			                                Thread.sleep(5000);
			           WebElement logout=   driver.findElement(By.linkText("Sign Out")); 
			                       logout.click();	
			                       
			             
			           WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
			           
			                a1.assertEquals(signinmsg.getText(), "Sign in or create account");  //Assertion 4
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);
			         
		  Thread.sleep(3000);
		        // driver.close();
	  }      

}
