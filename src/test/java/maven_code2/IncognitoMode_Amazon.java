package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class IncognitoMode_Amazon
{

	@Test
	public void Amazon_Incognito() throws InterruptedException
	{
		ChromeOptions options= new ChromeOptions();

		   options.addArguments("--incognito");          //enables incognito mode

		   WebDriver driver= new ChromeDriver(options);

		       driver.get("https://www.amazon.in");

		          driver.manage().window().maximize();
		          driver.navigate().refresh();

		          WebElement srch= driver.findElement(By.id("twotabsearchtextbox"));
		               srch.sendKeys("Cars" , Keys.ENTER);

		           System.out.println("Title-> " + driver.getTitle());

		              Thread.sleep(5000);
		             driver.quit();


	}


}
