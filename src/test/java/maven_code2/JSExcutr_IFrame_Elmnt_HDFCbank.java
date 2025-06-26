package maven_code2;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class JSExcutr_IFrame_Elmnt_HDFCbank
{
	@Test
	public void IFrame_HdfcBank()
	{
		ChromeOptions options= new ChromeOptions();
		 options.addArguments("start-maximized");

		 options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		   options.setExperimentalOption("useAutomationExtension", false);

		   ChromeDriver driver= new ChromeDriver(options);
		     driver.get("https://netbanking.hdfcbank.com/netbanking/");

		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


		     WebElement iframelmnt= driver.findElement(By.name("login_page"));

		           driver.switchTo().frame(iframelmnt);

		        WebElement id= driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		             id.sendKeys("83624569425");



	}

}
