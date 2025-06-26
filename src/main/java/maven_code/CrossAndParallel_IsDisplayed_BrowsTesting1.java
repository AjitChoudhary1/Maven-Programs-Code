package maven_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossAndParallel_IsDisplayed_BrowsTesting1
{

	WebDriver driver; //global variable


	@Test
	@Parameters("browser")
	public void LoginToAmazon(String browser) throws InterruptedException
    {

		if(browser.equals("chrome"))
		{
	      driver = new ChromeDriver();
		}

		if(browser.equals("edge"))
		{
           driver = new EdgeDriver();
		}

		driver.get ("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//Optional - in case CAPTCHA displayed we want the page to be refreshed
        try
        {
            // Find the first image tag on the page
            WebElement imgElement = driver.findElement(By.tagName("img"));

            // Check if the image is displayed
            if (imgElement.isDisplayed())
            {
                System.out.println("CAPTHA Image is displayed. Refreshing page.");
                driver.navigate().refresh(); // Refresh the page
            }
            else
            {
                System.out.println("CAPTCHA Image is not displayed. Proceeding.");
            }
        }
        catch (Exception e)
        {
            // If no image is found, print this
            System.out.println("CAPTCHA Image element not found. Proceeding.");
        }

		// Hover over the "Hello, Sign in" area
		Actions actions = new Actions(driver);
		WebElement signInHover = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signInHover).perform();

		Thread.sleep(1000); // small wait for the dropdown to appear

		// Click on the "Sign in" button in the dropdown
        WebElement signInButton = driver.findElement(By.className("nav-action-signin-button"));
        signInButton.click();


		WebElement login_email= driver.findElement(By.name("email"));
		login_email.sendKeys("ajitchoudhary8764@gmail.com");

		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();

		WebElement login_password = driver.findElement(By.id("ap_password"));
		login_password.sendKeys("mypassword123");

		WebElement signinsubmit = driver.findElement(By.id("signInSubmit"));
		signinsubmit.click();



		             Thread.sleep(7000);
		                driver.close();
		                  driver.quit();
	}

}


//ChromeDriver driver1 = new ChromeDriver();
//EdgeDriver driver2 = new EdgeDriver();
//FirefoxDriver driver3 = new FirefoxDriver();

//Instead of creating 3 different objects it's better do upcasting to WebDriver Interface (recommended practice in Selenium): WebDriver driver = new ChromeDriver();
//This allows switching between different browser drivers without changing the rest of the code
//And to avoid writing WebDriver 3 times it's better to create a global variable for it


