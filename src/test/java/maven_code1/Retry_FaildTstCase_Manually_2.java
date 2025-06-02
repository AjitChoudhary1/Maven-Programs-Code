package maven_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Retry_FaildTstCase_Manually_2 
{
	WebDriver driver;
	
	 @Test
	 public void Google() throws InterruptedException
	 {
		 driver= new ChromeDriver();
		 
		    driver.get("https://www.google.com");
		 
		     WebElement srchbar=    driver.findElement(By.id("APjFqb"));
		     // WebElement srchbar=    driver.findElement(By.id("Ajit"));
		         srchbar.sendKeys("Jay Veer Tejaji" + Keys.ENTER);
		         
		         
		         Thread.sleep(3000);
		         driver.quit();
	 }
	 
	 
	 @Test
	 public void Amazon() throws InterruptedException
	 {
		 driver= new EdgeDriver();
		    
		     driver.get("https://www.amazon.in");
		     
		     Thread.sleep(3000);
		       driver.close();
	 }
	 
	 
	 @Test
	 public void Facebook() throws InterruptedException
	 {
		 driver= new EdgeDriver();
		    
	     driver.get("https://www.facebook.com");
		 
	     WebElement forfail= driver.findElement(By.id("ghti456fg"));
	           forfail.isEnabled();
	     
		 Thread.sleep(3000);
		      driver.close();
	 }
	
	
	
	

}
