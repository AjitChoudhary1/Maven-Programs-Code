package maven_code1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonLogin_AddtoWishList_LogOut_Assertion_SoftAsrt
{
	@Test
	public static void LoginToAmazon() throws InterruptedException 
	{
		
		SoftAssert s1= new SoftAssert();
		
		EdgeDriver driver= new EdgeDriver();
        driver.manage().window().maximize();
        
           driver.get("https://www.amazon.in/");
           
           WebElement e1=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
		     
           Actions a1= new Actions(driver);
               a1.moveToElement(e1).perform();
               
               Thread.sleep(2000);
		          
   		    WebElement e2=    driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
   		           e2.click(); 
           
           WebElement usrname= driver.findElement(By.name("email"));
           usrname.sendKeys("8269201");
           
       WebElement prscontnu=    driver.findElement(By.id("continue"));
           prscontnu.click();
           
           WebElement password=    driver.findElement(By.id("ap_password"));
           password.sendKeys("Aj@803");
           
      WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
           prsSignin.click();
           
           
           
           //  a1.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");                   //Assertion
           //Assertion 1


                WebElement helloajit= driver.findElement(By.xpath("(//span[@class='nav-line-1 nav-progressive-content'])[2]"));
  

                     s1.assertEquals(helloajit.getText(), "Hello, Ajit");         //Assertion  1      

                                   String name= helloajit.getText();
                                            System.out.println(name);
           
           
           
           Thread.sleep(3000);
           
           WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
                   srchtxtfld.sendKeys("iphone 16pro max");
                      
             Thread.sleep(3000);
             
           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
               
               int count=  list.size();
                   System.out.println(count);
                  // Thread.sleep(5000);
                       list.get(count-4).click();

                   Thread.sleep(3000);    
          WebElement iphoneslct=  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]"));
          
                        iphoneslct.click();
                        
                        
                        Thread.sleep(3000);
          //s1.assertEquals(driver.getTitle(), "iPhone 16 Pro Max 512 GB: 5G Mobile Phone with Camera Control, 4K 120 fps Dolby Vision and a Huge Leap in Battery Life. Works with AirPods; Desert Titanium : Amazon.in: Electronics");                 
                                    //child window title
                        
                        
             s1.assertEquals(driver.getTitle(), "Amazon.in : iphone 16pro max 512gb");
                                          //parent window title
                    //Assertion 2
             
                            String titlemsg= driver.getTitle();
                                  System.out.println(titlemsg);
                        
                        
                        
                        
                Set<String> pcid =   driver.getWindowHandles();
                      System.out.println(pcid);
                      
                Iterator<String> i1= pcid.iterator();
                       String parentid=   i1.next();
                       String childid=    i1.next();
                   driver.switchTo().window(parentid);
                   driver.switchTo().window(childid);
                   
                   Thread.sleep(3000);
         WebElement addtowishlist=  driver.findElement(By.xpath("//span[@id='wishListMainButton']"));
                       addtowishlist.click();
                       
                       
                       Thread.sleep(3000);
                   WebElement itemadded= driver.findElement(By.xpath("//span[.='One item added to']"));      
                       
                       
                       //Assertion 3
               s1.assertEquals(itemadded.getText(), "One item added to");
               
                           String itemaddmsg= itemadded.getText();
                               System.out.println(itemaddmsg);
                       
                       
                    
                                   Thread.sleep(3000);
                         WebElement clickviewlist=  driver.findElement(By.linkText("View Your List"));
                         clickviewlist.click();
                         
                               Thread.sleep(3000);
                      WebElement delteclick=  driver.findElement(By.name("submit.deleteItem"));
                              delteclick.click();
                              
                                 Thread.sleep(3000);
                       WebElement hvrovr=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
                       Actions a2= new Actions(driver);
                           a2.moveToElement(hvrovr).perform();     //hvrovr Hello,Ajit Account&List
                           
                                Thread.sleep(5000);
                    WebElement logout=   driver.findElement(By.linkText("Sign Out")); 
                           logout.click();
                           
                           
                           
                      
               WebElement signinmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-spacing-small']"));
    			           
               
               
			  s1.assertEquals(signinmsg.getText(), "Sign in or create account");               //Assertion 4
			         
			                String signinmsg1= signinmsg.getText();
			                        System.out.println(signinmsg1);
                           
                           
			                   Thread.sleep(3000); 
                           
                         s1.assertAll();  
                           
                     
                         //  driver.quit();
                           
                           
		
	}

}
