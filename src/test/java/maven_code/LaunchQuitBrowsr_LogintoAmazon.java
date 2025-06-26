package maven_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchQuitBrowsr_LogintoAmazon
{
	                                                   //After adding the parameters we can run only from testng.xml as suite
	WebDriver driver;

	     @Parameters("Browsers")                                    //if run here in class will get testng exception
	    @BeforeMethod
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




	    }

	     @AfterMethod
	     public void QuitBrowser() throws InterruptedException
	     {
	    	                    Thread.sleep(7000);
	    	                           driver.quit();
	    }



}
