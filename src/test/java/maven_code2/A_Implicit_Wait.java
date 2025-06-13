package maven_code2;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_Implicit_Wait 
{
	  @Test
	  public void implicitWait()
	  {
	            ChromeDriver driver = new ChromeDriver();
	
	                                  //New Syntax
	                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	                    
	                    driver.manage().timeouts().implicitlyWait(Duration.ofNanos(500));
	                    
	                    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(700));
	                    
	                    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	                    
	                    
	                    
	                      //Old Syntax  now deprecated in 2023
	             // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                    
	                    
	  }

}
