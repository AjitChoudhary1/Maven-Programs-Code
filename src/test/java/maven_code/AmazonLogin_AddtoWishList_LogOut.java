package maven_code;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLogin_AddtoWishList_LogOut
{
	@Test
	public static void LoginToAmazon() throws InterruptedException 
	{
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
           usrname.sendKeys("8269201125");
           
       WebElement prscontnu=    driver.findElement(By.id("continue"));
           prscontnu.click();
           
           WebElement password=    driver.findElement(By.id("ap_password"));
           password.sendKeys("Aj@803131");
           
      WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
           prsSignin.click();
           
           Thread.sleep(3000);
           
           WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
                   srchtxtfld.sendKeys("iphone 16pro max");
                      
             Thread.sleep(3000);
             
           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
               
               int count=  list.size();
                   System.out.println(count);
                       list.get(count-4).click();

                   Thread.sleep(3000);    
          WebElement iphoneslct=  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));
          
                        iphoneslct.click();
                        
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
                           
                     Thread.sleep(3000);
                           driver.quit();
                           
                           
		
	}

}
