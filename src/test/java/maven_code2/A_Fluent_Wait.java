package maven_code2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class A_Fluent_Wait 
{
	
	  @Test
	  public void FluentWait()
	  {
		  WebDriver driver = new ChromeDriver();
		  
		  FluentWait<ChromeDriver> wait= new FluentWait<ChromeDriver>((ChromeDriver) driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(NullPointerException.class);          
		    wait.until(ExpectedConditions.titleContains("title here"));
		    
		    wait.until(ExpectedConditions.urlContains("url here"));
		    
		    //All other are also same as explicit wait
		  
		  
	  }

}
