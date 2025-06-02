package maven_code1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

//@SuppressWarnings("unused")
public class IRetryAnalyr_AmazonAuto_Logic_Script 
{
	
	@Test (retryAnalyzer=IRetryAnalyzr_FailedTstCase_Script.class)
	public static void AmazonAutoSuggesRetry() throws InterruptedException
	{
		
		WebDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();
     
           driver.get("https://www.amazon.in/");
     
         WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
              srchtxtfld.sendKeys("Mobiles");
                
               Thread.sleep(3000);
               Assert.fail("Purpose fully failing It");
       
           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
         
               int count=  list.size();
                    System.out.println(count);
                    
             Thread.sleep(2000);
                 list.get(4).click();
                 
               driver.quit();  
	} 
}
