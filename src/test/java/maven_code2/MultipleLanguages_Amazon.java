package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class MultipleLanguages_Amazon 
{

	@Test
	public void Multiple_LngAmazon() throws InterruptedException
	{
		EdgeOptions options= new EdgeOptions();
		
		   options.addArguments("--lang=HI");          
		
		   WebDriver driver= new EdgeDriver(options);
		   
		       driver.get("https://www.amazon.in");
		       options.addArguments("--lang=HI");              //Hindi
		       options.addArguments("--lang=GU");              //Gujrati
		       
		          driver.manage().window().maximize();
		          
		          WebElement srch= driver.findElement(By.id("twotabsearchtextbox"));
		               srch.sendKeys("Hp Laptop" , Keys.ENTER);
		               
		           System.out.println("Title-> " + driver.getTitle());
		                 
		              Thread.sleep(5000);
		             driver.quit();
		
		
	}
	

}
