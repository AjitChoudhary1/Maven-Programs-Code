package maven_code2;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class Disable_Infobar_Amazon
{

	@Test
	public void DisableInfo_Amazon() throws InterruptedException
	{
		EdgeOptions options= new EdgeOptions();
		options.addArguments("start-maximized");

		   options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		   options.setExperimentalOption("useAutomationExtension", false);

		   WebDriver driver= new EdgeDriver(options);

		       driver.get("https://www.amazon.in");
		         // driver.manage().window().maximize();

		          WebElement srch= driver.findElement(By.id("twotabsearchtextbox"));
		               srch.sendKeys("Dell Laptop" + Keys.ENTER);

		           System.out.println("Title-> " + driver.getTitle());

		              Thread.sleep(5000);
		             driver.quit();


	}


}
