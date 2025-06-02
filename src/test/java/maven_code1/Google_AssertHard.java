package maven_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google_AssertHard 
{
	  @Test
	  public void GoogleHomePage()
	  {
		  ChromeDriver driver= new ChromeDriver();
		     driver.manage().window().maximize();
		     
		        driver.get("https://www.google.com/");
		        
		         Assert.assertEquals(driver.getTitle(), "Google");
		         
		       WebElement srchfild= driver.findElement(By.className("gLFyf"));
		           srchfild.sendKeys("Ajit Choudhary");
		           
		           Assert.assertEquals(srchfild.getAccessibleName(), true);
		  
		         driver.close();
		  
	  }
	  
	  @Test
	  public void GooglePage()
	  {
		  ChromeDriver driver= new ChromeDriver();
		     driver.manage().window().maximize();
		     
		        driver.get("https://www.google.com/");
		        
		         Assert.assertEquals(driver.getTitle(), "google");
		  
		  driver.close();
	  }
	          

}
