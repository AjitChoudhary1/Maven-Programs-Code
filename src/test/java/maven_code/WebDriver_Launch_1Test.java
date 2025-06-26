package maven_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriver_Launch_1Test
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
	               driver.manage().window().maximize();

	                  driver.get("https://www.google.com/");

	    	}


	    	if(NameofBrowsers.equals("edge"))
	    	{
	            driver= new EdgeDriver();
	               driver.manage().window().maximize();

	                  driver.get("https://www.amazon.in/");

	    	}


	    	if(NameofBrowsers.equals("firefox"))
	    	{
	    	       driver= new FirefoxDriver();
                        driver.manage().window().maximize();

                             driver.get("https://www.flipkart.com/");

	    	}


	    	      Thread.sleep(3000);
	    	driver.get("https://www.google.com/");



	    	            Thread.sleep(4000);
	    	       driver.quit();
	    }



}
