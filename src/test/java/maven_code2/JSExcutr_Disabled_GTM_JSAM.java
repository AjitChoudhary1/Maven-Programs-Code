package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JSExcutr_Disabled_GTM_JSAM                                             // 2nd way use much
{
	@Test
	public void JSE_Perform_OnDisabled()
	{
		ChromeOptions options= new ChromeOptions();
		    options.addArguments("start-maximized");

		ChromeDriver driver= new ChromeDriver(options);
		     driver.get("file:///C:/Users/ajitc/OneDrive/Desktop/Java%20Notes/learningHTML1.html");


		     WebElement search= driver.findElement(By.id("121"));


		      JavascriptExecutor js=        driver;                                    //implicit explicit can both
		       // JavascriptExecutor js=  (JavascriptExecutor)      driver;
		          js.executeScript("arguments[0].removeAttribute('disabled')", search);
		             search.sendKeys("Ajit Choudhary");


	}


}
