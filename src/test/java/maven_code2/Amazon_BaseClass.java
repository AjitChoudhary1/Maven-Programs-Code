package maven_code2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@SuppressWarnings("unused")
public class Amazon_BaseClass // implements ITestListener
{
	WebDriver driver;
	
	
	 @BeforeMethod
	 public void Launching()
	 {
		   driver= new EdgeDriver();
		   
		 driver.get("https://www.amazon.in");
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		 
		      Reporter.log("Browser Is Launched Sucessfully");
	 }
	 
	 @AfterMethod
	 public void Closing()
	 {
		
		 // driver.close();
		     Reporter.log("Browser Is Closed Sucessfully");
	 }

}
