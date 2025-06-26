package maven_code1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listeners_Method_TestNG.class)
public class Listeners_AmazonAuto_Logic_ToFailTC
{
	@Test
	public static void AmazonAutoSuggesListnrs() throws InterruptedException
	{

		WebDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();

           driver.get("https://www.amazon.in/");

         WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
              srchtxtfld.sendKeys("Mobiles");

               Thread.sleep(3000);


           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));

               int count=  list.size();
                    System.out.println(count);

             Thread.sleep(2000);
                 list.get(4).click();

                //  list.get(15).click();        // To fail test case choose wrong purposely

               driver.quit();
	}



}
