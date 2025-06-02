package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelBrowsrTsting_LogintoAmazon1 
{
	                                                   //After adding the parameters we can run only from testng.xml as suite
	WebDriver driver;
	
	     @Parameters("Browsers")                                    //if run here in class will get testng exception
	    @Test
	    public void LaunchBrowser(String NameofBrowsers) throws InterruptedException
	    {
	    	if(NameofBrowsers.equals("chrome"))
	    	{
	    		
	            driver= new ChromeDriver();
	         
	    	}
	    	
	    	
	    	if(NameofBrowsers.equals("edge"))
	    	{
	    		
	            driver= new EdgeDriver();
	         
	    	}
	    	
	    	
	    	                     driver.manage().window().maximize();
		     
                              driver.get("https://www.amazon.in/");
                                      Thread.sleep(2000);
                                  driver.navigate().refresh();
                     WebElement e1=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
  
                                    Actions a1= new Actions(driver);
                                       a1.moveToElement(e1).perform();
                        
                                             Thread.sleep(2000);
       
                      WebElement e2=    driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
                                 e2.click(); 
        
        
        
        
                       WebElement usrname= driver.findElement(By.name("email"));
                                 usrname.sendKeys("ajit@gmail.com");
        
                       WebElement prscontnu=    driver.findElement(By.id("continue"));
                                       prscontnu.click();
        
                         WebElement password=    driver.findElement(By.id("ap_password"));
                                  password.sendKeys("8031aj");
         
                         WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
                                prsSignin.click();
                       
	    	
	    	
	    	
	    	                    Thread.sleep(10000);
	    	                           driver.quit();
	    }
	
	                 

}
