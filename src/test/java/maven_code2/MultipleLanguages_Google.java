package maven_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class MultipleLanguages_Google 
{

	@Test
	public void Multiple_LngGoogle() throws InterruptedException
	{
		ChromeOptions options= new ChromeOptions();
		
		   //options.addArguments("--lang=hi");               //Hindi
		   //options.addArguments("--lang=ar");                //Arabic
		  // options.addArguments("--lang=ru");                  //Russian
		  // options.addArguments("--lang=de");                  //German
		  // options.addArguments("--lang=gu");                  //Gujrati
		   //options.addArguments("--lang=ja");                  //Japanese
		   options.addArguments("--lang=fr");                  //French
		   
		   WebDriver driver= new ChromeDriver(options);
		   
		       driver.get("https://www.google.com");
		          driver.manage().window().maximize();
		          
		          WebElement srch= driver.findElement(By.className("gLFyf"));
		               srch.sendKeys("Ajit Choudhary Tatarwi");
		               
		           System.out.println("Title-> " + driver.getTitle());
		                 
		              Thread.sleep(5000);
		             driver.quit();
		
		
	}
	

}
