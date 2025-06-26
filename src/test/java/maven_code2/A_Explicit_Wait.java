package maven_code2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class A_Explicit_Wait
{
	@Test
	public void ExplicitWait()
	{
		WebDriver driver= new EdgeDriver();


		  WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		      wait.until(ExpectedConditions.titleContains("title comes here"));


		      //WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
		      wait.until(ExpectedConditions.titleIs("title comes here"));


		      wait.until(ExpectedConditions.alertIsPresent());

		      wait.until(ExpectedConditions.urlContains("url here"));

		      wait.until(ExpectedConditions.urlMatches("url here"));

		      wait.until(ExpectedConditions.urlToBe("url here"));


		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath here"))).click();


		      wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("xpath here"))).get(0);


		      wait.until(ExpectedConditions.elementToBeClickable(By.id("id here"))).click();



	}

}
