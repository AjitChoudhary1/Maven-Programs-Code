package maven_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriver_Launch_2Test
{
	    @Test
	    public void LaunchBrowser() throws InterruptedException
	    {
	           WebDriver driver= new ChromeDriver();
	               driver.manage().window().maximize();
	               
	                  driver.get("https://www.google.com/");
	                  
	                  
	           WebDriver driver1= new EdgeDriver();
	               driver1.manage().window().maximize();
	               
	                  driver1.get("https://www.amazon.in/");
	                  
	                  
	                      Thread.sleep(4000);
	                  driver.quit();
	                  driver1.quit();
	    }
	    
	    @Test
	    public void LaunchBrowser1() throws InterruptedException
	    {
	    	
	    	WebDriver driver1= new FirefoxDriver();
            driver1.manage().window().maximize();
            
               driver1.get("https://www.flipkart.com/");
               
	    	
                         Thread.sleep(4000);
                    driver1.quit();
	    	
	    }
	

}
