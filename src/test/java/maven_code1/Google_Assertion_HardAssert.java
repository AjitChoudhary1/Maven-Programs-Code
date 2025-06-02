package maven_code1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Google_Assertion_HardAssert 
{
	@Test
	public void Google() throws InterruptedException
	{
		
	        WebDriver driver= new ChromeDriver();
	             driver.get("https://www.google.com/");
	             
	                driver.manage().window().maximize();
	                
	            Assertion a1= new Assertion();
	              a1.assertEquals(driver.getTitle(), "Google");                  //Pass       //Assertion
	            
	                  //a1.assertEquals(driver.getTitle(), "Ajit");              //Fail
	              
	              Thread.sleep(2000);
	              driver.close();
	}
}
