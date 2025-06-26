package maven_code1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_Search_AssertHard
{
	  @Test
	  public void AmazonPhonePage() throws InterruptedException
	  {
		  EdgeDriver driver= new EdgeDriver();
		     driver.manage().window().maximize();

		        driver.get("https://www.amazon.in/");

		        WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		             search.sendKeys("Google pixel 9"+Keys.ENTER);

		        List<WebElement> phonlist=  driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		              phonlist.contains(search);

		        Assert.assertEquals(phonlist.size()>15, true, "The count of product is matching");

		  Thread.sleep(3000);
		         driver.quit();
	  }

}
