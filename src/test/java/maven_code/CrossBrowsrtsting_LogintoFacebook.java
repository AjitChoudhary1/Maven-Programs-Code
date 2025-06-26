package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsrtsting_LogintoFacebook
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

	    	}


	    	if(NameofBrowsers.equals("edge"))
	    	{

	            driver= new EdgeDriver();

	    	}

	    	       driver.manage().window().maximize();

	    	        driver.get("https://www.facebook.com/");

		      WebElement usrname=     driver.findElement(By.id("email"));
		           usrname.sendKeys("ajit@gmail.com");

		      WebElement password=    driver.findElement(By.id("pass"));
		           password.sendKeys("803131");

		      WebElement Login=       driver.findElement(By.name("login"));
		           Login.click();



	    	            Thread.sleep(10000);
	    	       driver.quit();
	    }



}
